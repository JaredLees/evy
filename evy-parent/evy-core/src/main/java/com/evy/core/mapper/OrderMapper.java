package com.evy.core.mapper;

import com.evy.core.bean.Order;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface OrderMapper {
    @Delete({
        "delete from order",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into order (id, account_id, ",
        "store_id, user_id, order_num, ",
        "good_detail_id, name, ",
        "amount, delivery_address_id, ",
        "origin_money, actual_money, ",
        "order_status, user_promotion_id, ",
        "delivery_date, freight, ",
        "fmodifyTime, deliver_status, ",
        "sign_status, weight, ",
        "weight_unit, type, ",
        "pay_status, status, create_time, ",
        "modify_time, expire_time, ",
        "delete, version)",
        "values (#{id,jdbcType=BIGINT}, #{accountId,jdbcType=BIGINT}, ",
        "#{storeId,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, #{orderNum,jdbcType=VARCHAR}, ",
        "#{goodDetailId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{amount,jdbcType=DECIMAL}, #{deliveryAddressId,jdbcType=BIGINT}, ",
        "#{originMoney,jdbcType=DECIMAL}, #{actualMoney,jdbcType=DECIMAL}, ",
        "#{orderStatus,jdbcType=INTEGER}, #{userPromotionId,jdbcType=BIGINT}, ",
        "#{deliveryDate,jdbcType=TIMESTAMP}, #{freight,jdbcType=DECIMAL}, ",
        "#{fmodifytime,jdbcType=TIMESTAMP}, #{deliverStatus,jdbcType=CHAR}, ",
        "#{signStatus,jdbcType=CHAR}, #{weight,jdbcType=DECIMAL}, ",
        "#{weightUnit,jdbcType=VARCHAR}, #{type,jdbcType=INTEGER}, ",
        "#{payStatus,jdbcType=CHAR}, #{status,jdbcType=CHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{modifyTime,jdbcType=TIMESTAMP}, #{expireTime,jdbcType=TIMESTAMP}, ",
        "#{delete,jdbcType=CHAR}, #{version,jdbcType=BIGINT})"
    })
    int insert(Order record);

    @InsertProvider(type=OrderSqlProvider.class, method="insertSelective")
    int insertSelective(Order record);

    @Select({
        "select",
        "id, account_id, store_id, user_id, order_num, good_detail_id, name, amount, ",
        "delivery_address_id, origin_money, actual_money, order_status, user_promotion_id, ",
        "delivery_date, freight, fmodifyTime, deliver_status, sign_status, weight, weight_unit, ",
        "type, pay_status, status, create_time, modify_time, expire_time, delete, version",
        "from order",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.BIGINT),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_num", property="orderNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="good_detail_id", property="goodDetailId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="delivery_address_id", property="deliveryAddressId", jdbcType=JdbcType.BIGINT),
        @Result(column="origin_money", property="originMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="actual_money", property="actualMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="order_status", property="orderStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="user_promotion_id", property="userPromotionId", jdbcType=JdbcType.BIGINT),
        @Result(column="delivery_date", property="deliveryDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="freight", property="freight", jdbcType=JdbcType.DECIMAL),
        @Result(column="fmodifyTime", property="fmodifytime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deliver_status", property="deliverStatus", jdbcType=JdbcType.CHAR),
        @Result(column="sign_status", property="signStatus", jdbcType=JdbcType.CHAR),
        @Result(column="weight", property="weight", jdbcType=JdbcType.DECIMAL),
        @Result(column="weight_unit", property="weightUnit", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="pay_status", property="payStatus", jdbcType=JdbcType.CHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="expire_time", property="expireTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete", property="delete", jdbcType=JdbcType.CHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.BIGINT)
    })
    Order selectByPrimaryKey(Long id);

    @UpdateProvider(type=OrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Order record);

    @Update({
        "update order",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "store_id = #{storeId,jdbcType=BIGINT},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "order_num = #{orderNum,jdbcType=VARCHAR},",
          "good_detail_id = #{goodDetailId,jdbcType=BIGINT},",
          "name = #{name,jdbcType=VARCHAR},",
          "amount = #{amount,jdbcType=DECIMAL},",
          "delivery_address_id = #{deliveryAddressId,jdbcType=BIGINT},",
          "origin_money = #{originMoney,jdbcType=DECIMAL},",
          "actual_money = #{actualMoney,jdbcType=DECIMAL},",
          "order_status = #{orderStatus,jdbcType=INTEGER},",
          "user_promotion_id = #{userPromotionId,jdbcType=BIGINT},",
          "delivery_date = #{deliveryDate,jdbcType=TIMESTAMP},",
          "freight = #{freight,jdbcType=DECIMAL},",
          "fmodifyTime = #{fmodifytime,jdbcType=TIMESTAMP},",
          "deliver_status = #{deliverStatus,jdbcType=CHAR},",
          "sign_status = #{signStatus,jdbcType=CHAR},",
          "weight = #{weight,jdbcType=DECIMAL},",
          "weight_unit = #{weightUnit,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=INTEGER},",
          "pay_status = #{payStatus,jdbcType=CHAR},",
          "status = #{status,jdbcType=CHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "expire_time = #{expireTime,jdbcType=TIMESTAMP},",
          "delete = #{delete,jdbcType=CHAR},",
          "version = #{version,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Order record);
}