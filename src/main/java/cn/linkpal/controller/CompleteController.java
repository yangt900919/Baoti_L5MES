package cn.linkpal.controller;

import cn.linkpal.model.*;
import cn.linkpal.util.DateUtil;
import cn.linkpal.util.HttpClientUtil;
import cn.linkpal.util.ToolUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.ws.rs.POST;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Controller
@SessionAttributes(value={"Access_token","User","WorkStep","workcard","completelist"},types = {String.class,UserInfo.class,WorkSteps.class,CardAndChilden.class,CompleteInfo.class})
public class CompleteController {

    @Value("${url}")
    private String access_url;

    @RequestMapping(value="complete/index")
    public ModelAndView index(int stepID)
    {
        ModelAndView mav=new ModelAndView("complete/card");
        mav.addObject("stepID",stepID);
        mav.addObject("workcard",new CardAndChilden());

        return mav;
    }

    @RequestMapping(value = "complete/ProcessFlowCardAndChildensList")
    @ResponseBody
    @POST
    public ModelAndView getProcessFlowCardAndChildensList( @RequestParam Map<String,Object> params, @ModelAttribute("Access_token")String token)
    {
        ModelAndView mav=new ModelAndView(params.get("url").toString());
        mav.addObject("cardNo",params);
       /* params.put("access_token",token);*/
        String url= access_url+"api/services/app/mESClientCardService/ProcessFlowCardAndChildensList?CardNO="+params.get("CardNO").toString();
        JSONObject object= HttpClientUtil.post(url, token);
        CardAndChilden cardAndChilden=new CardAndChilden();
        if(object!=null&&object.size()>0)
        {
            if (object.get("result") != null)
            {

                //JSONObject reslut=JSON.parseObject(object.get("result").toString());
                //System.out.println(reslut.get("processFlowCard"));
                cardAndChilden=JSON.parseObject(object.get("result").toString(),CardAndChilden.class);
                //cardAndChildens=JSON.parseArray(object.get("result").toString(),CardAndChilden.class);
            }
        }
        mav.addObject("workcard",cardAndChilden);
        return mav;
    }


    @RequestMapping(value = "complete/create")
    public ModelAndView Create(int stepID,@ModelAttribute("WorkStep")WorkSteps WorkStep,@ModelAttribute("User")UserInfo user,@ModelAttribute("workcard")CardAndChilden workcard,@ModelAttribute("Access_token")String token)
    {
        ModelAndView mav=new ModelAndView("complete/edit");
        CompleteInfo ci=new CompleteInfo();

        ci.setProcessId(WorkStep.getId());
        ci.setProcessName(WorkStep.getOperName());
        ci.setCardId(workcard.getProcessFlowCard().getId());
        ci.setCardNo(workcard.getProcessFlowCard().getCardNo());
        //ci.setCardLineNo(workcard.getProcessFlowCard().getWordNo());
        ci.setCompletionUser(user.getUsername());
        ci.setCompletionUserTeam(user.getTeamName());
        ci.setFactId(user.getFactID());
        ci.setFactName(user.getFactName());
        ci.setDeptId(user.getDeptID());
        ci.setDeptName(user.getDeptName());
        ci.setTeamId(user.getTeamID());
        ci.setTeamName(user.getTeamName());
        mav.addObject("model",ci);
        mav.addObject("equip",workcard.getListCardProcessInformationt().stream().filter(u->u.getOperID()==WorkStep.getId()).collect(Collectors.toList()));
        mav.addObject("positionlist", ToolUtil.getPositionByFactory(access_url,user.getFactID(),token));

        return mav;
    }

    @RequestMapping(value = "complete/save")
    @ResponseBody
    @POST
    public ModelAndView Save(HttpServletRequest request, HttpServletResponse response, @RequestParam Map<String,Object> params,
                             @ModelAttribute("Access_token")String token
    ,@ModelAttribute("User")UserInfo user)
    {
        //ModelAndView mav=new ModelAndView("complete/card");
        params.put("access_token",token);
        String url= access_url+"api/services/app/mESClientCompletionReportService/WorkReport";

        JSONObject object= HttpClientUtil.post(url, params);
        params.put("type",1);
        ModelAndView mav=WorkReportList(request,response, params,token);
        if(object.get("success").toString().equals("true"))
        {
            mav.addObject("savemsg","汇报成功!");
        }
        else
        {
            if(object.get("error")!=null && JSON.parseObject(object.get("error").toString()).get("message")!=null)
            {
mav.addObject("savemsg",JSON.parseObject(object.get("error").toString()).get("message"));
            }

        }
        return mav;
    }

    @RequestMapping(value = "complete/detail")
    public ModelAndView Detail(int ID,@ModelAttribute("completelist")List<CompleteInfo> completelist)
    {
        ModelAndView mav=new ModelAndView("complete/detail");

        mav.addObject("coinfo",completelist.stream().filter(u->u.getId()==ID).collect(Collectors.toList()));
        return mav;
    }



    @RequestMapping(value = "complete/WorkReportList")
    @ResponseBody
    @POST
    public ModelAndView WorkReportList(HttpServletRequest request, HttpServletResponse response, @RequestParam Map<String,Object> params, @ModelAttribute("Access_token")String token)
    {

        params.put("startTime",DateUtil.getPreMonthDate(Integer.parseInt(params.get("type").toString()))+" 00:00:00");
        params.put("endTime",new SimpleDateFormat("yyyy-MM-dd").format(new Date())+" 23:59:59");

        ModelAndView mav=new ModelAndView("complete/index");
        List<CompleteInfo> completeInfoList=new ArrayList<>();
        params.put("access_token",token);
        completeInfoList=getCpList("api/services/app/mESClientCompletionReportService/WorkReportList",params);
        mav.addObject("completelist",completeInfoList);
        mav.addObject("savemsg","");
        request.getSession().setAttribute("cpparams",params);
        return mav;
    }

    @RequestMapping(value = "complete/WorkReportListByTeam")
    @ResponseBody
    @POST
    public ModelAndView WorkReportListByTeam(HttpServletRequest request, HttpServletResponse response, @RequestParam Map<String,Object> params, @ModelAttribute("Access_token")String token)
    {

            params.put("startTime",DateUtil.getPreMonthDate(Integer.parseInt(params.get("type").toString()))+" 00:00:00");
            params.put("endTime",new SimpleDateFormat("yyyy-MM-dd").format(new Date())+" 23:59:59");

        ModelAndView mav=new ModelAndView("complete/index");
        List<CompleteInfo> completeInfoList=new ArrayList<>();
        params.put("access_token",token);

        completeInfoList=getCpList("api/services/app/mESClientCompletionReportService/WorkReportListByTeam",params);
        mav.addObject("completelist",completeInfoList);
        request.getSession().setAttribute("cpparams",params);
        mav.addObject("savemsg","");
        return mav;
    }

    @RequestMapping(value = "complete/WorkReportListByProcess")
    @ResponseBody
    @POST
    public ModelAndView WorkReportListByProcess(HttpServletRequest request, HttpServletResponse response, @RequestParam Map<String,Object> params, @ModelAttribute("Access_token")String token)
    {

        params.put("startTime",DateUtil.getPreMonthDate(Integer.parseInt(params.get("type").toString()))+" 00:00:00");
        params.put("endTime",new SimpleDateFormat("yyyy-MM-dd").format(new Date())+" 23:59:59");

//        int steptID=Integer.parseInt(params.get("steptID").toString());
       // params.put("processId",wlist.stream().filter(w->w.getId()==steptID).collect(Collectors.toList()).get(0).getDeptID());
        ModelAndView mav=new ModelAndView("complete/index");
        List<CompleteInfo> completeInfoList=new ArrayList<>();
        params.put("access_token",token);
        completeInfoList=getCpList("api/services/app/mESClientCompletionReportService/WorkReportListByProcess",params);

        mav.addObject("completelist",completeInfoList);
        request.getSession().setAttribute("cpparams",params);
        mav.addObject("savemsg","");
        return mav;
    }

    private List<CompleteInfo> getCpList(String url, Map<String,Object> map)
    {

        List<CompleteInfo> completeInfoList=new ArrayList<>();
        /*map.put("access_token",token);*/
        String urls= access_url+url;
        JSONObject object= HttpClientUtil.post(urls, map);
        if(object!=null&&object.size()>0) {
            if (object.get("result") != null) {
                completeInfoList= JSON.parseArray(object.get("result").toString(),CompleteInfo.class);
            }
        }
        return completeInfoList;
    }


}
