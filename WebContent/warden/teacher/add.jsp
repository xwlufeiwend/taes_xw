<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加教师信息</title>
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
	<p>添加教师信息</p><p><a href="javascript:history.go(-1)">返回</a></p>
	<s:form action="wardentea_addto" method="post" namespace="/warden" theme="simple">
		<table class="table-bordered col-xs-12">
			<tr>
				<td>教师编号</td>
				<td><input type="text" name="teacherNo"></td>
			</tr>
			<tr>
				<td>教师姓名</td>
				<td><input type="text" name="teacherName"></td>
			</tr>
			<tr>
				<td>院系</td>
				<td>
					<s:select id="college" name="college.collegeId" list="clist" listKey="collegeId" listValue="collegeName" headerKey=""  headerValue="--选择好学院--" value="%{model.college.collegeId}"></s:select>		
				</td>
			</tr>
			<tr>
				<td>登录密码</td>
				<td><input type="password" name="password" value="teacher"></td>
			</tr>
			<tr>
				<td colspan="2"><button class="but-default" type="submit">添加</button></td>
			</tr>
		</table>
	</s:form>
</body>
</html>