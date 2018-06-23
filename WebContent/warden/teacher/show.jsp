<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示所有教师信息</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
<style type="text/css">
p, th, td {
	text-align: center;
}
</style>
</head>
<body>
<p>当前页数<s:property value="currPage"/>/总页数<s:property value="totalPage"/>
				&nbsp;&nbsp;&nbsp;
				总记录数：<s:property value="totalCount" />/每页显示：<s:property value="pageSize" />条</p>
	<table class="table-bordered col-xs-12">
		<tr>
			<th>教师编号</th>
			<th>教师姓名</th>
			<th>学院</th>
			<th>修改</th>
			<th>删除</th>
		</tr>
		<s:iterator value="list" var="list">
			<tr>
				<td><s:property value="#list.teacherNo" /></td>
				<td><s:property value="#list.teacherName" /></td>
				<td><s:property value="#list.college.collegeName" /></td>
				<td><a
					href="wardentea_modify.action?teacherId=<s:property value="#list.teacherId"/>">修改</a></td>
				<td><a
					href="wardentea_delete.action?teacherId=<s:property value="#list.teacherId"/>">删除</a></td>
			</tr>
		</s:iterator>
	</table>
	<nav aria-label="Page navigation">
	<ul class="pager">
		<s:if test="currPage != 1">
			<li><a href="wardentea_show.action?currPage=1">首页</a></li>
			<li><a
				href="wardentea_show.action?currPage=<s:property value="currPage-1"/>">上一页</a></li>
		</s:if>
		<s:if test="currPage != totalPage">
			<li><a
				href="wardentea_show.action?currPage=<s:property value="currPage+1"/>">下一页</a></li>
			<li><a
				href="wardentea_show.action?currPage=<s:property value="totalPage"/>">尾页</a></li>
		</s:if>
	</ul>
	</nav>
</body>
</html>