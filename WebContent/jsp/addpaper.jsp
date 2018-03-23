<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>上传试题</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js" /></script>
<style type="text/css">
div {
	text-align: center;
}

.form2 {
	text-align: center;
}

option {
	text-align: center;
	width: 100px;
}
</style>
</head>
<body>
	<form action="${pageContext.request.contextPath}/addExaminationPaper.action" method="post">
		<div>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;试卷名:&nbsp;&nbsp;&nbsp;<input
				type="text" id="topic" name="topic"> <input type="submit"
				value="生成试卷">
		</div>
		<div>&nbsp;</div>
	</form>
		<div>
			&nbsp;&nbsp;题目&nbsp;:&nbsp;&nbsp;&nbsp;<input type="text"
				id="question" name="question">
		</div>
		<div>&nbsp;</div>
		<div>
			A选项:&nbsp;&nbsp;&nbsp;<input type="text" id="option1" name="option1">
		</div>
		<div>&nbsp;</div>
		<div>
			B选项:&nbsp;&nbsp;&nbsp;<input type="text" id="option2" name="option2">
		</div>
		<div>&nbsp;</div>
		<div>
			C选项:&nbsp;&nbsp;&nbsp;<input type="text" id="option3" name="option3">
		</div>
		<div>&nbsp;</div>
		<div>
			D选项:&nbsp;&nbsp;&nbsp;<input type="text" id="option4" name="option4">
		</div>
		<div>&nbsp;</div>
		<div>
			正确选项:A<input id="rightAnswers" name="rightAnswers" value="A" type="radio" checked="true" /> 
				   B<input id="rightAnswers" name="rightAnswers" value="B" type="radio" /> 
				   C<input id="rightAnswers" name="rightAnswers" value="C" type="radio" /> 
				   D<input id="rightAnswers" name="rightAnswers" value="D" type="radio" />
		</div>
		<div>&nbsp;</div>
		分值： 5<input checked="true" value="5" id="score" name="score" type="radio" /> 
		     10<input id="score" name="score" value="10" type="radio" />
			 15<input id="score" name="score" value="15" type="radio" />
			 20<input id="score" name="score" value="20" type="radio" />
		<div>&nbsp;</div>
		<!-- 下拉框 -->
		添加至:<select name="paperTopic" id="paperTopic"
			style="text-align: center">
			<c:forEach var="testPaper" items="${listExaminationPaperTopic}">
				<option value="${testPaper.id}" >${testPaper.topic}</option>
			</c:forEach>
		</select>
		<div>&nbsp;</div>
		<div align="right">
			<input type="button" value="添加题目" onclick="init()" >
		</div>
	
	<script type="text/javascript">
		function init() {
			var question = $("#question").val();
			var option1 = $("#option1").val();
			var option2 = $("#option2").val();
			var option3 = $("#option3").val();
			var option4 = $("#option4").val();
			var rightAnswers =  $("input[name='rightAnswers']:checked").val();
			var score = $("input[name='score']:checked").val();
			var tid = $("#paperTopic").val();
			alert(rightAnswers);
			alert(score);
			$.post(
					"${pageContext.request.contextPath}/addTestQuestions.action",
					{
						"question" : question,					
						"option1" : option1,					
						"option2" : option2,
						"option3" : option3,
						"option4" : option4,
						"rightAnswers" : rightAnswers,
						"score" : score,
						"tid" : tid
					},
					function(data){
						alert("Data Loaded: " + data);
						alert("成功");
					},
					"json"
				);
		}
	</script>
</body>
</html>