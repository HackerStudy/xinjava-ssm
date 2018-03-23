<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>相关资源模块</title>
</head>
<body>
	<h1 align="center">Java专题相关资源</h1>
	<h2 align="left">1.相关软件资源</h2>
	<c:forEach var="software" items="${softwareList}">
		<a href="downWorkDisplay.action?fileName=${software.href}">${software.name}</a>
		<br />
	</c:forEach>
	<br />
	<br />
	<h2 align="left">2.优秀网站</h2>
	<c:forEach var="website" items="${websiteList}">
		<a href="${website.href}" target="_blank">${website.name}</a>
		<br />
	</c:forEach>
	<h2 align="left">3.电子书籍</h2>
	<c:forEach var="book" items="${bookList}">
		<a href="downWorkDisplay.action?fileName=${book.href}">${book.name}</a>
		<br />
	</c:forEach>
</body>
</html>