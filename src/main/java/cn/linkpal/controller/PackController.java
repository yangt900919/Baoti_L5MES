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
import javax.ws.rs.POST;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@SessionAttributes(value={"Access_token","User","WorkStep","workcard","packlist"},types = {String.class,UserInfo.class,WorkSteps.class,CardAndChilden.class,PackInfo.class})
public class PackController {

    @Value("${url}")
    private String access_url;
    
    @RequestMapping(value="pack/index")
    public ModelAndView index(int stepID)
    {
        ModelAndView mav=new ModelAndView("pack/card");
        mav.addObject("stepID",stepID);
        mav.addObject("workcard",new CardAndChilden());

        return mav;
    }

    @RequestMapping(value = "pack/create")
    public ModelAndView Create(int stepID, @ModelAttribute("WorkStep")WorkSteps WorkStep, @ModelAttribute("User")UserInfo user, @ModelAttribute("workcard")CardAndChilden workcard ,@ModelAttribute("Access_token")String token)
    {
        ModelAndView mav=new ModelAndView("pack/edit");
        PackInfo pi=new PackInfo();

        //pi.setProcessId(WorkStep.getId());
        //pi.setProcessName(WorkStep.getOperName());
        pi.setCardId(workcard.getProcessFlowCard().getId());
        pi.setCardNo(workcard.getProcessFlowCard().getCardNo());
        pi.setWorkID(WorkStep.getId());
        pi.setWorkNo(workcard.getProcessFlowCard().getWordNo());
        //pi.setCardLineNo(workcard.getProcessFlowCard().getWordNo());
        pi.setPackUser(user.getUsername());
        pi.setPackUserTeam(user.getTeamName());
        pi.setFactId(user.getFactID());
        pi.setFactName(user.getFactName());
        pi.setDeptId(user.getDeptID());
        pi.setDeptName(user.getDeptName());
        pi.setTeamId(user.getTeamID());
        pi.setTeamName(user.getTeamName());
        pi.setContractNo(workcard.getProcessFlowCard().getContractNo());
        pi.setProductName(workcard.getProcessFlowCard().getItemName());
        pi.setSPEC(workcard.getProcessFlowCard().getItemModel());
        pi.setBrandName(workcard.getProcessFlowCard().getBrandName());
        pi.setTechStdNo(workcard.getProcessFlowCard().getTechStdNo());
        pi.setItemModelMore(workcard.getProcessFlowCard().getItemModelMore());
        mav.addObject("model",pi);
        mav.addObject("positionlist", ToolUtil.getPositionByFactory(access_url,user.getFactID(),token));
        //mav.addObject("equip",workcard.getListCardProcessInformationt().stream().filter(u->u.getOperID()==WorkStep.getId()).collect(Collectors.toList()));
        return mav;
    }

    @RequestMapping(value = "pack/save")
    @ResponseBody
    @POST
    public ModelAndView Save(HttpServletRequest request, HttpServletResponse response, @RequestParam Map<String,Object> params,
                             @ModelAttribute("Access_token")String token
            ,@ModelAttribute("User")UserInfo user)
    {

        params.put("access_token",token);
        String url= access_url+"api/services/app/mESClientPackReportService/PackReport";

        JSONObject object= HttpClientUtil.post(url, params);
        params.put("type",1);
        params.put("factID",user.getFactID());
        params.put("PackNo","");
        ModelAndView mav=PackReportList(request,response, params,token);
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

    @RequestMapping(value = "pack/detail")
    public ModelAndView Detail(String packNo,@ModelAttribute("packlist")List<PackInfo> packlist)
    {
        ModelAndView mav=new ModelAndView("pack/detail");

        mav.addObject("painfo",packlist.stream().filter(u->u.getPackNo().equals(packNo)).collect(Collectors.toList()));
        return mav;
    }



    @RequestMapping(value = "pack/PackReportList")
    @ResponseBody
    @POST
    public ModelAndView PackReportList(HttpServletRequest request, HttpServletResponse response, @RequestParam Map<String,Object> params, @ModelAttribute("Access_token")String token)
    {

        params.put("startTime",DateUtil.getPreMonthDate(Integer.parseInt(params.get("type").toString()))+" 00:00:00");
        params.put("endTime",new SimpleDateFormat("yyyy-MM-dd").format(new Date())+" 23:59:59");

        ModelAndView mav=new ModelAndView("pack/index");
        List<PackInfo> packInfoList=new ArrayList<>();
        params.put("access_token",token);
        String url=access_url+"api/services/app/mESClientPackReportService/PackReportListByFactAndPackNo";
        JSONObject object= HttpClientUtil.post(url, params);
        if(object!=null&&object.size()>0) {
            if (object.get("result") != null) {
                packInfoList= JSON.parseArray(object.get("result").toString(),PackInfo.class);
            }
        }
        mav.addObject("packlist",packInfoList);
        mav.addObject("savemsg","");
        request.getSession().setAttribute("paparams",params);
        return mav;
    }


}
