package com.core.po;


import java.math.BigDecimal;
import java.util.Date;

import com.core.util.Page;

public class DmmPay extends Page {
    private Integer id;

    private Integer userId;

    private Long payIntegral;

    private BigDecimal payAmount;

    private Integer payType;

    private String remark;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getPayIntegral() {
        return payIntegral;
    }

    public void setPayIntegral(Long payIntegral) {
        this.payIntegral = payIntegral;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}