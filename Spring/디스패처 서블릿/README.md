### 서블릿

<br>
  
- 서블릿(Servlet)은 클라이언트 요청을 처리하고, 그 결과를 반환하는 웹 프로그래밍 기술이라고 할 수 있습니다.
- 자바에서 서블릿(Servlet)은 자바를 사용하여 웹페이지를 동적으로 생성하는 로직을 말한다고 할 수 있습니다.
- 자바에서 서블릿은 주로 HTTP 프로토콜을 통해 클라이언트와 통신하는데 사용됩니다.
- 서블릿은 HTML, XML, JSON 등 다양한 형태의 응답을 생성할 수 있습니다.

<br>

### 디스패처 서블릿

- 디스패처 서블릿은 스프링에서 기본으로 채택한 서블릿이라고 할 수 있습니다.
- 따라서, 디스패처 서블릿은 HTTP 프로토콜로 들어오는 요청을 적합한 컨트롤러에 위임해서 비지니스 로직이 처리될 수 있게 만들어주는 객체라고 할 수 있습니다.
- 또한, 클라이언트로의 요청이 서버로 전달 되어질 때, Spring MVC 기반 애플리케이션에서 가장 먼저 수신받는 객체가 디스패처 서블릿이라고 할 수 있습니다.
- 사실, 이 뿐만이 아니라 디스패처 서블릿은 컨트롤러 매핑 및 요청, 뷰 랜더링 요청 등의 다양한 작업들을 중앙 집중식으로 관리하고 처리할 수 있다고 할 수 있습니다.
- 따라서 디스패처 서블릿은 클라이언트와 서버 간의 통신의 중간 인터페이스 역할을 한다고 할 수 있을 것 같습니다.

<br>

### 디스패처 서블릿의 전략

- 일반적으로 DispatcherServlet은 자신이 직접 작업하거나 처리하지 않고 여러 전략 인터페이스를 사용하여 요청을 처리한다고 할 수 있습니다.
- Spring MVC 프레임워크의 `DispatcherServlet.properties` 파일은 DispatcherServlet에서 사용할 인터페이스의 명시적인 구현체가 없으면 기본으로 사용하는 특정 Bean에 대한 속성 파일이라고 할 수 있습니다.
- 이러한 속성 파일은 크게 `HandlerMapping`, `HandlerAdapter`, `ViewResolver`으로 나눌 수 있습니다.
    
    <img width="700" alt="image" src="https://github.com/JohnPrk/TIL/assets/88137420/eefebbeb-e13f-4f06-b70f-61b87adea683">

    
<br>

### 디스패처 서블릿과 협력 객체

- 디스패처 서블릿의 협력 객체는 다음과 같습니다.
    
    <img width="700" alt="image2" src="https://github.com/JohnPrk/TIL/assets/88137420/dc0d2561-0f0a-4142-b9b7-9e9b0c19386f">
    
- HandlerMapping
    - 디스패처 서블릿은 HandlerMapping 인터페이스를 통해서 URI 경로 기반 컨트롤러 를 탐색합니다.
    - `RequestMappingHandlerMapping` 객체는 클래스 단위의 `@Controller` 어노테이션 내에서 `@RequestMapping` 어노테이션을 보고 이에 관한 정보를 `RequestMappingInfo` 클래스에 보관합니다.
    - 디스패처 서블릿은 이러한 정보를 바탕으로 `HandlerMapping`에 위임하여 해당 요청을 처리할 Handler(Controller)를 탐색합니다.
- HandlerAdapter
    - 일반적으로 디스패처 서블릿은 컨트롤러의 메서드를 직접 호출하지 않고 핸들러 객체 사이의 중간 역할을 하도록 설계되었습니다.
    - 따라서 HandlerMapping 인터페이스를 통해서 탐색된 컨트롤러의 메서드를 실행하는 역할을 수행합니다.
    - 핸들러 어뎁터 인터페이스를 구현한 구현체인 SimpleControllerHandlerAdapter 객체는 `컨트롤러 인터페이스`를 구현하는 컨트롤러가 처리하는 요청을 처리하기 위해 Spring MVC 프레임워크에서 제공하는 핸들러 어댑터입니다.
    - Spring MVC 아키텍처에서는 핸들러 어뎁터는 핸들러 메서드를 호출하고 결과값을 DispatcherServlet에게 반환합니다.
    - JSP 기준으로 일반적으로 ModelAndView 개체을 가져온다고 할 수 있습니다.
- ViewResolver
    - DispatcherServlet은 컨트롤러와 핸들러 어뎁터를 통해 전달 받은 `ModelAndView`개체를 ViewResolver로 전달하고 랜더링을 요청합니다.
    - 여기에서 Model은 `뷰에 넣을 데이터`를 의미하고, View는 뷰의 위치를 의미합니다.
    - 예를 들어 JSP를 위한 `InternalResourceViewResolver`, Thymeleaf를 위한 `ThymeleafViewResolver`가있습니다.
    - 예를 들어 뷰 이름이 "home"이고 ViewResolver가 "/WEB-INF/views/" 접두사와 ".jsp" 접미사가 있는 InternalResourceViewResolver인 경우 ViewResolver는 전체 파일 경로가 보기의 경우 "/WEB-INF/views/home.jsp"입니다.
    - @Controller의 경우에는 위와 같이 수행되어지고, @RestController 같은 경우에는 @ResponseBody 어노테이션이 포함되어 있는 것이므로 ViewResolver가 아닌 직접 데이터를 반환하는 REST API형식으로 클라이언트와 통신할 수 있습니다.

<br>

### 디스패처 서블릿 동작원리

- WAS에서 `HttpServletRequest`, `HttpServletResponse` 객체를 생성하여 DispatcherServlet에게 전달합니다.
- 이 후, 위의 3가지 인터페이스를 통해서 비즈니스 로직을 수행하고, 중간에 스프링이 제공하는 인터셉터의 `applyPreHandle`, `applyPostHandle`, `triggerAfterCompletion` 메서드를 순서대로 수행하게 됩니다.
    
    <img width="700" alt="image2" src="https://github.com/JohnPrk/TIL/assets/88137420/8088d361-e834-4192-88ac-ab9b90879408">
    
<br>

<br>

### <참고 자료>

- [Overview of Spring MVC Architecture](https://terasolunaorg.github.io/guideline/5.0.1.RELEASE/en/Overview/SpringMVCOverview.html#overview-of-spring-mvc-processing-sequence)
- [HandlerAdapters in Spring MVC](https://www.baeldung.com/spring-mvc-handler-adapters)
- [DispatcherServlet - Part 1](https://tecoble.techcourse.co.kr/post/2021-06-25-dispatcherservlet-part-1/)
- [DispatcherServlet - Part 2](https://tecoble.techcourse.co.kr/post/2021-07-15-dispatcherservlet-part-2/)
- [Servlet 과 ServletContainer](https://tecoble.techcourse.co.kr/post/2021-05-23-servlet-servletcontainer/)

<br>
