<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生端课程查询界面</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
</head>
<body>
	<p>查询课程信息</p>
	<s:form class="form-horizontal" action="student_findCourses" method="get"
		namespace="/student">
		<div class="form-group">
			<label for="coursesName" class="col-sm-2 control-label">输入课程关键字</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" id="coursesName"
					name="coursesName" placeholder="课程名">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default">查询</button>
			</div>
		</div>
	</s:form>
</body>
</html>