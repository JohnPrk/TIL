# 1주차
<br>

- ### ATDD 강의
    - ATDD 강의는 넥스트스텝, 프롤로그 웹 서비스를 개발하면서 직접 경험 해보고 불편한 부분을 개선해 나가면서 쌓았던 노하우들을 강의로 녹여서 전달하는 것
    - 따라서, 매 기수가 열릴 때마다 조금씩 개선되고 바뀌어 가고 있다.
<br>

- ### 넥스트 스텝
    - 성장을 위해서 자기 주도적인 학습 습관을 만들고 프로그래밍을 즐길 수 있도록 도와주는 교육 기관
    - 강의를 통한 주입식 전달이 아닌 미션을 기반으로 한 온라인 코드 리뷰 중심의 교육
<br>

- ### 과정
    - 미션 수행
        
        <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215271799-3ab97081-e2e8-45cd-bd66-c9e531d4574b.png">
        
        - 미션 수행, 온라인 강의, 피드백/코드리뷰 셋 다 중요함
<br>

- ### 미션 - 지하철 노선도
    - 지하철 노선도
        
        <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215271845-4d31ad02-1601-42fe-a605-919de5794bb9.png">

        
    - 지하철 노선도로 선택한 이유 : 도메인에 대한 이해에 드는 비용을 줄이고 기능 구현에 몰입할 수 있도록 선택
    - 지하철 노선도 관련 요구사항을 통해 단계별로 인수 테스트와 API 구현 하기
<br>

- ### 코드 리뷰 프로세스
    - 프로세스
    
        <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215271861-49104789-ec9c-4530-8b80-828e12f6b4bc.png">

        
<br>

- ### 피드백 강의
    - 미션과 코드리뷰 이후 강의 진행
    - 강의보다는 피드백에 조금 더 가까움
<br>

- ### 과정을 슬기롭게 임하는 방법
    - 정신무장(환경 바꾸기, 시간 확보하기)
    - 매일 1~2시간씩 매일 꾸준히 미션 진행하기
    - 리뷰어가 상반될 경우 → 혼란스러워 하지 말고 즐기기
    - 지우고 다시 해보기 : ‘미션을 완성한다’가 목표가 되지 말고 리뷰를 통해 계속 고민하고 성장하기
    - 정답을 찾기위해 집착하지 말기 : 정답은 존재하지 않는다. 다만 찾기 위해 노력할 뿐
<br>

- ### ATDD 과정 소개
    - 이번 과정에서는
        - E2E(API) 테스트 기반의 인수 테스트 작성 경험
        - 인수 테스트 기반 웹 API 기능 구현 경험
        - 웹 프로젝트 레벨의 TDD 경험
        - 스프링 기반의 테스트 도구 학습
        - 코드 리뷰 프로세스 경험
    - 기대효과
        - 인수 테스트 기반으로 TDD를 할 수 있다.
        - 테스트를 효과적으로 리팩토링하여 유지보수를 잘 할 수 있다.
        - 새로운 프로젝트 뿐만 아니라 레거시 코드에서도 TDD를 할 수 있다.
        - 남들에게 TDD와 ATDD가 실무에서 가능하다고 설명할 수 있다.
    - 무엇을 학습할 것인가?
        - 요구사항 → 문서화 → 인수테스트 → TDD → API 개발 → 테스트 리팩토링
        - 인수 테스트를 어떻게 가독성 좋게 해볼 것인가?
        - 중요하지 않은 인수 조건(시나리오)는 단위 테스트로 분리해보는 경험
        - 인수 테스트를 효율적으로 동작하게끔 해보는 경험
    - 주차별 학습
        - 1주차 : 인수 테스트
        - 2주차 : 인수 테스트를 기반으로 TDD 싸이클 경험
        - 3주차 : 강의 X(2주차 미션이 2주짜리 미션이라고 생각하면 됨)
        - 4주차 : 인증 기반 인수 테스트 - 외부 API에 의존적인 인수 테스트를 경험
        - 5주차 : 문서화를 포함한 전체 인수 테스트 싸이클을 경험 + 노하우
    - 미션 소개
        - 지하철 노선도 관리 - 어드민, 경로 검색, 즐겨 찾기, 요금 계산
        - 기능을 구현하는 것만이 미션의 목적은 아닙니다. → ATDD가 어떻게 기능 구현에 도움이 되는지 충분히 느낄 수 있는 시간이였으면 좋겠다.
<br>

- ### ATDD를 이야기 하기 전에
    - ATDD는 모든 문제를 해결 할 수 있다! → ❌
    - ATDD는 모든 문제를 해결할 수는 없다 → 하지만 필요한 상황에 맞춰서 잘 사용할 수 있는 도구
        - 어떤 상황 ?
            - 개발하다가 길을 잃어버리는 상황
            - 요구사항을 잘못 이해하는 상황
        - 내(개발팀, 회사)가 무엇(요구사항)을 개발(구현) 하려고 했는지 명확한 인지하고 확인할 수 있는 방법 = ATDD
<br>

- ### TDD의 단위 테스트
    - 구현한 대로 동작하는가? vs 의도한 대로 동작하는가?
    - 의도한 대로 동작하는지 확인은 단위 테스트로는 부족할 수 있다. → 의도한 대로 동작하는지 보장하는 인수 테스트를 만들어가면서 보완할 수 있다.
<br>

- ### TDD vs ATDD
    
    <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215271897-12003d01-4247-4dd7-9fb5-0fbb83ebdf3b.png">

    
    - TDD는 작은 단위의 요구 사항을 검증하는 (단위)테스트를 만들면서 개발하는 프로세스
    - ATDD는 시나리오 형태의 요구사항(기획자, QA 관점 등)을 검증하는 (인수)테스트를 만들면서 개발하는 프로세스
    

<br>

- ### 쉬는 시간(질문)
    - BDD와 ATDD의 차이점은 무엇인가요?
        - 사실 테스트를 짠 것을 놓고 보거나 어떤 의도로 한지를 놓고 보았을 경우에는 같다고 볼 수 있다.
        - ATDD 사이클 : 유저 스토리를 기반으로 인수 조건을 만들고 인수 조건이 검증되는 인수 테스트를 만들면서 개발하는 프로세스
            <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215272642-5cb03334-4ee6-4499-80c1-f15878a851fb.png">
            
        - 개발자 중요하게 생각하는 부분
            
            <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215272699-073f10ad-32b6-4f88-926e-79b98cd9b0de.png">
            
        - BDD는 행위 주도로 시나리오가 작성된다. ↔ ATDD는 인수 조건을 기반으로 테스트를 한다.
        - 1주차에는 BDD와 ATDD를 구분 하지 않았으면 좋겠다.
        - 1주차에서 하는 것은 BDD와 동일하다
        - 인수 테스트라함은 ‘요구사항이 있냐 없냐’의 차이인 것 같다.
    - 고객 관점과 PO(Product Owner) 관점은 같은건가요?
        
        애자일에서는 고객과 PO를 동일시 해서 같은 관점이라고 생각하셔도 될 것 같습니다.
        
    - 통합 테스트와 인수 테스트의 차이는 시나리오 기반인지 아닌지 일까요?
        - 모호하다.
        - 통합 테스트, 인수 테스트, BDD, E2E 테스트가 뭐가 다른지 매 기수마다 나왔던거 같다. → ‘린 애자일 기법을 활용한 테스트 주도 개발’ 책에서 많은 해결점을 찾았던 것 같다.

<br>

- ### ATDD를 하는 이유
    - 생산성 증가(명확한 요구사항 정의가 불필요한 반복을 줄여준다.)
    - 작업의 명확한 시작과 끝을 제시
    - TDD의 부족한 부분 보완 가능(큰 기능을 검증하기가 쉽지 않거나 단위 테스트를 통합하면서 의도하지 않는대로 동작하는 것을 검증할 수 있음)
    - 빠른 피드백(굳이 배포를 하지 않더라도 시나리오 레벨에서 테스트로 검증할 수 있음 / 새로운 기능을 구현하면서 다른 기능에 영향(사이드 이펙트)을 주는 것을 확인할 수 있음)
    - 귀찮은 작업 프로세스로 강제
<br>

- ### 인수 테스트란?
    - 사용자 스토리를 검증하는 기능 테스트
    - 사용자 스토리로 테스트할 시나리오를 지정
    - 명세나 계약의 요구 사항이 충족되는지 확인하기 위해 수행되는 테스트(제일 마지막 단계에서 사용)
    - 인수 == 수락(받아들임)
    - 테스트 주도 개발로 배우는 객체 지향 설계와 실천(BDD의 바이블)
<br>

- ### 콘솔 기반 예시)
    - 로또 요구사항
        - 콘솔 기반의 로또 애플리케이션을 만든다.
        - 금액을 입력하면 금액에 맞는 갯수의 로또를 구입한다.
        - 지난 주 당첨 번호를 입력하면 당첨 결과와 수익률이 계산된다.
    - 시나리오 작성(요구 사항 형식을 바꿈)
        - 10,000원을 입력한다.
        - 10장의 로또가 구매된다.
        - 구입한 10장의 로또 번호가 출력된다.
        - 지난 주 당첨 번호로 1,2,3,4,5,6를 입력한다.
        - 당첨 통계가 출력된다.
        - 수익률이 출력된다.
    - 비정상적인 시나리오 작성
        - 적은 금액
        - 유효하지 않은 당첨 번호
        
<br>

- ### API 기반 예시)
    - 지하철 역 관리 기능 구현하기
        - 지하철 역 생성
        - 지하철 역 목록 조회
        - 지하철 역 삭제
        
    - 시나리오 작성
        - 지하철 역 생성
            - 지하철 역 생성 요청을 한다.
            - 지하철 역이 생성 되었다.
        - 지하철 역 목록 조회
            - 지하철 역이 생성되어있다.
            - 지하철 역 목록을 조회 요청을 한다.
            - 지하철 역 목록이 응답되었다.
        
        (…)
        
<br>
    
- ### 이번 과정에서의 인수 테스트
    - 테스트는 테스트의 의도에 따라 구현 방법이 달라진다.
    - 백엔드 개발자가 단독적으로 적용해서 실천해볼 수 있는 범위
    - 고객은 프론트엔드 개발자 혹은 API를 활용하는 사람 대상
    - API 접점에서 검증하는 E2E 테스트
    - API의 Request와 Response 정보 이외 내부 정보는 최대한 가리는 블랙 박스 형식의 테스트
<br>

- ### 인수 테스트 만들기 전에 알아야할 것
    - 인수 테스트는 블랙 박스 테스트의 성격을 가지고 있음
<br>

- ### 테스트 도구
    - SpringBoot Test
        - 해당 프로덕션에서 사용하는 Bean들을 테스트 환경에서도 그대로 가져다 쓸 수 있음
    - RestAssured Test
        - RestAssured는 REST-API의 테스트 및 검증을 단순화하도록 설계
        - HTTP 작업에 대한 검증을 위한 풍부한 API 활용 가능
    - JsonPath
        - 응답 받은 객체를 클래스 형태로 래핑하는 방법도 있지만
        - JsonPath를 통해 응답받은 Json 값 그 자체로 테스트 가능


<br>

- ### 인수 테스트 실습
    - 주제 : 지하철역 생성 인수 테스트 만들기
    - 환경 : E2E 테스트(인수 테스트)를 안 만들어놓은 상황 / 프로덕션 코드는 존재
    - 목표 : 미리 구현되어 있는 기능을 검증하는 테스트를 작성
    - Todo
        - SpringBootTest 설정
        - RestAssured 작성
    - 코딩
        - 요구사항
            
            <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215273000-b7008a17-2ce4-42b7-9f03-1c720fae0759.png">  

            
        
        - SpringBootTest 어노테이션 설정
            
            <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215273023-8137f5fc-fce0-4346-8d16-5d25c69aeb20.png">

            
            - webEnvironment(포트 설정에 관한 부분) : MOCK, RANDOM_PORT, DEFINED_PORT, NONE
        
        - RestAssured 작성
            
            <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215273030-8a2f4b26-6f5a-4149-904c-ba1c7c53a2b2.png">
            
            - given() :  요청을 보내는 Request에 포함되어 있는 데이터
            - when() : 메서드와 URL을 넣어줌
            - then()
            
        - body / extract로 응답 객체 뽑아내기
            
            <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215272825-706fa822-85c5-4b87-b98e-ca5f20e50430.png">

            
            - body() : Request에 들어갈 내용 넣기
            - extract() : 응답 객체로 뽑아내기(Response) - Response의 정보를 다 확인할 수 있다.
        
        - var 사용하기(자바 11 이상 버젼부터 가능)
            
            <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215272831-ec4b9518-bdb8-4476-89a3-c2eff97e79e7.png">
            
        
        - 간단하게 statusCode 확인
            
            <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215272836-c5d7f06c-051c-4eee-885b-287687a1549d.png">
            
            
            - 포트 번호가 달라서 실패 ⇒ RestAssured는 기본 포트는 8080임을 알 수 있다.
                
                <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215272847-f254686c-ddf1-4e5d-a667-fab464a876a1.png">
                
                
                <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215272852-ce065be5-13ef-4510-aa53-46015752237a.png">
                
                
            - 해결 ⇒ 랜덤 포트를 주입 받아서 RestAssured의 portd에 넣어주기
                
                <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215272855-f858d53b-2353-4050-b4de-b1c4a85269ff.png">
                
                
            - 또 실패 ? → ‘path의 주소값을 가진 controller가 없다는게 아닌가?’ 추측
                
                <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215272858-aa967ffb-1ea1-4721-89a1-fd5497032aff.png">
                
                실제 이유 : 요청할 때, Content-Type이 text/plain이라 발생
                
                <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215272861-df485803-2f8f-4d47-a0ca-9ba231e24b65.png">
                
                
            - 해결 ⇒ ContentType을 Json Value로 바꿔주기
                
                <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215272863-1ea8a1a3-a07d-4436-a5de-011dc278ef78.png">
                
               
                @RequestBody는 Json 형태의 바디 값을 인지할 수 있음
            
        - 공통되게 사용하는 부분은 메서드 분리도 고려해볼 수 있음
            
            <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215272877-5fa34cd1-f2e5-43b7-b092-6cbb18caa019.png">
            
        
        - logback-access.xml을 통해서 로그 파일을 다양하게 볼 수 있음
            
            <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215272881-5df8d522-6b3b-4487-a027-12ca736eb05f.png">
            
            <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215272887-3e20be54-c5cc-4fda-a918-51dfa5b307cd.png">
            
<br>

- ### 질문
    - 질문이 있는데요 ...만약에 서비스 단의 로직 중 일부를 mocking해서 강제로 response 응답을 내려준 결과를 테스트하는 경우는 단위테스트 인가요 ??ㅇㅖ를 들어 외부 통신 api 통신 실패에 대한 시나리오를 검증하기 위해 사용했다면 이건 인수테스트가 되는건가요 ??
        - 단위 테스트라고 하긴 어렵다.
        - 세 번째 미션에서 외부 API에 의존하는 테스트를 만들건데, Mocking이나 Stubing을 이용할 수 있는거고, Fake도 이용할 수 있다.
        - ‘절대적으로 mocking을 쓰면 안된다’, ‘절대적으로 블랙박스를 써야한다’ 이런 방식의 접근법은  지양해야 한다고 생각합니다.
        - 가능하면 블랙박스의 형태로 하되, 실무에서 할 때 필요하다면 Mocking, Stubing, Fake를 사용할 수 있다고 생각한다.
    - 현재 예시에서는 Request를 HashMap으로 만드셨는데 RequestDTO안에 객체가 들어있다거나 List객체가 들어간 경우에는 어떤식으로 구현하는게 좋을까요?
        - 제가 Map으로 만든 이유는 최대한 프로덕션 코드에 의존하지 않는 테스트를 만들고자 해서 만들었다.
        - 근데 이게 실제로 쓰다보면 되게 번거롭다. 특히나 자주 바뀌거나 현재 개발 중인 API를 만들 때는 수정시 꼭 두 번 작업을 해야한다.
        - 굳이 DTO를 쓰든 Map을 쓰든 상관은 없다.
        - DTO를 쓰는 이유는 제가 팀원들을 설득 못 한 경우다 ,, ㅎㅎ(의존을 최소화)
        - DTO를 사용하는 것은 효율적으로 편하게 테스트 만들기
    - fixture용 객체를 하나 만들면 편하다.

<br>

- ### 인수 테스트 만들기 피드백
    - webEnvironment
        
        <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215273298-2fc521c9-509b-4016-8456-1f816b681137.png">
        
        - SpringBootTest의 webEnvironment 설명의 default값은 MOCK이다.
        - RANDOM_PORT, DEFINED_PORT는 실제로 내장(embedded:true)되어있는 web server(톰 캣, …)을 띄운다.
        - MOCK, NONE는 실제로 내장(embedded:true) 되어있는 web server(톰 캣, …)을 띄우지 않는다.
        - MOCK은 톰캣은 안 쓰지만, Dispatcher Sevlet을 이용해서 Handler를 찾아가는 데까지는 한다.
        - 원래는 톰캣을 거쳐서 Dispatcher Sevlet 요청을 받은 다음 동작을 하는 것인데,
        - MOCK은 실제 HTTP 요청과 응답이 없이 구성을 하는 방법
    - MockMvc vs WebTestClient vs RestAssured
        
        <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215273301-23ecaa80-9cb3-4cdc-9b05-24f741736bfc.png">
        
        - WebTestClient를 안 쓰는 이유 :  이 객체는 SpringMVC에 포함되어 있는 테스트 객체가 아니라 WebFlux Library에 포함되어 있는 테스트 객체입니다.
        - 그래서 tomcat이 아니라 Netty가 기본적으로 뜬다.
        
<br>

- ### 인수 테스트 주도로 개발 하기
    - 인수 조건 정의
        - 인수 테스트가 충족해야 하는 조건
        - 이번 과정에서는 시나리오 형태로 표현(given / when / then)
            
            <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215273304-aec83815-60fc-42e9-bdf6-2d327f7b1173.png">
            
    - 인수 테스트 작성
        - 인수 조건을 검증하는 테스트
        - 실제 요청/응답하는 환경과 유사하게 테스트 환경을 구성
        - SpringBootTest - webEnvironment 설정
            
            <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215273306-3f996771-98dc-42d3-85e4-4475ee0fb4e3.png">
            
        - RestAssured를 이용한 테스트 작성(`요청` / `응답` / `처리` / `검증`)
            
            <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/215273310-9be61b9a-38f0-4b98-ba58-64b3a0cc1658.png">
            
    - 기능 구현
        - 인수 테스트 기반으로 하나씩 기능 개발을 진행

<br>

- ### 미션 소개
    - 포인트 : 인수 테스트(E2E 테스트)가 중점!
    - 1단계
        - 지하철 역을 관리하는 기능의 뼈대 코드가 주어졌음
        - station이라는 (도메인 / 엔터티) 리스소에 C(Create)R(Read)D(Delete) API가 만들어져있고 기능이 구현되어 있습니다.
        - 인수 테스트에 대해서 생성에 대해서는 작성이 되어 있는데, 조회, 삭제에 대해서는 미션으로 진행하시면 됩니다.
    - 2단계
        - ‘지하철 노선’이라는 도메인을 인수 테스트를 만들고 기능 구현을 하는 부분을 다룰 것이다.
        - CRUD API를 만드는데, 그에 필요한 인수 조건을 기반으로 만든다.
    - 3단계
        - ‘지하철 구간 관리’을 추가하거나 삭제하는 기능이 들어간다.
        

<br>

- ### 정정 내용
    - Mock 환경에서 사용할 수 있는 테스트 객체는 MockMVC이다
<br>
