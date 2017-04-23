package com.bupt.openiot.service;

import com.bupt.openiot.mapper.UserCredentialMapper;
import com.bupt.openiot.mapper.UserInfoMapper;
import com.bupt.openiot.model.UserCredential;
import com.bupt.openiot.model.UserInfo;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dy on 2017/4/22.
 */
@Service
@Slf4j
public class UserServiceImp implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImp.class);

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserCredentialMapper userCredentialMapper;

    public List<UserInfo> getAll(UserInfo userInfo) {
        if (userInfo.getPage() != null && userInfo.getRows() != null) {
            PageHelper.startPage(userInfo.getPage(), userInfo.getRows());
        }
        return userInfoMapper.selectAll();
    }

    @Override
    public UserInfo findUserByEmail(String email) {
        logger.trace("Executing findUserByEmail [{}]", email);
        UserInfo user = new UserInfo();
        user.setEmail(email);
        return userInfoMapper.selectOne(user);
    }

    @Override
    public UserCredential findUserCredentialsByUserId(String userId) {
        logger.trace("Executing findUserCredentialsByUserId [{}]", userId);
        UserCredential userCredential = new UserCredential();
        userCredential.setUserid(userId);
        return userCredentialMapper.selectOne(userCredential);
    }
}
