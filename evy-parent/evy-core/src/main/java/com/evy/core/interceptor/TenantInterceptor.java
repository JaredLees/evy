package com.evy.core.interceptor;

import com.evy.core.sandbox.TenantContext;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Jonny
 * @Description: 通过拦截器获取tenantId参数，也可通过ControllerAdvice，Filter(依赖容器)
 * @date 2018/4/12上午10:52
 */
public class TenantInterceptor implements HandlerInterceptor {

    ////如果false，停止流程，api被拦截,在请求调用Controller之前调用
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //上下文处理
       // TenantContext.setTenantContext(request, response);
        return true;
    }

    //请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }


    //在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //租户上下文清理
        TenantContext.clear();
    }
}
