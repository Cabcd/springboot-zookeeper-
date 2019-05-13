package com.spring.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.mapper.SysRoleMapper;
import com.spring.po.SysRole;
import com.spring.po.UserInfo;
import com.spring.service.SysRoleService;

import java.util.List;

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
    @Override
    public List<SysRole> selectRoleByUser(UserInfo userInfo) throws Exception {
        return null;
    }
}
