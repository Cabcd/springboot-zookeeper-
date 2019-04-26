package com.spring.server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.spring.server.po.User;
import com.spring.server.service.UserService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {
    private int addIndex=0;
    public User saveUser(User user){
        int k=++addIndex;
        user.setId(k);
        System.out.println(user.toString());
        return user;
    }

}
