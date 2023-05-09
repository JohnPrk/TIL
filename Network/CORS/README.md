# CORS

<br>

### SOP

- CORS에 알기에 앞서서 브라우저의 보안 매커니즘인 `SOP`는 CORS(Cross-Origin Resource Sharing)의 반대 개념인 `Same Origin Policy`의 약자입니다.
- SOP는 웹 페이지가 `다른 출처`로부터의 `응답`을 차단하는 `보안 매커니즘`이라고 할 수 있습니다.
- 여기에서 출처는 `프로토콜`(http 또는 https), `호스트`, `포트`의 3가지 요소를 의미하고, 통신하는 과정에서 이 중에 하나라도 같지 않다면 `차단하는 것`을 의미합니다.
- 쉽게 이야기하자면, JavaScript의 맥락에서 SOP는 실제로 전송되는 `요청`을 차단하는 것은 아니지만 요청 스크립트로부터 오는 `응답`을 `차단하는 것`을 의미합니다.
- 이러한 SOP의 주요 목표는 악성 웹사이트가 `쿠키`, `토큰` 또는 `사용자 데이터`와 같은 민감한 정보에 액세스하지 못하도록 방지하는 것입니다.
- 그러나 `타사의 API`를 이용 하거나 `다른 출처의 리소스`에 엑세스해야하는 경우에는 `CORS`를 사용하여 상호 간의 보안을 유지하고 선택적으로 엑세스를 가능하게 만드는 매커니즘입니다.
- SOP는 다음과 같은 웹 브라우저 공격 기술을 방어합니다.
    1. `CSRF`는 악성 사이트를 통해 쿠키 또는 토큰과 같은 사용자의 자격 증명을 탈취해서 대상 웹 응용 프로그램에 위조된 요청을 보내는 것을 의미하는데 이를 방지할 수 있습니다.
    2. 또한 다른 출처의 데이터에 대한 `무단 액세스` 및 `데이터 도난`을 `방지`할 수 있습니다. SOP는 대상 서버가 CORS(Cross-Origin Resource Sharing)를 사용하여 요청을 명시적으로 허용하지 않는 한 웹 페이지가 XMLHttpRequest 또는 Fetch API를 다른 원본으로 호출하지 못하도록 제한합니다.

<br>

### CORS란?

- 교차 출처 리소스 공유([CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS))는 웹페이지에서 실행되는 자바스크립트 XMLHttpRequest(XHR) 호출이 출처가 다른 도메인의 리소스와 상호작용할 수 있도록 허용하는 표준 메커니즘입니다.
- 일반적으로 URL에서 프로토콜과 호스트과 포트가 같으면 동일한 출처라고 판단하는데, 이 때, 프로토콜은 HTTP, HTTPS와 같은 프로토콜을 의미하고, 도메인은 URL 주소를 의미하고 포트는 HTTP의 80번 포트, HTTPS의 443 포트와 같은 포트를 의미합니다.

<br>

### CORS 동작 원리

- CORS의 동작 방식은 단순 요청 방법과 예비 요청을 먼저 보내는 방법 2가지 방법이 있습니다.
    - Simple request
        - 단순 요청 방법은 서버에게 바로 요청을 보내는 방법입니다.
        - 아래 그림은 자바스크립트에서 API를 요청할 때 브라우저와 서버의 동작을 나타내는 그림입니다.
            
            ![image2](https://github.com/JohnPrk/TIL/assets/88137420/f40831dc-8a37-415e-a82f-99682567f922)
            
        - 단순 요청은 서버에 API를 요청하고, 서버는 `Access-Control-Allow-Origin` 헤더를 포함한 응답을 브라우저에 보냅니다.
        - 브라우저는 `Access-Control-Allow-Origin` 헤더를 확인해서 CORS 동작을 수행할지 판단합니다.
        - 하지만, 단순 요청 방식은 몇 가지 제약 조건이 있는데, 그 중에 `Content-Type`에 `application/json`을 지원하지 않기 때문에 일반적으로는 프리 플라이트 방식을 사용하게 됩니다.
    - Preflight request
        - Preflight 요청은 서버에 예비 요청을 보내서 안전한지 판단한 후 본 요청을 보내는 방법입니다.
        - 아래 그림은 Preflight 요청 동작을 나타내는 그립입니다.
            
            ![Untitled](https://github.com/JohnPrk/TIL/assets/88137420/daef59a4-cdd6-40fe-8532-3c8acb408f6c)


            
        - Preflight 요청은 실제 리소스를 요청하기 전에 `OPTIONS`라는 메서드를 통해 실제 요청을 전송할지 판단합니다.
        - `OPTIONS` 메서드로 서버에 예비 요청을 먼저 보내고, 서버는 이 예비 요청에 대한 응답으로 `Access-Control-Allow-Origin` 헤더를 포함한 응답을 브라우저에 보내야지 통신이 되는 것을 의미합니다.
        - 이 과정에서 원하는 응답 값이 아닌 경우에는 실제로 보내는 요청 전송도 막고, 다음과 같은 오류 메시지를 보여주게 됩니다.
            
            ![Untitled1](https://github.com/JohnPrk/TIL/assets/88137420/e4e184a5-c93d-4d9d-bf3f-2f7efeb7bb6e)

            

<br>

### 자바에서 CORS 설정

- 자바에서 CORS 설정은 스프링 시큐리티 기준 SecurityFilterChain에 CORS 설정을 세팅하고 넣어줌으로써 해결할 수 있습니다.
- 아래의 코드는 기본적인 CORS 설정 세팅입니다.
    
    ```java
    package com.gwangcle.study.config;
    
    import com.gwangcle.study.member.domain.Role;
    import org.springframework.context.annotation.Bean;
    import org.springframework.security.config.annotation.web.builders.HttpSecurity;
    import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
    import org.springframework.security.web.SecurityFilterChain;
    import org.springframework.web.cors.CorsConfiguration;
    import org.springframework.web.cors.CorsConfigurationSource;
    import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
    
    import java.util.Arrays;
    
    @EnableWebSecurity
    public class SecurityConfig {
    
        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http
                    .cors().configurationSource(corsConfigurationSource()).and()
                    .csrf().disable().headers().frameOptions().disable().and()
                    .httpBasic().and()
                    .authorizeRequests()
                    .antMatchers("/", "/css/**", "/images/**", "/js/**", "/h2-console/**", "/api/oauth/**").permitAll()
                    .antMatchers("/api/boards/**", "/api/members/**").hasRole(Role.USER.name())
                    .anyRequest().authenticated();
            return http.build();
        }
    
        @Bean
        CorsConfigurationSource corsConfigurationSource() {
            CorsConfiguration configuration = new CorsConfiguration();
            configuration.setAllowedHeaders(Arrays.asList("Authorization", "Cache-Control", "Content-Type"));
            configuration.setAllowedOrigins(Arrays.asList("http://localhost:3001"));
            configuration.setAllowedMethods(Arrays.asList("POST", "GET"));
            UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
            source.registerCorsConfiguration("/**", configuration);
            return source;
        }
    }
    ```
    
<br>

### 쿠키?

- 일반적으로 쿠키는 SOP(Same-Origin Policy)로 인해 다른 도메인으로 전달되지 않습니다.
- 심지어 쿠키는 CORS의 경우에도 상당 부분 제한된다고 할 수 있습니다.
- 권장하지는 않지만 쿠키를 요청과 응답으로 받고 싶다면 다음과 같은 3가지 작업이 필요합니다.
    1. Same-Site 속성은 `다른 도메인 간의 통신`에 대한 `보안에 대한 설정`인데, 이를 None으로 수정해줍니다. 이 때, 통신 과정에서의 하이재킹 등의 공격을 막기 위한 최소한은 secure(HTTPS) 설정이 필요합니다.
    2. patch API나 axios API를 통해서 보낼 때, `{ credentials: true }` 설정이 필요 합니다.
    3. 자바의 스프링에서는 CORS를 허용할 출처를 명시적으로 설정해야 합니다.
- 이러한 과정을 통해서 쿠키를 요청과 응답 헤더에 포함시킬 수 있지만, 보안 상의 이유로 JWT 토큰을 사용하는 것을 권장하고 있습니다.

<br>

<br>

### *참고 자료*

- [CORS란 무엇일까](https://github.com/wjdrbs96/Today-I-Learn/blob/master/Network/CORS%EB%9E%80%20%EB%AC%B4%EC%97%87%EC%9D%BC%EA%B9%8C.md)
- [CORS란?](https://beomy.github.io/tech/browser/cors/)

<br>
