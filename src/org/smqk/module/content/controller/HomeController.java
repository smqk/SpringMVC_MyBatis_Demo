package org.smqk.module.content.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.smqk.framework.controller.BaseController;
import org.smqk.module.content.domain.CustomerCase;
import org.smqk.module.content.domain.Menu;
import org.smqk.module.content.service.ICustomerCaseService;
import org.smqk.module.content.service.IMenuService;
import org.smqk.module.news.domain.News;
import org.smqk.module.news.service.INewsService;
import org.smqk.module.product.domain.Product;
import org.smqk.module.product.domain.ProductType;
import org.smqk.module.product.service.IProductService;
import org.smqk.module.product.service.IProductTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class HomeController extends BaseController{
	
	@Resource
	private IMenuService menuService;
	@Resource
	private IProductTypeService productTypeService;
	@Resource
	private IProductService productService;
	@Resource
	private ICustomerCaseService customerCaseService;
	@Resource
	private INewsService newsService;
	
	Logger log=this.getLogger(HomeController.class);
	
	@RequestMapping(value="/index")
	public ModelAndView home(HttpServletRequest request,HttpServletResponse response){
		// http://localhost:8080/smqk/home.json
		ModelAndView mv=new ModelAndView();
		
		//导航菜单
		List<Menu> menus=menuService.findMenu();
		mv.addObject("menus", menus);
		
		//产品分类
		List<ProductType> productTypes=productTypeService.findProductType();
		mv.addObject("productTypes", productTypes);
		
		//客户案例
		List<CustomerCase> customerCases=customerCaseService.findCustomerCase(1, 4);
		for (CustomerCase customerCase : customerCases) {
			String title=customerCase.getTitle();
			customerCase.setTitle(this.trim(title,17));
			
			String descript=customerCase.getDescript();
			customerCase.setDescript(this.trim(descript, 35));
		}
		mv.addObject("customerCases", customerCases);
		
		//最新新闻
		List<News> news=newsService.findLatestNews(INewsService.NEWS_TYPE_ID_ALL,1, 10);
		mv.addObject("news",news);
		
		
		//产品展示(展示第一个产品分类下的产品)
		List<Product> products=null;
		if(productTypes!=null && productTypes.size()>0){
			products=productService.findProductByTypeId(productTypes.get(0).getTypeId(), 1, 8);
		}
		mv.addObject("products", products);
		
		log.debug("run home ....");
		
		mv.setViewName("front/index");
		return mv;
	}
	
	/**
	 * 页头
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/getMenu")
	public ModelAndView getMenu(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv=new ModelAndView();
		List<Menu> menus=menuService.findMenu();
		
		log.debug("run getMenu ....");
		
		mv.addObject("menus", menus);
		mv.setViewName("front/modules/header");
		return mv;
	}

	
	/**
	 * 页脚
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/getFooter")
	public ModelAndView getFooter(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv=new ModelAndView();
		
		log.debug("run getFooter ....");
		
		mv.setViewName("front/modules/footer");
		return mv;
	}
	
}
