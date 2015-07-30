package org.smqk.module.product.domain;

import java.io.Serializable;

/**
 * 产品（td_product）
 */
public class Product implements Serializable{
	
	private static final long serialVersionUID = -819512550650162955L;
	
	private String productId;	//产品ID
	private String typeId;		//所属分类ID
	private String pName;		//产品名称
	private String icon;		//产品图标
	private String description;	//产品简介
	private String detail;		//产品详情
	private String status;		//产品状态
	private String orderValue;	//排序值
	private String publishDate; //产品发布日期
	private String publishTime; //产品发布时间
	
	public Product() {
	}

	public Product(String productId, String typeId, String pName, String icon, String description, String detail, String status, String orderValue, String publishDate, String publishTime) {
		super();
		this.productId = productId;
		this.typeId = typeId;
		this.pName = pName;
		this.icon = icon;
		this.description = description;
		this.detail = detail;
		this.status = status;
		this.orderValue = orderValue;
		this.publishDate = publishDate;
		this.publishTime = publishTime;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(String orderValue) {
		this.orderValue = orderValue;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", typeId=" + typeId + ", pName=" + pName + ", icon=" + icon + ", description=" + description + ", detail=" + detail + ", status=" + status + ", orderValue=" + orderValue + ", publishDate=" + publishDate + ", publishTime=" + publishTime + "]";
	}

}
