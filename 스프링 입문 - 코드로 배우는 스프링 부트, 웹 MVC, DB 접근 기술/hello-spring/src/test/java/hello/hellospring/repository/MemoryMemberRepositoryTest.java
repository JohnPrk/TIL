package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void  afterEach() {
        repository.clearStore();
    }

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        //System.out.println("result = " + (result == member));

        //org.junit.jupiter.api.Assertions을 사용(기본)
        //Assertions.assertEquals(member, result); 성공 => 아무런 값이 나오지 않는다. 다만 메서드에 초록색 체크가 있음
        //Assertions.assertEquals(member, null); 실패 => 오류가 나오며 메서드에 노란색 X표시가 나타남

        //import org.assertj.core.api.Assertions; 요즘은 이것도 많이씀(쉽게 사용할 수 있는 장점)
        //Assertions.assertThat(member).isEqualTo(result);

        //import static org.assertj.core.api.Assertions.*; 을 통해서 함수를 먼저 사용할 수도 있다.
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();

        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);
    }

}

