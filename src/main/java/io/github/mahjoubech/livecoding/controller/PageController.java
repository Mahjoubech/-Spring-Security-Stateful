package io.github.mahjoubech.livecoding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.security.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/public")
    public String publicPage() {
        return "public";
    }

    @GetMapping("/home")
    public String homePage(Model model, Principal principal) {
        return "home";
    }
    @GetMapping("/logout")
    public String logout() {
        return "login";
    }

    @PostMapping("updateProfile")
    @ResponseBody
    public String updateProfile(Principal principal) {
        return "updateProfile";
    }


}
