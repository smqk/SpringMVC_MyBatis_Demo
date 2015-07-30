package org.smqk.module.news.domain;

import java.io.Serializable;
/**
 * 新闻（td_news）
 */
public class News  implements Serializable{

	private static final long serialVersionUID = -5952821597336382661L;
	
	private String newsId;
	private String title;	//新闻标题
	private String typeId;	//新闻分类id	
	private String icon="/resources/uploadfile/images/news/default.jpg";	//新闻图标
	private String content; //新闻内容
	private String publishDate;		//发布日期
	private String publishTime;		//发布时间
	private int orderValue;		//排序值
	
	
	public News() {
	}


	public News(String newsId, String title, String typeId, String icon, String content, String publishDate, String publishTime, int orderValue) {
		super();
		this.newsId = newsId;
		this.title = title;
		this.typeId = typeId;
		this.icon = icon;
		this.content = content;
		this.publishDate = publishDate;
		this.publishTime = publishTime;
		this.orderValue = orderValue;
	}


	public String getNewsId() {
		return newsId;
	}


	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getTypeId() {
		return typeId;
	}


	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}


	public String getIcon() {
		return icon;
	}


	public void setIcon(String icon) {
		this.icon = icon;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}


	public String getPublishTime() {
		return publishTime;
	}


	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}


	public int getOrderValue() {
		return orderValue;
	}


	public void setOrderValue(int orderValue) {
		this.orderValue = orderValue;
	}


	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", title=" + title + ", typeId=" + typeId + ", icon=" + icon + ", content=" + content + ", publishDate=" + publishDate + ", publishTime=" + publishTime + ", orderValue=" + orderValue + "]";
	}


}
