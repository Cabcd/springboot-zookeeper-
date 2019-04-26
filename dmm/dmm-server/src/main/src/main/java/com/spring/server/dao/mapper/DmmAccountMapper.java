package com.spring.server.dao.mapper;

import com.spring.server.po.DmmAccount;

import java.util.List;

public interface DmmAccountMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(DmmAccount record);

    DmmAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(DmmAccount record);

    /**
     * 分页获取用户账户信息
     *
     * @param record  用户id
     * @return
     */
    List<DmmAccount> pageAccountInfo(DmmAccount record);
}