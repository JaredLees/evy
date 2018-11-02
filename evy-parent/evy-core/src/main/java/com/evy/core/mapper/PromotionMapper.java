package com.evy.core.mapper;

import com.evy.core.bean.Promotion;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface PromotionMapper {
    @Delete({
        "delete from promotion",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into promotion (id, account_id, ",
        "store_id, name, amount, ",
        "one_limit_num, money, ",
        "type, threshold_money, ",
        "password, get_begin_time, ",
        "get_end_time, effect_begin_time, ",
        "effect_end_time, status, ",
        "create_time, modify_time, ",
        "delete)",
        "values (#{id,jdbcType=BIGINT}, #{accountId,jdbcType=BIGINT}, ",
        "#{storeId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, #{amount,jdbcType=INTEGER}, ",
        "#{oneLimitNum,jdbcType=INTEGER}, #{money,jdbcType=DECIMAL}, ",
        "#{type,jdbcType=CHAR}, #{thresholdMoney,jdbcType=DECIMAL}, ",
        "#{password,jdbcType=VARCHAR}, #{getBeginTime,jdbcType=TIMESTAMP}, ",
        "#{getEndTime,jdbcType=TIMESTAMP}, #{effectBeginTime,jdbcType=TIMESTAMP}, ",
        "#{effectEndTime,jdbcType=TIMESTAMP}, #{status,jdbcType=CHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{modifyTime,jdbcType=TIMESTAMP}, ",
        "#{delete,jdbcType=CHAR})"
    })
    int insert(Promotion record);

    @InsertProvider(type=PromotionSqlProvider.class, method="insertSelective")
    int insertSelective(Promotion record);

    @Select({
        "select",
        "id, account_id, store_id, name, amount, one_limit_num, money, type, threshold_money, ",
        "password, get_begin_time, get_end_time, effect_begin_time, effect_end_time, ",
        "status, create_time, modify_time, delete",
        "from promotion",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.BIGINT),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="amount", property="amount", jdbcType=JdbcType.INTEGER),
        @Result(column="one_limit_num", property="oneLimitNum", jdbcType=JdbcType.INTEGER),
        @Result(column="money", property="money", jdbcType=JdbcType.DECIMAL),
        @Result(column="type", property="type", jdbcType=JdbcType.CHAR),
        @Result(column="threshold_money", property="thresholdMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="get_begin_time", property="getBeginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="get_end_time", property="getEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="effect_begin_time", property="effectBeginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="effect_end_time", property="effectEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete", property="delete", jdbcType=JdbcType.CHAR)
    })
    Promotion selectByPrimaryKey(Long id);

    @UpdateProvider(type=PromotionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Promotion record);

    @Update({
        "update promotion",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "store_id = #{storeId,jdbcType=BIGINT},",
          "name = #{name,jdbcType=VARCHAR},",
          "amount = #{amount,jdbcType=INTEGER},",
          "one_limit_num = #{oneLimitNum,jdbcType=INTEGER},",
          "money = #{money,jdbcType=DECIMAL},",
          "type = #{type,jdbcType=CHAR},",
          "threshold_money = #{thresholdMoney,jdbcType=DECIMAL},",
          "password = #{password,jdbcType=VARCHAR},",
          "get_begin_time = #{getBeginTime,jdbcType=TIMESTAMP},",
          "get_end_time = #{getEndTime,jdbcType=TIMESTAMP},",
          "effect_begin_time = #{effectBeginTime,jdbcType=TIMESTAMP},",
          "effect_end_time = #{effectEndTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=CHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "delete = #{delete,jdbcType=CHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Promotion record);
}