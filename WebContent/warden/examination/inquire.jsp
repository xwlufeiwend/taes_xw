<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询结果页面</title>
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
	<!-- 在这做查询时报HTTP Status 500 - An exception occurred processing JSP page /warden/examination/inquire.jsp at line 21
		，这个错误的原因是examName这个字段不存在，要修改查询条件！
	 -->
		<s:form action="wardenexam_inquire" method="get" theme="simple" namespace="/warden">
					<div class="form-group col-xs-6">
						<input type="text" id="college.collegeName" name="college.collegeName" value="${model.college.collegeName }" class="form-control" placeholder="查询考试信息">
					</div>
					<button type="submit" class="btn btn-default">搜索</button>
		</s:form>
	<p>查询结果为</p>
	<table class="table-bordered col-xs-12">
		<tr>
		  <th>考试编号</th>
		  <th>考试学院</th>
		  <th>考试课程</th>
		  <th>考试人数</th>
		  <th>考试时间</th>
		  <th>编辑</th>
		  <th>删除</th>
		</tr>
		<s:iterator value="list" var="e">
			<tr>
			  <td><s:property value="#e.exNo"/></td>
			  <td><s:property value="#e.college.collegeName"/></td>
		  	  <td><s:property value="#e.courses.coursesName"/></td>
		  	  <td><s:property value="#e.studentNum"/></td>
			  <td><s:date name="#e.startYear" format="yyyy-MM"/></td>
			  <td><a href="wardenexam_modify.action?exId=<s:property value="#e.exId"/>">编辑</a></td>
		  	  <td><a href="wardenexam_delete.action?exId=<s:property value="#e.exId"/>">删除</a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>