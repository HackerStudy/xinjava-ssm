<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addRelatedResource.action?type=0&uid=${user.id}" enctype="multipart/form-data" method="post">
		<h2>上传相关软件:</h2>
		<table align="center">
			<tr>
				<td>软件名:</td>
				<td><input type="text" id="name" name="name" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="file" name="file" id="file" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="添加" /></td>
			</tr>

		</table>
	</form>
	<form action="addRelatedResource.action?type=1&uid=${user.id}" method="post">
		<h2>上传优秀网站:</h2>
		<table align="center">
			<tr>
				<td>网站名:</td>
				<td><input type="text" id="name" name="name" /></td>
			</tr>
			<tr>
			<td>网站地址:</td>
				<td ><input type="text" name="href" id="href" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="添加" /></td>
			</tr>

		</table>
	</form>
	<form action="addRelatedResource.action?type=2&uid=${user.id}" enctype="multipart/form-data" method="post">
		<h2>上传电子书籍:</h2>
		<table align="center">
			<tr>
				<td>书名:</td>
				<td><input type="text" id="name" name="name" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="file" name="file" id="file" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="添加" /></td>
			</tr>

		</table>
	</form>


</body>
</html>