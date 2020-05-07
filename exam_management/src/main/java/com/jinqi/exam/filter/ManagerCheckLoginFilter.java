package com.jinqi.exam.filter;



import com.jinqi.exam.entity.Manager;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 管理员登录检查过滤器
 */
public class ManagerCheckLoginFilter implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest) req;
		HttpServletResponse response=(HttpServletResponse) res;
		
		Manager man = (Manager) request.getSession().getAttribute("man");
		if (man!=null) {
			chain.doFilter(request, response);
			return;
		}
		response.sendRedirect(request.getContextPath()+"/manager/showLogin.do");
	}

	public void init(FilterConfig arg0) throws ServletException {
		
	}
	
}
