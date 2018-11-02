package com.evy.core.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Goods implements Serializable {
    private Long id;

    private Long accountId;

    private Long storeId;

    private Long categoryId;

    private Long deliveryFreightId;

    private Date specDetailId;

    private String name;

    private String barcode;

    private String title;

    private String pic;

    private String video;

    private String feature;

    private Integer index;

    private Integer shareIntegral;

    private BigDecimal originalPrice;

    private BigDecimal currentPrice;

    private BigDecimal groupPrice;

    private BigDecimal minPrice;

    private Integer allInventory;

    private BigDecimal weight;

    private String canGroupBuy;

    private Date sellStartTime;

    private Date sellEndTime;

    private String itemUpShelf;

    private String recomState;

    private Integer views;

    private Integer collections;

    private Integer orderNum;

    private Integer praiseNum;

    private String status;

    private Date createTime;

    private Date modifyTime;

    private String delete;

    private String detail;

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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getDeliveryFreightId() {
        return deliveryFreightId;
    }

    public void setDeliveryFreightId(Long deliveryFreightId) {
        this.deliveryFreightId = deliveryFreightId;
    }

    public Date getSpecDetailId() {
        return specDetailId;
    }

    public void setSpecDetailId(Date specDetailId) {
        this.specDetailId = specDetailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getShareIntegral() {
        return shareIntegral;
    }

    public void setShareIntegral(Integer shareIntegral) {
        this.shareIntegral = shareIntegral;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public BigDecimal getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(BigDecimal groupPrice) {
        this.groupPrice = groupPrice;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getAllInventory() {
        return allInventory;
    }

    public void setAllInventory(Integer allInventory) {
        this.allInventory = allInventory;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getCanGroupBuy() {
        return canGroupBuy;
    }

    public void setCanGroupBuy(String canGroupBuy) {
        this.canGroupBuy = canGroupBuy == null ? null : canGroupBuy.trim();
    }

    public Date getSellStartTime() {
        return sellStartTime;
    }

    public void setSellStartTime(Date sellStartTime) {
        this.sellStartTime = sellStartTime;
    }

    public Date getSellEndTime() {
        return sellEndTime;
    }

    public void setSellEndTime(Date sellEndTime) {
        this.sellEndTime = sellEndTime;
    }

    public String getItemUpShelf() {
        return itemUpShelf;
    }

    public void setItemUpShelf(String itemUpShelf) {
        this.itemUpShelf = itemUpShelf == null ? null : itemUpShelf.trim();
    }

    public String getRecomState() {
        return recomState;
    }

    public void setRecomState(String recomState) {
        this.recomState = recomState == null ? null : recomState.trim();
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getCollections() {
        return collections;
    }

    public void setCollections(Integer collections) {
        this.collections = collections;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getPraiseNum() {
        return praiseNum;
    }

    public void setPraiseNum(Integer praiseNum) {
        this.praiseNum = praiseNum;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
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
        Goods other = (Goods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getDeliveryFreightId() == null ? other.getDeliveryFreightId() == null : this.getDeliveryFreightId().equals(other.getDeliveryFreightId()))
            && (this.getSpecDetailId() == null ? other.getSpecDetailId() == null : this.getSpecDetailId().equals(other.getSpecDetailId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getBarcode() == null ? other.getBarcode() == null : this.getBarcode().equals(other.getBarcode()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getVideo() == null ? other.getVideo() == null : this.getVideo().equals(other.getVideo()))
            && (this.getFeature() == null ? other.getFeature() == null : this.getFeature().equals(other.getFeature()))
            && (this.getIndex() == null ? other.getIndex() == null : this.getIndex().equals(other.getIndex()))
            && (this.getShareIntegral() == null ? other.getShareIntegral() == null : this.getShareIntegral().equals(other.getShareIntegral()))
            && (this.getOriginalPrice() == null ? other.getOriginalPrice() == null : this.getOriginalPrice().equals(other.getOriginalPrice()))
            && (this.getCurrentPrice() == null ? other.getCurrentPrice() == null : this.getCurrentPrice().equals(other.getCurrentPrice()))
            && (this.getGroupPrice() == null ? other.getGroupPrice() == null : this.getGroupPrice().equals(other.getGroupPrice()))
            && (this.getMinPrice() == null ? other.getMinPrice() == null : this.getMinPrice().equals(other.getMinPrice()))
            && (this.getAllInventory() == null ? other.getAllInventory() == null : this.getAllInventory().equals(other.getAllInventory()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getCanGroupBuy() == null ? other.getCanGroupBuy() == null : this.getCanGroupBuy().equals(other.getCanGroupBuy()))
            && (this.getSellStartTime() == null ? other.getSellStartTime() == null : this.getSellStartTime().equals(other.getSellStartTime()))
            && (this.getSellEndTime() == null ? other.getSellEndTime() == null : this.getSellEndTime().equals(other.getSellEndTime()))
            && (this.getItemUpShelf() == null ? other.getItemUpShelf() == null : this.getItemUpShelf().equals(other.getItemUpShelf()))
            && (this.getRecomState() == null ? other.getRecomState() == null : this.getRecomState().equals(other.getRecomState()))
            && (this.getViews() == null ? other.getViews() == null : this.getViews().equals(other.getViews()))
            && (this.getCollections() == null ? other.getCollections() == null : this.getCollections().equals(other.getCollections()))
            && (this.getOrderNum() == null ? other.getOrderNum() == null : this.getOrderNum().equals(other.getOrderNum()))
            && (this.getPraiseNum() == null ? other.getPraiseNum() == null : this.getPraiseNum().equals(other.getPraiseNum()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDelete() == null ? other.getDelete() == null : this.getDelete().equals(other.getDelete()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getDeliveryFreightId() == null) ? 0 : getDeliveryFreightId().hashCode());
        result = prime * result + ((getSpecDetailId() == null) ? 0 : getSpecDetailId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getBarcode() == null) ? 0 : getBarcode().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getVideo() == null) ? 0 : getVideo().hashCode());
        result = prime * result + ((getFeature() == null) ? 0 : getFeature().hashCode());
        result = prime * result + ((getIndex() == null) ? 0 : getIndex().hashCode());
        result = prime * result + ((getShareIntegral() == null) ? 0 : getShareIntegral().hashCode());
        result = prime * result + ((getOriginalPrice() == null) ? 0 : getOriginalPrice().hashCode());
        result = prime * result + ((getCurrentPrice() == null) ? 0 : getCurrentPrice().hashCode());
        result = prime * result + ((getGroupPrice() == null) ? 0 : getGroupPrice().hashCode());
        result = prime * result + ((getMinPrice() == null) ? 0 : getMinPrice().hashCode());
        result = prime * result + ((getAllInventory() == null) ? 0 : getAllInventory().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getCanGroupBuy() == null) ? 0 : getCanGroupBuy().hashCode());
        result = prime * result + ((getSellStartTime() == null) ? 0 : getSellStartTime().hashCode());
        result = prime * result + ((getSellEndTime() == null) ? 0 : getSellEndTime().hashCode());
        result = prime * result + ((getItemUpShelf() == null) ? 0 : getItemUpShelf().hashCode());
        result = prime * result + ((getRecomState() == null) ? 0 : getRecomState().hashCode());
        result = prime * result + ((getViews() == null) ? 0 : getViews().hashCode());
        result = prime * result + ((getCollections() == null) ? 0 : getCollections().hashCode());
        result = prime * result + ((getOrderNum() == null) ? 0 : getOrderNum().hashCode());
        result = prime * result + ((getPraiseNum() == null) ? 0 : getPraiseNum().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDelete() == null) ? 0 : getDelete().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return result;
    }
}