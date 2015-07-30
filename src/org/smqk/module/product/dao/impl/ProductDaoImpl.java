package org.smqk.module.product.dao.impl;

import java.util.List;

import org.smqk.framework.dao.BaseDao;
import org.smqk.module.product.dao.IProductDao;
import org.smqk.module.product.domain.Product;

public class ProductDaoImpl extends BaseDao implements IProductDao {
	
	private static final String NS="org.smqk.module.product.dao.IProductDao.";
	
	@Override
	public boolean insert(Product product) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean delete(String productId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product getProduct(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findProductByTypeId(String typeId,int pageNum,int pageSize) {
		return (List<Product>) this.selectList(NS+"findProductByTypeId",typeId,pageNum,pageSize);
	}


}
