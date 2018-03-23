<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
table
  {
  border-collapse:collapse;
  width: 60%;
  }

table,th, td
  {
  border: 1px solid black;
  height: 50px;
  }
</style>
</head>
<body>
           <h2 align="center">学生优秀作品列表</h2>
	<table border="1" cellpadding="0" cellspacing="5" width="200px" align="center">
		<tr align="center">
			<td>标题</td>
			<td>作者</td>
		</tr>
		<c:forEach var="workDisplay" items="${list}">
			<tr align="center">
				<td><a href="showWorkDisplay.action?id=${workDisplay.id}">${workDisplay.title}</a></td>
				<td>${workDisplay.userName}</td>
				<td><a href="showWorkDisplay.action?id=${workDisplay.id}">查看</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>