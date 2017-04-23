package com.bupt.openiot.conf;

import com.bupt.openiot.service.auth.RestAuthenticationProvider;
import com.bupt.openiot.service.auth.RestLoginProcessingFilter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * Created by dy on 2017/4/22.
 */
@Configuration
@EnableWebSecurity
public class OpenIoTSecurityConfig extends WebSecurityConfigurerAdapter {

    public static final String FORM_BASED_LOGIN_ENTRY_POINT = "/api/auth/login";

    @Autowired
    private AuthenticationSuccessHandler successHandler;  //登录成功处理类
    @Autowired
    private AuthenticationFailureHandler failureHandler;  //登录失败处理类
    @Autowired
    private RestAuthenticationProvider restAuthenticationProvider;  //该类实现了用户登录的逻辑
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    protected BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * 登录前过滤器
     * @return
     * @throws Exception
     */
    @Bean
    protected RestLoginProcessingFilter buildRestLoginProcessingFilter() throws Exception {
        RestLoginProcessingFilter filter = new RestLoginProcessingFilter(FORM_BASED_LOGIN_ENTRY_POINT, successHandler, failureHandler, objectMapper);
        filter.setAuthenticationManager(this.authenticationManager);
        return filter;
    }

    /**
     * Request层面的配置，对应XML Configuration中的<http>元素
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/api/signupui", FORM_BASED_LOGIN_ENTRY_POINT).permitAll()  /*/和/api/signupui不需要验证就可以访问*/
                .anyRequest().authenticated()  //任何请求,登录后可以访问
                .and()
                .formLogin()  /*定义需要用户登录时，转到登录页面*/
                .loginPage("/api/signinui")
                .permitAll()  //登录页面用户任意访问
                .and()
                .addFilterBefore(buildRestLoginProcessingFilter(), UsernamePasswordAuthenticationFilter.class)
                .logout()
                .logoutSuccessUrl("/") // 退出登录后的默认网址是”/”
                .permitAll(); //注销行为任意访问

        http.csrf().disable()   // 禁用security的csrf
                .exceptionHandling();
    }

    /**
     * Web层面的配置，一般用来配置无需安全检查的路径
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/static/**");
    }

    /**
     * 在内存中创建了一个用户，该用户的名称为user，密码为password，用户角色为USER。
     * @param auth
     * @throws Exception
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(restAuthenticationProvider);  //配置用户登录过滤器
    }

}
