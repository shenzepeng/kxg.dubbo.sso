package com.kxg.dubbo.sso.consumer.controller;

import com.kxg.dubbo.sso.UserDubboService;
import com.kxg.dubbo.sso.consumer.common.SzpJsonResult;
import com.kxg.dubbo.sso.request.LoginRequest;
import com.kxg.dubbo.sso.response.UserLoginResponse;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Reference(version = "1.0.0")
    private UserDubboService userDubboService;
    @GetMapping
    public String getHello(){
        return "hello";
    }

    @PostMapping("login")
    public SzpJsonResult<UserLoginResponse> login(@RequestBody LoginRequest request){
        return SzpJsonResult.ok(userDubboService.login(request));
    }
}
