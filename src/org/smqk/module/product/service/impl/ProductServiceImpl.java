package org.smqk.module.product.service.impl;

import java.util.List;

import org.smqk.module.product.dao.IProductDao;
import org.smqk.module.product.domain.Product;
import org.smqk.module.product.service.IProductService;


public class ProductServiceImpl implements IProductService {

	IProductDao productDao;
	
	public IProductDao getProductDao() {
		return productDao;
	}
	
	public void setProductDao(IProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<Product> findProductByTypeId(String typeId,int pageNum,int pageSize) {
		return productDao.findProductByTypeId(typeId,pageNum,pageSize);
	}

}
