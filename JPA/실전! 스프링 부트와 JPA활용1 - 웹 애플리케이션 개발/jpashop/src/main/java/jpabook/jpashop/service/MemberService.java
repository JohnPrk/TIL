package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true) // readOnly=true: 간단한 읽기일 경우 성능 최적화(global 적용) -> 쓰기에는 적용하면 안됨
@RequiredArgsConstructor
public class MemberService {


    private final MemberRepository memberRepository;


    // 회원 가입
    @Transactional // 쓰기 용도이기 때문에 readOnly=false(default)로 둠
    public Long join(Member member) {
        validateDuplicateMember(member); // 중복회원 검증 로직
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        // EXCEPTION
        List<Member> findMembers = memberRepository.findByName(member.getName());
        if(!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    // 회원 조회
    public Member findOne(Long id) {
        return memberRepository.findOne(id);
    }

    // 전체 회원 조회
    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
