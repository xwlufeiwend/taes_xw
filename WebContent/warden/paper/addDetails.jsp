<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加该试卷的详细分数</title>
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
	<s:actionmessage/>
	<s:form action="paper_addDto" method="post" namespace="/warden" theme="simple">
		<table class="table-bordered col-xs-12">
			<tr>
				<th>试卷Id</th>
				<th>题目</th>
				<th>分值</th>
			</tr>
			<tr>
				<td><input type="text" name="paper.paperId" value="${paper.paperId }" readonly="readonly"></td>
				<td><input type="text" name="title"></td>
				<td><input type="text" name="pScore"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="添加"></td>
			</tr>
		</table>
	</s:form>
</body>
</html>