package com.evy.core.mapper;


import com.evy.core.bean.Role;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class RoleSqlProvider {

    public String insertSelective(Role record) {
        BEGIN();
        INSERT_INTO("role");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=CHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(Role record) {
        BEGIN();
        UPDATE("role");
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=CHAR}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }
}