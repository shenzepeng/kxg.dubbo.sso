package com.kxg.dubbo.sso.provider.pojo;

import lombok.Data;

import javax.swing.*;
import java.util.Date;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String flag;
    private String imgUrl;
    private String phoneNumber;
    private Date createTime;
    private Date updateTime;

    public User(){
        this.id=1L;
        this.username="123";
        this.password="456";
        this.flag="1";
        this.imgUrl="http://asdasdas.jpg";
        this.createTime=new Date();
        this.updateTime=new Date();
        this.phoneNumber="911";
    }
}
