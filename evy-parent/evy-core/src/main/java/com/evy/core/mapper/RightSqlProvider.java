package com.evy.core.mapper;

import com.evy.core.bean.Right;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class RightSqlProvider {

    public String insertSelective(Right record) {
        BEGIN();
        INSERT_INTO("right");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUrl() != null) {
            VALUES("url", "#{url,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getRightType() != null) {
            VALUES("right_type", "#{rightType,jdbcType=VARCHAR}");
        }
        
        if (record.getOperateType() != null) {
            VALUES("operate_type", "#{operateType,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=CHAR}");
        }
        
        if (record.getDescription() != null) {
            VALUES("description", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getIndex() != null) {
            VALUES("index", "#{index,jdbcType=SMALLINT}");
        }
        
        if (record.getVersion() != null) {
            VALUES("version", "#{version,jdbcType=SMALLINT}");
        }
        
        if (record.getServiceType() != null) {
            VALUES("service_type", "#{serviceType,jdbcType=SMALLINT}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(Right record) {
        BEGIN();
        UPDATE("right");
        
        if (record.getUrl() != null) {
            SET("url = #{url,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getRightType() != null) {
            SET("right_type = #{rightType,jdbcType=VARCHAR}");
        }
        
        if (record.getOperateType() != null) {
            SET("operate_type = #{operateType,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=CHAR}");
        }
        
        if (record.getDescription() != null) {
            SET("description = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getIndex() != null) {
            SET("index = #{index,jdbcType=SMALLINT}");
        }
        
        if (record.getVersion() != null) {
            SET("version = #{version,jdbcType=SMALLINT}");
        }
        
        if (record.getServiceType() != null) {
            SET("service_type = #{serviceType,jdbcType=SMALLINT}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }
}