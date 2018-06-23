<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加学生分数数据</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />

</head>
<body>
	<s:form action="wardensco_addto" method="post" namespace="/warden"
		theme="simple">
		<table class="table-bordered col-xs-12">
			<tr>
				<th>学号</th>
				<th>姓名</th>
				<th>参加的考试</th>
				<th>考试课程</th>
				<th>考试的试卷</th>
				<th>得分</th>
				<th>大题分数串</th>
				<th>小题分数串</th>
			</tr>
			<tr>
				<td><input type="text" name="student.studentNo"></td>
				<td><input type="text" name="student.studentName"></td>
				<td><input type="text" name="examination."></td>
			</tr>
		</table>
	</s:form>
</body>
</html>