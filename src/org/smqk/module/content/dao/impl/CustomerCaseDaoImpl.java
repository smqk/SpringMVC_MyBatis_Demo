package org.smqk.module.content.dao.impl;

import java.util.List;

import org.smqk.framework.dao.BaseDao;
import org.smqk.module.content.dao.ICustomerCaseDao;
import org.smqk.module.content.domain.CustomerCase;

public class CustomerCaseDaoImpl extends BaseDao implements ICustomerCaseDao{
	private static final String NS="org.smqk.module.content.dao.ICustomerCaseDao.";
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerCase> findCustomerCase(int pageNum, int pageSize) {
		return (List<CustomerCase>) this.selectList(NS+"findCustomerCase", pageNum, pageSize);
	}

}
