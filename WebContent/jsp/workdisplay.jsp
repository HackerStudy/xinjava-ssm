<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>作品展示表</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
	
	<style type="text/css">
	.nav_banner{position:relative;}
	.banner_top_bg{width:100%;height:15px;position:absolute;top:0;left:0;background:url(../images/nav_bottom_bg.png) repeat-x;z-index:100;}
	.banner_pic{width:440px;height:440px;margin:0 auto;position:relative; }
	.banner_pic ul li{position:absolute;font-size:0;opacity:0;}
	.banner_pic ul li.active{opacity:1}
	.banner_icon{width:20px;height:20px;position:absolute;bottom:15px;left:600px;border-radius:10px;text-align:center;background:rgba(0,0,0,0.3);z-index:10;}
	.banner_icon span{display:inline-block;border-radius:50%;width:15px;height:15px;margin:2px 4px 0 4px;background:#fff;cursor:pointer}
	span.active{background:red;}
	
	.pre{border:1px solid blue;border-radius:50%;width:50px;height:50px;position:absolute;top:140px;left:50px;font-size:30px;line-height:50px;text-align:center;color:blue;opacity:0.7;}
	.next{border:1px solid blue;border-radius:50%;width:50px;height:50px;position:absolute;top:140px;right:50px;font-size:30px;line-height:50px;text-align:center;color:blue;opacity:0.7;}
	.pre:hover,.next:hover{color:red;border:1px solid red;}
	</style>
</head>
<body>
	<h1 align="center" style="color: gray;">标题：${workDisplay.title }</h1>
	<h3 align="right">作者：${workDisplay.userName }</h3>
	<h4 align="left">作品简介：</h4>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${workDisplay.profile}

	<h4 align="left">效果展示：</h4>
	
	<div class="banner_pic" >
		<ul>
 		<li class="li" style="opacity:1"><a href="javascript:void(0);"><img src="..img/java.png" alt="" width="360" height="360"/></a></li>
		<c:forEach var="picture" items="${list}">
			<li class="li"><a href="javascript:void(0);">
			<img class="img" src="../resouces/${picture}" alt="" style="width: 360px; height: 360px;" >
			</a>
			</li>
		</c:forEach>
		</ul>
		<a href="javascript:;" class="pre" id="pre">&lt;</a>
		<a href="javascript:;" class="next" id="next">&gt;</a>
	</div>
	
	<%-- <div class="banner_icon">
		<span class="active"></span>
		<c:forEach var="picture" items="${list}">
		<span></span>
		</c:forEach>
	</div> --%>
	
	<h4>附件：</h4>
	<a href="downWorkDisplay.action?fileName=${workDisplay.attachment}">${workDisplay.attachment}</a>
	
	<script type="text/javascript">
	function showBtn(){
		$(".active")&&($(".active").removeClass("active"))
		$(".banner_icon span").eq(myIndex).addClass("active")
	}
	var myIndex = 0;
	$(".pre").click(function(){
		myIndex --
		if(myIndex==-1){
			myIndex = 5
		}	
			$(".li").eq(myIndex).animate({opacity:"+=1"},1000)
			$(".li").eq(myIndex).siblings().css({opacity:"0"})
			showBtn()
	})
	$(".next").click(function(){
		myIndex ++
		if(myIndex==6){
			myIndex = 0
		}
			$(".li").eq(myIndex).animate({opacity:"+=1"},1000)
			$(".li").eq(myIndex).siblings().css({opacity:"0"})
			showBtn()
	})
		
	$(".banner_icon span").mouseover(function(){
		myIndex = $(this).index();
		if($(".banner_icon span").hasClass("active")){ 
				$(this).mouseover(function(){
					return
					})
				}
		$(".li").eq(myIndex).animate({opacity:"+=1"},1000)
		$(".li").eq(myIndex).siblings().css({opacity:"0"})
		showBtn()
			
	})
	
	</script>
</body>
</html>