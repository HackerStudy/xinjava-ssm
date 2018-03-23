<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>测试页面</title>
</head>
<body>
		<h3>文件下载</h3> 
		<!-- 通过一个List输出 -->
     <a
        href="${pageContext.request.contextPath }/download.action?filename=${requestScope.user.headimage.originalFilename}">
        用户头像：${requestScope.user.headimage.originalFilename}
      </a>
</body>
</html>