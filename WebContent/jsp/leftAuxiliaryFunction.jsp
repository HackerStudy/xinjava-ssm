<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>辅助功能模块</title>

<base target="body" />
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
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
<body id="body">
	<div>
		<h2 style="font-size: 25px">管理资源</h2>
		
		<c:if test="${user.position==1}">
		
			
		<a href="${pageContext.request.contextPath}/jsp/bodyAddteacher.jsp"
			target="body">新增教师</a> <br /> <a
			href="${pageContext.request.contextPath}/findExaminationPaperTopic.action?judgment=1"
			target="body">上传试题</a> <br />
		</c:if>		
		<c:if test="${user.position==3}">
		<a
			href="${pageContext.request.contextPath}/jsp/bodyAddworkdisplay.jsp"
			target="body">上传作品</a> <br />
		</c:if>
		<c:if test="${user.position==1}">
		<a
			href="${pageContext.request.contextPath}/jsp/bodyAddresources.jsp"
			target="body">上传资源</a> <br /><a
			href="${pageContext.request.contextPath}/findUser.action"
			target="body">删除用户</a> <br />
		</c:if>

	</div>
</body>
</html>