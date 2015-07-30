package org.smqk.module.news.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.smqk.framework.dao.BaseDao;
import org.smqk.module.news.dao.INewsDao;
import org.smqk.module.news.domain.News;

public class NewsDaoImpl extends BaseDao implements INewsDao {
	private static final String NS="org.smqk.module.news.dao.INewsDao.";
	
	@SuppressWarnings("unchecked")
	@Override
	public List<News> findNewsOrderByTime(String newsTypeId,String orderType,int pageNum,int pageSize) {
		Map<String,String> args=new HashMap<String,String>();
		args.put("newsTypeId", newsTypeId);
		args.put("orderType", orderType);
		return (List<News>) this.selectList(NS+"findNewsOrderByTime",args, pageNum, pageSize);
	}

	@Override
	public News getNews(String newsId) {
		return this.getSqlSession().selectOne(NS+"getNews", newsId);
	}




}
