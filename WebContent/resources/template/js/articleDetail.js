$(function(){
	$("#header_wrap").load("/getMenu.html");
	
	//加载新闻分类
	$("#articleList_warp").load("/news/getNewsType.html");
	
	
	$("#footer_wrap").load("/getFooter.html");
});
