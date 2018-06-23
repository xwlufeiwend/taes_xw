<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教师管理页面</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
<style type="text/css">
body {
	padding-top: 70px;
}

.navbar {
	margin-bottom: -1px;
}
</style>
</head>
<body>
	<%-- <p>分页显示所有教师信息页面</p>
	<p><a href="wardentea_findAll.action?currPage=1">显示</a><a href="wardentea_findAll.action?currPage=-1">关闭</a></p>
	<s:if test="currPage >= 1"> --%>
	<%-- <table>
			<tr>
				<th>教师编号</th>
				<th>教师姓名</th>
				<th>学院</th>
				<th>修改</th>
				<th>删除</th>
			</tr>
			<s:iterator value="list" var="list">
				<tr>
					<td><s:property value="#list.teacherNo"/></td>
					<td><s:property value="#list.teacherName"/></td>
					<td><s:property value="#list.college.collegeName"/></td>
					<td><a href="wardentea_modify.action?teacherId=<s:property value="#list.teacherId"/>">修改</a></td>
					<td><a href="wardentea_delete.action?teacherId=<s:property value="#list.teacherId"/>">删除</a></td>
				</tr>
			</s:iterator>
		</table>
		<!-- 控制分页 -->
		<table>
			<s:if test="currPage > 1">
				<tr>
					<td><a href="wardentea_findAll.action?currPage=1">首页</a></td>
					<td><a href="wardentea_findAll.action?currPage=<s:property value="currPage - 1"/>">上一页</a></td>
				</tr>
			</s:if>
			<s:if test="currPage < totalPage">
				<tr>
					<td><a href="wardentea_findAll.action?currPage=<s:property value="currPage + 1"/>">下一页</a></td>
					<td><a href="wardentea_findAll.action?currPage=<s:property value="totalPage"/>">尾页</a></td>
				</tr>
			</s:if>
		</table> --%>
	<%-- </s:if>
	<p>根据教师号查询教师信息<a href="wardentea_inquire.action">跳转</a></p>
	<p>添加教师信息<a href="wardentea_add.action">跳转</a></p> --%>
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
				<li class="active"><a href="#">管理教师 <span class="sr-only">
							(current) </span>
				</a></li>
				<li><a href="wardentea_findAll.action?currPage=1"
					target="brand">显示所有教师信息</a></li>
				<li><a href="wardentea_add.action" target="brand">添加教师信息</a></li>
				<li><a href="#" target="brand">批量操作教师数据</a></li>
			</ul>
			<s:form target="brand" class="navbar-form navbar-left"
				action="wardentea_findByCollegeName" method="get" namespace="/warden"
				theme="simple">
				<div class="form-group">
					<input type="text" name="college.collegeName" id="college.collegeName"
						value="${college.collegeName }" class="form-control" placeholder="根据学院查询教师信息">
				</div>
				<button type="submit" class="btn btn-default">查询</button>
			</s:form>
		</div>
	</div>
	</nav>
	<!--nav标签结束-->
</body>
</html>