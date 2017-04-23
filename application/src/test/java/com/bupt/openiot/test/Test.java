package com.bupt.openiot.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by dy on 2017/4/23.
 */
public class Test {

    /**
     * 生成加密密码
     * @param args
     */
    public static void main(String[] args) {
        String password = "123456";
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);
        System.out.println(hashedPassword);
    }
}
