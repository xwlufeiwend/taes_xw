<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>院系查询</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
<style type="text/css">
p, th, td {
	text-align: center;
}
</style>
</head>

<body>
	<label>输入院系完整名称：</label>
	<a href="javascript:history.go(-1)">返回</a>
	<s:form action="wardencollege_inquire" namespace="/warden" method="get">
		<input type="text" id="collegeName" name="collegeName"
			value="${model.collegeName }" />
		<input type="submit" value="查询" />
	</s:form>
	<table class="table-bordered col-xs-12">
			<s:if test="college != null">	
			<tr>
				<th colspan="2"><p>学院信息</th>
			</tr>		
			<tr>
				<th>院系代号</th>
				<th>院系名称</th>
			</tr>
			</s:if>
			<s:iterator var="college" value="college">
				<tr>
					<td><s:property value="#college.collegeNo" /></td>
					<td><s:property value="#college.collegeName" /></td>
				</tr>
			</s:iterator>
	</table>
	

</body>
</html>