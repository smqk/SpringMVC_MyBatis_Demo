package org.smqk.module.product.dao.impl;

import java.util.List;

import org.smqk.framework.dao.BaseDao;
import org.smqk.module.product.dao.IProductTypeDao;
import org.smqk.module.product.domain.ProductType;

public class ProductTypeDaoImpl extends BaseDao implements IProductTypeDao {
	
	private static final String NS="org.smqk.module.product.dao.IProductTypeDao.";
	
	@Override
	public boolean insert(ProductType productType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ProductType> findProductType() {
		return this.getSqlSession().selectList(NS+"findProductType");
	}

	@Override
	public boolean update(ProductType productType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String productTypeId) {
		// TODO Auto-generated method stub
		return false;
	}

}
