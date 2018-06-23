<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询学生信息</title>
</head>
<body>
	<s:form action="teacher_finds" method="get" namespace="/teacher"
		theme="simple">
		<p>
			输入学生学号：<input type="text" name="studentNo">
		</p>
		<p>
			<input type="submit" value="查询">
		</p>
	</s:form>
	<s:if test="list != null">
		<table>
			<tr>
				<th>学号</th>
				<th>姓名</th>
				<th>学制</th>
				<th>入学日期</th>
				<th>学院</th>
			</tr>
			<s:iterator var="s" value="list">
				<tr>
					<td><s:property value="#s.studentNo" /></td>
					<td><s:property value="#s.studentName" /></td>
					<td><s:property value="#s.academic" /></td>
					<td><s:date name="#s.admissionDate" format="yyyy_MM" /></td>
					<td><s:property value="#s.college.collegeName" /></td>
				</tr>
			</s:iterator>
		</table>
	</s:if>
</body>
</html>