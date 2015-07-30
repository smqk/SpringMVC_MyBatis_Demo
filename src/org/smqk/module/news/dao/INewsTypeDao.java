package org.smqk.module.news.dao;

import java.util.List;

import org.smqk.module.news.domain.NewsType;

public interface INewsTypeDao{
	
	/**
	 * 查询所有新闻分类信息
	 * @param orderType 排序类型，升序还是降序
	 * @return	List<新闻分类>
	 */
	public List<NewsType> findNewsType(String orderType);
}
