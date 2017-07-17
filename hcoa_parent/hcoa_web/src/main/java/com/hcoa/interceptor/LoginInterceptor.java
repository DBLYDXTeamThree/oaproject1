package com.hcoa.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hcoa.entity.StaffInfo;

/**
 * 登录拦截器
 * 没登录 跳转登录页面
 * 登录未操作超过30分钟 退出登录
 * @author staffInfoistrator
 *
 */
public class LoginInterceptor implements HandlerInterceptor {
	

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		//判断当前访问路径是否为登录的路径,如果是则放行
		if(request.getRequestURI().indexOf("login") > 0){
			return true;
		}
		if(request.getRequestURI().indexOf("identity") > 0){
			return true;
		}
		if(request.getRequestURI().indexOf("resources") > 0){
			return true;
		}
		
		//判断session中是否有登录信息,如果没有则跳转到登录页面,如果有则放行
		HttpSession session = request.getSession();
		StaffInfo staffInfo = (StaffInfo) session.getAttribute("staff");
		System.err.println("============拦截器"+staffInfo);
		if(staffInfo != null){
			return true;
		}
		
		//request.getRequestDispatcher("login.jsp").forward(request, response);
		response.sendRedirect("login.jsp");
		return false;
	}

}
