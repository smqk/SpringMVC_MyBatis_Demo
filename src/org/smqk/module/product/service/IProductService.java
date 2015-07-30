package org.smqk.module.product.service;

import java.util.List;

import org.smqk.module.product.domain.Product;

public interface IProductService {

	/**
	 * 根据产品的分类ID获取产品分类下的产品
	 * @param typeId 产品的分类ID
	 * @param pageNum 分页数
	 * @param pageSize	每页显示条数
	 * @return List<产品信息>
	 */
	public List<Product> findProductByTypeId(String typeId,int pageNum,int pageSize);
}
