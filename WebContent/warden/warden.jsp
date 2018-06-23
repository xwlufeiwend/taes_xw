<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员页面</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" 
							class="navbar-toggle collapsed" 
							data-toggle="collapse" 
							data-target="#bs-example-navbar-collapse-2" 
							aria-expanded="false">
        					 <span class="sr-only">Toggle navigation</span>
        					 <span class="icon-bar"></span>
       						 <span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#" target="_top">管理员图标</a>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="#">欢迎登录Taes系统后台
								<span class="sr-only">
									(current)
								</span>
							</a>
						</li>
						<li>
							<a href="#">系统介绍</a>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">用户管理<span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li>
									<a href="warden_management.action?li=2">学生管理</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="warden_management.action?li=3">教师管理</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="#">账号管理</a>
								</li>
							</ul>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">数据管理<span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li>
									<a href="warden_management.action?li=0">学院管理</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="warden_management.action?li=1">班级管理</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="warden_management.action?li=4">课程管理</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="warden_management.action?li=5">考试管理</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="warden_management.action?li=6">试卷管理</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="warden_management.action?li=7">成绩录入</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="#">数据导出</a>
								</li>
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-left">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="输入搜索内容">
						</div>
						<button type="submit" class="btn btn-default">搜索</button>
					</form>
				</div>
			</div>
		</nav><!--nav标签结束-->
</body>
</html>