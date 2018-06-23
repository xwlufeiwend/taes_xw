<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
<style type="text/css">
	p{
		text-align: center;
	}
</style>
</head>
<body>
	<p>密码修改</p><p><a href="javascript:history.go(-1)">返回</a></p>
	<p><s:actionerror/></p>
	<s:form class="form-horizontal" action="teacher_uPwd" method="post"
		namespace="/teacher">
		<s:hidden name="teacherId" value="%{teacher.teacherId}"/>
		<s:hidden name="teacherNo" value="%{teacher.teacherNo}"/>
		<s:hidden name="teacherName" value="%{teacher.teacherName}"/>
		<s:hidden name="college.collegeId" value="%{teacher.college.collegeId}"/>
		<div class="form-group">
			<label for="password" class="col-sm-2 control-label">密码</label>
			<div class="col-sm-6">
				<input type="password" class="form-control" id="password" name="password"
					placeholder="密码">
			</div>
		</div>
		<div class="form-group">
			<label for="password" class="col-sm-2 control-label">确认密码</label>
			<div class="col-sm-6">
				<input type="password" class="form-control" id="password1" name="password1"
					placeholder="确认密码">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default">修改</button>
			</div>
		</div>
	</s:form>
</body>
</html>