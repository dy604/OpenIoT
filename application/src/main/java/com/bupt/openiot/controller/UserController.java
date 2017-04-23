package com.bupt.openiot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dy on 2017/4/21.
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @RequestMapping("/personui")
    public ModelAndView signInView() {
        ModelAndView result = new ModelAndView("personal_information");
        return result;
    }
}
