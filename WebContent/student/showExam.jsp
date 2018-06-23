<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示该学生学院的考试信息</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
</head>
<body>
	<table class="table-bordered col-xs-12">
		<tr>
			<th>考试编号</th>
			<th>课程名称</th>
			<th>考试时间</th>
			<th>考试学院</th>
			<th>考试人数</th>
		</tr>
		<s:iterator var="e" value="exam">
			<tr>
				<td><s:property value="#e.exNo"/></td>
				<td><s:property value="#e.courses.coursesName"/></td>
				<td><s:date name="#e.startYear" format="yyyy-MM-dd"/></td>
				<td><s:property value="#e.college.collegeName"/></td>
				<td><s:property value="#e.studentNum"/></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>