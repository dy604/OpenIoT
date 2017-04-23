package com.bupt.openiot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dy on 2017/4/21.
 */
@RestController
@RequestMapping("/api/devicemanage")
public class DeviceManageController {

    @RequestMapping
    public ModelAndView deviceView() {
        ModelAndView result = new ModelAndView("instance");
        return result;
    }

    @RequestMapping("property")
    public ModelAndView property() {
        ModelAndView result = new ModelAndView("property");
        return result;
    }
}
