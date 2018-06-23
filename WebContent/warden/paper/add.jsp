<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加试卷信息</title>
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
	<p>添加试卷信息</p>
	<s:form action="wardenpaper_addto" namespace="/warden" theme="simple" method="post">
		<table class="table-bordered col-xs-12">
			<tr>
				<th>试卷编号</th>
				<th>试卷名称</th>
				<th>课程</th>
				<th>满分值</th>
			</tr>
			<tr>
				<td><input type="text" name="paperNo"></td>
				<td><input type="text" name="paperName"></td>
				<td>
					<s:select name="courses.coursesId" list="coulist" listKey="coursesId" listValue="coursesName" headerKey="" headerValue="-选择课程-"></s:select>
				</td>
				<td><input type="text" name="fullScore"></td>
			</tr>
			<tr>
				<td colspan="8"><input type="submit" value="添加"></td>
			</tr>
		</table>
	</s:form>
</body>
</html>