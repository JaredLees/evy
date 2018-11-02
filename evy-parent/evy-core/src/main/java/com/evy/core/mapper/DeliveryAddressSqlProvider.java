package com.evy.core.mapper;

import com.evy.core.bean.DeliveryAddress;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class DeliveryAddressSqlProvider {

    public String insertSelective(DeliveryAddress record) {
        BEGIN();
        INSERT_INTO("delivery_address");
        
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
        
        if (record.getAvatar() != null) {
            VALUES("avatar", "#{avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveName() != null) {
            VALUES("receive_name", "#{receiveName,jdbcType=VARCHAR}");
        }
        
        if (record.getTelephone() != null) {
            VALUES("telephone", "#{telephone,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            VALUES("province", "#{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            VALUES("city", "#{city,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getPostalCode() != null) {
            VALUES("postal_code", "#{postalCode,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDefault() != null) {
            VALUES("is_default", "#{isDefault,jdbcType=CHAR}");
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

    public String updateByPrimaryKeySelective(DeliveryAddress record) {
        BEGIN();
        UPDATE("delivery_address");
        
        if (record.getAccountId() != null) {
            SET("account_id = #{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getStoreId() != null) {
            SET("store_id = #{storeId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getAvatar() != null) {
            SET("avatar = #{avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveName() != null) {
            SET("receive_name = #{receiveName,jdbcType=VARCHAR}");
        }
        
        if (record.getTelephone() != null) {
            SET("telephone = #{telephone,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            SET("province = #{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            SET("city = #{city,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getPostalCode() != null) {
            SET("postal_code = #{postalCode,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDefault() != null) {
            SET("is_default = #{isDefault,jdbcType=CHAR}");
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
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }
}