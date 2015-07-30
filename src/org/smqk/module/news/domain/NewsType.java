package org.smqk.module.news.domain;

import java.io.Serializable;

/**
 * 新闻类型（td_news_type）
 */
public class NewsType  implements Serializable{

	private static final long serialVersionUID = -4475463620918363361L;

	//分类ID
	private String typeId="";
	//分类名称
	private String name="";
	//分类描述
	private String descript="";
	//排序值
	private int orderValue=0;
	
	public NewsType() {
	}

	public NewsType(String typeId, String name, String descript, int orderValue) {
		super();
		this.typeId = typeId;
		this.name = name;
		this.descript = descript;
		this.orderValue = orderValue;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}
	

	public int getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(int orderValue) {
		this.orderValue = orderValue;
	}

	@Override
	public String toString() {
		return "NewsType [typeId=" + typeId + ", name=" + name + ", descript=" + descript + ", orderValue=" + orderValue + "]";
	}
	
}