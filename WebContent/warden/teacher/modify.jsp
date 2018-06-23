<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改教师信息页面</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
</head>
<body>
	<p>修改教师信息</p>
	<s:form action="wardentea_updateSu" method="post" namespace="/warden" theme="simple">
	<s:hidden name="teacherId" value="%{model.teacherId}"/>
		<table class="table-bordered col-xs-12">
			<tr>
				<td>教师编号</td>
				<td><input type="text" name="teacherNo" value="${model.teacherNo}"></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" name="teacherName" value="${model.teacherName}"></td>
			</tr>
			<tr>
				<td>学院</td>
				<td><s:select name="college.collegeId" list="clist" value="%{model.college.collegeId}" listKey="collegeId" listValue="collegeName" headerKey="" headerValue="--请选择学院--" onchange="changeSelect(this.value)"></s:select></td>
			</tr>
			<tr>
				<td><input type="submit" value="修改"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</s:form>
</body>
</html>