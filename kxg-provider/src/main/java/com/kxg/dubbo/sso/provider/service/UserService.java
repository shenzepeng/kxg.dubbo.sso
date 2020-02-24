package com.kxg.dubbo.sso.provider.service;

import com.kxg.dubbo.sso.provider.pojo.User;

public interface UserService {
    User login(String username,String password);
}
