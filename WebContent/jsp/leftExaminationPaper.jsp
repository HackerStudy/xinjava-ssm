<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>试卷导航栏</title>
<style type="text/css">
ul li {
	list-style-type: none;
	margin-top: 20px;
	background-color: #CCC;
}

* {
	font-size: 13pt;
	text-align: center;
}

div {
	margin: 3px;
	padding: 3px;
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
		<h2 align="left">试卷名称</h2>
		<!-- 试卷名点击进入试题类查找试题 -->
		<c:forEach var="list" items="${listExaminationPaperTopic}">
			<a
				href="${pageContext.request.contextPath}/findTestQuestionsControllerBytid.action?tid=${list.id}"
				target="body">${list.topic }</a>  <br/>
		</c:forEach>
	</div>


</body>
</html>