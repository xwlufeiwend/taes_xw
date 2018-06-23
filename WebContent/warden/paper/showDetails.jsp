<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
	p,th,td{
		text-align: center;
	}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示细分</title>
</head>
<body>
	<p>细分显示</p>
	<s:if test="psd !=null">
		<table class="table-bordered col-xs-12">
		<tr>
			<th>试卷</th>
			<th>题目</th>
			<th>分值</th>
		</tr>
		<s:iterator value="psd" var="p">
		<tr>
			<td><s:property value="#p.paper.paperName"/></td>
			<td><s:property value="#p.title"/></td>
			<td><s:property value="#p.pScore"/></td>
		</tr>
		</s:iterator>
		
	</table>	
	</s:if>
	
</body>
</html>