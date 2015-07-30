package org.smqk.framework.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.DataBinder;

public class BaseController {
	
	protected final String ORDER_TYPE_DESC="DESC";	//排序类型，降序
	protected final String ORDER_TYPE_ASC="ASC";	//排序类型，升序
	
	
	//获取日志输出 Logger
	protected Logger getLogger(String name){
		return Logger.getLogger(name);
	}
	
	//获取日志输出 Logger
	protected Logger getLogger(@SuppressWarnings("rawtypes") Class clazz){
		return Logger.getLogger(clazz);
	}
	
	/**
	 * 字符串修剪
	 * @param str 字符串来源
	 * @param size 保留长度
	 * @return
	 */
	protected String trim(String str,int size){
		if(str.length()>size){
			return str.substring(0, size-1)+"...";
		}else{
			return str;
		}
	}
	
	
	//参数绑定
	@SuppressWarnings("rawtypes")
	protected void dataBinder(Object target,Map dataSrc){
		DataBinder dataBinder = new DataBinder(target);
		MutablePropertyValues pvs = new MutablePropertyValues(dataSrc);
		dataBinder.bind(pvs);
	}

}
