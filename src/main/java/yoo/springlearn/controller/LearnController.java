package yoo.springlearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LearnController {

    @GetMapping("test")
    public String test(Model model) {
        model.addAttribute("data", "hello world");
        return "test";
    }
}
