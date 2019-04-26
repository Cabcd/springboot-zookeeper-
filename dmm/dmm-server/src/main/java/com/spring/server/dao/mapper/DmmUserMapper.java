package com.spring.server.dao.mapper;



import com.core.po.DmmUser;

import java.util.List;

public interface DmmUserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(DmmUser record);

    DmmUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(DmmUser record);

    /**
     * 分页获取用户账户信息
     *
     * @param record  用户id
     * @return
     */
    List<DmmUser> pageUserInfo(DmmUser record);

    /**
     * 修改用户状态
     * @return
     */
    int uptUserStatus(DmmUser record);

}