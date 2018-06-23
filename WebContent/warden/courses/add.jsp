<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加课程页面</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
<style type="text/css">
	p,td {
	text-align: center;
}
</style>
</head>
<body>
	<p>添加课程信息</p>
	<s:form action="wardencour_addto" method="post" namespace="/warden" theme="simple">
		<table class="table-bordered col-xs-12">
			<tr>
			  <td>课程编号</td>
			  <td><input type="text" name="coursesNo"></td>
			</tr>
			<tr>
			  <td>课程名称</td>
			  <td><input type="text" name="coursesName"></td>
			</tr>
			<tr>
			  <td>学分</td>
			  <td><input type="text" name="credits"></td>
			</tr>
			<tr>
			  <td>任课教师</td>
			  <td>
			  	<s:select name="teacher.teacherId" listKey="teacherId" listValue="teacherName" list="tlist" headerKey="" headerValue="--请选择任课教师--" ></s:select>
			  </td>
			</tr>
			<tr>
			  <td colspan="2"><input type="submit" value="添加"></td>
			</tr>
		</table>
	</s:form>
</body>
</html>