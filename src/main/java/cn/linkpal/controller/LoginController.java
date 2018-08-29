package cn.linkpal.controller;

import cn.linkpal.model.Factory;
import cn.linkpal.model.MemoryData;
import cn.linkpal.model.UserInfo;
import cn.linkpal.model.WorkSteps;
import cn.linkpal.util.AccessUtil;
import cn.linkpal.util.HttpClientUtil;
import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Controller
@SessionAttributes(value={"Access_token","User","factID"},types = {String.class,UserInfo.class,Integer.class})
public class LoginController {


    @RequestMapping(value = "login.do")
    public ModelAndView Login(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = null;
    if(request.getSession().getAttribute("User")==null)
    {
        mav = new ModelAndView("login");
    }
    else
    {
        mav = new ModelAndView("menu");

        List<Factory> factoryList= (List<Factory>) request.getSession().getAttribute("factlist");
        UserInfo user= (UserInfo) request.getSession().getAttribute("User");


        UserInfo finalUser = user;
        int size = factoryList.stream().filter(f -> f.getId() == finalUser.getFactID()).collect(Collectors.<Factory>toList()).size();

        if (user.getFactID() == 0 || size == 0) {
            mav.addObject("page", "factory.jsp");

           // request.getSession().setAttribute("factlist", factoryList);
        } else {


            mav.addObject("page", "worksteps.jsp");
            mav.addObject("factID", user.getFactID());
        }
    }

    return mav;
    }


        @RequestMapping(value = "/Login")
    @ResponseBody
    @POST
    public ModelAndView Login(HttpServletRequest request, HttpServletResponse response,@RequestParam Map<String,Object> params)
    {

        String url="";

        List<Factory> factoryList=null;
        List<WorkSteps> workStepsList=null;

        UserInfo user=null;

        String token="";
      /*  initFactList();*/

        ModelAndView mav = null;


        if(params.size()==0) {
            mav = new ModelAndView("/login");
            mav.addObject("msg", "请输入用户名或密码");
        }
        else if( request.getSession().getAttribute("User")!=null)
        {
            UserInfo users= (UserInfo) request.getSession().getAttribute("User");
            if(users.getUsername().equals(params.get("usernameOrEmailAddress").toString()))
            {
                mav=Login(request,response);
            }
            else
            {
                mav = new ModelAndView("/login");
               // mav.addObject("username", FName);
                mav.addObject("msg", "请退出已登录用户");
            }
        }
        else
        {
       /*     UserInfo users= (UserInfo) request.getSession().getAttribute("User");
            if(users.)*/
            //登录
            url = AccessUtil.url + "api/Account";
            JSONObject object = HttpClientUtil.post(url, params);
            if (object != null && object.size() > 0) {
                if (object.get("result") != null) {
                    mav = new ModelAndView("menu");
                    token = object.get("result").toString();
                    mav.addObject("Access_token", token);

                    //String token = request.getRequestedSessionId();
                  /*  String username = params.get("usernameOrEmailAddress").toString();
                    if (!MemoryData.getSessionIDMap().containsKey(username)) {
                        MemoryData.getSessionIDMap().put(username, token);
                    } else if (MemoryData.getSessionIDMap().containsKey(username) && !StringUtils.equals(token, MemoryData.getSessionIDMap().get(username))) {
                        MemoryData.getSessionIDMap().remove(username);
                        MemoryData.getSessionIDMap().put(username, token);
                    }
*/
                  /*  String finalToken = token;
                    if(AccessUtil.tokens.stream().filter(u->u.getToken().equals(finalToken)).collect(Collectors.toList()).size()==0)
                  {
                      AccessUtil.tokens.add(new MemoryData(params.get("usernameOrEmailAddress").toString(),token));
                  }*/

                    //获取用户信息

                    url = AccessUtil.url + "api/services/app/mESClientUserService/GetUserInfo";
                    params.put("UserName", params.get("usernameOrEmailAddress"));
                    params.put("access_token", token);
                    JSONObject userinfo = HttpClientUtil.post(url, params);
                    if (userinfo != null && userinfo.size() > 0) {
                        if (userinfo.get("result") != null) {
                            user = JSON.parseObject(userinfo.get("result").toString(), UserInfo.class);
                            mav.addObject("User", user);
                            //String username=user.getUsername();

                        }
                    }

                    if (user != null) {
                        //获取所有的工厂
                        url = AccessUtil.url + "api/services/app/mESClientFactoryService/GetFactorys";
                        Map<String, Object> map = new HashMap<>();
                        map.put("access_token", token);
                        factoryList = JSON.parseArray(HttpClientUtil.post(url, map).get("result").toString(), Factory.class);


                        UserInfo finalUser = user;
                        int size = factoryList.stream().filter(f -> f.getId() == finalUser.getFactID()).collect(Collectors.<Factory>toList()).size();

                        if (user.getFactID() == 0 || size == 0) {
                            mav.addObject("page", "factory.jsp");

                            request.getSession().setAttribute("factlist", factoryList);
                        } else {

                            url = AccessUtil.url + "api/services/app/mESClientWorkingProcedureService/GetWorkSteps";
                            workStepsList = JSON.parseArray(HttpClientUtil.post(url, map).get("result").toString(), WorkSteps.class);
                            workStepsList = workStepsList.stream().filter(w -> w.getDeptID() == finalUser.getFactID()).collect(Collectors.toList());
                            request.getSession().setAttribute("workStepsList", workStepsList);
                            mav.addObject("page", "worksteps.jsp");
                            mav.addObject("factID", user.getFactID());
                        }
                    } else {
                        user = new UserInfo();
                        user.setUsername(params.get("usernameOrEmailAddress").toString());
                        mav = new ModelAndView("/login");
                        mav.addObject("User", user);
                        mav.addObject("msg", "当前用户无权限");
                    }

                } else {
                    if (object.get("error") != null) {
                        JSONObject error = JSON.parseObject(object.get("error").toString());
                        mav = new ModelAndView("/login");
                        mav.addObject("msg", error.get("details").toString());
                    }

                }
            } else {
                mav = new ModelAndView("/login");
                mav.addObject("msg", "用户名或密码错误");
            }
        }

       /* mav.addObject("user", AccessUtil.userInfo);*/
        return mav;
    }

    @RequestMapping(value = "/Loginout")
    public String Loginout(HttpServletRequest request,SessionStatus status)
    {
        /*UserInfo user= (UserInfo) request.getSession().getAttribute("User");

        List<MemoryData> md= AccessUtil.tokens.stream().filter(u->u.getUsername().equals(user.getUsername())).collect(Collectors.toList());
        AccessUtil.tokens.removeAll(md);*/
        status.setComplete();
        request.getSession().invalidate();
        return "login";
    }

    /*public void initFactList()
    {

        factoryList=new ArrayList<>();
        factoryList.add(new Factory(1,"熔铸厂","001","熔铸厂主要进行铸锭的熔炼生产！"));
        factoryList.add(new Factory(2,"锻造厂","002","锻造厂主要进行坯料的铸造生产！"));
        factoryList.add(new Factory(3,"板材厂","003","锻造厂主要进行坯料的铸造生产！"));
        factoryList.add(new Factory(4,"管材厂","004","管材厂主要进行管材的生产！"));
        factoryList.add(new Factory(5,"管材公司","005","管材公司主要进行管材的生产！"));
        factoryList.add(new Factory(6,"线材厂","006","线材厂主要完成小规格棒材级丝材的生产！"));
        factoryList.add(new Factory(7,"原料厂","007","原料厂主要负责铸锭、坯料的机加生产及废料回收！"));
        factoryList.add(new Factory(8,"铸件材料公司","008","铸件材料公司主要生产钛及钛合金铸件产品！"));
        factoryList.add(new Factory(9,"钛带材料公司","009","钛带材料公司主要生产带材及部分板、箔材产品！"));

    }*/


}
