package com.bupt.openiot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dy on 2017/4/21.
 */
@RestController
@RequestMapping("/api/deviceaccess")
public class DeviceAccessController {

    @RequestMapping
    public ModelAndView signInView() {
        ModelAndView result = new ModelAndView("access");
        return result;
    }
}
