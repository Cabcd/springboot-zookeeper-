package com.spring.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.mapper.SysPermissionMapper;
import com.spring.po.SysPermission;
import com.spring.po.UserInfo;
import com.spring.service.SysPermissionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements SysPermissionService {

    @Override
    public List<SysPermission> selectPermByUser(UserInfo userInfo) throws Exception {
        return baseMapper.selectPermByUser(userInfo);
    }

}
