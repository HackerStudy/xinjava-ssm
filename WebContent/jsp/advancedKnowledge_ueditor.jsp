<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>进阶知识上传</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<script type="text/javascript" charset="utf-8"
	src="${pageContext.request.contextPath}/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8"
	src="${pageContext.request.contextPath}/ueditor/ueditor.all.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js" /></script>
<!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
<!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
<script type="text/javascript" charset="utf-8"
	src="${pageContext.request.contextPath}/ueditor/lang/zh-cn/zh-cn.js"></script>


</head>
<body>
	<div>
		请选择专题：<select name="thematic" id="thematic">
					<c:forEach var="thematic" items="${thematicList}" >
						<option value="${thematic.id }" >${thematic.projectname }</option>
					</c:forEach>
				</select>
				
	</div>
	
	<div>
		请输入小标题:<input type="text" id="subtitle" name="subtitle" >
	</div>

	
	<h1>请在下面输入框中编辑内容</h1>
	<div id="test1" style="width: 800px; height: 500px"></div>
	<button onclick="init()">提交</button>

	<script type="text/javascript">
		var ue;
		$(function() {
			ue = UE.getEditor('test1');
		});
		function init() {
			var thematicval = $("#thematic").val();
			var subtitletext = $("#subtitle").val();
			var content = ue.getContent();
			
			$.post(
				"${pageContext.request.contextPath}/preservationadvancedchild.action",
				{
					"thematicid" : thematicval,					
					"subtitletext" : subtitletext,					
					"stringdata" : content
				},
				function(data){
					alert("成功!");
				}
			);
		}
	</script>
</body>
</html>