<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示所有学生信息</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css"/>
<style type="text/css">
	p,th,td{
		text-align: center;
	}
</style>
</head>
<body>
	<p>当前页:<s:property value="currPage"/>/总页数<s:property value="totalPage"/>&nbsp;&nbsp;
			总数据条数：<s:property value="totalCount"/></p>
	<table class="table-bordered col-xs-12">
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>学制</th>
			<th>入学日期</th>
			<th>专业班级</th>
			<th>学院</th>
			<th>编辑</th>
			<th>删除</th>
		</tr>
		<s:iterator var="st" value="list">
			<tr>
				<td><s:property value="#st.studentNo"/> </td>
				<td><s:property value="#st.studentName"/></td>
				<td><s:property value="#st.academic"/></td>
				<td><s:date name="#st.admissionDate" format="yyyy-MM-dd"/></td>
				<td><s:property value="#st.professionalClass.pcName"/> </td>
				<td><s:property value="#st.college.collegeName"/></td>
				<td><a href="wardenstu_edit.action?studentId=<s:property value="#st.studentId" />">编辑</a></td>
				<td><a href="wardenstu_delete.action?studentId=<s:property value="#st.studentId" />">删除</a></td>
			</tr>
		</s:iterator>
	</table>
	<nav aria-label="Page navigation">
	<ul class="pager">
	   <s:if test="currPage != 1">
		<li><a href="wardenstu_show.action?currPage=1">首页</a></li>
		<li><a href="wardenstu_show.action?currPage=<s:property value="currPage-1"/>">上一页</a></li>
	   </s:if>
	   <s:if test="currPage != totalPage">	
		<li><a href="wardenstu_show.action?currPage=<s:property value="currPage+1"/>">下一页</a></li>
		<li><a href="wardenstu_show.action?currPage=<s:property value="totalPage"/>">尾页</a></li>
	   </s:if>
	</ul>
	</nav>
	<%-- <table>
		<tr>
			<td>当前页:<s:property value="currPage"/>/总页数<s:property value="totalPage"/></td>
			<td>总数据条数：<s:property value="totalCount"/></td>
			<s:if test="currPage > 1">
				<td><a href="wardenstu_findAll.action?currPage=1">首页</a></td>
				<td><a href="wardenstu_findAll.action?currPage=<s:property value="currPage-1"/>">上一页</a></td>
			</s:if>
			<s:if test="currPage < totalPage">
				<td><a href="wardenstu_findAll.action?currPage=<s:property value="currPage+1"/>">下一页</a></td>
				<td><a href="wardenstu_findAll.action?currPage=<s:property value="totalPage"/>">尾页</a></td>
			</s:if>
		</tr>
	</table> --%>
</body>
</html>