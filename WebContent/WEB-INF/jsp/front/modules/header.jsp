<%@ page contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%-- 网页头 --%>
<div class="header-container">
	<div class="header_left">
		<a class="logo" href="#"></a>
		<a class="banner" href="#"></a>
	</div>
	<div class="header_right">
		<ul>
			<li class="r1"><a href="#">收藏本站</a></li>
			<li class="r2"><a href="#">TAG标签</a></li>
			<li class="r3"><a href="#">网站地图</a></li>
			<li class="r4"><a href="#">RSS订阅</a></li>
		</ul>
	</div>
</div>

<!-- 导航菜单  -->
<nav id="nav_container">
	<ul class="menu_bar">
		<c:forEach items="${menus}" var="menu">
			<li class="menu-item"><a href="${menu.url}"><span><c:out value="${menu.name}" /></span></a>
				<c:if test="${!empty menu.subMenu}">
					<ul class="sub-menu">
					<c:forEach items="${menu.subMenu}" var="subMenu">
						<li><a href="#"><span><c:out value="${subMenu.name}" /></span></a></li>
					</c:forEach>
					</ul>
				</c:if>
			</li>         
		</c:forEach>
	</ul>
</nav>