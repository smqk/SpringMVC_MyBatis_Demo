package org.smqk.module.product.dao;

import java.util.List;

import org.smqk.module.product.domain.ProductType;

public interface IProductTypeDao {
	
	/**
	 * 添加一个产品分类信息
	 * @param productType 产品分类信息
	 * @return 操作成功（true）与否(false)
	 */
	public boolean insert(ProductType productType);
	
	/**
	 * 删除指定产品分类ID的产品分类信息
	 * @param productTypeId 产品分类ID
	 * @return 操作成功（true）与否(false)
	 */
	public boolean delete(String productTypeId);
	
	/**
	 * 修改一个产品分类信息
	 * @param productType 产品分类信息
	 * @return 操作成功（true）与否(false)
	 */
	public boolean update(ProductType productType);
	
	/**
	 * 获取产品分类信息
	 * @return List<产品分类信息>
	 */
	public List<ProductType> findProductType();
}
