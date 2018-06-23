<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>考试管理导航</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
	<!-- 导航条设计 -->
	<nav class="navbar navbar-default navbar-fixed-top">
		<!-- container-fluid -->
		<div class="container-fluid">
			<!-- navbar-header -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse"
						data-target="#examination"
						aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="../warden.jsp" target="_top">首页</a>
			</div><!-- navbar-header -->
			<!-- collapse navbar-collapse -->
			<div class="collapse navbar-collapse" id="#examinaton">
				<ul class="nav navbar-nav">
					<li class="active">
						<a href="#">欢迎来到考试管理页面
							<span class="sr-only">
								(current)
							</span>
						</a>
					</li>
					<li>
						<a href="wardenexam_show.action?currPage=1" target="brand">显示所有考试信息</a>
					</li>
					<li>
						<a href="wardenexam_add.action" target="brand">添加考试信息</a>
					</li>
					<li>
						<a href="#" target="brand">扩展</a>
					</li>
				</ul>
				<s:form target="brand" class="navbar-form navbar-left" action="wardenexam_inquire" method="get" theme="simple" namespace="/warden">
					<div class="form-group">
						<input type="text" id="examName" name="examName" value="${model.examName }" class="form-control" placeholder="查询考试信息">
					</div>
					<button type="submit" class="btn btn-default">搜索</button>
				</s:form>
			</div><!-- cnc -->
		</div><!-- container-fluid -->
	</nav><!-- 导航结束 -->
</body>
</html>