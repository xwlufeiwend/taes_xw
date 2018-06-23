<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询结果显示界面</title>
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
	<s:form action="wardenpaper_inquire" method="get" theme="simple"
		namespace="/warden">
		<div class="form-group col-xs-6">
			<input type="text" id="paperName" name="paperName"
				value="${model.paperName }" class="form-control"
				placeholder="查询试卷信息">
		</div>
		<button type="submit" class="btn btn-default">搜索</button>
	</s:form>
	<table class="table-bordered col-xs-12">
		<s:if test="">
		<tr>
			<th colspan="6">显示查询结果</th>
		</tr>
		<tr>
			<th>试卷编号</th>
			<th>试卷名称</th>
			<th>课程</th>
			<th>满分值</th>
			<th>编辑</th>
			<th>删除</th>
		</tr>
		</s:if>
		<s:iterator var="p" value="list">
			<tr>
				<td><s:property value="#p.paperNo" /></td>
				<td><s:property value="#p.paperName" /></td>
				<td><s:property value="#p.courses.coursesName" /></td>
				<td><s:property value="#p.fullScore" /></td>
				<td><a
					href="wardenpaper_modify.action?paperId=<s:property value="#p.paperId"/>">编辑</a></td>
				<td><a
					href="wardenpaper_delete.action?paperId=<s:property value="#p.paperId"/>">删除</a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>