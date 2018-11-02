package com.evy.core.mapper;


import com.evy.core.bean.AccountAdminStore;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class AccountAdminStoreSqlProvider {

    public String insertSelective(AccountAdminStore record) {
        BEGIN();
        INSERT_INTO("account_admin_store");
        
        if (record.getAccountId() != null) {
            VALUES("account_id", "#{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getAdminId() != null) {
            VALUES("admin_id", "#{adminId,jdbcType=BIGINT}");
        }
        
        if (record.getStoreId() != null) {
            VALUES("store_id", "#{storeId,jdbcType=BIGINT}");
        }
        
        return SQL();
    }
}