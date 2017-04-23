package com.bupt.openiot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dy on 2017/4/21.
 */
@RestController
@RequestMapping("/api")
public class LoginController {

    @RequestMapping("/signinui")
    public ModelAndView signInView() {
        ModelAndView result = new ModelAndView("signin");
        return result;
    }

    @RequestMapping("/auth/login")
    public ModelAndView login() {
        ModelAndView result = new ModelAndView("homepage");
        return result;
    }

    @RequestMapping("/signupui")
    public ModelAndView signUpView() {
        ModelAndView result = new ModelAndView("signup");
        return result;
    }
}
