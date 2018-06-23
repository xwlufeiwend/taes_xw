<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>院系添加</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
	p,tr {
		text-align: center;
	}
</style>
</head>
<body>
	<p>添加院系</p><p><a href="javascript:history.go(-1)">返回</a></p>
	<s:form action="wardencollege_save" method="post" namespace="/warden">
		<table class="table-bordered col-xs-12">
			<tr>
				<td>院系代号：</td>
				<td><input type="text" name="collegeNo"></td>
			</tr>
			<tr>
				<td>院系名称：</td>
				<td><input type="text" name="collegeName"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="保存"/>	
				</td>
			</tr>
		</table>
	</s:form>
</body>
</html>