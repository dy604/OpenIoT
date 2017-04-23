package com.bupt.openiot.service;

import com.bupt.openiot.model.UserCredential;
import com.bupt.openiot.model.UserInfo;

import java.util.List;

/**
 *
 * Created by dy on 2017/4/21.
 */
public interface UserService {

    public List<UserInfo> getAll(UserInfo userInfo);

    public UserInfo findUserByEmail(String email);

    public UserCredential findUserCredentialsByUserId(String userId);
}
