package com.evy.core.mapper;

import com.evy.core.bean.GoodSpec;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface GoodSpecMapper {
    @Delete({
        "delete from good_spec",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into good_spec (id, account_id, ",
        "store_id, name, status, ",
        "index, create_time, ",
        "modify_time, delete)",
        "values (#{id,jdbcType=BIGINT}, #{accountId,jdbcType=BIGINT}, ",
        "#{storeId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, #{status,jdbcType=CHAR}, ",
        "#{index,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{modifyTime,jdbcType=TIMESTAMP}, #{delete,jdbcType=CHAR})"
    })
    int insert(GoodSpec record);

    @InsertProvider(type=GoodSpecSqlProvider.class, method="insertSelective")
    int insertSelective(GoodSpec record);

    @Select({
        "select",
        "id, account_id, store_id, name, status, index, create_time, modify_time, delete",
        "from good_spec",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.BIGINT),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="index", property="index", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete", property="delete", jdbcType=JdbcType.CHAR)
    })
    GoodSpec selectByPrimaryKey(Long id);

    @UpdateProvider(type=GoodSpecSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GoodSpec record);

    @Update({
        "update good_spec",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "store_id = #{storeId,jdbcType=BIGINT},",
          "name = #{name,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "index = #{index,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "delete = #{delete,jdbcType=CHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GoodSpec record);
}