package cn.linkpal.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.linkpal.model.UserInfo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginHandlerIntercepter implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest httpservletrequest,
								HttpServletResponse httpservletresponse, Object obj,
								Exception exception) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest httpservletrequest,
						   HttpServletResponse httpservletresponse, Object obj,
						   ModelAndView modelandview) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest httpservletrequest,
							 HttpServletResponse httpservletresponse, Object obj)
			throws Exception {
		// TODO Auto-generated method stub

		//说明处在编辑的页面
		HttpSession session = httpservletrequest.getSession();
		UserInfo userInfo = (UserInfo) session.getAttribute("User");
		System.out.println(userInfo + "*************");
		if (userInfo != null) {
			//登陆成功的用户
			return true;
		} else {
			//没有登陆，转向登陆界面
			httpservletrequest.getRequestDispatcher("/login.jsp").forward(httpservletrequest, httpservletresponse);
			return false;
		}


	}
}