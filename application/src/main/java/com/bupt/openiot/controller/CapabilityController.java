package com.bupt.openiot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dy on 2017/4/21.
 */
@RestController
@RequestMapping("/api/capability")
public class CapabilityController {

    @RequestMapping("/evaluate")
    public ModelAndView evaluate() {
        ModelAndView result = new ModelAndView("evaluate");
        return result;
    }
}
