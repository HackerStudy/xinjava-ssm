<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<style type="text/css">
		#tupian{
			width: 200px;
			height: 200px;
			margin: 0 auto;
			margin-top:50px;
		}
		#fujian0{
			width: 200px;
			height: 50px;
			float: right;
			margin: 0 auto;
		}
		
		
	</style>
<body>
		<div id="tou" class="tou">
			<h1>${basickowleage.headings }</h1>
		</div>
		
		<div id="textjianjie" class="textclass">
			
			${basickowleage.text }
			
		</div>
		
		
		<div id="fujian0" class="fujian">
			
			<a
		         href="${pageContext.request.contextPath }/filedownload.action?id=${basickowleage.id}">
		       	 附件：${basickowleage.attachment}
		    </a>
			
		</div>
		
		<c:if test="${user.position!=3 }">
		<form action="${pageContext.request.contextPath }/fileupload.action?id=${basickowleage.id}" enctype="multipart/form-data" method="post">
	        <table>
	        	<a href="${pageContext.request.contextPath }/modificationBasicKnowledgeId.action?id=${basickowleage.id}" >删除此项</a>
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
</body>
</html>