package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    /*
    * Model이란 무엇인가? 이 친구에다가 data를 싣어서 view로 넘길 수 있다!
    * return은 "이동할 화면(view)이름"이고
    * 'resources' -> 'templates'에서 '이동할 화면(view)이름.html' 파일을 찾아서 이동시켜준다.
    * = resources:template/+{ViewName}+.html
    * 순수하게 서버 렌더링을 안 하고 정적인 페이지를 띄우고 싶다면 'resources' -> 'static' -> 'index.html'을 만들어준다.
    */
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!!");
        return "hello";
    }

}
