package com.kxg.dubbo.sso.provider.provider;


import com.kxg.dubbo.sso.UserDubboService;
import com.kxg.dubbo.sso.provider.pojo.User;
import com.kxg.dubbo.sso.provider.service.UserService;
import com.kxg.dubbo.sso.provider.utils.JsonUtils;
import com.kxg.dubbo.sso.request.LoginRequest;
import com.kxg.dubbo.sso.response.UserLoginResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.UUID;
@Slf4j
@Service(version = "1.0.0")
public class UserServiceProvider implements UserDubboService {
    @Autowired
    private UserService userService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Override
    public UserLoginResponse login(LoginRequest request) {
        log.info("调用用户登录的dubbo接口-{}",request);
        String username = request.getUsername();
        String password = request.getPassword();
        User user = userService.login(username, password);
        String uuid=UUID.randomUUID().toString();
        String token=uuid+","+user.getId()+","+user.getPhoneNumber();
        log.info("该用户-{},token-{}",user.toString(),token);
        //将token留在redis中
        stringRedisTemplate.opsForValue().set(token, JsonUtils.objectToJson(user));
        UserLoginResponse userLoginResponse=new UserLoginResponse();
        userLoginResponse.setToken(token);
        return userLoginResponse;
    }

}
