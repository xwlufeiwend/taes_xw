<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询专业班级</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
	p,th,td{
		text-align: center;
	}
</style>
</head>
<body>
	<p>查询专业班级信息</p>
	<!-- 通过专业班级名查询 -->
	<s:form action="wardenproc_findByName" method="get" namespace="/warden">
		<!-- 使用$符可以保留需要查询的名字 需要加载模型驱动 -->
		请输入专业班级名称：<input type="text" name="pcName" id="pcName" value="${model.pcName }" placholder="请输入班级名称"/>
		<input type="submit" value="查询"/>
	</s:form>
	<table class="table-bordered col-xs-12">
		<s:if test="pList != null">
			<tr>
				<th>班级信息</th>
			</tr>
			<tr>
			<th>班级代号</th>
			<th>班级名称</th>
			<th>所属学院</th>
			<th>修改</th>
			<th>删除</th>
		</tr>
		</s:if>
		
		<s:iterator var="pList" value="pList">
		<tr>
			<td><s:property value="#pList.pcNo"/></td>
			<td><s:property value="#pList.pcName"/></td>
			<td><s:property value="#pList.college.collegeName"/></td>
			<td><a href="wardenproc_modify.action?pcId=<s:property value="#pList.pcId"/>">修改</a></td>
			<td><a href="wardenproc_delete.action?pcId=<s:property value="#pList.pcId"/>">删除</a></td>
		</tr>
		</s:iterator>
	</table>
	
</body>
</html>