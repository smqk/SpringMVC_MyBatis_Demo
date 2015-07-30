package org.smqk.module.content.domain;

import java.io.Serializable;

/**
 * 客户案例：td_customer_case
 */
public class CustomerCase implements Serializable{
	
	private static final long serialVersionUID = 411839430907986391L;
	
	private String id; 
	private String title; 		//标题
	private String icon;		//图标
	private String descript;	//描述
	private String detail;		//详情
	private String date;		//日期	
	private String time;		//时间
	private int orderValue;		//排序值
	
	public CustomerCase() {
	}

	public CustomerCase(String id, String title, String icon, String descript,
			String detail, String date, String time, int orderValue) {
		super();
		this.id = id;
		this.title = title;
		this.icon = icon;
		this.descript = descript;
		this.detail = detail;
		this.date = date;
		this.time = time;
		this.orderValue = orderValue;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(int orderValue) {
		this.orderValue = orderValue;
	}

	@Override
	public String toString() {
		return "CustomerCase [id=" + id + ", title=" + title + ", icon=" + icon
				+ ", descript=" + descript + ", detail=" + detail + ", date="
				+ date + ", time=" + time + ", orderValue=" + orderValue + "]";
	}
	
}
