package com.evy.core.mapper;

import com.evy.core.bean.Promotion;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class PromotionSqlProvider {

    public String insertSelective(Promotion record) {
        BEGIN();
        INSERT_INTO("promotion");
        
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
        
        if (record.getAmount() != null) {
            VALUES("amount", "#{amount,jdbcType=INTEGER}");
        }
        
        if (record.getOneLimitNum() != null) {
            VALUES("one_limit_num", "#{oneLimitNum,jdbcType=INTEGER}");
        }
        
        if (record.getMoney() != null) {
            VALUES("money", "#{money,jdbcType=DECIMAL}");
        }
        
        if (record.getType() != null) {
            VALUES("type", "#{type,jdbcType=CHAR}");
        }
        
        if (record.getThresholdMoney() != null) {
            VALUES("threshold_money", "#{thresholdMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getPassword() != null) {
            VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getGetBeginTime() != null) {
            VALUES("get_begin_time", "#{getBeginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGetEndTime() != null) {
            VALUES("get_end_time", "#{getEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEffectBeginTime() != null) {
            VALUES("effect_begin_time", "#{effectBeginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEffectEndTime() != null) {
            VALUES("effect_end_time", "#{effectEndTime,jdbcType=TIMESTAMP}");
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

    public String updateByPrimaryKeySelective(Promotion record) {
        BEGIN();
        UPDATE("promotion");
        
        if (record.getAccountId() != null) {
            SET("account_id = #{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getStoreId() != null) {
            SET("store_id = #{storeId,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            SET("amount = #{amount,jdbcType=INTEGER}");
        }
        
        if (record.getOneLimitNum() != null) {
            SET("one_limit_num = #{oneLimitNum,jdbcType=INTEGER}");
        }
        
        if (record.getMoney() != null) {
            SET("money = #{money,jdbcType=DECIMAL}");
        }
        
        if (record.getType() != null) {
            SET("type = #{type,jdbcType=CHAR}");
        }
        
        if (record.getThresholdMoney() != null) {
            SET("threshold_money = #{thresholdMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getGetBeginTime() != null) {
            SET("get_begin_time = #{getBeginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGetEndTime() != null) {
            SET("get_end_time = #{getEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEffectBeginTime() != null) {
            SET("effect_begin_time = #{effectBeginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEffectEndTime() != null) {
            SET("effect_end_time = #{effectEndTime,jdbcType=TIMESTAMP}");
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