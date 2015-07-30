package org.smqk.module.content.service.impl;

import java.util.List;

import org.smqk.module.content.dao.ICustomerCaseDao;
import org.smqk.module.content.domain.CustomerCase;
import org.smqk.module.content.service.ICustomerCaseService;
import org.springframework.transaction.annotation.Transactional;

public class CustomerCaseServiceImpl implements ICustomerCaseService {
	
	private ICustomerCaseDao customerCaseDao;
		
	public ICustomerCaseDao getCustomerCaseDao() {
		return customerCaseDao;
	}
	public void setCustomerCaseDao(ICustomerCaseDao customerCaseDao) {
		this.customerCaseDao = customerCaseDao;
	}


	@Override
	@Transactional
	public List<CustomerCase> findCustomerCase(int pageNum, int pageSize) {
		List<CustomerCase> customreCases=customerCaseDao.findCustomerCase(pageNum, pageSize);
		return customreCases;
	}

}
