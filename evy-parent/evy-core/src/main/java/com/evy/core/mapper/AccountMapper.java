package com.evy.core.mapper;

import com.evy.core.bean.Account;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface AccountMapper {
    @Delete({
        "delete from account",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into account (id, username, ",
        "password, credentials_salt, ",
        "nickname, realname, ",
        "pinyin, telephone, ",
        "mobile, email, QQ, ",
        "status, last_login_time, ",
        "last_login_ip, last_logout_time, ",
        "this_login_time, this_login_ip, ",
        "check_mail, check_mobile, ",
        "remark, create_time, ",
        "modify_time, delete)",
        "values (#{id,jdbcType=BIGINT}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{credentialsSalt,jdbcType=VARCHAR}, ",
        "#{nickname,jdbcType=VARCHAR}, #{realname,jdbcType=VARCHAR}, ",
        "#{pinyin,jdbcType=VARCHAR}, #{telephone,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, #{qq,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=CHAR}, #{lastLoginTime,jdbcType=TIMESTAMP}, ",
        "#{lastLoginIp,jdbcType=VARCHAR}, #{lastLogoutTime,jdbcType=TIMESTAMP}, ",
        "#{thisLoginTime,jdbcType=TIMESTAMP}, #{thisLoginIp,jdbcType=VARCHAR}, ",
        "#{checkMail,jdbcType=CHAR}, #{checkMobile,jdbcType=CHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{modifyTime,jdbcType=TIMESTAMP}, #{delete,jdbcType=CHAR})"
    })
    int insert(Account record);

    @InsertProvider(type=AccountSqlProvider.class, method="insertSelective")
    int insertSelective(Account record);

    @Select({
        "select",
        "`id`, username, password, credentials_salt, nickname, realname, pinyin, telephone, ",
        "mobile, email, QQ, status, last_login_time, last_login_ip, last_logout_time, ",
        "this_login_time, this_login_ip, check_mail, check_mobile, remark, create_time, ",
        "modify_time, `delete`",
        "from account",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="credentials_salt", property="credentialsSalt", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="realname", property="realname", jdbcType=JdbcType.VARCHAR),
        @Result(column="pinyin", property="pinyin", jdbcType=JdbcType.VARCHAR),
        @Result(column="telephone", property="telephone", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="QQ", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="last_login_time", property="lastLoginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_login_ip", property="lastLoginIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_logout_time", property="lastLogoutTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="this_login_time", property="thisLoginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="this_login_ip", property="thisLoginIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="check_mail", property="checkMail", jdbcType=JdbcType.CHAR),
        @Result(column="check_mobile", property="checkMobile", jdbcType=JdbcType.CHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete", property="delete", jdbcType=JdbcType.CHAR)
    })
    Account selectByPrimaryKey(@Param("id") Long id);

    @UpdateProvider(type=AccountSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Account record);

    @Update({
        "update account",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "credentials_salt = #{credentialsSalt,jdbcType=VARCHAR},",
          "nickname = #{nickname,jdbcType=VARCHAR},",
          "realname = #{realname,jdbcType=VARCHAR},",
          "pinyin = #{pinyin,jdbcType=VARCHAR},",
          "telephone = #{telephone,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "QQ = #{qq,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "last_login_time = #{lastLoginTime,jdbcType=TIMESTAMP},",
          "last_login_ip = #{lastLoginIp,jdbcType=VARCHAR},",
          "last_logout_time = #{lastLogoutTime,jdbcType=TIMESTAMP},",
          "this_login_time = #{thisLoginTime,jdbcType=TIMESTAMP},",
          "this_login_ip = #{thisLoginIp,jdbcType=VARCHAR},",
          "check_mail = #{checkMail,jdbcType=CHAR},",
          "check_mobile = #{checkMobile,jdbcType=CHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "delete = #{delete,jdbcType=CHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Account record);
}