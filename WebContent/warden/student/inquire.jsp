<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询学生信息</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
	p,th,td{
		text-align: center;
	}
</style>
</head>
<body>
	<p>查询学生信息（通过学号查询）</p><p><a href="javascript:history.go(-1)">返回</a></p>
	<s:form action="wardenstu_inquireto" method="get" name="form1" namespace="/warden">
		<table>
			<tr>
				<td>请输入正确的学号信息:</td>
				<td><input type="text" name="studentNo"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="查询"/></td>
			</tr>
		</table>
	</s:form>
	<s:iterator var="stu" value="stu">
		<table class="table-bordered col-xs-12">
			<tr>
				<th>学号</th>
				<th>姓名</th>
				<th>学制</th>
				<th>入学日期</th>
				<th>所在学院</th>
				<th>所在班级</th>
				<th>编辑</th>
				<th>删除</th>
			</tr>
			<tr>
				<td><s:property value="#stu.studentNo"/> </td>
				<td><s:property value="#stu.studentName"/></td>
				<td><s:property value="#stu.academic"/></td>
				<td><s:date name="#stu.admissionDate" format="yyyy-MM-dd"/> </td>
				<td><s:property value="#stu.college.collegeName"/></td>
				<td><s:property value="#stu.professionalClass.pcName"/></td>
				<td><a href="wardenstu_edit.action?studentId=<s:property value="#st.studentId" />">编辑</a></td>
				<td><a href="wardenstu_delete.action?studentId=<s:property value="#st.studentId" />">删除</a></td>
			</tr>
		</table>
	</s:iterator>
</body>
</html>