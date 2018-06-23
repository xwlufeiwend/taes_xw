<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>选择课程（班级）</title>
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
	<p>学生信息显示</p>
	<p><a href="javascript:history.go(-1)">返回</a></p>
	<p><s:actionmessage/></p>
	<div class="liebiao">
		<ul>
			<s:iterator value="courses" var="c">
				<li><a href="teacher_sInfo.action?coursesId=<s:property value="#c.coursesId"/>"><s:property value="#c.coursesName"/></a></li>
			</s:iterator>
		</ul>
	</div>
	<s:if test="list != null">
	<table class="table-bordered col-xs-12">
		<tr>
			<th colspan="5"><s:property value="name"/></th>
		</tr>
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>学制</th>
			<th>入学日期</th>
			<th>学院</th>
		</tr>
		<s:iterator var="s" value="list">
		<tr>
			<td><s:property value="#s.studentNo"/></td>
			<td><s:property value="#s.studentName"/></td>
			<td><s:property value="#s.academic"/></td>
			<td><s:date name="#s.admissionDate" format="yyyy_MM"/></td>
			<td><s:property value="#s.college.collegeName"/></td>
		</tr>
		</s:iterator>
	</table>
	</s:if>
</body>
</html>