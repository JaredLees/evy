package com.evy.core.mapper;

import com.evy.core.bean.Store;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface StoreMapper {
    @Delete({
        "delete from store",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into store (id, account_id, ",
        "store_no, store_logo, ",
        "store_name, store_qrcode, ",
        "store_status, store_type, ",
        "store_area, province, ",
        "city, address, idcard_no, ",
        "latitude, longitude, ",
        "contact_name, contact_sex, ",
        "contact_tel, status, ",
        "volume_num, praise_num, ",
        "create_time, modify_time, ",
        "delete, business_day)",
        "values (#{id,jdbcType=BIGINT}, #{accountId,jdbcType=BIGINT}, ",
        "#{storeNo,jdbcType=VARCHAR}, #{storeLogo,jdbcType=VARCHAR}, ",
        "#{storeName,jdbcType=VARCHAR}, #{storeQrcode,jdbcType=VARCHAR}, ",
        "#{storeStatus,jdbcType=INTEGER}, #{storeType,jdbcType=INTEGER}, ",
        "#{storeArea,jdbcType=INTEGER}, #{province,jdbcType=VARCHAR}, ",
        "#{city,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, #{idcardNo,jdbcType=VARCHAR}, ",
        "#{latitude,jdbcType=DOUBLE}, #{longitude,jdbcType=DOUBLE}, ",
        "#{contactName,jdbcType=VARCHAR}, #{contactSex,jdbcType=INTEGER}, ",
        "#{contactTel,jdbcType=VARCHAR}, #{status,jdbcType=CHAR}, ",
        "#{volumeNum,jdbcType=INTEGER}, #{praiseNum,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{modifyTime,jdbcType=TIMESTAMP}, ",
        "#{delete,jdbcType=CHAR}, #{businessDay,jdbcType=LONGVARCHAR})"
    })
    int insert(Store record);

    @InsertProvider(type=StoreSqlProvider.class, method="insertSelective")
    int insertSelective(Store record);

    @Select({
        "select",
        "id, account_id, store_no, store_logo, store_name, store_qrcode, store_status, ",
        "store_type, store_area, province, city, address, idcard_no, latitude, longitude, ",
        "contact_name, contact_sex, contact_tel, status, volume_num, praise_num, create_time, ",
        "modify_time, delete, business_day",
        "from store",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.BIGINT),
        @Result(column="store_no", property="storeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_logo", property="storeLogo", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_name", property="storeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_qrcode", property="storeQrcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_status", property="storeStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="store_type", property="storeType", jdbcType=JdbcType.INTEGER),
        @Result(column="store_area", property="storeArea", jdbcType=JdbcType.INTEGER),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="idcard_no", property="idcardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="latitude", property="latitude", jdbcType=JdbcType.DOUBLE),
        @Result(column="longitude", property="longitude", jdbcType=JdbcType.DOUBLE),
        @Result(column="contact_name", property="contactName", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact_sex", property="contactSex", jdbcType=JdbcType.INTEGER),
        @Result(column="contact_tel", property="contactTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="volume_num", property="volumeNum", jdbcType=JdbcType.INTEGER),
        @Result(column="praise_num", property="praiseNum", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete", property="delete", jdbcType=JdbcType.CHAR),
        @Result(column="business_day", property="businessDay", jdbcType=JdbcType.LONGVARCHAR)
    })
    Store selectByPrimaryKey(Long id);

    @UpdateProvider(type=StoreSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Store record);

    @Update({
        "update store",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "store_no = #{storeNo,jdbcType=VARCHAR},",
          "store_logo = #{storeLogo,jdbcType=VARCHAR},",
          "store_name = #{storeName,jdbcType=VARCHAR},",
          "store_qrcode = #{storeQrcode,jdbcType=VARCHAR},",
          "store_status = #{storeStatus,jdbcType=INTEGER},",
          "store_type = #{storeType,jdbcType=INTEGER},",
          "store_area = #{storeArea,jdbcType=INTEGER},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "idcard_no = #{idcardNo,jdbcType=VARCHAR},",
          "latitude = #{latitude,jdbcType=DOUBLE},",
          "longitude = #{longitude,jdbcType=DOUBLE},",
          "contact_name = #{contactName,jdbcType=VARCHAR},",
          "contact_sex = #{contactSex,jdbcType=INTEGER},",
          "contact_tel = #{contactTel,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "volume_num = #{volumeNum,jdbcType=INTEGER},",
          "praise_num = #{praiseNum,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "delete = #{delete,jdbcType=CHAR},",
          "business_day = #{businessDay,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Store record);

    @Update({
        "update store",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "store_no = #{storeNo,jdbcType=VARCHAR},",
          "store_logo = #{storeLogo,jdbcType=VARCHAR},",
          "store_name = #{storeName,jdbcType=VARCHAR},",
          "store_qrcode = #{storeQrcode,jdbcType=VARCHAR},",
          "store_status = #{storeStatus,jdbcType=INTEGER},",
          "store_type = #{storeType,jdbcType=INTEGER},",
          "store_area = #{storeArea,jdbcType=INTEGER},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "idcard_no = #{idcardNo,jdbcType=VARCHAR},",
          "latitude = #{latitude,jdbcType=DOUBLE},",
          "longitude = #{longitude,jdbcType=DOUBLE},",
          "contact_name = #{contactName,jdbcType=VARCHAR},",
          "contact_sex = #{contactSex,jdbcType=INTEGER},",
          "contact_tel = #{contactTel,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "volume_num = #{volumeNum,jdbcType=INTEGER},",
          "praise_num = #{praiseNum,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "delete = #{delete,jdbcType=CHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Store record);
}