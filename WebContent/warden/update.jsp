<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改管理员信息</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
</head>
<body>
	<p>修改</p>
	<s:form action="warden_updateto" namespace="/warden" method="post" theme="simple">
		<s:hidden name="wId" value="%{model.wId}"/>
		<table class="table-bordered col-xs-6">
			<tr>
				<th>编号</th>
				<td><input type="text" name="wNo" value="${model.wNo }"></td>
			</tr>
			<tr>
				<th>姓名</th>
				<td><input type="text" name="wName" value="${model.wName }"></td>
			</tr>
			<tr>
				<th>联系电话</th>
				<td><input type="text" name="tel" value="${model.tel }"></td>
			</tr>
			<tr>
				<th>登录密码</th>
				<td><input type="password" name="wPassword" value="${model.wPassword }"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit" class="btn btn-info">修改</button></td>
			</tr>
		</table>
	</s:form>
</body>
</html>