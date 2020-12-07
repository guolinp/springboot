package com.example.template_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.template_thymeleaf.model.User;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login2")
    public ModelAndView login(User user, HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();

        mv.addObject(user);
        mv.setViewName("redirect:/");

        request.getSession().setAttribute("user", user);
        return mv;
    }

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("page/login");
    }
}
