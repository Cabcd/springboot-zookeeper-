package com.spring.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.spring.po.SysPermission;
import com.spring.po.UserInfo;

import java.util.List;

public interface SysPermissionService  extends IService<SysPermission> {
    List<SysPermission> selectPermByUser(UserInfo userInfo) throws Exception;
}
