package jpabook.jpashop.etc;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // @Entity 어노테이션은 데이터베이스의 테이블과 1대1로 매칭되는 객체단위이며 Entity객체의 인스턴스 하나가 테이블의 하나의 레코드 값을 의미한다.
@Getter @Setter
public class Member_del {

    @Id // 객체의 인스턴스를 구분하기 위한 유일한 키 값(PK)을 가지는데 이것은 테이블 상의 Primary Key와 같은 의미를 가지며 @Id 어노테이션으로 표기된다.
    @GeneratedValue // PK컬럼의 데이터 형식은 정해져 있지 않으나 구분이 가능한 유일한 값을 가지고 있어야하고 데이터 경합으로 인해 발생되는
    // 데드락과 같은 현상을 방지하기 위해서 대부분 BigInteger 즉 Long을 주로 사용한다.
    // 데드락 : 동일한 시점에 요청이 유입 되었을 때 데이터베이스는 테이블 혹은 레코드를 lock을 걸어 데이터가 변경되지 않도록 막아놓고 다른 작업을 진행
    // 물론 String 형태의 고정된 키 값을 직접 생성해서 관리하기도 합니다. 가장 중요한 것은 대량의 요청이 유입 되더라도 중복과 deadlock이 발생되지 않을만큼
    // 키 값이 빨리 생성되고 안전하게 관리 되어야 한다.
    // 가장 보편적으로 사용되는 MySQL에서는 auto increment방식으로, ORACLE은 sequence방식을 사용한다.
    // MySQL의 auto increment 방식은 숫자형의 PK 컬럼 속성을 auto increment로 지정하면 자동으로 새로운 레코드가 생성될 때마다 마지막 PK 값에서
    // 자동으로 +1을 해주는 방식입니다. 이를 위해 @GeneratedValue 어노테이션의 stategy 속성을 GenerationType.IDENTITY로 지정해
    // auto increment 컬럼인 것을 EntityManager에게 알려준다.
    // 이 때, 자동으로 생성되는 값을 가지는 PK 컬럼명은 명시적으로 id로 지정하는 것이 관례이다.

    // 참고자료 : https://www.icatpark.com/entry/JPA-%EA%B8%B0%EB%B3%B8-Annotation-%EC%A0%95%EB%A6%AC
    private Long id;
    private String username;

}
