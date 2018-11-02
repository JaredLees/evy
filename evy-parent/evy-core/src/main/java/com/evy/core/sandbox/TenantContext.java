package com.evy.core.sandbox;

import com.evy.core.returns.ApiResult;
import com.evy.core.returns.ReturnCode;
import io.jsonwebtoken.Claims;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Jonny
 * @Description: 租户上下文
 * @date 2018/4/12上午10:02
 */
public class TenantContext {

    private static ThreadLocal<Tenant> tenantHolder = new ThreadLocal<>();

    public static void setTenant(Tenant tenant) {
        tenantHolder.set(tenant);
    }

    public static Tenant getTenant() {
        return tenantHolder.get();
    }

    public static Long getUserId() {
        return getTenant().getUserId();
    }

    public static int getUserType() {
        return getTenant().getUserType();
    }

    public static Long getTenantId() {
        return getTenant().getTenantId();
    }

    public static boolean exists() {
        return getTenant() != null;
    }

    public static boolean isIsolated() {
        return getTenant().isIsolated();
    }

    public static String getIsolatedKey(String key) {
        if (isIsolated()) {
            return String.format("%s_%s", getTenantId(), key);
        }
        return key;
    }

    public static void clear() {
        tenantHolder.remove();
    }

    //设置租户上下文
    public static boolean setTenantContext(Claims claims){
        String tenantId = toString(claims.get(TenantConstants.TENANT_ID));
        String userId = toString(claims.get(TenantConstants.USER_ID));
        String userType = toString(claims.get(TenantConstants.USER_TYPE));
        String isolatedStr = toString(claims.get(TenantConstants.ISOLATED));
        boolean isolated = true;

        if(StringUtils.isNotEmpty(isolatedStr)) {
            isolated = Boolean.valueOf(isolatedStr);
        }

        if (isolated && valid(tenantId)) { // 如果需要租户隔离并且租户Id有效
            Tenant tenant = new Tenant(Long.valueOf(tenantId));
            if (valid(userId)) {
                tenant.setUserId(Long.valueOf(userId));
            }
            if (valid(userType)) {
                tenant.setUserType(Integer.parseInt(userId));
            }
            TenantContext.setTenant(tenant);
        } else if (!isolated) { // 如果配置了不需要租户隔离
            Tenant tenant = new Tenant(false);
            if (valid(tenantId)) {
                tenant.setTenantId(Long.valueOf(tenantId));
            }
            if (valid(userId)) {
                tenant.setUserId(Long.valueOf(userId));
            }
            if (valid(userType)) {
                tenant.setUserType(Integer.parseInt(userId));
            }
            TenantContext.setTenant(tenant);
        } else { // 租户Id无效或不合法
            return false;
        }
        return true;
    }

    public static void setTenantContext(HttpServletRequest request) {
        String tenantId = request.getHeader(TenantConstants.TENANT_ID);
        String userId = request.getHeader(TenantConstants.USER_ID);
        String userType = request.getHeader(TenantConstants.USER_TYPE);
        String isolatedStr = request.getHeader(TenantConstants.ISOLATED);
        boolean isolated = true;

        if(StringUtils.isNotEmpty(isolatedStr)) {
            isolated = Boolean.valueOf(isolatedStr);
        }

        if (isolated && valid(tenantId)) { // 如果需要租户隔离并且租户Id有效
            Tenant tenant = new Tenant(Long.valueOf(tenantId));
            if (valid(userId)) {
                tenant.setUserId(Long.valueOf(userId));
            }
            if (valid(userType)) {
                tenant.setUserType(Integer.parseInt(userId));
            }
            TenantContext.setTenant(tenant);
        } else if (!isolated) { // 如果配置了不需要租户隔离
            Tenant tenant = new Tenant(false);
            if (valid(tenantId)) {
                tenant.setTenantId(Long.valueOf(tenantId));
            }
            if (valid(userId)) {
                tenant.setUserId(Long.valueOf(userId));
            }
            if (valid(userType)) {
                tenant.setUserType(Integer.parseInt(userId));
            }
            TenantContext.setTenant(tenant);
        } else { // 租户Id无效或不合法
            throw new IllegalArgumentException();
        }
    }

    //设置租户上下文
    public static boolean setTenantContext(Claims claims, HttpServletResponse response){
        String tenantId = toString(claims.get(TenantConstants.TENANT_ID));
        String userId = toString(claims.get(TenantConstants.USER_ID));
        String userType = toString(claims.get(TenantConstants.USER_TYPE));
        String isolatedStr = toString(claims.get(TenantConstants.ISOLATED));
        boolean isolated = true;

        if(StringUtils.isNotEmpty(isolatedStr)) {
            isolated = Boolean.valueOf(isolatedStr);
        }

        if (isolated && valid(tenantId)) { // 如果需要租户隔离并且租户Id有效
            Tenant tenant = new Tenant(Long.valueOf(tenantId));
            if (valid(userId)) {
                tenant.setUserId(Long.valueOf(userId));
            }
            if (valid(userType)) {
                tenant.setUserType(Integer.parseInt(userId));
            }
            TenantContext.setTenant(tenant);
            return true;
        } else if (!isolated) { // 如果配置了不需要租户隔离
            Tenant tenant = new Tenant(false);
            if (valid(tenantId)) {
                tenant.setTenantId(Long.valueOf(tenantId));
            }
            if (valid(userId)) {
                tenant.setUserId(Long.valueOf(userId));
            }
            if (valid(userType)) {
                tenant.setUserType(Integer.parseInt(userId));
            }
            TenantContext.setTenant(tenant);
            return true;
        } else { // 租户Id无效或不合法
            ApiResult.response(response, ReturnCode.C455);
            return false;
        }
    }

    private static String toString(Object obj) {
        if(null == obj){ return "";}
        return obj.toString();
    }

    /**
     * valid tenantId is correct
     */
    private static boolean valid(String tenantId) {
        return StringUtils.isNotEmpty(tenantId) && StringUtils.isNumeric(tenantId);
    }
}