package com.evy.core.mapper;

import com.evy.core.bean.DeliveryFreight;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface DeliveryFreightMapper {
    @Delete({
        "delete from delivery_freight",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into delivery_freight (id, account_id, ",
        "store_id, name, is_cover_express_fee, ",
        "status, fee_type, fee_basic, ",
        "remark, create_time, ",
        "modify_time, delete)",
        "values (#{id,jdbcType=BIGINT}, #{accountId,jdbcType=BIGINT}, ",
        "#{storeId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, #{isCoverExpressFee,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=CHAR}, #{feeType,jdbcType=INTEGER}, #{feeBasic,jdbcType=DECIMAL}, ",
        "#{remark,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{modifyTime,jdbcType=TIMESTAMP}, #{delete,jdbcType=CHAR})"
    })
    int insert(DeliveryFreight record);

    @InsertProvider(type=DeliveryFreightSqlProvider.class, method="insertSelective")
    int insertSelective(DeliveryFreight record);

    @Select({
        "select",
        "id, account_id, store_id, name, is_cover_express_fee, status, fee_type, fee_basic, ",
        "remark, create_time, modify_time, delete",
        "from delivery_freight",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.BIGINT),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_cover_express_fee", property="isCoverExpressFee", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="fee_type", property="feeType", jdbcType=JdbcType.INTEGER),
        @Result(column="fee_basic", property="feeBasic", jdbcType=JdbcType.DECIMAL),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete", property="delete", jdbcType=JdbcType.CHAR)
    })
    DeliveryFreight selectByPrimaryKey(Long id);

    @UpdateProvider(type=DeliveryFreightSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DeliveryFreight record);

    @Update({
        "update delivery_freight",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "store_id = #{storeId,jdbcType=BIGINT},",
          "name = #{name,jdbcType=VARCHAR},",
          "is_cover_express_fee = #{isCoverExpressFee,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "fee_type = #{feeType,jdbcType=INTEGER},",
          "fee_basic = #{feeBasic,jdbcType=DECIMAL},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "delete = #{delete,jdbcType=CHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(DeliveryFreight record);
}