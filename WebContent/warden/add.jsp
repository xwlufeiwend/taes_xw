<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员添加</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" /><style type="text/css">
	p,table,button {
	text-align: center;
}
</style>
</head>
<body>
	<p>添加管理员</p>
	<s:form action="warden_addto" method="post" namespace="/warden" theme="simple">
		<table class="table-bordered col-xs-12">
			<tr>
				<td>编号：</td>
				<td><input type="text" name="wNo"></td>
			</tr>
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="wName"></td>
			</tr>
			<tr>
				<td>联系电话：</td>
				<td><input type="text" name="tel"></td>
			</tr>
			<tr>
				<td>登录密码：</td>
				<td><input type="password" name="wPassword" value="warden"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit" class="btn btn-info">添加</button></td>
			</tr>
		</table>
	</s:form>
</body>
</html>