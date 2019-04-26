package com.spring.server.dao.mapper;


import com.core.po.DmmTransaction;

import java.util.List;

public interface DmmTransactionMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(DmmTransaction record);


    DmmTransaction selectByPrimaryKey(Integer id);


    int updateByPrimaryKey(DmmTransaction record);

    /**
     * 分页获取用户账户信息
     *
     * @param record  用户id
     * @return
     */
    List<DmmTransaction> pageTransactionInfo(DmmTransaction record);
}