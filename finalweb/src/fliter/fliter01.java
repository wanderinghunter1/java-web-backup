package fliter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")//defin the myservlet source;
public class fliter01 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter01 inited");
        //Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        System.out.println("filter01 destoryed");
        //Filter.super.destroy();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //rerun the source
        System.out.println("f01 running");

        filterChain.doFilter ( servletRequest, servletResponse);
    }
}
