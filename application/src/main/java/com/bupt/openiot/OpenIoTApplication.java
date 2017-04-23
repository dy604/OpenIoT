package com.bupt.openiot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by dy on 2017/4/21.
 */
@EnableWebMvc
@Controller
@SpringBootApplication
@MapperScan(basePackages = "com.bupt.openiot.mapper")
public class OpenIoTApplication extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(OpenIoTApplication.class, args);
    }

    /**
     * 设置项目首页
     * @return
     */
    @RequestMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping("/api/homepage")
    String home() {
        return "homepage";
    }
}
