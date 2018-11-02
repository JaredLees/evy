package com.evy.core.mapper;

import com.evy.core.bean.Right;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface RightMapper {
    @Delete({
        "delete from right",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into right (id, url, ",
        "name, right_type, ",
        "operate_type, status, ",
        "description, index, ",
        "version, service_type)",
        "values (#{id,jdbcType=BIGINT}, #{url,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{rightType,jdbcType=VARCHAR}, ",
        "#{operateType,jdbcType=VARCHAR}, #{status,jdbcType=CHAR}, ",
        "#{description,jdbcType=VARCHAR}, #{index,jdbcType=SMALLINT}, ",
        "#{version,jdbcType=SMALLINT}, #{serviceType,jdbcType=SMALLINT})"
    })
    int insert(Right record);

    @InsertProvider(type=RightSqlProvider.class, method="insertSelective")
    int insertSelective(Right record);

    @Select({
        "select",
        "id, url, name, right_type, operate_type, status, description, index, version, ",
        "service_type",
        "from right",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="right_type", property="rightType", jdbcType=JdbcType.VARCHAR),
        @Result(column="operate_type", property="operateType", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="index", property="index", jdbcType=JdbcType.SMALLINT),
        @Result(column="version", property="version", jdbcType=JdbcType.SMALLINT),
        @Result(column="service_type", property="serviceType", jdbcType=JdbcType.SMALLINT)
    })
    Right selectByPrimaryKey(Long id);

    @UpdateProvider(type=RightSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Right record);

    @Update({
        "update right",
        "set url = #{url,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "right_type = #{rightType,jdbcType=VARCHAR},",
          "operate_type = #{operateType,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "index = #{index,jdbcType=SMALLINT},",
          "version = #{version,jdbcType=SMALLINT},",
          "service_type = #{serviceType,jdbcType=SMALLINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Right record);
}