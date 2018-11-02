package com.evy.gateway.filter;

import com.evy.core.config.Audience;
import com.evy.core.returns.ApiResult;
import com.evy.core.returns.ReturnCode;
import com.evy.core.sandbox.TenantConstants;
import com.evy.core.sandbox.TenantContext;
import com.evy.core.utils.JWTUtil;
import com.evy.core.utils.JsonUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @author Jonny
 * @Description:
 * @date 2018/7/13上午9:49
 */
@Slf4j
@Component
public class JwtZuulFilter extends ZuulFilter{

    private static final String[] URL_IGNORES = {
            "/sso/signin"
    };

    @Resource
    private Audience audience;

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        String uri = request.getRequestURI();

        // 忽略认证
        if(ArrayUtils.contains(URL_IGNORES, uri)) {
            context.addZuulRequestHeader(TenantConstants.ISOLATED, "false");
            return null;
        }

        String jwtToken = request.getHeader("authorization");

        if (StringUtils.isEmpty(jwtToken) || !jwtToken.startsWith("bearer;")) {
            response(context, ReturnCode.C302);
            return null;
        }
        final String token = jwtToken.substring(7);

        try {
            if(audience == null){
                BeanFactory factory = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
                audience = (Audience) factory.getBean("audience");
            }
            final Claims claims = JWTUtil.parseJWT(token,audience.getBase64Secret());

            if(!TenantContext.setTenantContext(claims)){
                response(context, ReturnCode.C455);
                return null;
            }

            String tenantId = toString(claims.get(TenantConstants.TENANT_ID));
            String userId = toString(claims.get(TenantConstants.USER_ID));
            String userType = toString(claims.get(TenantConstants.USER_TYPE));
            String isolatedStr = toString(claims.get(TenantConstants.ISOLATED));

            context.addZuulRequestHeader(TenantConstants.TENANT_ID, tenantId);
            context.addZuulRequestHeader(TenantConstants.USER_ID, userId);
            context.addZuulRequestHeader(TenantConstants.USER_TYPE, userType);
            context.addZuulRequestHeader(TenantConstants.ISOLATED, isolatedStr);

        } catch (final Exception e) {
            response(context, ReturnCode.C302);
            return null;
        }
        log.info("accessToken = {}", jwtToken);
        return null;
    }

    private static String toString(Object obj) {
        if(null == obj){
            return "";
        };
        return obj.toString();
    }

    /**
     *
     * @param context
     * @param returnCode
     */
    private void response(RequestContext context, ReturnCode returnCode) {
        //该请求将不会被路由，直接返回
        context.setSendZuulResponse(false);
        ApiResult rep = new ApiResult(returnCode.getCode(),returnCode.getMessage());
        context.addZuulResponseHeader("Content-Type", "application/json;charset=UTF-8");
        context.setResponseBody(JsonUtil.object2Json(rep));
    }
}
