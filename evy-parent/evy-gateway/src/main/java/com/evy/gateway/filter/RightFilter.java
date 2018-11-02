package com.evy.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @author Jonny
 * @Description:
 * @date 2018/7/13上午9:52
 */
@Slf4j
@Component
public class RightFilter extends ZuulFilter {

    //@Resource private RightService rightService;

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        Boolean sendZuulResponse = (Boolean)context.get("sendZuulResponse"); //false为存在异常
        if(sendZuulResponse == null || sendZuulResponse) {
            return false; //return !checkRight(request);
            // return !checkRight(request);
        }else{
            return false;
        }
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        //response(context, ReturnCode.C403); //如需权限，打开此注释
        return null;
    }

    //权限校验
    private boolean checkRight(HttpServletRequest request) {
        return true; // TODO
    }

}
