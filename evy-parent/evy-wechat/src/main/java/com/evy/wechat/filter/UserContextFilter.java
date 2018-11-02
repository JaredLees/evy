package com.evy.wechat.filter;

import com.evy.core.returns.ApiResult;
import com.evy.core.returns.ReturnCode;
import com.evy.core.sandbox.TenantContext;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jonny
 * @Description:
 * @date 2018/7/13下午3:32
 */
@Component
@WebFilter(filterName = "UserContextFilter", urlPatterns = "/*")
public class UserContextFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        final HttpServletRequest request = (HttpServletRequest) req;
        final HttpServletResponse response = (HttpServletResponse) res;

        if ("OPTIONS".equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
        } else {
            try{
                setTanentContext(request);
            }catch (IllegalArgumentException ex){
                ApiResult.response(response, ReturnCode.C455);
                return ;
            }
        }
        chain.doFilter(req, res);
    }

    private void setTanentContext(HttpServletRequest request) {
        TenantContext.setTenantContext(request);
    }

    @Override
    public void destroy() {

    }
}
