package jpabook.jpashop;

import jpabook.jpashop.etc.MemberRepository_del;
import jpabook.jpashop.etc.Member_del;
import org.assertj.core.api.Assertions;
import org.junit.Test; //
import org.junit.runner.RunWith; //
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


/* 단위 테스트 케이스(단위 테스트=junit) 세팅
* 단위 테스트 : 소스코드의 특정 모듈이 의도된 대로 정확히 작동하는지 검증하는 절차이다.
* 또한, 모든 함수와 메소드에 대한 테스트 케이스(Test case)를 작성하는 절차를 말한다.
* @RunWith(SpringRunner.class) 어노테이션을 사용하는 이유 :
* @SpringBootTest만 사용하면 application-context를 전부 로딩해서 무겁고 시간이 오래걸린다.
* 하지만, @RunWith(SpringRunner.class) 어노테이션을 사용하면 @Autowiredm @MockBean에
* 해당하는 것들에만 application-context를 로딩하게 되므로 빠르고 단위 테스트에 적합하다.
* 'SpringRunner'은 별칭으로 'SpringJUnit4ClassRunner,JUnit 테스트 라이브러리 등등'을
* 결합한 것을 의미한다.
*/

/* 스프링 부트에서는 'spring-boot-starter-test'를 제공하고 이 안에는 다음 라이브러리가 있다.
* spring-boot-starter-test
* Spring Test & Spring Boot Test
* AssertJ
* Mockito 등등
*
 */

/* 통합 테스트 케이스(통합 테스트=@SpringBootTest) 세탕
* @SpringBootTest 어노테이션 : 실제 운영 환경에서 사용될 클래스들을 통합하여 테스트 한다.
* 단위 테스트와 같이 기능 검증을 위한 것이 아니라 spring framework에서 전체적으로 플로우가
* 제대로 동작하는지 검증하기 위해 사용 한다.
* 단점 : 애플리케이션의 설정, 모든 Bean을 모두 로드하기 때문에 시간이 오래걸리고 무겁다.
* 또한, 테스트 단위가 크기 때문에 디버깅이 어려운 편이다.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberDelRepositoryTest {

    // 자동으로 의존성 주입
    @Autowired
    MemberRepository_del memberRepositoryDel;

        /*
        * @Test가 메서드 위에 선언되면 이 메서드는 테스트 대상 메소드임(단위 테스트)을 의미한다.
        * @test 어노테이션은 테스트를 수행하는 메소드를 지정합니다.
        * jUnit에서는 각각의 테스트가 서로 영향을 주지 않고 독립적으로 실행되는 것을 지향합니다.
        * 따라서 @Test 단위 마다 필요한 객체를 생성해 지원해줍니다.
        */

        /*
        * @Transaction : 데이터베이스의 상태를 변경하는 작업 또는 한번에 수행되어야 하는 연산들을 의미한다.
        * 예외 발생 시 Rollback 처리를 자동으로 수행해준다.
        * @Transactional([rollbackFor=Exception.class]) => 특정 예외 발생시 강제로 Rollback
        * 정확하진 않지만 then에서 처리해야하는 함수가 2개이므로  @Transactional을 꼭 넣어줘야함 아니면 에러
        * @Transactional이 없어서 발생하는 에러는 다음과 같다.
        * org.springframework.dao.InvalidDataAccessApiUsageException:
        * No EntityManager with actual transaction available for current thread
        * - cannot reliably process 'persist' call; nested exception is javax.persistence.
        * TransactionRequiredException: No EntityManager with actual transaction available for current thread
        * - cannot reliably process 'persist' call
         */

        /*
        * AssertJ : 두 객체의 동일성이나 객체의 필드를 조사하기 위해 다양한 방법으로 비교할 수 있다.
         */
        @Test
        @Transactional // @Transactional이 @Test밑에 있으면 테스트 이후에 바로 Rollback을 해버린다. => DB에 자료 초기
        @Rollback(value = false) // 자동으로 Rollback 되는 것을 막아준다. => 테스트 케이스가 구현되는지 확인하고 싶을 때 사용
        public void testMember() throws Exception {
            // given
            Member_del memberDel = new Member_del();
            memberDel.setUsername("memberB");

            // when
            Long saveId = memberRepositoryDel.save(memberDel);
            Member_del findMemberDel = memberRepositoryDel.find(saveId);

            // then(트랜잭션 적용 => 둘 중에 하나라도 에러가 나면 rollback이 된다)
            Assertions.assertThat(findMemberDel.getId()).isEqualTo(memberDel.getId());
            Assertions.assertThat(findMemberDel.getUsername()).isEqualTo(memberDel.getUsername());
            Assertions.assertThat(findMemberDel).isEqualTo(memberDel); // JPA 엔티티 동일성 보장
    }
}