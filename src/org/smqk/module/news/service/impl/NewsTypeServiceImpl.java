package org.smqk.module.news.service.impl;


import java.util.List;

import org.smqk.framework.service.BaseService;
import org.smqk.module.news.dao.INewsTypeDao;
import org.smqk.module.news.domain.NewsType;
import org.smqk.module.news.service.INewsTypeService;
import org.springframework.transaction.annotation.Transactional;

public class NewsTypeServiceImpl extends BaseService implements INewsTypeService {
	
	private static INewsTypeDao newsTypeDao;

	public static INewsTypeDao getNewsTypeDao() {
		return newsTypeDao;
	}

	public static void setNewsTypeDao(INewsTypeDao newsTypeDao) {
		NewsTypeServiceImpl.newsTypeDao = newsTypeDao;
	}
	
	/**
	 * 查询所有新闻分类信息
	 * @param orderType 排序类型，升序还是降序
	 * @return	List<新闻分类>
	 */
	@Transactional
	public List<NewsType> findNewsType(String orderType) {
		return newsTypeDao.findNewsType(orderType);
	}
	

}
