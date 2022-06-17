package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {

    private MemberService memberService;
//    @Autowired private MemberService memberService; //DI의 필드 주입(별로 안 좋음 => 나중에 바꿀 수 없음)

//    @Autowired
//    public void setMemberService(MemberService memberService) { //DI의 Setter 주입(별로 안 좋음 => 나중에 바뀔 일이 없는데 public으로 너무 노출 됨)
//        this.memberService = memberService;
//    }

    @Autowired
    public MemberController(MemberService memberService) { //DI의 생성자 주입(가장 많이 씀)
        this.memberService = memberService;
        System.out.println("memberService =" + memberService.getClass());
    }


    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }
    @GetMapping("/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }
}
