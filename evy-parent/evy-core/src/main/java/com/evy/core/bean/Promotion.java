package com.evy.core.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Promotion implements Serializable {
    private Long id;

    private Long accountId;

    private Long storeId;

    private String name;

    private Integer amount;

    private Integer oneLimitNum;

    private BigDecimal money;

    private String type;

    private BigDecimal thresholdMoney;

    private String password;

    private Date getBeginTime;

    private Date getEndTime;

    private Date effectBeginTime;

    private Date effectEndTime;

    private String status;

    private Date createTime;

    private Date modifyTime;

    private String delete;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getOneLimitNum() {
        return oneLimitNum;
    }

    public void setOneLimitNum(Integer oneLimitNum) {
        this.oneLimitNum = oneLimitNum;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public BigDecimal getThresholdMoney() {
        return thresholdMoney;
    }

    public void setThresholdMoney(BigDecimal thresholdMoney) {
        this.thresholdMoney = thresholdMoney;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getGetBeginTime() {
        return getBeginTime;
    }

    public void setGetBeginTime(Date getBeginTime) {
        this.getBeginTime = getBeginTime;
    }

    public Date getGetEndTime() {
        return getEndTime;
    }

    public void setGetEndTime(Date getEndTime) {
        this.getEndTime = getEndTime;
    }

    public Date getEffectBeginTime() {
        return effectBeginTime;
    }

    public void setEffectBeginTime(Date effectBeginTime) {
        this.effectBeginTime = effectBeginTime;
    }

    public Date getEffectEndTime() {
        return effectEndTime;
    }

    public void setEffectEndTime(Date effectEndTime) {
        this.effectEndTime = effectEndTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete == null ? null : delete.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Promotion other = (Promotion) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getOneLimitNum() == null ? other.getOneLimitNum() == null : this.getOneLimitNum().equals(other.getOneLimitNum()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getThresholdMoney() == null ? other.getThresholdMoney() == null : this.getThresholdMoney().equals(other.getThresholdMoney()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getGetBeginTime() == null ? other.getGetBeginTime() == null : this.getGetBeginTime().equals(other.getGetBeginTime()))
            && (this.getGetEndTime() == null ? other.getGetEndTime() == null : this.getGetEndTime().equals(other.getGetEndTime()))
            && (this.getEffectBeginTime() == null ? other.getEffectBeginTime() == null : this.getEffectBeginTime().equals(other.getEffectBeginTime()))
            && (this.getEffectEndTime() == null ? other.getEffectEndTime() == null : this.getEffectEndTime().equals(other.getEffectEndTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDelete() == null ? other.getDelete() == null : this.getDelete().equals(other.getDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getOneLimitNum() == null) ? 0 : getOneLimitNum().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getThresholdMoney() == null) ? 0 : getThresholdMoney().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getGetBeginTime() == null) ? 0 : getGetBeginTime().hashCode());
        result = prime * result + ((getGetEndTime() == null) ? 0 : getGetEndTime().hashCode());
        result = prime * result + ((getEffectBeginTime() == null) ? 0 : getEffectBeginTime().hashCode());
        result = prime * result + ((getEffectEndTime() == null) ? 0 : getEffectEndTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDelete() == null) ? 0 : getDelete().hashCode());
        return result;
    }
}