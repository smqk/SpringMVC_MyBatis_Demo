package org.smqk.module.news.dao.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.smqk.framework.dao.BaseDao;
import org.smqk.module.news.dao.INewsTypeDao;
import org.smqk.module.news.domain.NewsType;

public class NewsTypeDaoImpl extends BaseDao implements INewsTypeDao {
	private static final String NS="org.smqk.module.news.dao.INewsTypeDao.";
	
	@Override
	public List<NewsType> findNewsType(String orderType) {
		Map<String, String> args=new HashMap<String, String>();
		args.put("orderType", orderType);
		return this.getSqlSession().selectList(NS+"findNewsType", args);
	}



}
