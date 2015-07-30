<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"  type="text/css"  href="/resources/common/css/default.css"/>
<link rel="stylesheet"  type="text/css"  href="/resources/template/layout/articleDetail.css"/>
<link rel="stylesheet"  type="text/css"  href="/resources/template/themes/theme/css/footer.css"/>
<link rel="stylesheet"  type="text/css"  href="/resources/template/themes/theme/css/header.css"/>
<link rel="stylesheet"  type="text/css"  href="/resources/template/themes/theme/css/sidebar.css"/>
<script type="text/javascript" src="/resources/common/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="/resources/common/js/utils.js"></script>
<script type="text/javascript" src="/resources/template/js/common.js"></script>
<title>什码科技有限公司</title>
</head>
<body>
	<div id="header_wrap"></div>
	
	<div id="middle_wrap">
		<!-- 内容  -->
		<div id="content">
			<div id="banner">
				<img src="/resources/template/themes/theme/images/news_banner.jpg">
			</div>
			
			<div id="article_detail">
			</div>
		</div>
		
		<!-- 左侧栏 -->
		<div id="sidebar">
			<ul class="content">
				<li>
					<!-- 文章列表  -->
					<div id="articleList_warp">
						
					</div>
				</li>
				<li>        
					<img src="/resources/uploadfile/images/theme/lefttel.png" style="margin: 5px 0; padding: 0;" />
					<img src="/resources/uploadfile/images/theme/lefthelp.png" style="margin: 5px 0; padding: 0;" /> 
					<img src="/resources/uploadfile/images/theme/leftservice.png" style="margin: 5px 0; padding: 0;" />
				</li>
			</ul>
		</div>
		<div class="clear"></div>
	</div><!-- middle_wrap结束 -->
	<div id="footer_wrap"></div>
</body>
</html>