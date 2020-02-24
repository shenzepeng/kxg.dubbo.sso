package com.kxg.dubbo.sso;

import com.kxg.dubbo.sso.request.LoginRequest;
import com.kxg.dubbo.sso.response.UserLoginResponse;


public interface UserDubboService {
    UserLoginResponse login(LoginRequest request);
}
