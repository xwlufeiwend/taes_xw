<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示所有课程信息</title>
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
	<p>
		当前页数
		<s:property value="currPage" />
		/总页数
		<s:property value="totalPage" />
		&nbsp;&nbsp;&nbsp; 总记录数：
		<s:property value="totalCount" />
		/每页显示：
		<s:property value="pageSize" />
		条
	</p>
	<table class="table-bordered col-xs-12">
		<tr>
			<th>课程号</th>
			<th>课程名</th>
			<th>学分</th>
			<th>任课教师</th>
			<th>编辑</th>
			<th>删除</th>
		</tr>
		<s:iterator var="c" value="list">
			<tr>
				<td><s:property value="#c.coursesNo" /></td>
				<td><s:property value="#c.coursesName" /></td>
				<td><s:property value="#c.credits" /></td>
				<td><s:property value="#c.teacher.teacherName" /></td>
				<td><a
					href="wardencour_modify.action?coursesId=<s:property value="#c.coursesId"/>">编辑</a></td>
				<td><a
					href="wardencour_delete.action?coursesId=<s:property value="#c.coursesId"/>">删除</a></td>
			</tr>
		</s:iterator>
	</table>
	<br>
	<!-- 分页导航栏 -->
	<nav aria-label="Page navigation">
	<ul class="pager">
		<s:if test="currPage != 1">
			<li><a href="wardencour_show.action?currPage=1">首页</a></li>
			<li><a
				href="wardencour_show.action?currPage=<s:property value="currPage-1"/>">上一页</a></li>
		</s:if>
		<s:if test="currPage != totalPage">
			<li><a
				href="wardencour_show.action?currPage=<s:property value="currPage+1"/>">下一页</a></li>
			<li><a
				href="wardencour_show.action?currPage=<s:property value="totalPage"/>">尾页</a></li>
		</s:if>
	</ul>
	</nav>
</body>
</html>