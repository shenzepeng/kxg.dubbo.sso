package com.kxg.dubbo.sso.provider.service.impl;

import com.kxg.dubbo.sso.provider.pojo.User;
import com.kxg.dubbo.sso.provider.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User login(String username, String password) {
        User user=new User();
        if (user.getUsername().equals(username)&&user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
}
