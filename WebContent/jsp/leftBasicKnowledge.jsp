<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>实例教程导航栏</title>
<base target="body" />
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.8.2.js"></script>
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
style type ="text /css">* {
	font-size: 13pt;
	text-align: center;
}

div {
	margin: 3px;
	padding: 3px;
	width: 150px;
	height: 30px;
/* 	border: 1px solid blue; */
	margin: 0 auto;
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
	<c:forEach var="basicKowleage" items="${listbasicKowleage}">
		<div align="center">
			<a  
				href="${pageContext.request.contextPath}/forwardbodyjsp.action?id=${basicKowleage.id}"
				target="body">${basicKowleage.headings}</a>
		</div>
	</c:forEach>


</body>
</html>
