package com.spring.server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.core.po.DmmUser;
import com.core.po.User;
import com.core.service.UserService;
import com.spring.server.dao.mapper.DmmUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private DmmUserMapper dmmUserMapper;

    private int addIndex=0;
    public Boolean saveUser(DmmUser user) {
        try {
            System.out.println(user.toString());
            user.setCreateTime(new Date());
            user.setUpdateTime(new Date());
            dmmUserMapper.insert(user);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

}
