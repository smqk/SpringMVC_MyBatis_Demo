<%@ page contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<div id="news_list">
	<h2>新闻资讯</h2>
	<c:if test="${news.total==0}">
		<h3 style="margin: 20px 30px; color: red;font-size: 16px;">很遗憾，还没有找到新闻 。。。</h3>
	</c:if>
<ul class="news_warp">
		<c:forEach  var="news" items="${news.list}">
	<li class="news">
		<a href="/news/newsDetail.html?newsId=${news.newsId}">${news.title}</a><span class="date">${news.publishDate}</span>
	</li>
		</c:forEach>
</ul>
	
	<!-- 
		<div>
			<a href="#" target="_blank"><img src=""></a>
			<h2>
				<a href="#">对讲机官网微信公众平台正式开通！欢迎关注我们</a>
			</h2>
			微信以不可思议的成长速度在中国快速崛起，拥有着海量的用户群，官网也顺应潮流在微信公众平台上开通了官方微信，如果您不在电脑旁边，在旅途中，乘车中，用手机也可以阅读我们为您推送及时的对讲机新闻快讯，让您了解最新的精彩新闻，也可以通过微信平台与我们直接交流。
			官网微信公众平台二维码   如何添加“对讲机”为微信好友 二维码扫描： 在手机上…
		</div>
	 -->
	<!-- 分页  -->
	<div id="pagination">
		<c:if test="${news.pages>1}">
			<!-- 总页数大于1时才显示分页信息  -->
			<c:if test="${news.isFirstPage == false}">
				<li  onclick="turnPage(1)">首页</li>
			</c:if>
			<c:if test="${news.hasPreviousPage == true}">
				<li onclick="turnPage(${news.prePage})">上一页</li>
			</c:if>
			
			<c:forEach var="pageNum" items="${news.navigatepageNums}">
				<c:choose> 
		        	<c:when test="${news.pageNum == pageNum}">
		        		<span class="current">${pageNum}</span>
		        	</c:when>
		        	<c:otherwise>
		        		<li onclick="turnPage(${pageNum})">${pageNum}</li>
		        	</c:otherwise>
		        </c:choose>
			</c:forEach> 
			
			
			<c:if test="${news.hasNextPage == true}">
				<li onclick="turnPage(${news.nextPage})">下一页</li>
			</c:if>
			<c:if test="${news.isLastPage == false}">
				<li onclick="turnPage(${news.pages})">尾页</li>
			</c:if>
		</c:if>
	</div>
	
</div>