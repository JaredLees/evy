package com.evy.core.mapper;

import com.evy.core.bean.AccountAdminStore;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountAdminStoreMapper {
    @Insert({
        "insert into account_admin_store (account_id, admin_id, ",
        "store_id)",
        "values (#{accountId,jdbcType=BIGINT}, #{adminId,jdbcType=BIGINT}, ",
        "#{storeId,jdbcType=BIGINT})"
    })
    int insert(AccountAdminStore record);

    @InsertProvider(type=AccountAdminStoreSqlProvider.class, method="insertSelective")
    int insertSelective(AccountAdminStore record);
}