$(function(){
	$("#header_wrap").load("/getMenu.html");
	
	
	$("#newsTypeList_wrap").load("/news/getNewsType.html");
	
	
	$("#footer_wrap").load("/getFooter.html");
});

//加载新闻列表
$(function(){
	var baseUrl="/news/getNewsDetail.html";
	var urlUtil=new UrlUtil(window.location.href);
	urlUtil.baseUrl=baseUrl;
	
	$("#newsDetail_warp").load(urlUtil.toUrlString());
	
});