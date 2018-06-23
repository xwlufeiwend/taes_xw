<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教师查询页面</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
<style type="text/css">
	th,td{
		text-align: center;
	}
</style>
</head>
<body>
	 <p>查询教师信息页面（通过学院查询）</p>
	<s:form action="wardentea_findByCollegeName" method="get" namespace="/warden">
		<table>
			<tr>
				<td>请输入学院名：</td>
				<td><input type="text" name="college.collegeName"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="查询"></td>
			</tr>
		</table>
	</s:form>
	<table class="table-bordered col-xs-12">
		<s:if test="list != null">
		<tr>
			<th>教师编号</th>
			<th>教师姓名</th>
			<th>所在学院</th>
			<th>修改</th>
			<th>删除</th>
		</tr>
		
		</s:if>
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
</body>
</html>