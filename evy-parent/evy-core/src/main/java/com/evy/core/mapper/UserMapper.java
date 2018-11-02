package com.evy.core.mapper;

import com.evy.core.bean.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface UserMapper {
    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user (id, account_id, ",
        "avatar, telephone, ",
        "username, nickname, ",
        "province, city, ",
        "source, create_ip, last_login_time, ",
        "last_login_ip, this_login_time, ",
        "this_login_ip, status, ",
        "create_time, modify_time, ",
        "delete, open_id)",
        "values (#{id,jdbcType=BIGINT}, #{accountId,jdbcType=BIGINT}, ",
        "#{avatar,jdbcType=VARCHAR}, #{telephone,jdbcType=VARCHAR}, ",
        "#{username,jdbcType=VARCHAR}, #{nickname,jdbcType=VARCHAR}, ",
        "#{province,jdbcType=VARCHAR}, #{city,jdbcType=VARCHAR}, ",
        "#{source,jdbcType=CHAR}, #{createIp,jdbcType=VARCHAR}, #{lastLoginTime,jdbcType=TIMESTAMP}, ",
        "#{lastLoginIp,jdbcType=VARCHAR}, #{thisLoginTime,jdbcType=TIMESTAMP}, ",
        "#{thisLoginIp,jdbcType=VARCHAR}, #{status,jdbcType=CHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{modifyTime,jdbcType=TIMESTAMP}, ",
        "#{delete,jdbcType=CHAR}, #{openId,jdbcType=VARCHAR})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @Select({
        "select",
        "id, account_id, avatar, telephone, username, nickname, province, city, source, ",
        "create_ip, last_login_time, last_login_ip, this_login_time, this_login_ip, status, ",
        "create_time, modify_time, `delete`, open_id",
        "from user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.BIGINT),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="telephone", property="telephone", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.CHAR),
        @Result(column="create_ip", property="createIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_login_time", property="lastLoginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_login_ip", property="lastLoginIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="this_login_time", property="thisLoginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="this_login_ip", property="thisLoginIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete", property="delete", jdbcType=JdbcType.CHAR),
        @Result(column="open_id", property="openId", jdbcType=JdbcType.VARCHAR)
    })
    User selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "avatar = #{avatar,jdbcType=VARCHAR},",
          "telephone = #{telephone,jdbcType=VARCHAR},",
          "username = #{username,jdbcType=VARCHAR},",
          "nickname = #{nickname,jdbcType=VARCHAR},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "source = #{source,jdbcType=CHAR},",
          "create_ip = #{createIp,jdbcType=VARCHAR},",
          "last_login_time = #{lastLoginTime,jdbcType=TIMESTAMP},",
          "last_login_ip = #{lastLoginIp,jdbcType=VARCHAR},",
          "this_login_time = #{thisLoginTime,jdbcType=TIMESTAMP},",
          "this_login_ip = #{thisLoginIp,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "`delete` = #{delete,jdbcType=CHAR},",
          "open_id = #{openId,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(User record);

    @Select({"<script>" ,
            "select * from user " ,
            "where `delete` = '0' and " ,
            "<if test='username != null' >",
            "username = #{username} " ,
            "</if>"+
            "</script>"})
    User selectByUserName(Long dbid, String username);

    @Select({"<script>" ,
            "select * from user " ,
            "where `delete` = '0' and " ,
            "open_id = #{openId} and account_id = #{accountId}" ,
            "</script>"})
    User findByAccountIdAndOpenId(@Param("openId") String openId, @Param("accountId") Long accountId);
}