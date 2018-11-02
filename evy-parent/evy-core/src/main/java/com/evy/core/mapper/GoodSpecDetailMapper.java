package com.evy.core.mapper;

import com.evy.core.bean.GoodSpecDetail;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface GoodSpecDetailMapper {
    @Delete({
        "delete from good_spec_detail",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into good_spec_detail (id, account_id, ",
        "store_id, spec_id, name, ",
        "remark, status, index, ",
        "create_time, modify_time, ",
        "delete)",
        "values (#{id,jdbcType=BIGINT}, #{accountId,jdbcType=BIGINT}, ",
        "#{storeId,jdbcType=BIGINT}, #{specId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{status,jdbcType=CHAR}, #{index,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{modifyTime,jdbcType=TIMESTAMP}, ",
        "#{delete,jdbcType=CHAR})"
    })
    int insert(GoodSpecDetail record);

    @InsertProvider(type=GoodSpecDetailSqlProvider.class, method="insertSelective")
    int insertSelective(GoodSpecDetail record);

    @Select({
        "select",
        "id, account_id, store_id, spec_id, name, remark, status, index, create_time, ",
        "modify_time, delete",
        "from good_spec_detail",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.BIGINT),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.BIGINT),
        @Result(column="spec_id", property="specId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="index", property="index", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete", property="delete", jdbcType=JdbcType.CHAR)
    })
    GoodSpecDetail selectByPrimaryKey(Long id);

    @UpdateProvider(type=GoodSpecDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GoodSpecDetail record);

    @Update({
        "update good_spec_detail",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "store_id = #{storeId,jdbcType=BIGINT},",
          "spec_id = #{specId,jdbcType=BIGINT},",
          "name = #{name,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "index = #{index,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "delete = #{delete,jdbcType=CHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GoodSpecDetail record);
}