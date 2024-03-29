# REST API

<br />

```
🍊 REST API를 학습하기 이전에 먼저 API에 대해서 알아보자!
```

<br />

### API란?

- `API`는 Application Programming Interface의 약자로, 서로 다른 두 개의 컴퓨터 시스템이 서로 `상호작용` 하기 위해서 사용하는 `인터페이스`입니다.
- 즉, 두 컴퓨터 시스템이 `데이터`를 주고 받기 위해 `일정한 규칙`을 만들고 이를 통해서 `통신`을 하는 것을 의미합니다.
- 이러한 특징으로 인해서
    - API 요청을 보내는 사용자는 세부적인 구현 방식을 알지 못하더라도 서비스와도 통신할 수 있으며
    - 이를 통해, 개발자는 시간과 비용을 절약할 수 있는 특징을 가질 수 있습니다.
- API는 접근방식과 아키텍쳐 스타일을 기준으로 다양하게 나뉠 수 있습니다.
    - 먼저, API의 접근 방식을 기준으로 나누어 본다면,
        - `ChatGPT`나 `Naver Login API`와 같이 모두가 사용할 수 있는 `개방형 API`가 있고,
        - 특정 회사 간의 데이터 공유를 위해서 사용하는 `파트너 API`가 있고,
        - 서비스 자체 내에서만의  통신을 위한 `비공개 API`로 나눌 수 있습니다.
    - API를 시기나 아키텍처 스타일을 기준으로 나누어 본다면,
        - `RPC`(Remote Procedure Call)
        - `SOAP`(Simple Object Access Protocol)
        - `REST API`으로 나눌 수 있습니다.
        - 웹 서버의 초창기에는 RPC, SOAP를 사용 했지만, 여러 단점과 불편함으로 인해서 현재 대부분의 네트워크 통신은 REST API로 이루어집니다.

<br />

```
🍊 API 통신 중에 가장 많이 사용되는 REST API에 대해서 알아보자!
```

<br />

### REST API란

- `REST API`는 ‘Representational State Transfer API’의 약자로, `REST 아키텍처 스타일`의 `제약 조건`을 준수하는 API를 의미합니다.

<br />

### REST 아키텍쳐 스타일

- `REST 아키텍쳐 스타일`은 2000년 로이 필딩의 박사 학위 논문에서 처음 소개가 되었습니다.
- 로이 필딩은 HTTP의 주요 저자 중 한 사람으로,
    - 그 당시 `HTTP 설계`의 우수성에 비해 제대로 사용되어지지 못하는 모습에 안타까워하며
    - HTTP의 장점을 최대한 활용할 수 있도록 REST를 발표 했다고 합니다.
    - 그가 REST를 개발할 때는 웹이 폭발적으로 성장하고 있었지만 웹 전체를 꿰뚫는 ‘`표준`’이라는 개념이 미비했던 때로,
    - 그의 표현에 따르면 **그 당시에는**
        - **“*웹의 구조를 서술하는 문서들이 있었지만 실제 웹 발전 속도가 너무 빨라 이미 시대에 뒤떨어진 경우가 많았다*”**고 한다.
        - **또 “*그 당시 이미 캐시와 프록시 등이 웹에는 존재했지만 이를 인식하는 표준은 없다시피 했다.*“**고 했다.
- REST 설계 제약 조건은 SOAP만큼 엄격하게 정의되어 있지 않고, 다음 6개의 제약 조건을 준수하게 되면 Rest-ful한 아키텍쳐라고 로이 필딩이 정의 했습니다.
    - `클라이언트-서버 구조`
        - `데이터의 저장에 대한 관심사`와 `사용자 인터페이스에 대한 관심사`를 `분리`함으로써,
        - 클라이언트 측면에서는 `여러 플랫폼`(웹, 앱, …)에 대한 사용자 인터페이스의 `이식성`(portability)을 개선시키고,
        - 서버 측면에서는 구성요소를 단순화함으로써 `확장성`(scalability)를 개선시킵니다.
        - 이를 통해, 각각의 요소가 독립적으로 발전할 수 있게 해주는 장점을 가지고 있습니다.
    - `무상태`(Stateless)
        - 클라이언트와 서버간의 통신(HTTP)은 본질적으로 `Stateless` ****한 속성을 가지고 있습니다.
        - 따라서, 클라이언트가 서버로 보내는 요청에는 해당 요청에 `필요한 모든 정보`가 포함 되어야 한다는 것을 의미합니다.
        - 그렇기 때문에, 세션에 대한 정보는 전적으로 클라이언트에서 관리됩니다.
    - `캐시 가능`(Cacheable)
        - 네트워크 성능을 향상시키기 위해 ****Cache ****가능 조건을 추가합니다.
        - Cache 제약조건은 응답 데이터가 `cacheable`한 지, `non-cacheable`한 지 암시적으로 또는 명시적으로 지정되어야 한다는 것을 의미합니다.
        - 만약 응답이 cacheable하다면, 동일한 요청에 대해 해당 응답데이터를 나중에 재사용할 수 있는 장점을 가지게 됩니다.
    
    ```
    🍊 여기서 잠깐
    
    - 위의 3가지 특징은 사실 HTTP의 특징을 나타내고, 이를 REST 아키텍쳐 스타일에 잘 반영 했다고 할 수 있습니다.
    - 또한, 여기까지는 REST만의 특징이 아닌, HTTP를 사용하는 이미 존재하던 아키텍쳐의 스타일이라고도 할 수 있습니다.
    ```
    
    - `Code-on-demand`
        - Code-on-demand는 선택적인 제약조건으로 서버에서 클라이언트로 보내는 리소스 외에도, 실행 가능한 코드를 클라이언트에게 전송할 수 있는 기능을 제공합니다.
        - 하지만, 이 제약 조건은 보안 문제와 코드 관리의 어려움 등으로 인해 많은 REST API에서 사용되지 않습니다.
        - 대부분의 REST API는 단순한 데이터 교환을 목적으로 하며, 클라이언트가 실행 가능한 코드를 다운로드하거나 실행하지 않도록 설계됩니다.
    - `계층형 구조`(Layered System)
        - 계층형 구조에서는 클라이언트와 서버 사이에서 계층을 분리해서 각각의 역할에 맞는 작업을 처리 합니다.
        - 일반적으로 계층은 보안, 로드 밸런싱, 캐싱과 같은 작업 단위로 분리가 되며, 이를 통해 성능과 보안 향상에 도움을 줄 수 있습니다.
        - 이를 통해 인터넷과 같은 큰 규모의 네트워크에서도 REST API를 빠르고 안전하게 사용할 수 있는 특징을 가집니다.
    - `일관성 있는 인터페이스`(Uniform Interface)
        - 일관성 있는 인터페이스는 REST 아키텍처 스타일이 다른 `네트워크 기반 아키텍처 스타일`과 구분되는 `핵심적인` 특징입니다.
        - 일관성 있는 인터페이스에 대한 정의는 다음과 같습니다.
            - 클라이언트와 서버를 구분하고 그 사이의 통신의 연결점을 `인터페이스`라 하고
            - 그 인터페이스를 `균일한 형태`로, `약속된 형태`로 `정의`하자는 것을 의미합니다.
        - 이를 위해서 4가지 제약 조건이 등장하게 되는데,
            1. `자원의 식별 리소스`(identification of resources)
                - 자원은 uri로 식별된다. 요청 내에 기술된 개별 자원을 식별할 수 있어야 한다.
            2. `메시지를 통한 리소스의 조작`(manipulation of resources through representations)
                - HTTP에 표현을 담아 전송하여 리소스를 조작해야한다.
            3. `자기서술적 메시지`(self-descriptive messages)
                - 메세지는 스스로를 설명해야한다.
            4. `HATEOAS`(hypermedia as the engine of application state)
                - 애플리케이션의 상태는 Hyperlink를 이용해 전이되어야한다.
            

<br />

```
🍊 난제
```

<br />

- REST API라고 알려진 거의 모든 API들이 **3, 4번 제약 조건**은 거의 지키지 못하고 있다.


<br />

### REST API의 구성

- REST API를 통해서 전달하는 데이터는 `자원`(Resource), `행위`(verb)로 구성되어 있고, 이를 `표현`(Json, XML)을 통해서 전달한다.
- 자원은 URI(URL) 주소를 의미하며, 다음과 같은 특징을 가지고 있습니다.
    - 자원에는 `동사`를 사용하지 않습니다.
    - 슬래시 구분자(/)를 사용하여 `계층 관계`를 나타내는 사용합니다.
    - URI 마지막에 슬래시를 붙이지 않습니다.
    - 가독성을 위해 불가피한 경우 `하이픈`(-)을 사용합니다.
    - URI 경로에 `밑줄`(_)은 사용할 수 없습니다.
    - URI 경로에 `대문자 사용`은 피하도록 해야 합니다.
- 행위는 HTTP Method(GET, POST, PUT, DELETE)로 구성되어 있고,
    - HTTP 메서드를 통해 자원에 대한 CRUD 작업을 수행한다.

<br />

<참고 자료>

- [RESTful API란 무엇입니까?](https://aws.amazon.com/ko/what-is/restful-api/)
- [[REST API] Roy Fielding 의 REST API 논문 번역 및 이해](https://m.blog.naver.com/aservmz/222234406469)
- [그런 REST API로 괜찮은가](https://tv.naver.com/v/2292653#comment_focus)

<br />
