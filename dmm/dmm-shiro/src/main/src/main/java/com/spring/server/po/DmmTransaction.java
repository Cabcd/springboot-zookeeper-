package com.spring.server.po;
import com.spring.server.util.Page;

import java.math.BigDecimal;
import java.util.Date;

public class DmmTransaction extends Page {
    private Integer id;

    private Integer userId;

    private BigDecimal consumeAmount;

    private Long consumeIntegral;

    private BigDecimal rate;

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

    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public Long getConsumeIntegral() {
        return consumeIntegral;
    }

    public void setConsumeIntegral(Long consumeIntegral) {
        this.consumeIntegral = consumeIntegral;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
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