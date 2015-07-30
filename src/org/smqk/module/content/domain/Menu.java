package org.smqk.module.content.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Menu 
 * @author 程序改变世界
 * @time 2014-11-23下午10:12:23
 */
public class Menu implements Serializable{
	private static final long serialVersionUID = 5521821012135607653L;
	
	private String id;
	private String name;
	private String parentId;
	private String url;
	private String descript;
	private int orderValue;
	
	//非数据库字段
	private List<Menu> subMenu;
	
	public Menu(){}

	public Menu(String id, String name, String parentId, String url,
			String descript, int orderValue) {
		super();
		this.id = id;
		this.name = name;
		this.parentId = parentId;
		this.url = url;
		this.descript = descript;
		this.orderValue = orderValue;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	
	public List<Menu> getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(List<Menu> subMenu) {
		this.subMenu = subMenu;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", parentId=" + parentId
				+ ", url=" + url + ", descript=" + descript + ", orderValue="
				+ orderValue + ", subMenu=" + subMenu + "]";
	}
	
	
}
