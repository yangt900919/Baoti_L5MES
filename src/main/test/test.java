
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class test {

    @Test
    public void t()
    {
        /*try {

            DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");  //yyyy-MM-dd'T'HH:mm:ss.SSSZ
            Date  date = df.parse("2018-08-07T11:06:44+08:00");
            SimpleDateFormat df1 = new SimpleDateFormat ("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK);
            Date date1 =  df1.parse(date.toString());
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/

       /* String s=JSON.toJSONString(new Date());
        System.out.println(s);
        Date mydate = new Date();
        mydate.setTime(Long.parseLong(s));
        SimpleDateFormat sdf =   new SimpleDateFormat(" yyyy-MM-dd ");
        System.out.println(sdf.format(mydate));*/

       /* CloseableHttpClient httpclient = HttpClients.createDefault();
        //实例化post方法
        HttpPost httpPost = new HttpPost("http://web.xngt.cn:99/WebService.asmx/setbill");
        //处理参数

        //结果
        CloseableHttpResponse response = null;
        String content="";
        try {
            *//*if(params.get("access_token")!=null)
                httpPost.addHeader("Authorization","Bearer" + " "+params.get("access_token").toString());
*//*


            httpPost.addHeader("Content-type","application/json; charset=utf-8");

            httpPost.setHeader("Accept", "application/json");
            String param="{\"ei_request\":{\"coop_id\":\"2016008\",\"de_name\":\"袁蓉\",\"h_id\":\"gzdl-st180800127\",\"de_carno\":\"陕a665663\",\"cust_no\":\"001003001040\",\"ware_name\":\"贵州东岭嘉联库\",\"ctime\":\"2018-08-30 04:27:35\",\"de_donum\":\"9865475225654566255\",\"version\":\"3.0\",\"busi_id\":\"20180830042735\",\"cust_name\":\"贵州东岭物资有限公司\",\"chksum\":\"332de3d98803748b18ece4a99e325aad945011ffd3cfa800c24e6bdf550dfbb4\",\"delivery_name\":\"北京鸿睿智业时代投资有限公司\",\"de_phone\":\"123456789\",\"s_name\":[\"高线φ6.5\",\"螺纹钢ⅲφ32\"],\"s_spec\":[\"φ6.5\",\"φ32\"],\"s_material\":[\"hrb400 \",\"hrb400 \"],\"s_vender\":[\"洛钢\",\"龙钢\"],\"s_num\":[\"1\",\"2\"],\"s_weight\":[\"23\",\"36\"]}}";
            //System.out.println(JSON.toJSONString(params));
            StringEntity s = new StringEntity(param, Charset.forName("UTF-8"));
           *//* s.setContentEncoding("utf-8");
            s.setContentType("application/json;chartset=utf-8");//发送json数据需要设置contentType*//*

            httpPost.setEntity(s);
            //执行post方法
            response = httpclient.execute(httpPost);

            //System.
     *//*       System.out.println(response.getStatusLine().getStatusCode());
            System.out.println(EntityUtils.toString(response.getEntity(),"utf-8"));
            if(response.getStatusLine().getStatusCode()==200){*//*
            content = EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(content);
            *//*}*//*
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
       //System.out.println(JSON.parseObject(content));

  /*      CloseableHttpClient  httpClient=HttpClients.createDefault();
        String url ="http://web.xngt.cn:99/WebService.asmx/setbill";;

        HttpPost httpPost = new HttpPost(url);
        System.out.println(httpPost);

        httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
        String param="ReceiveData={\"ei_request\":{\"coop_id\":\"2016008\",\"de_name\":\"袁蓉\",\"h_id\":\"gzdl-st180800127\",\"de_carno\":\"陕a665663\",\"cust_no\":\"001003001040\",\"ware_name\":\"贵州东岭嘉联库\",\"ctime\":\"2018-08-30 04:27:35\",\"de_donum\":\"9865475225654566255\",\"version\":\"3.0\",\"busi_id\":\"20180830042735\",\"cust_name\":\"贵州东岭物资有限公司\",\"chksum\":\"332de3d98803748b18ece4a99e325aad945011ffd3cfa800c24e6bdf550dfbb4\",\"delivery_name\":\"北京鸿睿智业时代投资有限公司\",\"de_phone\":\"123456789\",\"s_name\":[\"高线φ6.5\",\"螺纹钢ⅲφ32\"],\"s_spec\":[\"φ6.5\",\"φ32\"],\"s_material\":[\"hrb400 \",\"hrb400 \"],\"s_vender\":[\"洛钢\",\"龙钢\"],\"s_num\":[\"1\",\"2\"],\"s_weight\":[\"23\",\"36\"]}}";

        StringEntity se = null;
        try {
            se = new StringEntity(param);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(se);
        se.setContentType("application/json");
        se.setContentEncoding(new BasicHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8"));
        httpPost.setEntity(se);
        System.out.println(httpPost);
        HttpResponse response = null;
        try {
            response = httpClient.execute(httpPost);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(response);
        Object  re= null;
        try {
            re = EntityUtils.toString(response.getEntity(),"utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(re);
        //JSONObject jsonResult = JSONObject.fromObject(re);
        System.out.println(JSON.toJSONString(re));*/

  //System.out.println(Setting.getString("url"));
    }




}
