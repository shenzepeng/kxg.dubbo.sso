package com.kxg.dubbo.sso.response;

import lombok.Data;

import java.io.Serializable;
@Data
public class UserLoginResponse implements Serializable {
    private String token;
}
