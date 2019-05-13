package com.spring.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.mapper.UserInfoMapper;
import com.spring.po.UserInfo;
import com.spring.service.UserInfoService;


@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    
}
