<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>教师页</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js" ></script>
</head>
<body style="background-color: #f2f9fd;">
	<div class="header bg-main">
		<div class="logo margin-big-left fadein-top">
			<h1 style="color: #000000;">
				<!--<img src="images/y.jpg" class="radius-circle rotate-hover"
					height="50" alt="" />-->教师端
			</h1>
		</div>
		<div class="head-l">
			用户：<a target="right" class="button button-little bg-black" href="teacher_info.action?teacherId=<s:property value="#session.teacher.teacherId"/>"><span
				class="icon-power-on"></span><s:property value="#session.teacher.teacherName"/></a>
		</div>
		<div class="head-l">
			<a class="button button-little bg-blue" href="teacher_exit.action"><span
				class="icon-power-off"></span>退出登录</a>
		</div>
	</div>
	<div class="leftnav">
		<div class="leftnav-title">
			<strong style="color: #000000;"><span class="icon-list"></span>菜单列表</strong>
		</div>
		<h2>
			<span class="icon-user"></span>基本设置
		</h2>
		<!--  style="display: block"设置样式使其开始不被缩起 -->
		<ul>
			<li><a href="teacher_info.action?teacherId=<s:property value="#session.teacher.teacherId"/>"
				target="right"><span class="icon-caret-right"></span>基本信息显示</a></li>
			<li><a href="teacher_updatePwd.action?teacherId=<s:property value="#session.teacher.teacherId" />" target="right"><span
					class="icon-caret-right"></span>修改登录密码</a></li>
		</ul>
		<h2>
			<span class="icon-pencil-square-o"></span>课程
		</h2>
		<ul>
			<li><a href="teacher_coursesShow.action?currPage=1&&teacherId=<s:property value="#session.teacher.teacherId"/>" target="right"><span
					class="icon-caret-right"></span>显示所教授课程</a></li>
			<li><a href="teacher_coursesShowAll.action?currPage=1" target="right"><span
					class="icon-caret-right"></span>查看所有课程</a></li>
		</ul>
		<h2>
			<span class="icon-pencil-square-o"></span>学生管理
		</h2>
		<ul>
			<li><a href="teacher_studentShow.action?teacherId=<s:property value="#session.teacher.teacherId" />" target="right"><span
					class="icon-caret-right"></span>显示学生信息</a></li>
			<li><a href="teacher_studentFind.action" target="right"><span
					class="icon-caret-right"></span>查询学生</a></li>
		</ul>
		
		<h2>
			<span class="icon-pencil-square-o"></span>考试
		</h2>
		<ul>
			<li><a href="teacher_examShow.action?currPage=1" target="right"><span
					class="icon-caret-right"></span>考试信息</a></li>
		</ul>
		
		<h2>
			<span class="icon-pencil-square-o"></span>成绩
		</h2>
		<ul>
			<li><a href="teacher_scoreShow.action?teacherId=<s:property value="#session.teacher.teacherId" />" target="right"><span
					class="icon-caret-right"></span>成绩列表</a></li>
			<li><a href="teacher_daoru.action" target="right"><span
					class="icon-caret-right"></span>导入成绩</a></li>
			<li><a href="teacher_scoreFind.action" target="right"><span
					class="icon-caret-right"></span>查询成绩</a></li>
			<li><a href="teacher_analysis.action" target="right"><span
					class="icon-caret-right"></span>成绩分析</a></li>
		</ul>
	</div>
	<script type="text/javascript">
		$(function() {
			$(".leftnav h2").click(function() {
				$(this).next().slideToggle(200);
				$(this).toggleClass("on");
			})
			$(".leftnav ul li a").click(function() {
				$("#a_leader_txt").text($(this).text());
				$(".leftnav ul li a").removeClass("on");
				$(this).addClass("on");
			})
		});
	</script>
	<ul class="bread">
		<li><a href="#" target="right" class="icon-home">首页</a>
		</li>
		<li><a href="##" id="a_leader_txt"></a></li>
	</ul>
	<div class="admin">
		<iframe src="brand.jsp" name="right" width="100%" height="100%"></iframe>
	</div>
</body>
</html>