package com.spring.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spring.po.SysRole;
import com.spring.po.UserInfo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huitu123
 * @since 2018-01-23
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<SysRole> selectRoleByUser(UserInfo userInfo);
}
