package org.smqk.module.content.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smqk.framework.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/test")
public class TestController extends BaseController {
	
	static Logger log=LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("/**")
	public ModelAndView var1(HttpServletRequest request) {
		ModelAndView mv=new ModelAndView();
		System.out.println("URI : "+request.getRequestURI());
		
		return mv;
	}
	
	
	@RequestMapping(value= "/{var1}")
	public ModelAndView var1(@PathVariable String var1) {
		ModelAndView mv=new ModelAndView();
		System.out.println("@@@@:  "+var1);
		mv.addObject(var1, var1);
		
		return mv;
	}
	
	
	@RequestMapping(value= "/{var1}/{var2}")
	public ModelAndView var2(@PathVariable String var1,@PathVariable String var2) {
		ModelAndView mv=new ModelAndView();
		System.out.println("@@@@:  "+var1);
		System.out.println("@@@@:  "+var2);
		mv.addObject(var1, var1);
		mv.addObject(var2, var2);
		
		return mv;
	}
	
	
	@RequestMapping(value= "/getURI")
	public ModelAndView var2(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		String URI=request.getRequestURI();
		mv.addObject("URI", URI);
		return mv;
	}
	
	@RequestMapping(value= "/publish")
	public void onPublish(HttpServletRequest request,HttpServletResponse response) {
		
		
	}
	
	
	/**
     * 向指定URL发送GET方法的请求
     * 
     * @param url 发送请求的URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            
            log.debug("【get】urlNameString--->"+urlNameString);
            
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
            	log.debug("【get】"+key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
        	log.debug("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
		
	}
    
    
}
