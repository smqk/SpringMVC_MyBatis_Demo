package org.smqk.module.product.dao;

import java.util.List;

import org.smqk.module.product.domain.Product;

public interface IProductDao {
	
	/**
	 * 添加一个产品信息
	 * @param Product 产品信息
	 * @return 操作成功（true）与否(false)
	 */
	public boolean insert(Product product);
	
	/**
	 * 删除指定产品ID的产品
	 * @param ProductId 产品ID
	 * @return 操作成功（true）与否(false)
	 */
	public boolean delete(String poductId);

	/**
	 * 修改一个产品信息
	 * @param Product 产品信息
	 * @return 操作成功（true）与否(false)
	 */
	public boolean update(Product product);
	
	/**
	 * 根据产品ID获取产品
	 * @return 产品
	 */
	public Product getProduct(String productId);
	
	/**
	 * 根据产品的分类ID获取产品分类下的产品
	 * @param typeId 产品的分类ID
	 * @param pageNum 分页数
	 * @param pageSize	每页显示条数
	 * @return List<产品信息>
	 */
	public List<Product> findProductByTypeId(String typeId,int pageNum,int pageSize);
}
