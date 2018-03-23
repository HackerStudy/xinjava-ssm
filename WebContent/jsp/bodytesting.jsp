<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
#totalScore {
	color: red;
	font-size: 50px;
}
</style>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#button").click(function() {
			$("#button").hide();
			var ans = $(".answer");
			//var right = $(".rightAnswers");             	
			var radios = $("input:radio:checked");
			//var score = $(".score");
			var score = $(".score");
			var totalScore = 0;
			for (var i = 0; i < ans.length; i++) {
				//$(ans[i]).text($(right[i]).val());
				$(ans[i]).text($(ans[i]).prev().val()); //prev()上一节点
				//$(radios[i]).val()选中的值，$(ans[i]).prev().val()正确答案
				if ($(radios[i]).val() == $(ans[i]).prev().val()) {
					totalScore += parseInt($(score[i]).text());
				}
			}
			$("#totalScore").text("总得分:" + totalScore);
		});
	});
</script>
</head>
<body>
	<h1 align="center">${topic}</h1>
	一.选择题(总分:${totalScore})
	<br />
	<br />
	<c:forEach var="questions" items="${listTestPaper}" varStatus="status">
              ${status.count}. ${questions.question} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(分值:<span
			class="score">${questions.score}</span>)<br />
                &nbsp;&nbsp; A.${questions.option1} <br />
                &nbsp;&nbsp; B.${questions.option2} <br />
                &nbsp;&nbsp; C.${questions.option3} <br />
                &nbsp;&nbsp;  D.${questions.option4} <br />
		<br />
                 A<input name="option${status.count}" value="A"
			type="radio" class="option" /> 
                 B<input name="option${status.count}" value="B"
			type="radio" class="option" />
	             C<input name="option${status.count}" value="C"
			type="radio" class="option" /> 
	             D<input name="option${status.count}" value="D"
			type="radio" class="option" />、
	             
	    <br />
		<input type="hidden" name="rightAnswers" class="rightAnswers"
			value="${questions.rightAnswers}" />   
		正确选项：<div class="answer"></div>
	</c:forEach>
	<br />
	<br />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="submit" value="提交" id="button" />
	<div id="totalScore" align="center" ></div>
</body>
</html>