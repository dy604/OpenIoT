package com.bupt.openiot.controller;

import com.bupt.openiot.model.UserInfo;
import com.bupt.openiot.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dy on 2017/4/21.
 */
@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public PageInfo<UserInfo> test(UserInfo userInfo) {
        List<UserInfo> userInfoList = userService.getAll(userInfo);
        return new PageInfo<UserInfo>(userInfoList);
    }
}
