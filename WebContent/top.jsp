<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>第一个小东西哦</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<!-- 
<link rel="stylesheet" type="text/css" href="styles.css"> -->

<style type="text/css">
#moduleDiv {
	background-color: #E0E0E0;
	background-repeat: no-repeat;
	margin: 0 auto;
}

body {
	background-color: #E0E0E0;
}

a {
	text-transform: none;
	text-decoration: none;
}

a:hover {
	text-decoration: underline;
	color: white;
}

#h1 {
	text-align: center;
	color: cadetblue;
}

#div {
	text-align: right;
}
</style>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.js">
	
</script>
<script type="text/javascript">
	
</script>

</head>
<body>
	<div>
		<h1 id="h1" align="center">
			<img src="../resouces/JAVA.png" align="top"> Java专题学习网
		</h1>
	</div>
	<div id="moduleDiv" style="font-size: 15pt;">
		您好 ：${user.name} &nbsp;&nbsp;&nbsp;&nbsp; <a
			href="${pageContext.request.contextPath}/BasicKnowledgeFindAll.action"
			target="left" id="a1">基础知识模块</a>&nbsp;&nbsp;&nbsp;&nbsp; <a
			href="${pageContext.request.contextPath}/findAdvancedKnowledgeAll.action"
			target="left">进阶知识模块</a>&nbsp;&nbsp;&nbsp;&nbsp; <a
			href="${pageContext.request.contextPath}/findinstanceName.action"
			target="left">实例教程模块</a>&nbsp;&nbsp;&nbsp;&nbsp; <a
			href="${pageContext.request.contextPath}/leftWorkDisplay.action"
			target="left">学生作品展示</a>&nbsp;&nbsp;&nbsp;&nbsp; <a
			href="${pageContext.request.contextPath}/showRelatedResource.action"
			target="body">相关资源</a>&nbsp;&nbsp;&nbsp;&nbsp; <a
			href="${pageContext.request.contextPath}/findExaminationPaperTopic.action?judgment=0"
			target="left">在线测试模块</a>&nbsp;&nbsp;&nbsp;&nbsp; <a
			href="${pageContext.request.contextPath}/jsp/leftAuxiliaryFunction.jsp"
			target="left">辅助功能模块</a>&nbsp;&nbsp;&nbsp;&nbsp; <a
			href="${pageContext.request.contextPath}/exit.action" target="main">退出</a>
	</div>
</body>

</html>