package com.evy.core.mapper;

import com.evy.core.bean.RoleRight;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class RoleRightSqlProvider {

    public String insertSelective(RoleRight record) {
        BEGIN();
        INSERT_INTO("role_right");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getRoleId() != null) {
            VALUES("role_id", "#{roleId,jdbcType=BIGINT}");
        }
        
        if (record.getRightId() != null) {
            VALUES("right_id", "#{rightId,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(RoleRight record) {
        BEGIN();
        UPDATE("role_right");
        
        if (record.getRoleId() != null) {
            SET("role_id = #{roleId,jdbcType=BIGINT}");
        }
        
        if (record.getRightId() != null) {
            SET("right_id = #{rightId,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }
}