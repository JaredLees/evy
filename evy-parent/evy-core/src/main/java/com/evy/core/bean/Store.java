package com.evy.core.bean;

import java.io.Serializable;
import java.util.Date;

public class Store implements Serializable {
    private Long id;

    private Long accountId;

    private String storeNo;

    private String storeLogo;

    private String storeName;

    private String storeQrcode;

    private Integer storeStatus;

    private Integer storeType;

    private Integer storeArea;

    private String province;

    private String city;

    private String address;

    private String idcardNo;

    private Double latitude;

    private Double longitude;

    private String contactName;

    private Integer contactSex;

    private String contactTel;

    private String status;

    private Integer volumeNum;

    private Integer praiseNum;

    private Date createTime;

    private Date modifyTime;

    private String delete;

    private String businessDay;

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

    public String getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo == null ? null : storeNo.trim();
    }

    public String getStoreLogo() {
        return storeLogo;
    }

    public void setStoreLogo(String storeLogo) {
        this.storeLogo = storeLogo == null ? null : storeLogo.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreQrcode() {
        return storeQrcode;
    }

    public void setStoreQrcode(String storeQrcode) {
        this.storeQrcode = storeQrcode == null ? null : storeQrcode.trim();
    }

    public Integer getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(Integer storeStatus) {
        this.storeStatus = storeStatus;
    }

    public Integer getStoreType() {
        return storeType;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }

    public Integer getStoreArea() {
        return storeArea;
    }

    public void setStoreArea(Integer storeArea) {
        this.storeArea = storeArea;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIdcardNo() {
        return idcardNo;
    }

    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo == null ? null : idcardNo.trim();
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public Integer getContactSex() {
        return contactSex;
    }

    public void setContactSex(Integer contactSex) {
        this.contactSex = contactSex;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel == null ? null : contactTel.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getVolumeNum() {
        return volumeNum;
    }

    public void setVolumeNum(Integer volumeNum) {
        this.volumeNum = volumeNum;
    }

    public Integer getPraiseNum() {
        return praiseNum;
    }

    public void setPraiseNum(Integer praiseNum) {
        this.praiseNum = praiseNum;
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

    public String getBusinessDay() {
        return businessDay;
    }

    public void setBusinessDay(String businessDay) {
        this.businessDay = businessDay == null ? null : businessDay.trim();
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
        Store other = (Store) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getStoreNo() == null ? other.getStoreNo() == null : this.getStoreNo().equals(other.getStoreNo()))
            && (this.getStoreLogo() == null ? other.getStoreLogo() == null : this.getStoreLogo().equals(other.getStoreLogo()))
            && (this.getStoreName() == null ? other.getStoreName() == null : this.getStoreName().equals(other.getStoreName()))
            && (this.getStoreQrcode() == null ? other.getStoreQrcode() == null : this.getStoreQrcode().equals(other.getStoreQrcode()))
            && (this.getStoreStatus() == null ? other.getStoreStatus() == null : this.getStoreStatus().equals(other.getStoreStatus()))
            && (this.getStoreType() == null ? other.getStoreType() == null : this.getStoreType().equals(other.getStoreType()))
            && (this.getStoreArea() == null ? other.getStoreArea() == null : this.getStoreArea().equals(other.getStoreArea()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getIdcardNo() == null ? other.getIdcardNo() == null : this.getIdcardNo().equals(other.getIdcardNo()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getContactName() == null ? other.getContactName() == null : this.getContactName().equals(other.getContactName()))
            && (this.getContactSex() == null ? other.getContactSex() == null : this.getContactSex().equals(other.getContactSex()))
            && (this.getContactTel() == null ? other.getContactTel() == null : this.getContactTel().equals(other.getContactTel()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getVolumeNum() == null ? other.getVolumeNum() == null : this.getVolumeNum().equals(other.getVolumeNum()))
            && (this.getPraiseNum() == null ? other.getPraiseNum() == null : this.getPraiseNum().equals(other.getPraiseNum()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDelete() == null ? other.getDelete() == null : this.getDelete().equals(other.getDelete()))
            && (this.getBusinessDay() == null ? other.getBusinessDay() == null : this.getBusinessDay().equals(other.getBusinessDay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getStoreNo() == null) ? 0 : getStoreNo().hashCode());
        result = prime * result + ((getStoreLogo() == null) ? 0 : getStoreLogo().hashCode());
        result = prime * result + ((getStoreName() == null) ? 0 : getStoreName().hashCode());
        result = prime * result + ((getStoreQrcode() == null) ? 0 : getStoreQrcode().hashCode());
        result = prime * result + ((getStoreStatus() == null) ? 0 : getStoreStatus().hashCode());
        result = prime * result + ((getStoreType() == null) ? 0 : getStoreType().hashCode());
        result = prime * result + ((getStoreArea() == null) ? 0 : getStoreArea().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getIdcardNo() == null) ? 0 : getIdcardNo().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getContactName() == null) ? 0 : getContactName().hashCode());
        result = prime * result + ((getContactSex() == null) ? 0 : getContactSex().hashCode());
        result = prime * result + ((getContactTel() == null) ? 0 : getContactTel().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getVolumeNum() == null) ? 0 : getVolumeNum().hashCode());
        result = prime * result + ((getPraiseNum() == null) ? 0 : getPraiseNum().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDelete() == null) ? 0 : getDelete().hashCode());
        result = prime * result + ((getBusinessDay() == null) ? 0 : getBusinessDay().hashCode());
        return result;
    }
}