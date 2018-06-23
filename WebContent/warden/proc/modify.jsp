<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改班级页面</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
	p,td {
	text-align: center;
}
</style>
</head>
<body>
	<p>修改班级信息</p><p><a href="javascript:history.go(-1)">返回</a></p>
	<!-- s:select用法，当要默认选中时需添加value属性，value属性需以name一致即可默认选中， -->
	<!-- 麻麻批 用个尖括号都出错，我曹 -->
	<s:form action="wardenproc_update" method="post" namespace="/warden" theme="simple">
		<s:hidden name="pcId" value="%{model.pcId}"/>
		<table class="table-bordered col-xs-12">
			<tr>
				<td>班级代号：</td>
				<td><s:textfield name="pcNo" value="%{model.pcNo}"/></td>
			</tr>
			<tr>
				<td>班级名称：</td>
				<td><s:textfield name="pcName" value="%{model.pcName}"/></td>
			</tr>
			<tr>
				<td>所属院系：</td>
				<td>
					<s:select name="college.collegeId" list="list" value="%{model.college.collegeId }" listKey="collegeId" listValue="collegeName" headerKey="" headerValue="--请选择学院--"/>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="修改"></td>
				<td><input type="reset" value="清空"></td>
			</tr>
		</table>
	</s:form>
</body>
</html>