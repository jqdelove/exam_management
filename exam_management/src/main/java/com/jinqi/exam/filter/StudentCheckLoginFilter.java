package com.jinqi.exam.filter;



import com.jinqi.exam.entity.Student;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentCheckLoginFilter implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest) req;
		HttpServletResponse response=(HttpServletResponse) res;
		
		Student stu = (Student) request.getSession().getAttribute("stu");
		if (stu!=null) {
			chain.doFilter(request, response);
			return;
		}
		response.sendRedirect(request.getContextPath()+"/student/showLogin.do");
	}

	public void init(FilterConfig arg0) throws ServletException {
		
	}
	
}
