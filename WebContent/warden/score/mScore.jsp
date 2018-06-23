<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>top</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
	p,th,td{
		text-align: center;
	}
	body{
		padding-top: 70px;
	}
	.navbar{
		margin-bottom: -1px;
	}
</style>
</head>
<body>
	<!--导航栏-->
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" 
							class="navbar-toggle collapsed" 
							data-toggle="collapse" 
							data-target="#score" 
							aria-expanded="false">
        					 <span class="sr-only">Toggle navigation</span>
        					 <span class="icon-bar"></span>
       						 <span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="../warden.jsp" target="_top">首页</a>
				</div>
				<div class="collapse navbar-collapse" id="#score">
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="#">管理分数数据
								<span class="sr-only">
									(current)
								</span>
							</a>
						</li>
						<li>
							<a href="wardensco_findAll.action?currPage=1" target="brand">显示所有学生的分数</a>
						</li>
						<li>
							<a href="wardensco_add.action" target="brand">添加学生分数</a>
						</li>
						<li>
							<a href="#" target="brand">批量操作班级数据</a>
						</li>
					</ul>
					<s:form target="brand" class="navbar-form navbar-left" action="wardensco_findBysId" method="get" namespace="/warden" theme="simple">
						<div class="form-group">
							<input type="text" name="studentId" id="studentId" value="${model.studentId }" class="form-control" placeholder="查询分數">
						</div>
						<button type="submit" class="btn btn-default">查询</button>
					</s:form>
				</div>
			</div>
		</nav><!--nav标签结束-->
</body>
</html>