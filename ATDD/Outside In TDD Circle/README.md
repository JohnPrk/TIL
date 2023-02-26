# Outside In TDD 사이클


- 현재 상황
    - 지난 시간에 인수 테스트를 기반으로 컨트롤러에서 리턴값을 `Mock`으로 만드는거까지 했다.
        - 여기에서 Mock이란 service에 따로 요청하지 않고, 임의의 `Response` 값을 개발자가 직접 설정해주는 것을 의미
            
            ![Untitled](https://user-images.githubusercontent.com/88137420/221408150-99352639-3595-44c6-919a-53c891001ce8.png)
            
        - 인수 테스트에서도 임의의 `Request` 값을 설정 해주고 이를 통해서 인수 테스트를 진행한다.
            
            ![Untitled](https://user-images.githubusercontent.com/88137420/221408168-ead87ba4-4446-45f2-9545-289399d53709.png)
            

- 노선 생성 TDD 사이클
    - 임의의 Mock(=Response) 생성 기능을 메서드로 분리하고 이를 서비스의 메서드로 전달(서비스 객체가 없다면 새로 만들어주기)
        
        ![Untitled](https://user-images.githubusercontent.com/88137420/221408222-3719f165-317d-4b76-9133-2b4ea9613018.png)
        
        ![Untitled1](https://user-images.githubusercontent.com/88137420/221408230-b6fa9f65-04df-47ae-a117-ea05f99fc83d.png)
        
    - `DI`를 통해서 서비스에 대한 의존성 주입
        
        ![Untitled2](https://user-images.githubusercontent.com/88137420/221408238-d62c1315-7b7b-4d99-8fe2-cb64a0bc28d8.png)
        
    - 서비스가 Spring이 관리할 수 있도록 어노테이션 붙여주기
        
        ![Untitled3](https://user-images.githubusercontent.com/88137420/221408243-e53979e1-eab1-4725-a6a5-c9426c319d46.png)
        
    - Service에 대한 단위 테스트 코드 작성 : Todo 리스트 작성 → `DB`말고 `객체`로 단위 테스트 작성
        
        ![Untitled4](https://user-images.githubusercontent.com/88137420/221408250-a27249c0-379e-49d8-ad65-852397f44a55.png)
        
        ![Untitled5](https://user-images.githubusercontent.com/88137420/221408253-1877e25e-8868-4d31-8dba-dfb1f506c7f4.png)
        
    - Repository를 `stubbing`해서 테스트 작성 : `Repository` 클래스 생성 → `Domain` 클래스 생성 → `Mockito 환경` 및 `Mock 객체 생성(주입)` → stubbing으로 `협력 객체` 세팅
        
        ![Untitled6](https://user-images.githubusercontent.com/88137420/221408260-93901a2e-417e-4dc1-804d-a9caec29a6bc.png)
        
        - `Tips`
            - 이 때, Repository에 대한 `구체적인 구현`을 고려하지 않아도 됩니다.
            - 컴파일 에러만 뜨지 않을 수 있도록 적당한 `Return` 값만 세팅 해준다.
            - stubbing할 객체는 mock 객체로 만들어줘야한다.
            - 불 필요한(이상한) stubbing이 발생 하면 안 된다 → stubbing에서 사용하고 있는 메서드는 실제 객체의 메서드에도 동일하게 있어야 한다.
            - any()는 어떤 객체 타입이나 값을 무시하고 값을 넣어주는 것을 의미한다.
            - RequestDTO를 통해서 도메인의 값을 만들 때, DTO를 넘겨주는 것보다는 값을 넘겨주어서 도메인이 외부 레이어의 객체(DTO, …)의 의존성을 갖지 않도록 하는 것이 좋다.
            - TDD 사이클이 익숙하다면 중간의 몇 부분은 띄어넘을 수 있다.
        
    - Repository에 대한 단위 테스트 코드 작성 : Todo 리스트 작성 → Repository 기능 생성(JpaRepository 상속) → Domain 클래스 `Entity화`
        
        ![Untitled7](https://user-images.githubusercontent.com/88137420/221408265-cd49adc2-5d44-4000-b4d0-5527fcc0a659.png)
        
        - `Tips`
            - `@DataJpaTest` 어노테이션을 적용하게 되면 스프링 컨테이너에 존재하는 다양한 Repository를 사용할 수 있게 해줍니다.
            - 이 어노테이션을 사용하면 JPA 관련 기능들만을 테스트할 수 있으며, 테스트 시에는 실제 데이터베이스가 아닌 테스트용 데이터베이스를 사용합니다.
            - 또한, 이 어노테이션을 사용하면 자동으로 트랜잭션 처리가 되어 테스트 결과가 실제 데이터베이스에 영향을 주지 않습니다.
            - Entity는 빈 생성자가 필요하다.

- 추후에 기능을 생성하거나 수정할 때 이 모든 부분을 인수 테스트로 검증하지 않아도 된다 → 작은 부분의 단위 테스트에서도 충분히 검증할 수 있다.

- 같은 이름을 가진 노선이 생성되지 않도록 예외를 처리하는 새로운 요구사항을 받았을 때 우리는 어디에 비즈니스 코드를 작성하고 테스트 하면 될까요?
    - Controller
    - Service : ‘Request(요청값)’의 이름을 ‘Repository의 findAll() 메서드의 결과값’과 직접 비교 해서 예외 처리를 하자고 한다면 서비스에서 비즈니스 코드를 작성하고 테스트 한다.
    - Repository
    - Domain : Entity 테이블에 `Unique Key`를 걸어서 자연스럽게 예외 처리를 하고자 한다면 Domain에 비즈니스 코드를 작성하고 Repository에서 테스트 한다.
    
- `RuntimeException`도 예외 처리를 하지 못하면 `InternalServerException`으로 바뀌기 때문에 이에 대한 처리가 필요하다 → Controller에서 단위 테스트로 확인
    
    ![Untitled8](https://user-images.githubusercontent.com/88137420/221408315-b71df9a1-4d4f-4aa5-89d6-4574918b194f.png)
    
    ![Untitled9](https://user-images.githubusercontent.com/88137420/221408303-71e62fa0-7b76-42f6-9ebf-92708c7b3567.png)    

- try/catch를 통해서 예외 처리 로직 생성 → `@ExceptionHandler`나 `@ControllerAdvice`으로 변경 하는 것을 추천 → 이 것은 Springboot 환경에서 동작하기 때문에 `SpringBootTest 환경` 구축이 필요
    

