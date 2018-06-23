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
	<p>显示所有试卷信息</p>
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
			<th>试卷编号</th>
			<th>试卷名称</th>
			<th>课程</th>
			<th>满分值</th>
			<th>编辑</th>
			<th>删除</th>
			<th>添加试卷详细分值</th>
			<th>查看试卷细分值</th>
		</tr>
		<s:iterator var="p" value="list">
			<tr>
				<td><s:property value="#p.paperNo"/></td>
				<td><s:property value="#p.paperName"/></td>
				<td><s:property value="#p.courses.coursesName"/></td>
				<td><s:property value="#p.fullScore"/></td>
				<td><a href="wardenpaper_modify.action?paperId=<s:property value="#p.paperId"/>">编辑</a></td>
				<td><a href="wardenpaper_delete.action?paperId=<s:property value="#p.paperId"/>">删除</a></td>
				<td><a href="paper_addDetails.action?paperId=<s:property value="#p.paperId"/>">添加</a></td>
				<td><a href="paper_showDetails.action?paperId=<s:property value="#p.paperId"/>">查看</a></td>
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