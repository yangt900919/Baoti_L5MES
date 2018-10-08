package cn.linkpal.controller;

import cn.linkpal.model.UserInfo;
import cn.linkpal.model.WorkSteps;
import cn.linkpal.util.HttpClientUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@SessionAttributes(value={"Access_token","User","workStepsList","WorkStep"},types = {String.class,UserInfo.class,WorkSteps.class,WorkSteps.class})
public class MainController {


    @Value("${url}")
    private String access_url;
    
    Map<String,Object> map=new HashMap<>();
    /**
     * 获取所有工序
     * @param ID
     * @param facname
     * @param token
     * @return
     */
    @RequestMapping(value = "/getWorkSteps")
    public ModelAndView getWorkSteps(int ID,String facname,@ModelAttribute("Access_token")String token,@ModelAttribute("User")UserInfo user)
    {
        ModelAndView mav=new ModelAndView("worksteps");
        List<WorkSteps> workStepsList=new ArrayList<>();
        map.put("access_token",token);
        String url= access_url+"api/services/app/mESClientWorkingProcedureService/GetWorkSteps";
        JSONObject object= HttpClientUtil.post(url, map);
        if(object!=null&&object.size()>0) {
            if (object.get("result") != null) {
                workStepsList = JSON.parseArray(object.get("result").toString(), WorkSteps.class);
                workStepsList = workStepsList.stream().filter(w -> w.getDeptID() == ID).collect(Collectors.toList());
            }
        }
        mav.addObject("workStepsList",workStepsList);
        mav.addObject("facname",facname);
        user.setFactID(ID);
        user.setFactName(facname);
      mav.addObject("User",user);
        return mav;
    }


   @RequestMapping(value = "/Main")
    public ModelAndView Main(int ID, @ModelAttribute("workStepsList")List<WorkSteps> wlist)
   {
       ModelAndView mav=new ModelAndView("submenu");
       mav.addObject("WorkStep",wlist.stream().filter(u->u.getId()==ID).collect(Collectors.toList()).get(0));
       return mav;
   }

}
