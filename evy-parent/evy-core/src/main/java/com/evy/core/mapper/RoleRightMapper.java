package com.evy.core.mapper;

import com.evy.core.bean.RoleRight;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface RoleRightMapper {
    @Delete({
        "delete from role_right",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into role_right (id, role_id, ",
        "right_id, status)",
        "values (#{id,jdbcType=BIGINT}, #{roleId,jdbcType=BIGINT}, ",
        "#{rightId,jdbcType=BIGINT}, #{status,jdbcType=VARCHAR})"
    })
    int insert(RoleRight record);

    @InsertProvider(type=RoleRightSqlProvider.class, method="insertSelective")
    int insertSelective(RoleRight record);

    @Select({
        "select",
        "id, role_id, right_id, status",
        "from role_right",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.BIGINT),
        @Result(column="right_id", property="rightId", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR)
    })
    RoleRight selectByPrimaryKey(Long id);

    @UpdateProvider(type=RoleRightSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(RoleRight record);

    @Update({
        "update role_right",
        "set role_id = #{roleId,jdbcType=BIGINT},",
          "right_id = #{rightId,jdbcType=BIGINT},",
          "status = #{status,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(RoleRight record);
}