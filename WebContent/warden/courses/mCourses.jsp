<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导航</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />

</head>
<body>
	<!--导航栏-->
	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-2"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="../warden.jsp" target="_top">首页</a>
		</div>
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-2">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">管理课程 <span class="sr-only">
							(current) </span>
				</a></li>
				<li><a href="wardencour_findAll.action?currPage=1"
					target="brand">显示所有课程信息</a></li>
				<li><a href="wardencour_add.action" target="brand">添加课程</a></li>
				<li><a href="#" target="brand">批量操作课程数据</a></li>
			</ul>
			<s:form target="brand" class="navbar-form navbar-left"
				action="wardencour_inquire" method="get" namespace="/warden"
				theme="simple">
				<div class="form-group">
					<input type="text" name="coursesName" id="coursesName"
						value="${model.coursesName }" class="form-control" placeholder="查询课程">
				</div>
				<button type="submit" class="btn btn-default">查询</button>
			</s:form>
		</div>
	</div>
	</nav>
	<!--nav标签结束-->
</body>
</html>