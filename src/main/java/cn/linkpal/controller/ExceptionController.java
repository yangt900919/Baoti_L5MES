package cn.linkpal.controller;

import cn.linkpal.model.*;
import cn.linkpal.util.AccessUtil;
import cn.linkpal.util.DateUtil;
import cn.linkpal.util.HttpClientUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Controller
@SessionAttributes(value={"Access_token","User","WorkStep","exceptionList"},types = {String.class,UserInfo.class,WorkSteps.class,ExceptionInfo.class})
public class ExceptionController {

    Map<String,Object> map=new HashMap<>();

    @RequestMapping(value = "exception/ExceptionFilterList")
    @ResponseBody
    @POST
    public ModelAndView ExceptionFilterList(HttpServletRequest request, HttpServletResponse response, @RequestParam Map<String,Object> params, @ModelAttribute("Access_token")String token)
    {
        ModelAndView mav=new ModelAndView("exception/historyindex");

            params.put("startTime",DateUtil.getPreMonthDate(Integer.parseInt(params.get("type").toString())));
            params.put("endTime",new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
           //params.put("factId",user.)
        List<ExceptionInfo> exceptionList=new ArrayList<>();
        params.put("access_token",token);
      exceptionList=getExList("api/services/app/mESClientExceptionService/ExceptionFilterList",params);
        mav.addObject("exceptionList",exceptionList);
       /* mav.addObject("processId",params.get("processId"));*/
        request.getSession().setAttribute("exceptionParam",params);
        return mav;
    }

    @RequestMapping(value = "exception/ExceptionList")
    @ResponseBody
    @POST
    public ModelAndView ExceptionList(HttpServletRequest request, HttpServletResponse response, @RequestParam Map<String,Object> params, @ModelAttribute("Access_token")String token)
    {
        ModelAndView mav=new ModelAndView("exception/index");
        List<ExceptionInfo> exceptionList=new ArrayList<>();
        params.put("access_token",token);
      /*  params.put("")*/
        exceptionList=getExList("api/services/app/mESClientExceptionService/ExceptionList",params);
        mav.addObject("exceptionList",exceptionList);
        request.getSession().setAttribute("exceptionParam",params);
        return mav;
    }

    @RequestMapping(value = "exception/detail")
    public ModelAndView Detail(int ID,@ModelAttribute("exceptionList")List<ExceptionInfo> exceptionList)
    {
        ModelAndView mav=new ModelAndView("exception/detail");

        mav.addObject("exinfo",exceptionList.stream().filter(u->u.getId()==ID).collect(Collectors.toList()));
        return mav;
    }

    @RequestMapping(value = "exception/close")
    @ResponseBody
    @POST
    public ModelAndView Close(HttpServletRequest request, HttpServletResponse response,@RequestParam Map<String,Object> params,@ModelAttribute("Access_token")String token)
    {
        params.put("access_token",token);
        String url= AccessUtil.url+"api/services/app/mESClientExceptionService/CloseException?id="+Integer.parseInt(params.get("id").toString());
        JSONObject object= HttpClientUtil.post(url, token);
        return ExceptionList(request,response, (Map<String, Object>) request.getSession().getAttribute("exceptionParam"),token);
    }

    @RequestMapping(value = "exception/create")
    public ModelAndView Create(int stepID, @ModelAttribute("WorkStep")WorkSteps WorkStep, @ModelAttribute("User")UserInfo user,
                               @ModelAttribute("Access_token")String token)
    {
        ModelAndView mav=new ModelAndView("exception/edit");
        ExceptionInfo ei=new ExceptionInfo();

        ei.setFactId(user.getFactID());
        ei.setFactName(user.getFactName());
        ei.setProcessId(WorkStep.getId());
        ei.setProcessName(WorkStep.getOperName());
        ei.setCardId(0);
        ei.setCardNo("");
        ei.setDeptId(user.getDeptID());
        ei.setDeptName(user.getDeptName());
        ei.setTeamId(user.getTeamID());
        ei.setTeamName(user.getTeamName());
        ei.setReportUser(user.getUsername());
        mav.addObject("model", ei);
        List<ExceptionClassificat> exceptionClassificatList=getExClass(token);
        List<ExceptionFineClass> exceptionFineClassList=new ArrayList<>();
        if(exceptionClassificatList.size()>0)
        {
            exceptionFineClassList=getExType(exceptionClassificatList.get(0).getClassificatNo(),token);
        }
        mav.addObject("exClass",exceptionClassificatList);
        mav.addObject("exType",exceptionFineClassList);
        return mav;
    }

    @RequestMapping(value = "exception/save")
    @ResponseBody
    @POST
    public ModelAndView Save(HttpServletRequest request, HttpServletResponse response, @RequestParam Map<String,Object> params,
                             @ModelAttribute("Access_token")String token)
    {
        ModelAndView mav=new ModelAndView("exception/index");
        params.put("access_token",token);


        String url= AccessUtil.url+"api/services/app/mESClientExceptionService/ExceptionReport";

        JSONObject object= HttpClientUtil.post(url, params);
        return ExceptionList(request,response,params,token);
    }


    @RequestMapping(value = "exception/ExType")
    public void ExType(HttpServletRequest request,HttpServletResponse response,@ModelAttribute("Access_token")String token ) throws Exception {
        response.setContentType("text/xml");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        List<ExceptionFineClass> exceptionFineClassList=getExType(request.getParameter("ClassificatNo"),token);

     out.println(JSON.toJSONString(exceptionFineClassList));
    }

    private List<ExceptionClassificat> getExClass(String token)
    {
        List<ExceptionClassificat> exceptionClassificatList=new ArrayList<>();
        map.put("access_token",token);
        String url= AccessUtil.url+"api/services/app/mESClientExceptionService/ExClass";
        JSONObject object= HttpClientUtil.post(url, map);
        if(object!=null&&object.size()>0) {
            if (object.get("result") != null) {
                exceptionClassificatList= JSON.parseArray(object.get("result").toString(),ExceptionClassificat.class);
                //exceptionClassificatList=exceptionFineClassList.stream().filter(ef->ef.getClassificatNo().equals(classNO)).collect(Collectors.toList());
            }
        }
        return exceptionClassificatList;
    }

    private  List<ExceptionFineClass> getExType(String  classNO,String token)
    {
        List<ExceptionFineClass> exceptionFineClassList=new ArrayList<>();
        map.put("access_token",token);
        String url= AccessUtil.url+"api/services/app/mESClientExceptionService/ExType";
        JSONObject object= HttpClientUtil.post(url, map);
        if(object!=null&&object.size()>0) {
            if (object.get("result") != null) {
                exceptionFineClassList= JSON.parseArray(object.get("result").toString(),ExceptionFineClass.class);
                exceptionFineClassList=exceptionFineClassList.stream().filter(ef->ef.getClassificatNo().equals(classNO)).collect(Collectors.toList());
            }
        }
        return exceptionFineClassList;
    }

    private List<ExceptionInfo> getExList(String url, Map<String,Object> map)
    {

        List<ExceptionInfo> exceptionList=new ArrayList<>();
        /*map.put("access_token",token);*/
        String urls= AccessUtil.url+url;
        JSONObject object= HttpClientUtil.post(urls, map);
        if(object!=null&&object.size()>0) {
            if (object.get("result") != null) {
                exceptionList= JSON.parseArray(object.get("result").toString(),ExceptionInfo.class);
            }
        }
        return exceptionList;
    }



}
