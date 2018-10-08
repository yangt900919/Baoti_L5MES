package cn.linkpal.util;

import cn.linkpal.model.Position;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ToolUtil {

    public static List<Position> getPositionByFactory(String access_url,int factid, String token)
    {
        List<Position> list=new ArrayList<>();
        //params.put("access_token",token);
        String url=access_url+"api/services/app/mESClientPositionService/GetPositionsByFactory?factId="+factid;
        JSONObject object= HttpClientUtil.post(url, token);
        if(object!=null&&object.size()>0)
        {
            if(object.get("result")!=null)
            {
                list= JSON.parseArray(object.get("result").toString(),Position.class);
            }
        }
        return list;
    }
}
