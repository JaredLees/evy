package com.evy.core.mapper;

import com.evy.core.bean.GoodDetail;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodDetailMapper {
    @Insert({
        "insert into good_detail (account_id, store_id, ",
        "id, good_id, spec_detail_id, ",
        "inventory, status, ",
        "create_time, modify_time, ",
        "delete)",
        "values (#{accountId,jdbcType=BIGINT}, #{storeId,jdbcType=BIGINT}, ",
        "#{id,jdbcType=BIGINT}, #{goodId,jdbcType=BIGINT}, #{specDetailId,jdbcType=TIMESTAMP}, ",
        "#{inventory,jdbcType=INTEGER}, #{status,jdbcType=CHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{modifyTime,jdbcType=TIMESTAMP}, ",
        "#{delete,jdbcType=CHAR})"
    })
    int insert(GoodDetail record);

    @InsertProvider(type=GoodDetailSqlProvider.class, method="insertSelective")
    int insertSelective(GoodDetail record);
}