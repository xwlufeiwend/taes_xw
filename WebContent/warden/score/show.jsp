<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示所有试卷信息</title>
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
	<p>显示所有成绩</p>
	<p>当前页数
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
			<th>学号</th>
			<th>姓名</th>
			<th>参加的考试</th>
			<th>考试课程</th>
			<th>考试的试卷</th>
			<th>得分</th>
			<th>大题分数串</th>
			<th>小题分数串</th>
			<th>编辑</th>
			<th>删除</th>
		</tr>
		<s:iterator var="s" value="list">
			<tr>
				<td><s:property value="#s.student.studentNo"/></td>
				<td><s:property value="#s.student.studentName"/></td>
				<td><s:property value="#s.examination.examName"/></td>
				<td><s:property value="#s.courses.coursesName"/></td>
				<td><s:property value="#s.paper.paperName"/></td>
				<td><s:property value="#s.actualScore"/></td>
				<td><s:property value="#s.actualBScore"/></td>
				<td><s:property value="#s.actualSScore"/></td>
				<td><a href="wardenpaper_modify.action?paperId=<s:property value="#p.paperId"/>">编辑</a></td>
				<td><a href="wardenpaper_delete.action?paperId=<s:property value="#p.paperId"/>">删除</a></td>
			</tr>	
		</s:iterator>
	</table>
	<!-- 分页导航条 -->
	<nav aria-label="Page navigation">
	<ul class="pager">
		<s:if test="currPage != 1">
			<li><a href="wardenpaper_show.action?currPage=1">首页</a></li>
			<li><a
				href="wardenpaper_show.action?currPage=<s:property value="currPage-1"/>">上一页</a></li>
		</s:if>
		<s:if test="currPage != totalPage">
			<li><a
				href="wardenpaper_show.action?currPage=<s:property value="currPage+1"/>">下一页</a></li>
			<li><a
				href="wardenpaper_show.action?currPage=<s:property value="totalPage"/>">尾页</a></li>
		</s:if>
	</ul>
	</nav>
</body>
</html>