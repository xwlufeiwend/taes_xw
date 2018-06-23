<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示课程</title>
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
	<p><s:actionerror/></p>
	<table class="table-bordered col-xs-12">
		<tr>
			<th>课程号</th>
			<th>课程名</th>
			<th>学分</th>
			<th>任课教师</th>
			<th>选课人数</th>
		</tr>
		<s:iterator var="c" value="courses">
			<tr>
				<td><s:property value="#c.coursesNo" /></td>
				<td><s:property value="#c.coursesName" /></td>
				<td><s:property value="#c.credits" /></td>
				<td><s:property value="#c.teacher.teacherName" /></td>
				<td><a href="${pageContext.request.contextPath}/teacher/teacher_cstFind.action?coursesId=<s:property value="#c.coursesId"/>&&coursesName=<s:property value="#c.coursesName"/>">查看人数</a></td>
			</tr>
		</s:iterator>
	</table>

</body>
</html>