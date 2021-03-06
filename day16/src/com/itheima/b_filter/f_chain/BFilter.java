package com.itheima.b_filter.f_chain;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "BFilter", urlPatterns = {"/a/*"})
public class BFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("bfilter 收到请求");
        //放行
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("bfilter 收到响应");
    }

    @Override
    public void destroy() {

    }
}
