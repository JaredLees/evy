package com.evy.core.mapper;

import com.evy.core.bean.Account;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class AccountSqlProvider {

    public String insertSelective(Account record) {
        BEGIN();
        INSERT_INTO("account");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUsername() != null) {
            VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getCredentialsSalt() != null) {
            VALUES("credentials_salt", "#{credentialsSalt,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            VALUES("nickname", "#{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getRealname() != null) {
            VALUES("realname", "#{realname,jdbcType=VARCHAR}");
        }
        
        if (record.getPinyin() != null) {
            VALUES("pinyin", "#{pinyin,jdbcType=VARCHAR}");
        }
        
        if (record.getTelephone() != null) {
            VALUES("telephone", "#{telephone,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            VALUES("mobile", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getQq() != null) {
            VALUES("QQ", "#{qq,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=CHAR}");
        }
        
        if (record.getLastLoginTime() != null) {
            VALUES("last_login_time", "#{lastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastLoginIp() != null) {
            VALUES("last_login_ip", "#{lastLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLogoutTime() != null) {
            VALUES("last_logout_time", "#{lastLogoutTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getThisLoginTime() != null) {
            VALUES("this_login_time", "#{thisLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getThisLoginIp() != null) {
            VALUES("this_login_ip", "#{thisLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getCheckMail() != null) {
            VALUES("check_mail", "#{checkMail,jdbcType=CHAR}");
        }
        
        if (record.getCheckMobile() != null) {
            VALUES("check_mobile", "#{checkMobile,jdbcType=CHAR}");
        }
        
        if (record.getRemark() != null) {
            VALUES("remark", "#{remark,jdbcType=VARCHAR}");
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
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(Account record) {
        BEGIN();
        UPDATE("account");
        
        if (record.getUsername() != null) {
            SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getCredentialsSalt() != null) {
            SET("credentials_salt = #{credentialsSalt,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            SET("nickname = #{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getRealname() != null) {
            SET("realname = #{realname,jdbcType=VARCHAR}");
        }
        
        if (record.getPinyin() != null) {
            SET("pinyin = #{pinyin,jdbcType=VARCHAR}");
        }
        
        if (record.getTelephone() != null) {
            SET("telephone = #{telephone,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            SET("mobile = #{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getQq() != null) {
            SET("QQ = #{qq,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=CHAR}");
        }
        
        if (record.getLastLoginTime() != null) {
            SET("last_login_time = #{lastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastLoginIp() != null) {
            SET("last_login_ip = #{lastLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLogoutTime() != null) {
            SET("last_logout_time = #{lastLogoutTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getThisLoginTime() != null) {
            SET("this_login_time = #{thisLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getThisLoginIp() != null) {
            SET("this_login_ip = #{thisLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getCheckMail() != null) {
            SET("check_mail = #{checkMail,jdbcType=CHAR}");
        }
        
        if (record.getCheckMobile() != null) {
            SET("check_mobile = #{checkMobile,jdbcType=CHAR}");
        }
        
        if (record.getRemark() != null) {
            SET("remark = #{remark,jdbcType=VARCHAR}");
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
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }
}