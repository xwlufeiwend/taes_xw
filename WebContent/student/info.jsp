<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息显示</title>
<style type="text/css">
	p {
	text-align: center;
}
</style>
</head>
<body>
	<p>用户信息如下</p>
	<p>用户名：<s:property value="%{model.studentName }"/></p>
	<p>学号：<s:property value="%{model.studentNo }"/></p>
	<p>班级：<s:property value="%{model.professionalClass.pcName }"/></p>
	<p>院系：<s:property value="%{model.college.collegeName}"/></p>
	<p>入学日期：<s:date name="%{model.admissionDate}" format="yyyy-MM-dd"/></p>
	<p>学制：<s:property value="%{model.academic}"/></p>
</body>
</html>