package org.smqk.module.product.service.impl;

import java.util.List;

import org.smqk.module.product.dao.IProductTypeDao;
import org.smqk.module.product.domain.ProductType;
import org.smqk.module.product.service.IProductTypeService;

public class ProductTypeServiceImpl implements IProductTypeService {

	IProductTypeDao productTypeDao;
	
	public IProductTypeDao getProductTypeDao() {
		return productTypeDao;
	}

	public void setProductTypeDao(IProductTypeDao productTypeDao) {
		this.productTypeDao = productTypeDao;
	}



	@Override
	public List<ProductType> findProductType() {
		return productTypeDao.findProductType();
	}

}
