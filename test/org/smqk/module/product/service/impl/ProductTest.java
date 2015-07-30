package org.smqk.module.product.service.impl;

import java.util.List;

import org.junit.Test;
import org.smqk.framework.test.BaseTest;
import org.smqk.module.product.domain.Product;
import org.smqk.module.product.service.IProductService;

public class ProductTest extends BaseTest{
	static IProductService productService;
	
	public static void  init(){
		productService=(IProductService) getAc().getBean("productService");
	}
	
	@Test
	public void findProductByTypeIdTest(){
		init();
		String typeId="05819d71787e4675a1bf103dea5f0a9f";
		List<Product> products=productService.findProductByTypeId(typeId,2,2);
		for (Product product : products) {
			System.out.println(product.toString());
		}
	}
	
}
