package com.evy.core.sandbox;

import lombok.Data;

/**
 * @author Jonny
 * @Description: 租户隔离
 * @date 2018/4/12上午10:02
 */
@Data
public class Tenant {

    private Long tenantId; //租户id

    private Long userId;  //用户id

    private int userType; //用户类型

    // 是否需要进行租户隔离, 默认需要
    private boolean isolated = true;

    public Tenant(Long tenantId, Long userId, int userType, boolean isolated) {
        this.tenantId = tenantId;
        this.userId = userId;
        this.userType = userType;
        this.isolated = isolated;
    }

    public Tenant(boolean isolated) {
        this.isolated = isolated;
    }

    public Tenant(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Tenant() {
    }
}