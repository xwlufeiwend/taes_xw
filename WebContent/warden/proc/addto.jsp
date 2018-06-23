<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>班级添加</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
	p,td,form {
	text-align: center;
}
</style>
</head>
<body>
	<p>添加新的班级信息</p>
	<s:form action="wardenproc_save" method="post" namespace="/warden" theme="simple">
		<table class="table-bordered col-xs-12">
			<tr>
				<td>班级代号：</td>
				<td><input type="text" name="pcNo" id="pcNo"></td>
			</tr>
			<tr>
				<td>班级名称：</td>
				<td><input type="text" name="pcName" id="pcName"></td>
			</tr>
			<tr>
				<td>所在学院：</td>
				<td><s:select name="college.collegeId" list="list" listKey="collegeId" listValue="collegeName" headerKey="" headerValue="--请选择--"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="添加"></td>
			</tr>
		</table>
	</s:form>
</body>
</html>