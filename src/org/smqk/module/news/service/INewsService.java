package org.smqk.module.news.service;

import java.util.List;

import org.smqk.module.news.domain.News;

public interface INewsService{
	
	String NEWS_TYPE_ID_ALL="";		// 该字段表示匹配所有的新闻分类id
	
	/**
	 * 根据新闻分类查询最新发布的新闻
	 * @param newsTypeId 新闻分类ID
	 * @param pageNum 分页数
	 * @param pageSize	每页条数
	 * @return List<最新发布的新闻>
	 */
	public List<News> findLatestNews(String newsTypeId,int pageNum,int pageSize);
	
	
	
	/**
	 * 根据新闻ID获取新闻详情
	 * @param newsId 新闻ID
	 * @return	新闻内容
	 */
	public News getNewsDetail(String newsId);
}
