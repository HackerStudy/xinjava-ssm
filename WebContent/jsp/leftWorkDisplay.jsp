<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>实例教程左侧导航栏</title>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
/* * {
	font-size: 13pt;
	text-align: center;
}

div {
	margin: 3px;
	padding: 3px;
}

a {
	text-decoration: none;
	color:black;
}

#body {
	background-color: aliceblue;
} */
<
style type ="text/css">* {
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
<script type="text/javascript">
	
</script>
</head>

<body id="body">
	<!-- 从数据库查找转发过来的数据显示 -->

	<c:forEach var="list" items="${list}">
		<div align="center">
			<a
				href="${pageContext.request.contextPath}/showWorkDisplay.action?id=${list.id}"
				target="body">${list.title}</a>
		</div>
		<br />
	</c:forEach>

</body>
</html>
