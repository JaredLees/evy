package com.evy.core.mapper;

import com.evy.core.bean.UserPromotion;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface UserPromotionMapper {
    @Delete({
        "delete from user_promotion",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into user_promotion (id, account_id, ",
        "store_id, user_id, promotion_id, ",
        "useable, get_time, ",
        "use_time, expire_time, ",
        "status, create_time, ",
        "modify_time, delete)",
        "values (#{id,jdbcType=VARCHAR}, #{accountId,jdbcType=BIGINT}, ",
        "#{storeId,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, #{promotionId,jdbcType=BIGINT}, ",
        "#{useable,jdbcType=CHAR}, #{getTime,jdbcType=TIMESTAMP}, ",
        "#{useTime,jdbcType=TIMESTAMP}, #{expireTime,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=CHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{modifyTime,jdbcType=TIMESTAMP}, #{delete,jdbcType=CHAR})"
    })
    int insert(UserPromotion record);

    @InsertProvider(type=UserPromotionSqlProvider.class, method="insertSelective")
    int insertSelective(UserPromotion record);

    @Select({
        "select",
        "id, account_id, store_id, user_id, promotion_id, useable, get_time, use_time, ",
        "expire_time, status, create_time, modify_time, delete",
        "from user_promotion",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.BIGINT),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="promotion_id", property="promotionId", jdbcType=JdbcType.BIGINT),
        @Result(column="useable", property="useable", jdbcType=JdbcType.CHAR),
        @Result(column="get_time", property="getTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="use_time", property="useTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="expire_time", property="expireTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete", property="delete", jdbcType=JdbcType.CHAR)
    })
    UserPromotion selectByPrimaryKey(String id);

    @UpdateProvider(type=UserPromotionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserPromotion record);

    @Update({
        "update user_promotion",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "store_id = #{storeId,jdbcType=BIGINT},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "promotion_id = #{promotionId,jdbcType=BIGINT},",
          "useable = #{useable,jdbcType=CHAR},",
          "get_time = #{getTime,jdbcType=TIMESTAMP},",
          "use_time = #{useTime,jdbcType=TIMESTAMP},",
          "expire_time = #{expireTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=CHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "delete = #{delete,jdbcType=CHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UserPromotion record);
}