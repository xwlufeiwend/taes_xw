<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改考试信息页面</title>
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
	<!-- 在使用s标签时，我去修改考试信息出现错误，并没有修改成功，并出现404错误
		在将标签s改为<input>标签代替时错误消失，并修改成功。
	 -->
	<p>修改考试信息</p>
	<s:form action="wardenexam_update" name="update" method="post"
		namespace="/warden" theme="simple">
		<s:hidden name="exId" value="%{model.exId}" />
		<table class="table-bordered col-xs-12">
			<tr>
				<th>考试编号</th>
				<th>考试学院</th>
				<th>考试课程</th>
				<th>考试人数</th>
				<th>考试时间</th>
			</tr>
			<tr>
				<td><input type="text" name="exNo" value="${model.exNo }"></td>
				<td><s:select name="college.collegeId"
						value="%{model.college.collegeId}" list="colleges"
						listKey="collegeId" listValue="collegeName" headerKey=""
						headerValue="-选择学院-"></s:select></td>
				<td><s:select name="courses.coursesId"
						value="%{model.courses.coursesId}" list="coursess"
						listKey="coursesId" listValue="coursesName" headerKey=""
						headerValue="-考试课程-"></s:select></td>
				<td><input type="text" name="studentNum"
					value="${model.studentNum }" /></td>

				<td><input type="date" name="startYear"
					value="<s:date name="model.startYear" format="yyyy-MM-dd"/>" /></td>
				</tr>
			<tr>
				<td colspan="8"><input type="submit" value="修改"></td>
			</tr>
		</table>
	</s:form>
</body>
</html>