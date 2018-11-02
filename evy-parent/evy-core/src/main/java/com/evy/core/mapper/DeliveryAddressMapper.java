package com.evy.core.mapper;

import com.evy.core.bean.DeliveryAddress;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface DeliveryAddressMapper {
    @Delete({
        "delete from delivery_address",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into delivery_address (id, account_id, ",
        "store_id, user_id, avatar, ",
        "receive_name, telephone, ",
        "province, city, ",
        "address, postal_code, ",
        "is_default, status, create_time, ",
        "modify_time, delete)",
        "values (#{id,jdbcType=BIGINT}, #{accountId,jdbcType=BIGINT}, ",
        "#{storeId,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, #{avatar,jdbcType=VARCHAR}, ",
        "#{receiveName,jdbcType=VARCHAR}, #{telephone,jdbcType=VARCHAR}, ",
        "#{province,jdbcType=VARCHAR}, #{city,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{postalCode,jdbcType=VARCHAR}, ",
        "#{isDefault,jdbcType=CHAR}, #{status,jdbcType=CHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{modifyTime,jdbcType=TIMESTAMP}, #{delete,jdbcType=CHAR})"
    })
    int insert(DeliveryAddress record);

    @InsertProvider(type=DeliveryAddressSqlProvider.class, method="insertSelective")
    int insertSelective(DeliveryAddress record);

    @Select({
        "select",
        "id, account_id, store_id, user_id, avatar, receive_name, telephone, province, ",
        "city, address, postal_code, is_default, status, create_time, modify_time, delete",
        "from delivery_address",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.BIGINT),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_name", property="receiveName", jdbcType=JdbcType.VARCHAR),
        @Result(column="telephone", property="telephone", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="postal_code", property="postalCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_default", property="isDefault", jdbcType=JdbcType.CHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete", property="delete", jdbcType=JdbcType.CHAR)
    })
    DeliveryAddress selectByPrimaryKey(Long id);

    @UpdateProvider(type=DeliveryAddressSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DeliveryAddress record);

    @Update({
        "update delivery_address",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "store_id = #{storeId,jdbcType=BIGINT},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "avatar = #{avatar,jdbcType=VARCHAR},",
          "receive_name = #{receiveName,jdbcType=VARCHAR},",
          "telephone = #{telephone,jdbcType=VARCHAR},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "postal_code = #{postalCode,jdbcType=VARCHAR},",
          "is_default = #{isDefault,jdbcType=CHAR},",
          "status = #{status,jdbcType=CHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "delete = #{delete,jdbcType=CHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(DeliveryAddress record);
}