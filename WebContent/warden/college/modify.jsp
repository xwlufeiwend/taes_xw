<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学院修改</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
	td {
	text-align: center;
}
</style>
</head>
<body>
<s:form action="wardencollege_modify" method="post" namespace="/warden">
	<s:hidden name="collegeId" value="%{model.collegeId}"/>
	<table class="table-bordered col-xs-12">
			<tr>
				<td>院系代号：</td>
				<td><input name="collegeNo" value="${model.collegeNo }"></td>
			</tr>
			<tr>
				<td>院系名称：</td>
				<%-- <td><s:textfield name="collegeName" value="%{model.collegeName}"/></td> --%>
				<td><input name="collegeName" value="${model.collegeName}"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="修改"/></td>
			</tr>
	</table>
</s:form>
</body>
</html>