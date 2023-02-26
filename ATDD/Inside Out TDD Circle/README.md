# Inside Out TDD 사이클


- 현재 상황
    - CRUD에 대한 인수 테스트 작성 완료
        
        ![Untitled](https://user-images.githubusercontent.com/88137420/221419781-14722b94-c67e-4d31-9360-2fc5b06cb04e.png)
        
        ![Untitled1](https://user-images.githubusercontent.com/88137420/221419792-148dceb4-9c99-4fb9-8877-a6efdd8141e7.png) 
        
    - 노선에 구간을 추가하는 기능 요구사항

- 노선 생성 TDD 사이클(도메인 단위 테스트) : 도메인 객체와 기능을 먼저 검증(테스트) 및 개발하고 서비스나 레포지토리에서 이용할 수 있게끔 한 뒤 차츰차츰 단위 테스트 작성
    - 단위 테스트의 검증 내용 : addSection 메서드(노선이 구간을 생성한다)
    
        ![Untitled2](https://user-images.githubusercontent.com/88137420/221419807-5a26087b-ab3c-4b38-8888-5f5a803ed327.png)
        ![Untitled3](https://user-images.githubusercontent.com/88137420/221419816-70c7f7ee-5077-4672-89e7-7ef78c74b561.png)
    
        ![Untitled4](https://user-images.githubusercontent.com/88137420/221419819-5bf9dd2a-0f39-4c45-a094-e0bfe44ba6e8.png)
    

- 노선 생성의 다른 요구 사항 추가
    1. 노선의 중간에 위치한 구간의 상행역(하행역)과 연결되는 구간이 추가될 수 있다. → 기존의 구간은 사라지고 새로운 2구간이 생기게 된다.
        
        ![Untitled5](https://user-images.githubusercontent.com/88137420/221419831-f95ba0c5-5cbb-4f58-b766-79e2bf46453c.png)
        
        ![Untitled6](https://user-images.githubusercontent.com/88137420/221419835-a7b7faec-3818-4b85-b804-b8ab54f8ce67.png)
        
    2. 노선의 마지막 구간과 연결되는 구간이 추가될 수 있다.
    3. 노선의 첫 구간과 연결되는 구간이 추가될 수 있다. 
    
    ⇒ 이 전에 Reponse 응답 객체를 만들 때 역 이름별로 stations 객체를 정렬하는 로직을 만들었기 때문에 따로 비즈니스 코드를 작성하지 않더라도 2, 3번의 단위 테스트 통과한다.
    
- 노선 생성 TDD 사이클(서비스 테스트) : 서비스는 단순히 레파지토리, 다른 서비스, 객체들의 호출을 통해서 비즈니스 로직의 흐름만 제어하는 역할
    
    ![Untitled7](https://user-images.githubusercontent.com/88137420/221419844-09d606f2-46ee-4cf1-abe9-f7c3285b5400.png)
    
    - 서비스 단위 테스트 작성하고 프로덕션 코드를 작성해야하는게 아닌가? → 물론 verify 테스트 메서드를 통해서 행위 검증을 할 수 있지만, 이 것이 굳이 남겨둘 필요성을 느껴서 따로 작성하지는 않았다.(스킵)
    
    ![Untitled8](https://user-images.githubusercontent.com/88137420/221419851-c3eb9704-26ee-4144-8bb7-7f2d15ab6c35.png)
    
    ![Untitled9](https://user-images.githubusercontent.com/88137420/221419856-3db13156-44a1-4c2c-8fc8-60926a7beee8.png)
    
    ![Untitled99](https://user-images.githubusercontent.com/88137420/221419864-c9838cd6-7854-4a8d-ae65-6c071db72ebe.png)
    
    브라운 曰  
    
    - 사실 TDD 공부할 때 가장 어려웠던 부분이 ‘내가 뭘 구현할지 이미 알고 있는데’도 테스트를 진행해야하는데, 테스트를 어떻게 짜야할지 고민이 많았다.
    - 실제로 해보다보면 테스트 하기가 어려운 코드가 있다.
    - 특히나 리턴 타입이 없는 void 형태의 메서드 같은 경우에는 상태를 검증하기 어렵기 때문에 이 메서드 내부에서 어떤 행위가 일어났는지를 검증 해야하고 그러다보니 자연스럽게 stubbing이나 mocking을 사용해서 테스트를 작성했다.
    - 이처럼 너무 소모적인 테스트는 만들 필요가 없다고 생각한다.
