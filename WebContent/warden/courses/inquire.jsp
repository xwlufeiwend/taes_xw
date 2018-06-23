<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询页面</title>
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
	<!-- 课程的查询结果，明天做 -->
	<p>显示查询结果</p>
	<s:form action="wardencour_inquire" method="get" namespace="/warden"
				theme="simple">
				<div class="form-group col-xs-6">
					<input type="text" name="coursesName" id="coursesName"
						value="${model.coursesName }" class="form-control" placeholder="查询课程">
				</div>
				<button type="submit" class="btn btn-default">查询</button>
			</s:form>
	
	<table class="table-bordered col-xs-12">
		<s:if test="list != null">
	
		<tr>
		  <th>课程号</th>
		  <th>课程名</th>
		  <th>学分</th>
		  <th>任课教师</th>
		  <th>编辑</th>
		  <th>删除</th>
		</tr>
		</s:if>
		<s:iterator var="c" value="list">
		  <tr>
		    <td><s:property value="#c.coursesNo"/></td>
		    <td><s:property value="#c.coursesName"/></td>
		    <td><s:property value="#c.credits"/></td>
		    <td><s:property value="#c.teacher.teacherName"/></td>
		    <td><a href="wardencour_modify.action?coursesId=<s:property value="#c.coursesId"/>">编辑</a></td>
		    <td><a href="wardencour_delete.action?coursesId=<s:property value="#c.coursesId"/>">删除</a></td>
		  </tr>
		</s:iterator>
		 
	</table>
</body>
</html>