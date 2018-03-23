<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>主页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		*{
			font-size:10pt;
		}
		body{
			text-align:center;
		}
		.table{
			width:1230px;
			height:100%;
			border:1px solid gray;/*åºå®è¾¹æ¡,1åç´ */
		    border-collapse: collapse;/*åçº¿çåè¡¨è¾¹æ¡*/
		}
		.table td{
			border:1px solid gray;/*åºå®è¾¹æ¡,1åç´ */
		}
		iframe {
			width: 100%;
			height: 100%;
		}
	</style>
 

  </head>
  
  <body>
<table class="table" align="center">
	<tr style=" height: 120px; ">
		<td colspan="2" align="center">
			<iframe frameborder="0" src="top.jsp" name="top"></iframe>
		</td>
	</tr>
	<tr>
		<td width="240" style="padding:5px;" align="center" valign="top">
			<iframe frameborder="0"  src="jsp/left.jsp" name="left"></iframe>
		</td>
		<td>
			<iframe frameborder="0" src="body.html" name="body" id="bodyFrame"></iframe>
		</td>
	</tr>
</table>
  </body>
</html>
