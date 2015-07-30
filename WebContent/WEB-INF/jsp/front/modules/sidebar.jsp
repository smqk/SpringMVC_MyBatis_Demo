<%@ page contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<!-- 左侧栏 -->
<div id="sidebar">
	<ul class="content">
		<!-- 
			内容的结构规则（预先写好了CSS样式，所以要确定好结构）：
			
			/××××××××××　模块开始　××××××××××/
			
			<li>
				子模块 (更多注释，参见下面)
			</li>
			
			/××××××××××　模块结束　××××××××××/
			
			.
			.
			
			
			<li>
				子模块 (更多注释，参见下面)
			</li>
		 -->
	</ul>
</div>
	
	
	
<!-- 
	
	子模块的结构规则：
	/××××××××××　模块开始　××××××××××/
	<div>
		<h2>ｘｘ标题</h2>
		<ul>
			<li class="xx类名"><a href="链接地址">xxx内容</a></li>
				.
				.
				. 
			<li class="xx类名"><a href="链接地址">xxx内容</a></li>  
	    </ul>
    </div>
	
	/××××××××××　模块结束　××××××××××/
	
-->