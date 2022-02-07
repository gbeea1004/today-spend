package geonhee.todayspend.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/login")
@Controller
public class LoginController {

    @GetMapping
    public String loginForm() {
        return "user/login_form";
    }

    @PostMapping
    public String login() {
        log.info("로그인 됨");
        return "redirect:/";
    }
}
