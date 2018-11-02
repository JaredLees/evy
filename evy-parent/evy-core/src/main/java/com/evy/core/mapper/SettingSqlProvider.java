package com.evy.core.mapper;


import com.evy.core.bean.Setting;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class SettingSqlProvider {

    public String insertSelective(Setting record) {
        BEGIN();
        INSERT_INTO("setting");
        
        if (record.getId() != null) {
            VALUES("ID", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getProperty() != null) {
            VALUES("property", "#{property,jdbcType=VARCHAR}");
        }
        
        if (record.getPropvalue() != null) {
            VALUES("propValue", "#{propvalue,jdbcType=VARCHAR}");
        }
        
        if (record.getDesc() != null) {
            VALUES("desc", "#{desc,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(Setting record) {
        BEGIN();
        UPDATE("setting");
        
        if (record.getProperty() != null) {
            SET("property = #{property,jdbcType=VARCHAR}");
        }
        
        if (record.getPropvalue() != null) {
            SET("propValue = #{propvalue,jdbcType=VARCHAR}");
        }
        
        if (record.getDesc() != null) {
            SET("desc = #{desc,jdbcType=VARCHAR}");
        }
        
        WHERE("ID = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }
}