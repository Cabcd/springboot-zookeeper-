package com.spring.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.spring.po.SysUser;

public interface SysUserService extends IService<SysUser> {
    void myTest() throws Exception;

    Page<SysUser> myTest2() throws Exception;
}
