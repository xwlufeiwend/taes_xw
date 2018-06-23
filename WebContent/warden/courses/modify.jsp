<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改课程信息页面</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
	p,th,td {
	text-align: center;
}
</style>
</head>
<body>
	<p>修改课程信息</p>
	<s:form action="wardencour_update" method="post" namespace="/warden" theme="simple">
		<s:hidden name="coursesId" value="%{model.coursesId}"/>
		<table class="table-bordered col-xs-12">
			<tr>
				<th>课程编号</th>
				<th>课程名称</th>
				<th>学分</th>
				<th>任课教师</th>
			</tr>
			<tr>
				<td><s:textfield name="coursesNo" value="%{model.coursesNo }"/> </td>
				<td><s:textfield name="coursesName" value="%{model.coursesName }"/> </td>
				<td><s:textfield name="credits" value="%{model.credits}"/> </td>
				<td>
					<s:select name="teacher.teacherId" listKey="teacherId" listValue="teacherName" value="model.teacher.teacherId" headerKey="" headerValue="--选择授课教师--" list="tlist"></s:select>
				</td>
			</tr>
			<tr>
				<td colspan="4"><input type="submit" value="修改"></td>
			</tr>
		</table>
	</s:form>
</body>
</html>