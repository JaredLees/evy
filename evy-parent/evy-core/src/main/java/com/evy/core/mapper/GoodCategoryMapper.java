package com.evy.core.mapper;

import com.evy.core.bean.GoodCategory;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface GoodCategoryMapper {
    @Delete({
        "delete from good_category",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into good_category (id, account_id, ",
        "store_id, name, type, ",
        "pre_id, icon, status, ",
        "index, create_time, ",
        "modify_time, delete)",
        "values (#{id,jdbcType=BIGINT}, #{accountId,jdbcType=BIGINT}, ",
        "#{storeId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, #{type,jdbcType=VARCHAR}, ",
        "#{preId,jdbcType=BIGINT}, #{icon,jdbcType=VARCHAR}, #{status,jdbcType=CHAR}, ",
        "#{index,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{modifyTime,jdbcType=TIMESTAMP}, #{delete,jdbcType=CHAR})"
    })
    int insert(GoodCategory record);

    @InsertProvider(type=GoodCategorySqlProvider.class, method="insertSelective")
    int insertSelective(GoodCategory record);

    @Select({
        "select",
        "id, account_id, store_id, name, type, pre_id, icon, status, index, create_time, ",
        "modify_time, delete",
        "from good_category",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.BIGINT),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="pre_id", property="preId", jdbcType=JdbcType.BIGINT),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="index", property="index", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete", property="delete", jdbcType=JdbcType.CHAR)
    })
    GoodCategory selectByPrimaryKey(Long id);

    @UpdateProvider(type=GoodCategorySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GoodCategory record);

    @Update({
        "update good_category",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "store_id = #{storeId,jdbcType=BIGINT},",
          "name = #{name,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "pre_id = #{preId,jdbcType=BIGINT},",
          "icon = #{icon,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "index = #{index,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "delete = #{delete,jdbcType=CHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GoodCategory record);
}