package com.evy.core.base;

import com.evy.core.sandbox.TenantContext;
import com.evy.core.utils.IdGenerator;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础bean
 */
@Data
public class BaseBean implements Serializable {
    public static final String[] LOCKS_ALL = {"0","1"};
    public static final String LOCK_VALIABLE = LOCKS_ALL[0];
    public static final String LOCK_INVALIABLE = LOCKS_ALL[1];
    public static final String[] STATUS_ALL = {"0","1"};
    public static final String STATUS_VALIABLE = STATUS_ALL[0];
    public static final String STATUS_INVALIABLE = STATUS_ALL[1];
    public static final String[] DELETE_ALL = {"0","1"};
    public static final String DELETE_FALSE = DELETE_ALL[0];
    public static final String DELETE_TRUE = DELETE_ALL[1];
    public static final Integer FALSE = 0;//否
    public static final Integer TRUE = 1;//是

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    protected Date createdDate;//创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    protected Date lastUpdated;//最后修改时间
    protected String deleted;//是否删除 1：删除 0：未删除
    protected Long dbid;//学校id
    protected Long id; // id

    public static final IdGenerator idGenerator = IdGenerator.getInstance();

    public void build4Insert(){
        Date now = new Date();
        this.createdDate = now;
        this.lastUpdated = now;
        this.id = idGenerator.nextId();
        this.dbid = TenantContext.getTenantId();
        this.deleted = DELETE_FALSE;
    }

    public void build4Update() {
        this.lastUpdated = new Date();
    }
}
