package org.smqk.module.news.service.impl;

import java.util.List;

import org.smqk.framework.service.BaseService;
import org.smqk.module.news.dao.INewsDao;
import org.smqk.module.news.domain.News;
import org.smqk.module.news.service.INewsService;
import org.springframework.transaction.annotation.Transactional;

public class NewsServiceImpl extends BaseService implements INewsService {
	
	private static INewsDao newsDao;
	
	public static INewsDao getNewsDao() {
		return newsDao;
	}

	public static void setNewsDao(INewsDao newsDao) {
		NewsServiceImpl.newsDao = newsDao;
	}


	@Override
	@Transactional
	public List<News> findLatestNews(String newsTypeId,int pageNum, int pageSize) {
		return newsDao.findNewsOrderByTime(newsTypeId, INewsDao.ORDER_TYPE_DESC, pageNum, pageSize);
	}

	@Override
	public News getNewsDetail(String newsId) {
		return newsDao.getNews(newsId);
	}

}
