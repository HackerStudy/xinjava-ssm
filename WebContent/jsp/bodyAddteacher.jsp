<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增教师</title>
<style type="text/css">
.divcss {
    position: absolute;
	top: 50%;
	left: 45%;
	margin: -150px 0 0 -150px;
	width: 500px;
	height: 400px; 
}
</style>
</head>
<body>
	<div align="center" class="divcss">
		<form action="${pageContext.request.contextPath}/register.action?type=1" method="post">
			<div id="usernameDiv">
				用&nbsp;&nbsp;户&nbsp;&nbsp;名<input type="text" name="account"
					id="account" align="center" /> <span id="userNameSpan"></span>
			</div>
			<div id="passwdDiv">
				密&nbsp;&nbsp;&nbsp;码&nbsp;&nbsp;&nbsp;&nbsp;<input type="password"
					name="password" id="password" align="center" />
			</div>
			<div id="passwdSureDiv">
				确认密码<input type="password" name="password1" id="password1"
					align="center" />
			</div>
			<div id="nameDiv">
				姓&nbsp;&nbsp;&nbsp;名&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"
					name="name" id="name" align="center" />
			</div>
			<input type="submit" value="新增" id="register"/>
		</form>
		</div>
</body>
</html>