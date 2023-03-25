# 자바 애플리케이션 작동원리(1)-JVM의 서막

<br>


### 자바 애플리케이션의 두 가지의 컴파일 과정

- 사용자가 작성한 자바 코드`(.java)`는 JDK의 `자바 컴파일러`를 통해서 자바 바이트 코드`(.class)`로 변환됩니다.
- 이러한 바이트 코드는 JVM의 `인터프리터`나 `JIT 컴파일러`를 통해서 Native OS에 맞춘 기계어로 변환되어 집니다.
<br>

### JVM vs JRE vs Library vs JDK?

- 사실, `JVM`은 자바 애플리케이션을 실행을 위한 충분 조건이 되지 않기 때문에 혼자 배포되지 않는 특성을 가지고 있습니다.
- 자바 애플리케이션을 실행하기 위한 최소의 조건은 JVM과 `라이브러리`를 포함한 `JRE`(Java Runtime Environment) 환경입니다.
- 자바 라이브러리는 `Java API` 및 `환경 설정`, `실행 관련 툴 킷` 등으로 구성되어 있습니다.
- Java API는 `자료구조`, `I/O`, `네트워크`, `데이터베이스`와 같은 일반적인 기능을 제공하는 `미리 작성된 코드 모음`을 의미하고 크게 5가지로 구성이 됩니다.
    - java.lang
    - java.util
    - java.io
    - java.net
    - java.sql
- JRE에는 실행 관련 도구만 있기 때문에, 자바 애플리케이션 실행은 가능 하지만, 컴파일과 같은 개발 관련 작업은 어렵기 때문에 이는 `JDK`을 통해서 해결하고 있습니다.
- JDK(Java Development Kit)는 JRE를 포함한 자바 개발도구와 자바 컴파일러를 포함하고 있습니다.
- 자바 11 버전부터는 JRE 조차도 혼자 배포되지 않고, 자바 애플리케이션의 개발과 실행의 지원하는 JDK가 배포의 최소 조건이 되었습니다.
<br>

### IDE ?

- 자바 애플리케이션은 `Eclipse` 또는 `IntelliJ`와 같은 IDE(통합 개발환경)를 통해 실행될 때 일반적으로 여러 단계를 통해 처리됩니다.
    1. `컴파일`(Compile) : 애플리케이션의 소스 코드는 Java 컴파일러(javac)에 의해 바이트코드인 .class 파일로 저장됩니다.
    2. `로딩`(Loading) : JVM이 필요에 따라 컴파일된 클래스 파일을 메모리에 적재하는 것을 의미합니다.
    3. `링크`(Link) : JVM은 검증, 준비, 해석 작업을 통해서 바이트코드가 유효한지 확인하고 클래스나 인터페이스에 대해서 정적 변수의 기본값을 메모리에 할당하고 심볼릭 레퍼런스를 실제 레퍼런스로 교체합니다.
    4. `초기화`(Initialization) : JVM은 클래스의 정적 변수에 실제 값을 할당합니다.
    5. `실행`(Excution) : 앞선 초기화 작업이 끝이 나면 애플리케이션의 진입점인 `main
     메서드`로 가서 바이트코드를 실행하게 됩니다.
<br>

*<참고자료>*

- [더 자바, 코드를 조작하는 다양한 방법](https://www.inflearn.com/course/the-java-code-manipulation/dashboard)
- [Understanding JVM Architecture](https://medium.com/platform-engineer/understanding-jvm-architecture-22c0ddf09722)
