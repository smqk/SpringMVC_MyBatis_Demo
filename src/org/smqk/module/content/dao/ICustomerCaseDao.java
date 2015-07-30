package org.smqk.module.content.dao;

import java.util.List;
import org.smqk.module.content.domain.CustomerCase;

public interface ICustomerCaseDao {
	
	/**
	 * 查询客户案例信息
	 * @param pageNum 分页数
	 * @param pageSize	每页数据条数
	 * @return List<CustomerCase>
	 */
	public List<CustomerCase> findCustomerCase(int pageNum,int pageSize);
}
