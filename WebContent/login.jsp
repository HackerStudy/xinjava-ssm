<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/jquery-1.8.2.js"></script>
<style type="text/css">
.bodycss {
	background-image: url(images/16745.jpg);
	background-repeat: no-repeat;
}

.divcss {
	position: absolute;
	top: 50%;
	left: 45%;
	margin: -150px 0 0 -150px;
	width: 500px;
	height: 400px;
}
/*	#username {
				position: absolute;
				top: 25%;
				left: 30%;
			}*/
#message{
	color: red;
	position: absolute;
	top: 16%;
	left: 42%;
}
#usernameDiv {
	color: aqua;
	position: absolute;
	top: 25%;
	left: 30%;
}

#passwdDiv {
	color: aqua;
	position: absolute;
	top: 35%;
	left: 30%;
}

#loginPosition {
	color: aqua;
	position: absolute;
	top: 45%;
	left: 30%;
}

#login {
	position: absolute;
	top: 55%;
	left: 40%;
}

#register {
	position: absolute;
	top: 55%;
	left: 60%;
}
</style>
<meta charset="UTF-8">
<title></title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js">
</script>
<script type="text/javascript">
	 $(function() {
		var $account = $("#account");
		$account.blur(function() {
			var account = $("#account").val();
			if (account.length == 0) {
				alert("账号不能为空");
			}
		});
		 /* 	 $("#login").click(function(){
			 alert("?");
			 $.post("login.action",{uid:"55"},function(data){               
		        		alert(data.length);
		        });       		 
		 });  */ 
	}); 
		
	window.onload = function() {
		if("${path}".length!=0){
			
			window.top.location="${path}";
		}
	
	}
	
</script>
</head>

<body class="bodycss">
	<div class="divcss">
		<form action="${pageContext.request.contextPath}/login.action" method="post">
			<div id="message">${message}</div>
			<div id="usernameDiv">
				用户名<input type="text" name="account" id="account" align="center" />
			</div>
			<div id="passwdDiv">
				密&nbsp;&nbsp;&nbsp;码<input type="password" name="password"
					id="password" align="center" />
			</div>
			<div id="loginPosition">
				身&nbsp;&nbsp;份 <select name="position" id="position">
					<option value="1">管理员</option>
					<option value="2">老师</option>
					<option value="3" selected="selected">学生</option>
				</select>
			</div>
			<input type="submit" value="登录" id="login" /> 
			<input type="button" value="注册" id="register" />
		</form>
	</div>
</body>
<script type="text/javascript">
	 $("#register").click(function() {
		location.href = "register.jsp";
	}); 
</script>

</html>