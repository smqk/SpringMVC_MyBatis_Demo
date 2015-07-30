<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html>
<html>
<head>
<title>什码科技有限公司</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"  type="text/css"  href="/resources/common/css/default.css"/>
<link rel="stylesheet"  type="text/css"  href="/resources/template/layout/footer.css"/>
<link rel="stylesheet"  type="text/css"  href="/resources/template/layout/header.css"/>
<link rel="stylesheet"  type="text/css"  href="/resources/template/layout/index.css"/>
<script type="text/javascript" src="/resources/template/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="/resources/template/js/slider.js"></script>
<script type="text/javascript">
$(document).ready(
		function($){
			$('#slider').cycle({
				fx:     'fade',
				speed:  'slow',
				timeout: 5000,
				pager:  '#slider',
				pagerAnchorBuilder: function(idx, slide) {
					// return sel string for existing anchor
					return '#slide li:eq(' + (idx) + ') a';
				}
			});
		}
);


</script>
</head>
<body>
	
	<!-- 页头 -->
	<div class="head">
		<c:import url="modules/header.jsp"/>
	</div>	
	
	<%-- 滚动大图 --%>
	<div id="slide">
		<div id="slider">
			<div class="slider-item">
			  <a href=""><img src="<%=basePath %>/resources/uploadfile/images/theme/01.jpg" alt=" " /></a>
			</div>
			<div class="slider-item">
			  <a href=""><img src="<%=basePath %>/resources/uploadfile/images/theme/02.jpg" alt=" " /></a>
			</div>
			<div class="slider-item">
			  <a href=""><img src="<%=basePath %>/resources/uploadfile/images/theme/03.jpg" alt=" " /></a>
			</div>
			<div class="slider-item">
			  <a href=""><img src="<%=basePath %>/resources/uploadfile/images/theme/04.jpg" alt=" " /></a>
			</div>
		</div>
		<div id="rpic">
		  <a href="#"><img src="<%=basePath %>/resources/uploadfile/images/theme/1.gif" alt=" " /></a>
		  <a href="#"><img src="<%=basePath %>/resources/uploadfile/images/theme/2.gif" alt=" " /></a>
		  <a href="#"><img src="<%=basePath %>/resources/uploadfile/images/theme/3.gif" alt=" " /></a>
		</div>
	</div>	
	

	<!-- 左侧栏 -->
	<div class="sidebar_left">
		<ul class="content">
		
	        <!-- 产品分类  -->
			<li class="product_type">
				<h2>产品分类</h2>
				<ul>
					<c:forEach items="${productTypes}" var="productType">
						<li class="product-type-item"><a href="#"><c:out value="${productType.tName}" /></a></li>         
					</c:forEach>
		        </ul>
			</li>
	        
	        <img src="resources/uploadfile/images/theme/lefttel.png" style="margin: 5px 0; padding: 0;" />
			<img src="resources/uploadfile/images/theme/lefthelp.png" style="margin: 5px 0; padding: 0;" /> 
			<img src="resources/uploadfile/images/theme/leftservice.png" style="margin: 5px 0; padding: 0;" />
	     
	     	<li>
	          <h2>热门标签</h2>
	          <ul>
	            <li class="sidebar_news"> <a href="/jingxiaoshangshouquan-xiangyang.html" title="SC70三维激光扫描仪" target="_blank" style="font-size:12px;">SC70三维激光扫描仪</a></li>
	            <li class="sidebar_news"> <a href="/motorola-sl.html" title="SC500三维激光扫描仪" target="_blank" style="font-size:12px;">SC500三维激光扫描仪</a></li>
	            <li class="sidebar_news"> <a href="/hubeiqichun.html" title="VS1000三维激光扫描仪" target="_blank" style="font-size:12px;">VS1000三维激光扫描仪</a></li>
	            <li class="sidebar_news"> <a href="/kirisun-pt7800.html" title="3DSCAN三维建模与土方计算" target="_blank" style="font-size:12px;">3DSCAN三维建模与土方计算</a></li>
	            <li class="sidebar_news"> <a href="/kirisun-pt6800.html" title="3D Cloud Processor" target="_blank" style="font-size:12px;">3D Cloud Processor</a></li>
	            <li class="sidebar_news"> <a href="/kirisun-pt668.html" title="MakerBot Replicator 2™ 3D 打印机" target="_blank" style="font-size:12px;">MakerBot Replicator 2™ 3D 打印机</a></li>
	            <li class="sidebar_news"> <a href="/motorola-smp268.html" title="ProJet 3510 3D打印机" target="_blank" style="font-size:12px;">ProJet 3510 3D打印机</a></li>
	            <li class="sidebar_news"> <a href="/kirisun-pt558s.html" title="SD300pro-3D打印机|快速成型机" target="_blank" style="font-size:12px;">SD300pro-3D打印机|快速成型机</a></li>
	          </ul>
	        </li>
	        
			<li>
			   <h2>推荐内容</h2>
			   <ul>
			     <li class="recommend_product"> <a href="#" target="_blank" style="font-size:12px;">SC70三维激光扫描仪</a></li>
			     <li class="recommend_product"> <a href="#" title="SC500三维激光扫描仪" target="_blank" style="font-size:12px;">SC500三维激光扫描仪</a></li>
			     <li class="recommend_product"> <a href="#" title="VS1000三维激光扫描仪" target="_blank" style="font-size:12px;">VS1000三维激光扫描仪</a></li>
			     <li class="recommend_product"> <a href="#" title="3DSCAN三维建模与土方计算" target="_blank" style="font-size:12px;">3DSCAN三维建模与土方计算</a></li>
			     <li class="recommend_product"> <a href="#" title="3D Cloud Processor" target="_blank" style="font-size:12px;">3D Cloud Processor</a></li>
			     <li class="recommend_product"> <a href="#" title="MakerBot Replicator 2™ 3D 打印机" target="_blank" style="font-size:12px;">MakerBot Replicator</a></li>
			     <li class="recommend_product"> <a href="#" title="ProJet 3510 3D打印机" target="_blank" style="font-size:12px;">ProJet 3510 3D打印机</a></li>
			     <li class="recommend_product"> <a href="#" title="SD300pro-3D打印机|快速成型机" target="_blank" style="font-size:12px;">SD300pro-3D打印机|快速成型机</a></li>
			   </ul>
			</li>	        
		</ul>
	</div>
	
	<div class="customer_case">
		<h2>客户案例 <span><a href="#">更多</a></span></h2>
		<c:forEach  var="customerCase" items="${customerCases}">
			<div class="case">
				<h3><a href="#"><c:out value="${customerCase.title}" /></a></h3>
				<img alt="" src="<%=basePath %>${customerCase.icon}">
				<p><c:out value="${customerCase.descript}" />
				<a href="#"><font color=#cc0000>全文</font></a></p>
			</div>
		</c:forEach>
	</div>
	
	<div class="news-content">
		<h2>最新新闻 <span><a href="#">更多</a></span></h2>
			<c:if test="${!empty news}">
		<ul class="news">
				<c:forEach var="news" items="${news}">
			<li ><a href="#">${news.title}</a><span style="float:right;">${news.publishDate}</span></li>
				</c:forEach>
		</ul>
			</c:if>
	</div>
	
	
	<div class="mod">
      <h2>产品展示<span><a href="">更多</a></span></h2>
      <c:forEach var="product" items="${products}">
	      <div class="sub_mod"> <a href="#"> <img src="${product.icon}" /></a>
	       	 <h3><a href="#">${product.pName}</a></h3>
	      </div>
      </c:forEach>
    </div>


     <div class="mod">
      <h2>三维激光扫描仪应用行业<span><a href="">更多</a></span></h2>
      <div class="sub_mod"> <a href="#"> <img src="resources/uploadfile/images/product/2014135559-0.jpg" /></a>
        <h3><a href="#">逆向工程</a></h3>
      </div>
      <div class="sub_mod"> <a href="#"> <img src="resources/uploadfile/images/product/2014135559-0.jpg" /></a>
        <h3><a href="#">工业制造</a></h3>
      </div>
      <div class="sub_mod"> <a href="#"> <img src="resources/uploadfile/images/product/2014135559-0.jpg" /></a>
        <h3><a href="#">家具木雕</a></h3>
      </div>
      <div class="sub_mod"> <a href="#"> <img src="resources/uploadfile/images/product/2014135559-0.jpg" /></a>
        <h3><a href="#">工艺玩具</a></h3>
      </div>
      <div class="sub_mod"> <a href="#"> <img src="resources/uploadfile/images/product/14410W053-0.jpg" /></a>
        <h3><a href="#">精密雕刻</a></h3>
      </div>
      <div class="sub_mod"> <a href="#"> <img src="resources/uploadfile/images/product/14410W053-0.jpg" /></a>
        <h3><a href="#">人体相关</a></h3>
      </div>
      <div class="sub_mod"> <a href="#"> <img src="resources/uploadfile/images/product/14410W053-0.jpg" /></a>
        <h3><a href="#">制鞋行业</a></h3>
      </div>
      <div class="sub_mod"> <a href="#"> <img src="resources/uploadfile/images/product/14410W053-0.jpg" /></a>
        <h3><a href="#">园林行业</a></h3>
      </div>
    </div>
	
	<!-- 友情链接 -->
	<div id="friend_link">
		<h2>友情链接<span style="width:90px;">排名不分先后</span></h2>
		<div style="padding:0 10px;">
			<span><a href="www.chinahightech.com" title="" target=_blank rel="external nofollow">光谷高薪产业</a></span>
			<span><a href="www.wehdz.gov.cn" title="" target=_blank rel="external nofollow">光谷管委会</a></span>
		</div>
	</div>	
	
	<!-- 页脚 -->
	<c:import url="modules/footer.jsp" />
</body>
</html>