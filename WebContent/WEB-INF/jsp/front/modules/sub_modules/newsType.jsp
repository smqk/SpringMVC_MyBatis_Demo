<%@ page contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<%-- 所属 sidebar (不需要写CSS样式，按结构规则就会有对应的样式) --%>
<div id="newsType">
	<h2>新闻分类</h2>
	<ul>
		<c:forEach items="${newsTypes}" var="newsType">
			<li class="news_type_item"><a href="/news/newsList.html?newsTypeId=${newsType.typeId}"><c:out value="${newsType.name}" /></a></li>         
		</c:forEach>
    </ul>
</div>