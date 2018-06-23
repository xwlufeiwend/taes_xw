<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示试卷信息</title>
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
	<p><a href="javascript:history.go(-1)">返回</a></p>
	<table class="table-bordered col-xs-12">
		<tr>
			<th>试卷编号</th>
			<th>试卷名称</th>
			<th>课程</th>
			<th>满分值</th>
			<th>查看试卷构成</th>
		</tr>
		<s:iterator value="paper" var="p">
			<tr>
				<td><s:property value="#p.paperNo"/></td>
				<td><s:property value="#p.paperName"/></td>
				<td><s:property value="#p.courses.coursesName"/></td>
				<td><s:property value="#p.fullScore"/></td>
				<td><a href="paper_showDetails.action?paperId=<s:property value="#p.paperId"/>">构成</a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>