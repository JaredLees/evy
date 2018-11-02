package com.evy.core.mapper;

import com.evy.core.bean.UserPromotion;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class UserPromotionSqlProvider {

    public String insertSelective(UserPromotion record) {
        BEGIN();
        INSERT_INTO("user_promotion");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=VARCHAR}");
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
        
        if (record.getPromotionId() != null) {
            VALUES("promotion_id", "#{promotionId,jdbcType=BIGINT}");
        }
        
        if (record.getUseable() != null) {
            VALUES("useable", "#{useable,jdbcType=CHAR}");
        }
        
        if (record.getGetTime() != null) {
            VALUES("get_time", "#{getTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUseTime() != null) {
            VALUES("use_time", "#{useTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExpireTime() != null) {
            VALUES("expire_time", "#{expireTime,jdbcType=TIMESTAMP}");
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
        
        if (record.getDelete() != null) {
            VALUES("delete", "#{delete,jdbcType=CHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(UserPromotion record) {
        BEGIN();
        UPDATE("user_promotion");
        
        if (record.getAccountId() != null) {
            SET("account_id = #{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getStoreId() != null) {
            SET("store_id = #{storeId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getPromotionId() != null) {
            SET("promotion_id = #{promotionId,jdbcType=BIGINT}");
        }
        
        if (record.getUseable() != null) {
            SET("useable = #{useable,jdbcType=CHAR}");
        }
        
        if (record.getGetTime() != null) {
            SET("get_time = #{getTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUseTime() != null) {
            SET("use_time = #{useTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExpireTime() != null) {
            SET("expire_time = #{expireTime,jdbcType=TIMESTAMP}");
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
        
        if (record.getDelete() != null) {
            SET("delete = #{delete,jdbcType=CHAR}");
        }
        
        WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return SQL();
    }
}