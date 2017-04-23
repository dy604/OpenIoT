package com.bupt.openiot.service.auth;

import com.bupt.openiot.model.UserInfo;
import com.bupt.openiot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class RestAuthenticationProvider implements AuthenticationProvider {

    private final BCryptPasswordEncoder encoder;
    private final UserService userService;

    @Autowired
    public RestAuthenticationProvider(final UserService userService, final BCryptPasswordEncoder encoder) {
        this.userService = userService;
        this.encoder = encoder;
    }

    /**
     * 完成对登录逻辑进行判断，验证成功，将用户信息保存到认证的Token中
     * @param authentication
     * @return
     * @throws AuthenticationException
     */
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Assert.notNull(authentication, "No authentication data provided");

        String username = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();

        UserInfo user = userService.findUserByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found: " + username);
        }

        if (!encoder.matches(password, user.getPassword())) {
            throw new BadCredentialsException("Authentication Failed. Username or Password not valid.");
        }

        Collection<GrantedAuthority> authorities = new ArrayList<>();
        return new UsernamePasswordAuthenticationToken(user, user.getPassword(), authorities);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }
}
