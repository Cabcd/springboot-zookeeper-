package com.spring.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spring.po.SysRole;
import com.spring.po.UserInfo;

import java.util.List;

public interface SysRoleService extends IService<SysRole> {
    List<SysRole> selectRoleByUser(UserInfo userInfo) throws Exception;
}
