<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table width="100%" border=1>
			<tr>
				<td>标题</td>
				<td><input type="text" name="items.price" value="${basicKowleage.headings }" /></td>
			</tr>
	
			<tr>
				<td>文本</td>
				<td><input type="text" name="items.name" value="${basicKowleage.text }" /></td>
			</tr>
		</table>
		
		<form action="${pageContext.request.contextPath }/fileupload.action" enctype="multipart/form-data" method="post">
        <input type="hidden" name="id" value="${basicKowleage.id }" >
        <table>
            <tr>
                <td>请选择文件：</td>
                <td><input type="file" name="headimage"></td>
            </tr>
            <tr>
                <td>开始上传</td>
                <td><input type="submit" value="上传"></td>
            </tr>
        </table>
    </form>
</body>
</html>