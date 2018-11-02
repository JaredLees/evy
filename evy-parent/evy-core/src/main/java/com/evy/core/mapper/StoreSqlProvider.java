package com.evy.core.mapper;

import com.evy.core.bean.Store;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class StoreSqlProvider {

    public String insertSelective(Store record) {
        BEGIN();
        INSERT_INTO("store");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getAccountId() != null) {
            VALUES("account_id", "#{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getStoreNo() != null) {
            VALUES("store_no", "#{storeNo,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreLogo() != null) {
            VALUES("store_logo", "#{storeLogo,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreName() != null) {
            VALUES("store_name", "#{storeName,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreQrcode() != null) {
            VALUES("store_qrcode", "#{storeQrcode,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreStatus() != null) {
            VALUES("store_status", "#{storeStatus,jdbcType=INTEGER}");
        }
        
        if (record.getStoreType() != null) {
            VALUES("store_type", "#{storeType,jdbcType=INTEGER}");
        }
        
        if (record.getStoreArea() != null) {
            VALUES("store_area", "#{storeArea,jdbcType=INTEGER}");
        }
        
        if (record.getProvince() != null) {
            VALUES("province", "#{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            VALUES("city", "#{city,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getIdcardNo() != null) {
            VALUES("idcard_no", "#{idcardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getLatitude() != null) {
            VALUES("latitude", "#{latitude,jdbcType=DOUBLE}");
        }
        
        if (record.getLongitude() != null) {
            VALUES("longitude", "#{longitude,jdbcType=DOUBLE}");
        }
        
        if (record.getContactName() != null) {
            VALUES("contact_name", "#{contactName,jdbcType=VARCHAR}");
        }
        
        if (record.getContactSex() != null) {
            VALUES("contact_sex", "#{contactSex,jdbcType=INTEGER}");
        }
        
        if (record.getContactTel() != null) {
            VALUES("contact_tel", "#{contactTel,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=CHAR}");
        }
        
        if (record.getVolumeNum() != null) {
            VALUES("volume_num", "#{volumeNum,jdbcType=INTEGER}");
        }
        
        if (record.getPraiseNum() != null) {
            VALUES("praise_num", "#{praiseNum,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyTime() != null) {
            VALUES("modify_time", "#{modifyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDelete() != null) {
            VALUES("delete", "#{delete,jdbcType=CHAR}");
        }
        
        if (record.getBusinessDay() != null) {
            VALUES("business_day", "#{businessDay,jdbcType=LONGVARCHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(Store record) {
        BEGIN();
        UPDATE("store");
        
        if (record.getAccountId() != null) {
            SET("account_id = #{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getStoreNo() != null) {
            SET("store_no = #{storeNo,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreLogo() != null) {
            SET("store_logo = #{storeLogo,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreName() != null) {
            SET("store_name = #{storeName,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreQrcode() != null) {
            SET("store_qrcode = #{storeQrcode,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreStatus() != null) {
            SET("store_status = #{storeStatus,jdbcType=INTEGER}");
        }
        
        if (record.getStoreType() != null) {
            SET("store_type = #{storeType,jdbcType=INTEGER}");
        }
        
        if (record.getStoreArea() != null) {
            SET("store_area = #{storeArea,jdbcType=INTEGER}");
        }
        
        if (record.getProvince() != null) {
            SET("province = #{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            SET("city = #{city,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getIdcardNo() != null) {
            SET("idcard_no = #{idcardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getLatitude() != null) {
            SET("latitude = #{latitude,jdbcType=DOUBLE}");
        }
        
        if (record.getLongitude() != null) {
            SET("longitude = #{longitude,jdbcType=DOUBLE}");
        }
        
        if (record.getContactName() != null) {
            SET("contact_name = #{contactName,jdbcType=VARCHAR}");
        }
        
        if (record.getContactSex() != null) {
            SET("contact_sex = #{contactSex,jdbcType=INTEGER}");
        }
        
        if (record.getContactTel() != null) {
            SET("contact_tel = #{contactTel,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=CHAR}");
        }
        
        if (record.getVolumeNum() != null) {
            SET("volume_num = #{volumeNum,jdbcType=INTEGER}");
        }
        
        if (record.getPraiseNum() != null) {
            SET("praise_num = #{praiseNum,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyTime() != null) {
            SET("modify_time = #{modifyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDelete() != null) {
            SET("delete = #{delete,jdbcType=CHAR}");
        }
        
        if (record.getBusinessDay() != null) {
            SET("business_day = #{businessDay,jdbcType=LONGVARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }
}