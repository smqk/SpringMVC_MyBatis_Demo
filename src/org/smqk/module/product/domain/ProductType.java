package org.smqk.module.product.domain;

import java.io.Serializable;

/**
 * 产品分类（td_product_type）
 */
public class ProductType implements Serializable{
	
	private static final long serialVersionUID = -4060699424395983514L;
	
	private String typeId;	//分类ID
	private String tName;	//产品分类名
	private String descript;	//描述
	private String orderValue;	//排序值
	
	public ProductType() {
	}

	public ProductType(String typeId, String tName, String descript,
			String orderValue) {
		super();
		this.typeId = typeId;
		this.tName = tName;
		this.descript = descript;
		this.orderValue = orderValue;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(String orderValue) {
		this.orderValue = orderValue;
	}

	@Override
	public String toString() {
		return "ProductType [typeId=" + typeId + ", tName=" + tName
				+ ", descript=" + descript + ", orderValue=" + orderValue + "]";
	}
	
}
