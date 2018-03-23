<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/addWorkDisplay.action" enctype="multipart/form-data" method="post">
		<table align="center">
			<tr>
				<td>标题</td>
				<td><input type="text" name="title" id="title" /></td>
			</tr>
			<tr>
				<td>作者名</td>
				<td><input type="text" name="userName" id="userName" /></td>
			</tr>
			<tr>
				<td>内容介绍</td>
				<td><textarea rows="5" cols="20" name="profile" id="profile"></textarea></td>
			</tr>
			<tr>
				<td>效果展示</td>
				<td><input type="file" name="pics" multiple /></td>
			</tr>
			<tr>
			   <td>附件</td>
			   <td><input type="file" name="file" /></td>
			</tr>
			<tr>
			 <td colspan="2" align="right"><input type="submit" value="上传"/></td>
			</tr>
		</table>
	</form>
	
	
</body>
</html>