package org.smqk.module.news.dao;

import java.util.List;

import org.smqk.module.news.domain.News;

public interface INewsDao{
	String ORDER_TYPE_DESC="DESC";	//排序类型，降序
	String ORDER_TYPE_ASC="ASC";	//排序类型，升序
	
	
	/**
	 * 根据新闻分类查询新闻，然后根据新闻的发布时间来排序
	 * @param newsTypeId 新闻类型ID（如果新闻类型为空，则查询所有类型下的新闻）
	 * @param orderType 排序类型，升序还是降序
	 * @param pageNum 分页的页数
	 * @param pageSize	每页的条数
	 * @return	List<新闻>
	 */
	public List<News> findNewsOrderByTime(String newsTypeId,String orderType,int pageNum,int pageSize);

	/**
	 * 根据新闻ID查询新闻
	 * @param newsId	新闻ID
	 * @return	新闻
	 */
	public News getNews(String newsId);
	
	
}
