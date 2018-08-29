package cn.linkpal.Interceptor;

import cn.linkpal.model.MemoryData;
import cn.linkpal.model.UserInfo;
import cn.linkpal.util.AccessUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SingleUserInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String url = httpServletRequest.getRequestURI();
        //如果拦截到的是登录的页面的话放行
        if (url.indexOf("Login") >= 0) {
            return true;
        }
UserInfo user= (UserInfo) httpServletRequest.getSession().getAttribute("User");
  String token="";

   if(user!=null)
   {
   token= (String) httpServletRequest.getSession().getAttribute("Access_token");
  //String sessionid= MemoryData.getSessionIDMap().get(user.getUsername());
   if(AccessUtil.tokens.size()==0) return true;
   else if(!(AccessUtil.tokens.get(AccessUtil.tokens.size()-1).equals(token))) {
       if (httpServletRequest.getHeader("x-requested-with") != null
               && httpServletRequest.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) {
           httpServletResponse.setHeader("sessionstatus", "timeout");
           return false;
       } else {
           String indexurl = "Loginout" ;
           httpServletResponse.sendRedirect(indexurl);
           return false;
       }
   }
}




        httpServletRequest.getRequestDispatcher("Loginout").forward(httpServletRequest, httpServletResponse);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
