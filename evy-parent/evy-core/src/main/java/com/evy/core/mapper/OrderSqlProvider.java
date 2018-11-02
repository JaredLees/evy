package com.evy.core.mapper;

import com.evy.core.bean.Order;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class OrderSqlProvider {

    public String insertSelective(Order record) {
        BEGIN();
        INSERT_INTO("order");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getAccountId() != null) {
            VALUES("account_id", "#{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getStoreId() != null) {
            VALUES("store_id", "#{storeId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderNum() != null) {
            VALUES("order_num", "#{orderNum,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodDetailId() != null) {
            VALUES("good_detail_id", "#{goodDetailId,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            VALUES("amount", "#{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getDeliveryAddressId() != null) {
            VALUES("delivery_address_id", "#{deliveryAddressId,jdbcType=BIGINT}");
        }
        
        if (record.getOriginMoney() != null) {
            VALUES("origin_money", "#{originMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getActualMoney() != null) {
            VALUES("actual_money", "#{actualMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getOrderStatus() != null) {
            VALUES("order_status", "#{orderStatus,jdbcType=INTEGER}");
        }
        
        if (record.getUserPromotionId() != null) {
            VALUES("user_promotion_id", "#{userPromotionId,jdbcType=BIGINT}");
        }
        
        if (record.getDeliveryDate() != null) {
            VALUES("delivery_date", "#{deliveryDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFreight() != null) {
            VALUES("freight", "#{freight,jdbcType=DECIMAL}");
        }
        
        if (record.getFmodifytime() != null) {
            VALUES("fmodifyTime", "#{fmodifytime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeliverStatus() != null) {
            VALUES("deliver_status", "#{deliverStatus,jdbcType=CHAR}");
        }
        
        if (record.getSignStatus() != null) {
            VALUES("sign_status", "#{signStatus,jdbcType=CHAR}");
        }
        
        if (record.getWeight() != null) {
            VALUES("weight", "#{weight,jdbcType=DECIMAL}");
        }
        
        if (record.getWeightUnit() != null) {
            VALUES("weight_unit", "#{weightUnit,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            VALUES("type", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getPayStatus() != null) {
            VALUES("pay_status", "#{payStatus,jdbcType=CHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=CHAR}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyTime() != null) {
            VALUES("modify_time", "#{modifyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExpireTime() != null) {
            VALUES("expire_time", "#{expireTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDelete() != null) {
            VALUES("delete", "#{delete,jdbcType=CHAR}");
        }
        
        if (record.getVersion() != null) {
            VALUES("version", "#{version,jdbcType=BIGINT}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(Order record) {
        BEGIN();
        UPDATE("order");
        
        if (record.getAccountId() != null) {
            SET("account_id = #{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getStoreId() != null) {
            SET("store_id = #{storeId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderNum() != null) {
            SET("order_num = #{orderNum,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodDetailId() != null) {
            SET("good_detail_id = #{goodDetailId,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            SET("amount = #{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getDeliveryAddressId() != null) {
            SET("delivery_address_id = #{deliveryAddressId,jdbcType=BIGINT}");
        }
        
        if (record.getOriginMoney() != null) {
            SET("origin_money = #{originMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getActualMoney() != null) {
            SET("actual_money = #{actualMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getOrderStatus() != null) {
            SET("order_status = #{orderStatus,jdbcType=INTEGER}");
        }
        
        if (record.getUserPromotionId() != null) {
            SET("user_promotion_id = #{userPromotionId,jdbcType=BIGINT}");
        }
        
        if (record.getDeliveryDate() != null) {
            SET("delivery_date = #{deliveryDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFreight() != null) {
            SET("freight = #{freight,jdbcType=DECIMAL}");
        }
        
        if (record.getFmodifytime() != null) {
            SET("fmodifyTime = #{fmodifytime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeliverStatus() != null) {
            SET("deliver_status = #{deliverStatus,jdbcType=CHAR}");
        }
        
        if (record.getSignStatus() != null) {
            SET("sign_status = #{signStatus,jdbcType=CHAR}");
        }
        
        if (record.getWeight() != null) {
            SET("weight = #{weight,jdbcType=DECIMAL}");
        }
        
        if (record.getWeightUnit() != null) {
            SET("weight_unit = #{weightUnit,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            SET("type = #{type,jdbcType=INTEGER}");
        }
        
        if (record.getPayStatus() != null) {
            SET("pay_status = #{payStatus,jdbcType=CHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=CHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyTime() != null) {
            SET("modify_time = #{modifyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExpireTime() != null) {
            SET("expire_time = #{expireTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDelete() != null) {
            SET("delete = #{delete,jdbcType=CHAR}");
        }
        
        if (record.getVersion() != null) {
            SET("version = #{version,jdbcType=BIGINT}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }
}