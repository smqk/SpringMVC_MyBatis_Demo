package org.smqk.module.news.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.smqk.framework.controller.BaseController;
import org.smqk.framework.pagehelper.Page;
import org.smqk.framework.pagehelper.PageInfo;
import org.smqk.module.news.domain.News;
import org.smqk.module.news.domain.NewsType;
import org.smqk.module.news.service.INewsService;
import org.smqk.module.news.service.INewsTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

@Controller
@RequestMapping("/news")
public class NewsController extends BaseController {
	@Resource
	private INewsService newsService;
	@Resource
	private INewsTypeService newsTypeService;
	
	
	Logger log=this.getLogger(NewsController.class);
	
	/**
	 * 【模板】新闻分类
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/getNewsType")
	public ModelAndView getNewsType(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv=new ModelAndView();
		
		List<NewsType> newsTypes=newsTypeService.findNewsType(ORDER_TYPE_DESC);
		mv.addObject("newsTypes", newsTypes);
		
		mv.setViewName("front/modules/sub_modules/newsType");
		return mv;
	}
	
	
	/**
	 * 【模板】新闻列表(按时间排序，最新的在最前面)
	 * @param request
	 * @param response
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/getNewsList")
	public ModelAndView getNewsList(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv=new ModelAndView();
		
		//绑定request中请求过来的分页参数
		Page page=new Page();
		this.dataBinder(page, WebUtils.getParametersStartingWith(request, ""));
		
		//新闻分类ID
		String newsTypeId=request.getParameter("newsTypeId");
//		log.debug("$$$@@:newsTypeId的值为："+newsTypeId );
		if(null==newsTypeId || "".equals(newsTypeId)){
			newsTypeId=INewsService.NEWS_TYPE_ID_ALL;
//			log.debug("$$$@@:newsTypeId isEmpty!" );
		}
		
		//最新新闻
		List<News> news=newsService.findLatestNews(newsTypeId,page.getPageNum(), page.getPageSize());
		PageInfo newsInfo=new PageInfo(news);
		mv.addObject("news",newsInfo);
		
		
		log.debug("run newsList:[newsTypeId:"+newsTypeId+"]");
		log.debug("run newsList ......");
		
		mv.setViewName("/front/modules/newsList");
		return mv;
	}
	
	/**
	 * 新闻列表(按时间排序，最新的在最前面)
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/newsList")
	public ModelAndView newsList(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("/front/templates/newsList");
		return mv;
	}
	
	/**
	 * 【模板】新闻详情页
	 * @return
	 */
	@RequestMapping("/getNewsDetail")
	public ModelAndView getNewsDetail(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv=new ModelAndView();
		
		String newsId=request.getParameter("newsId");
		News news=newsService.getNewsDetail(newsId);
		
		
		log.debug("run getNewsDetail ......");
		mv.addObject("news", news);
		mv.setViewName("front/modules/newsDetail");
		return mv;
	}
	
	/**
	 * 新闻详情页
	 * @return
	 */
	@RequestMapping("/newsDetail")
	public ModelAndView newsDetail(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv=new ModelAndView();
		
		log.debug("run newsDetail ......");
		mv.setViewName("front/templates/newsDetail");
		return mv;
	}
	
	
	
	
	
	

}
