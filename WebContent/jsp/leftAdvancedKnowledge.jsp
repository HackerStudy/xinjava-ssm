<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>进阶知识导航栏</title>
<style type="text/css">
div {
	width: 200px;
}

a {
	text-decoration: none;
	color: black;
}

#body {
	background-color: aliceblue;
}
</style>

</head>
<body>
	<div>
		<!-- 专题 -->
		<c:forEach var="advancedKnowledge" items="${advancedKnowledgeList}">
			<h2 style="font-size: 25px" align="left">${advancedKnowledge.projectname}</h2>

			<!-- 小题 -->
			<c:forEach var="advancedChild"
				items="${advancedKnowledge.advancedChildList}">
				<div align="center">
					<a
						href="${pageContext.request.contextPath}/findAdvancedChildAll.action?id=${advancedChild.id}"
						target="body">${advancedChild.teachingresources_name }</a>
				</div>
				<br />
			</c:forEach>

		</c:forEach>

	</div>


</body>
</html>