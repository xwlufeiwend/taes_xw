<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分数查询页面</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
<style type="text/css">
	.admin{
		margin-top: -110px;
	}
</style>
</head>
<body>
<p>选择查询条件</p>
<s:form target="rright" action="teacher_findScore" method="get" namespace="/teacher" theme="simple">
	<p>课程：<s:select name="courses.coursesId" listKey="coursesId" listValue="coursesName" list="list" headerKey="0" headerValue="-课程-"/>
	</p>
	<p>
		学号：<input type="text" name="studentNo">
	</p>
	<p>
		<input type="submit" value="查询">
	</p>
</s:form>
<div class="admin">
		<iframe frameborder="0" src="brand.jsp" name="rright" width="100%" height="100%"></iframe>
</div>
</body>
</html>