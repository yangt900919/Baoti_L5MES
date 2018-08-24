package cn.linkpal.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.httpclient.HttpClient;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpClientUtil {


    /**
     * 模拟浏览器post提交
     * @param url
     * @return
     */
    public static HttpPost getPostMethod(String url) {
        HttpPost pmethod = new HttpPost(url); // 设置响应头信息
        pmethod.addHeader("Connection", "keep-alive");
        pmethod.addHeader("Accept", "*/*");
        pmethod.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        pmethod.addHeader("Host", "mp.weixin.qq.com");
        pmethod.addHeader("X-Requested-With", "XMLHttpRequest");
        pmethod.addHeader("Cache-Control", "max-age=0");
        pmethod.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.0) ");
        return pmethod;
    }

    /**
     * 模拟浏览器GET提交
     * @param url
     * @return
     */
    public static HttpGet getGetMethod(String url) {
        HttpGet pmethod = new HttpGet(url);
        // 设置响应头信息
        pmethod.addHeader("Connection", "keep-alive");
        pmethod.addHeader("Cache-Control", "max-age=0");
        pmethod.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.0) ");
        pmethod.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/;q=0.8");
        return pmethod;
    }

    /**
     * 处理get请求.
     * @param url  请求路径
     * @return  json
     */
    public static JSONObject get(String url){
        //实例化httpclient
        CloseableHttpClient httpclient = HttpClients.createDefault();
        //实例化get方法
        HttpGet httpget = new HttpGet(url);
        //请求结果
        CloseableHttpResponse response = null;
        String content ="";
        try {
            //执行get方法
            response = httpclient.execute(httpget);
            if(response.getStatusLine().getStatusCode()==200){
                content = EntityUtils.toString(response.getEntity(),"utf-8");
                //System.out.println(content);
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JSON.parseObject(content);
    }

    /**
     * 处理post请求.
     * @param url  请求路径
     * @param params  参数
     * @return  json
     */
    public static JSONObject post(String url,Map<String, Object> params){
        //实例化httpClient
        CloseableHttpClient httpclient = HttpClients.createDefault();
        //实例化post方法
        HttpPost httpPost = new HttpPost(url);
        //处理参数

        //结果
        CloseableHttpResponse response = null;
        String content="";
        try {
            if(params.get("access_token")!=null)
            httpPost.addHeader("Authorization","Bearer" + " "+params.get("access_token").toString());



            httpPost.addHeader("Content-type","application/json; charset=utf-8");

            httpPost.setHeader("Accept", "application/json");
            //System.out.println(JSON.toJSONString(params));
            StringEntity s = new StringEntity(JSON.toJSONString(params), Charset.forName("UTF-8"));
           /* s.setContentEncoding("utf-8");
            s.setContentType("application/json;chartset=utf-8");//发送json数据需要设置contentType*/

            httpPost.setEntity(s);
            //执行post方法
            response = httpclient.execute(httpPost);

            //System.
     /*       System.out.println(response.getStatusLine().getStatusCode());
            System.out.println(EntityUtils.toString(response.getEntity(),"utf-8"));
            if(response.getStatusLine().getStatusCode()==200){*/
                content = EntityUtils.toString(response.getEntity(),"utf-8");
                //System.out.println(content);
            /*}*/
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JSON.parseObject(content);
    }

    public static JSONObject post(String url,String token)
    {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //创建一个post对象
        //HttpPost post = new HttpPost("http://192.168.2.130:83/api/services/app/mESClientCardService/ProcessFlowCardAndChildensList?CardNO=10086");
        HttpPost post = new HttpPost(url);
        post.addHeader("Authorization","Bearer" + " "+token);

        //执行post请求
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(post);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String content = null;
        try {
            content = EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(content);

        try {
            response.close();
            httpClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JSON.parseObject(content);
    }

}

