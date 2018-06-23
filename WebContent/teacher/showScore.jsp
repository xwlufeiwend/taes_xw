<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成绩显示</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
<style type="text/css">
	.admin{
		margin-top: -110px;
	}
</style>
</head>
<body>
	<p>课程列表</p>
	<ol>
	  <s:iterator value="courses" var="c">
	  	<li><a href="teacher_showScore.action?coursesId=<s:property value="#c.coursesId"/>" target="rright"><s:property value="#c.coursesName"/>成绩</a></li>	
	  </s:iterator>
	</ol>
	<div class="admin">
		<iframe frameborder="0" src="brand.jsp" name="rright" width="100%" height="100%"></iframe>
	</div>
</body>
</html>