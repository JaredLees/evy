package com.evy.core.base;

import com.evy.core.sandbox.TenantContext;
import com.evy.core.utils.IdGenerator;

import java.util.List;

public abstract  class BaseService{
    //获取租户id
    public Long getTenantId() {
        return TenantContext.getTenantId();
    }

    //生成唯一id
    public Long generatorId() {
        return IdGenerator.getInstance().nextId();
    }

    //生成唯一id
    public List<Long> generatorId(int size) {
        return IdGenerator.getInstance().batchIds(size);
    }
}
