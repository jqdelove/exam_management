package com.jinqi.exam.filter;



import com.jinqi.exam.entity.Teacher;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TeacherCheckLoginFilter implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest) req;
		HttpServletResponse response=(HttpServletResponse) res;
		
		Teacher tea = (Teacher) request.getSession().getAttribute("tea");
		if (tea!=null) {
			chain.doFilter(request, response);
			return;
		}
		response.sendRedirect(request.getContextPath()+"/teacher/showLogin.do");
	}

	public void init(FilterConfig arg0) throws ServletException {
		
	}
	
}
