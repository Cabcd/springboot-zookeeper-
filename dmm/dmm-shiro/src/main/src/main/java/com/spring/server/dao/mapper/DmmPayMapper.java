package com.spring.server.dao.mapper;

import com.spring.server.po.DmmPay;

import java.util.List;

public interface DmmPayMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(DmmPay record);

    DmmPay selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(DmmPay record);

    /**
     * 分页获取用户账户信息
     *
     * @param record  用户id
     * @return
     */
    List<DmmPay> pagePayInfo(DmmPay record);
}