$(function(){
	$("#header_wrap").load("/getMenu.html");
	
	//加载新闻分类
	$("#newsTypeList_wrap").load("/news/getNewsType.html");
	
	
	$("#footer_wrap").load("/getFooter.html");
});


//加载新闻列表
$(function(){
	var baseUrl="/news/getNewsList.html";
	var urlUtil=new UrlUtil(window.location.href);
	urlUtil.baseUrl=baseUrl;
	
	$("#newsList_wrap").load(urlUtil.toUrlString());
	
});