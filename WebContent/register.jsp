<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<style type="text/css">
.bodycss {
	background-image: url(images/880571.jpg);
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
#passwdSureDiv{
	color: aqua;
	position: absolute;
	top: 45%;
	left: 30%;

}
#nameDiv{
color: aqua;
	position: absolute;
	top: 55%;
	left: 30%;
}

#register {
	position: absolute;
	top: 65%;
	left: 40%;
}

#exit {
	position: absolute;
	top: 65%;
	left: 60%;
}
</style>
<meta charset="UTF-8">
<title></title>
</head>

<body class="bodycss">
	<div class="divcss">
		<form action="register.action" method="post">
			<div id="usernameDiv">
				用&nbsp;&nbsp;户&nbsp;&nbsp;名<input type="text" name="account" id="account" align="center" />
				<span id="userNameSpan"></span>
			</div>
			<div id="passwdDiv">
				密&nbsp;&nbsp;&nbsp;码&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="password" id="passwd"
					align="center" />
			</div>
			<div id="passwdSureDiv">
			   确认密码<input type="password" name="password1" id="password1"
					align="center" />
			</div>
			<div id="nameDiv">
			  姓&nbsp;&nbsp;&nbsp;名&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="name" id="name" align="center"/>
			</div>
			<input type="submit" value="注册" id="register" /> <input
				type="button" value="返回" id="exit" />
		</form>
	</div>

</body>
<script type="text/javascript">
	
	var $username = $("#userId");
	var reg = /^[a-zA-Z]+.{5}$/;
	$username.blur(function() {
		var username = $username.val();
		if (username.match(reg)) {
			$("#userNameSpan").text("正确");
		} else {
			$("#userNameSpan").text("错误");
		}
	});
	$("#exit").click(function() {
		window.location = "login.jsp";
	});
	var msg = "${msg}";
	if (msg==1) {
		alert("账号已存在");
	}
</script>

</html>