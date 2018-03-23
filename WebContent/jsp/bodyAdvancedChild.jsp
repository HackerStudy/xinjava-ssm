<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>进阶知识小标题在线文档</title>
</head>
<body>
	<div>
		${advancedchild.documents }
	</div>
	
	<div>
		<div id="fujian0" class="fujian">
			
			<a
		         href="${pageContext.request.contextPath }/filedownloadAdvancedChild.action?id=${advancedchild.id }">
		       	 附件：${advancedchild.attachment}
		    </a>
			
		</div>
	</div>
	
	<div>
		
		<c:if test="${user.position!=3 }">
		<form action="${pageContext.request.contextPath }/fileuploadAdvancedChild.action" enctype="multipart/form-data" method="post">
	        <input type="hidden" name="id" value="${advancedchild.id}" >
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
    </c:if>
	</div>
</body>
</html>