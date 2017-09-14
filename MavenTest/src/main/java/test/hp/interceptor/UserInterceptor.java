package test.hp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import test.hp.bean.User;

public class UserInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
           System.out.println("请求完成");		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
           System.out.println("请求中");		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
           System.out.println("请求之前");
           User user=(User) request.getSession().getAttribute("user");
           String surl=request.getContextPath();
           if(user==null){
        	   response.sendRedirect(surl);   
        	   }
		return true;
	}

}
