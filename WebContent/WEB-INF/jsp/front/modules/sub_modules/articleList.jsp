<%@ page contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<%-- 所属 sidebar (不需要写CSS样式，按结构规则就会有对应的样式) --%>
<div id="newsType">
	<h2>关于我们</h2>
	<ul>
		<c:forEach items="${articles}" var="article">
			<li><a href="#">${article.title}</a></li>         
		</c:forEach>
    </ul>
</div>