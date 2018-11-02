package com.evy.core.mapper;


import com.evy.core.bean.GoodDetail;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class GoodDetailSqlProvider {

    public String insertSelective(GoodDetail record) {
        BEGIN();
        INSERT_INTO("good_detail");
        
        if (record.getAccountId() != null) {
            VALUES("account_id", "#{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getStoreId() != null) {
            VALUES("store_id", "#{storeId,jdbcType=BIGINT}");
        }
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getGoodId() != null) {
            VALUES("good_id", "#{goodId,jdbcType=BIGINT}");
        }
        
        if (record.getSpecDetailId() != null) {
            VALUES("spec_detail_id", "#{specDetailId,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInventory() != null) {
            VALUES("inventory", "#{inventory,jdbcType=INTEGER}");
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
}