package com.example.xlr8travel.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/signup")
public class SignupController {
    @GetMapping
    public ModelAndView getTestData() {
        ModelAndView mv = new ModelAndView();
        return mv;
    }
}
