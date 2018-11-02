package com.evy.core.mapper;

import com.evy.core.bean.DeliveryFreight;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class DeliveryFreightSqlProvider {

    public String insertSelective(DeliveryFreight record) {
        BEGIN();
        INSERT_INTO("delivery_freight");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getAccountId() != null) {
            VALUES("account_id", "#{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getStoreId() != null) {
            VALUES("store_id", "#{storeId,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getIsCoverExpressFee() != null) {
            VALUES("is_cover_express_fee", "#{isCoverExpressFee,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=CHAR}");
        }
        
        if (record.getFeeType() != null) {
            VALUES("fee_type", "#{feeType,jdbcType=INTEGER}");
        }
        
        if (record.getFeeBasic() != null) {
            VALUES("fee_basic", "#{feeBasic,jdbcType=DECIMAL}");
        }
        
        if (record.getRemark() != null) {
            VALUES("remark", "#{remark,jdbcType=VARCHAR}");
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

    public String updateByPrimaryKeySelective(DeliveryFreight record) {
        BEGIN();
        UPDATE("delivery_freight");
        
        if (record.getAccountId() != null) {
            SET("account_id = #{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getStoreId() != null) {
            SET("store_id = #{storeId,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getIsCoverExpressFee() != null) {
            SET("is_cover_express_fee = #{isCoverExpressFee,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=CHAR}");
        }
        
        if (record.getFeeType() != null) {
            SET("fee_type = #{feeType,jdbcType=INTEGER}");
        }
        
        if (record.getFeeBasic() != null) {
            SET("fee_basic = #{feeBasic,jdbcType=DECIMAL}");
        }
        
        if (record.getRemark() != null) {
            SET("remark = #{remark,jdbcType=VARCHAR}");
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