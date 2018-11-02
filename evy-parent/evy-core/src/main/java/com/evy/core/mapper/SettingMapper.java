package com.evy.core.mapper;

import com.evy.core.bean.Setting;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface SettingMapper {
    @Delete({
        "delete from setting",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into setting (ID, property, ",
        "propValue, desc)",
        "values (#{id,jdbcType=BIGINT}, #{property,jdbcType=VARCHAR}, ",
        "#{propvalue,jdbcType=VARCHAR}, #{desc,jdbcType=VARCHAR})"
    })
    int insert(Setting record);

    @InsertProvider(type=SettingSqlProvider.class, method="insertSelective")
    int insertSelective(Setting record);

    @Select({
        "select",
        "ID, property, propValue, desc",
        "from setting",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="property", property="property", jdbcType=JdbcType.VARCHAR),
        @Result(column="propValue", property="propvalue", jdbcType=JdbcType.VARCHAR),
        @Result(column="desc", property="desc", jdbcType=JdbcType.VARCHAR)
    })
    Setting selectByPrimaryKey(Long id);

    @UpdateProvider(type=SettingSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Setting record);

    @Update({
        "update setting",
        "set property = #{property,jdbcType=VARCHAR},",
          "propValue = #{propvalue,jdbcType=VARCHAR},",
          "desc = #{desc,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Setting record);
}