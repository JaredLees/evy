package com.evy.core.mapper;

import com.evy.core.bean.Comments;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface CommentsMapper {
    @Delete({
        "delete from comments",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into comments (id, account_id, ",
        "store_id, user_id, order_num, ",
        "title, content, score, ",
        "pre_id, status, create_time, ",
        "modify_time, delete)",
        "values (#{id,jdbcType=BIGINT}, #{accountId,jdbcType=BIGINT}, ",
        "#{storeId,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, #{orderNum,jdbcType=VARCHAR}, ",
        "#{title,jdbcType=BIGINT}, #{content,jdbcType=VARCHAR}, #{score,jdbcType=DECIMAL}, ",
        "#{preId,jdbcType=BIGINT}, #{status,jdbcType=CHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{modifyTime,jdbcType=TIMESTAMP}, #{delete,jdbcType=CHAR})"
    })
    int insert(Comments record);

    @InsertProvider(type=CommentsSqlProvider.class, method="insertSelective")
    int insertSelective(Comments record);

    @Select({
        "select",
        "id, account_id, store_id, user_id, order_num, title, content, score, pre_id, ",
        "status, create_time, modify_time, delete",
        "from comments",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.BIGINT),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_num", property="orderNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.BIGINT),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="score", property="score", jdbcType=JdbcType.DECIMAL),
        @Result(column="pre_id", property="preId", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete", property="delete", jdbcType=JdbcType.CHAR)
    })
    Comments selectByPrimaryKey(Long id);

    @UpdateProvider(type=CommentsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Comments record);

    @Update({
        "update comments",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "store_id = #{storeId,jdbcType=BIGINT},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "order_num = #{orderNum,jdbcType=VARCHAR},",
          "title = #{title,jdbcType=BIGINT},",
          "content = #{content,jdbcType=VARCHAR},",
          "score = #{score,jdbcType=DECIMAL},",
          "pre_id = #{preId,jdbcType=BIGINT},",
          "status = #{status,jdbcType=CHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "delete = #{delete,jdbcType=CHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Comments record);
}