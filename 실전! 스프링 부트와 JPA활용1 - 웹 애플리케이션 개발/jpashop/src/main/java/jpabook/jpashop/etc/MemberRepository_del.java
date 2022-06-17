package jpabook.jpashop.etc;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository_del {

    @PersistenceContext
    private EntityManager em;

    // save함수로 저장된 member를 반환(리턴)하면 되지 않나?
    // DML언어는 '커맨드와 쿼리를 분리한다!'라는 약속이 있다.
    // 땨라서, 추후에 간단하게 사용할 수 있도록 num(Long)타입의 member.getId 값을 들고 온다.
    // 저장을 하고나면 가급적이면 사이드 이벤트를 일으키는 커맨드성이기 때문에 리턴 값을 굳이 만들 필요는 없다.
    // 하지만, 아이디를 리턴하면 조회는 바로 할 수 있으니 아이디 값으로 반횐(리턴) => 선택적인 부분

    // ++++ 아무 자리에서나 테스트 케이스(Shift + Command + T) ++++


    // db에 Member_del 타입으로 저장(JPA 장점)
    public Long save(Member_del memberDel) {
        em.persist(memberDel);
        return memberDel.getId();
    }
    // db에서 id값에 맞는 값 출력
    public Member_del find(Long id) {
        return em.find(Member_del.class, id);
    }
}
