package org.smqk.module.product.service;

import java.util.List;

import org.smqk.module.product.domain.ProductType;

public interface IProductTypeService {

	/**
	 * 获取产品分类信息
	 * @return List<产品分类信息>
	 */
	public List<ProductType> findProductType();
}
