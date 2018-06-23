<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示所有考试信息</title>
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
	<p>显示所有考试信息</p>
	<p> 当前页数
		<s:property value="currPage" />
		/总页数
		<s:property value="totalPage" />
		&nbsp;&nbsp;&nbsp; 总记录数：
		<s:property value="totalCount" />
		/每页显示：
		<s:property value="pageSize" />
		条</p>
	<table class="table-bordered col-xs-12">
		<tr>
		  <th>考试编号</th>
		  <th>考试名称</th>
		  <th>考试学院</th>
		  <th>考试课程</th>
		  <th>考试人数</th>
		  <th>开始学年</th>
		  <th>终止学年</th>
		</tr>
		<s:iterator value="list" var="e">
		  <tr>
		  	<td><s:property value="#e.exNo"/></td>
		  	<td><s:property value="#e.examName"/></td>
		  	<td><s:property value="#e.college.collegeName"/></td>
		  	<td><s:property value="#e.courses.coursesName"/></td>
		  	<td><s:property value="#e.studentNum"/></td>
		  	<td><s:date name="#e.startYear" format="yyyy-MM"/></td>
		  	<td><s:date name="#e.endYear" format="yyyy-MM"/></td>
		  </tr>
		</s:iterator>
	</table>
	<!-- 分页导航栏 -->
	<nav aria-label="Page navigation">
	<ul class="pager">
		<s:if test="currPage != 1">
			<li><a href="teacher_examShow.action?currPage=1">首页</a></li>
			<li><a
				href="teacher_examShow.action?currPage=<s:property value="currPage-1"/>">上一页</a></li>
		</s:if>
		<s:if test="currPage != totalPage">
			<li><a
				href="teacher_examShow.action?currPage=<s:property value="currPage+1"/>">下一页</a></li>
			<li><a
				href="teacher_examShow.action?currPage=<s:property value="totalPage"/>">尾页</a></li>
		</s:if>
	</ul>
	</nav>
</body>
</html>