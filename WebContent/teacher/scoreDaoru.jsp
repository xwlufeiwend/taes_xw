<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成绩导入页面</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js" ></script>
<style type="text/css">
	p,th,td{text-align: center;}
</style>
<script type="text/javascript">
	
</script>
</head>
<body>
	<p>成绩录入</p>
	<s:form action="teacher_scoredaoru" namespace="/teacher" theme="simple" method="post">
		<table class="table-bordered col-xs-12">
			<tr>
				<th>学号</th>
				<th>姓名</th>
				<th>课程</th>
				<th>考试时间</th>
				<th>考试试卷</th>
				<th>分数</th>
			</tr>
			<tr>
				<td><input type="text" name="studentNo"></td>
				<td><input type="text" name="studentName"></td>
				<td>
					<s:select name="courses.coursesId" listKey="coursesId" listValue="课程名称" list="courses" headerKey="" headerValue="-选择课程-"></s:select>
				</td>
				<td><s:textfield type="date" name="startYear" format="yyyy-MM-dd"/></td>
				<td><input type="text" name="paperName"></td>
				<td><input type="text" name="actualScore"></td>
			</tr>
			<tr>
				<td colspan="6"><input type="submit" value="添加"></td>
			</tr>
		</table>
	</s:form>
</body>
</html>