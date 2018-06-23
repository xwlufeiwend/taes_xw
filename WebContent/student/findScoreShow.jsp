<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询分数显示</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
	
<style type="text/css">
	p,th,td{
		text-align: center;
	}
</style>
</head>
<body>
	<p>分数显示</p>
	<p><s:actionerror /></p>
	<p>当前页数
		<s:property value="currPage" />
		/总页数
		<s:property value="totalPage" />
		&nbsp;&nbsp;&nbsp; 总分数条：
		<s:property value="totalCount" />
		/每页显示：
		<s:property value="pageSize" />
		条
	</p>
	<table class="table-bordered col-xs-12">
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>考试时间</th>
			<th>课程</th>
			<th>试卷</th>
			<th>分数</th>
			<th>查看详细分数</th>
		</tr>

		<s:iterator var="s" value="list">
			<tr>
				<td><s:property value="#s.student.studentNo" /></td>
				<td><s:property value="#s.student.studentName" /></td>
				<td><s:date name="#s.examination.startYear" format="yyyy-MM" /></td>
				<td><s:property value="#s.courses.coursesName"/></td>
				<td><s:property value="#s.paper.paperName" /></td>
				<td><s:property value="#s.actualScore" /></td>
				<td><a href="student_detailScore.action?">详细分数</a></td>
			</tr>
		</s:iterator>
	</table>
	<nav aria-label="Page navigation">
	<ul class="pager">
		<s:if test="currPage != 1">
			<li><a href="student_findScore.action?currPage=1">首页</a></li>
			<li><a
				href="student_findScore.action?currPage=<s:property value="currPage-1"/>">上一页</a></li>
		</s:if>
		<s:if test="currPage != totalPage">
			<li><a
				href="student_findScore.action?currPage=<s:property value="currPage+1"/>">下一页</a></li>
			<li><a
				href="student_findScore.action?currPage=<s:property value="totalPage"/>">尾页</a></li>
		</s:if>
	</ul>
	</nav>
</body>
</html>