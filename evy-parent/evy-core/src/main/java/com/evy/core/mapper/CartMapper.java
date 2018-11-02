package com.evy.core.mapper;

import com.evy.core.bean.Cart;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface CartMapper {
    @Delete({
        "delete from cart",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into cart (id, account_id, ",
        "store_id, user_id, good_detail_id, ",
        "amount, create_time, ",
        "modify_time)",
        "values (#{id,jdbcType=BIGINT}, #{accountId,jdbcType=BIGINT}, ",
        "#{storeId,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, #{goodDetailId,jdbcType=BIGINT}, ",
        "#{amount,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{modifyTime,jdbcType=TIMESTAMP})"
    })
    int insert(Cart record);

    @InsertProvider(type=CartSqlProvider.class, method="insertSelective")
    int insertSelective(Cart record);

    @Select({
        "select",
        "id, account_id, store_id, user_id, good_detail_id, amount, create_time, modify_time",
        "from cart",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.BIGINT),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="good_detail_id", property="goodDetailId", jdbcType=JdbcType.BIGINT),
        @Result(column="amount", property="amount", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP)
    })
    Cart selectByPrimaryKey(Long id);

    @UpdateProvider(type=CartSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Cart record);

    @Update({
        "update cart",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "store_id = #{storeId,jdbcType=BIGINT},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "good_detail_id = #{goodDetailId,jdbcType=BIGINT},",
          "amount = #{amount,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Cart record);
}