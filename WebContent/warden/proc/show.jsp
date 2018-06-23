<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示所有班级信息</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet"/>
<style type="text/css">
	td,p {
	text-align: center;
}
</style>
</head>
<body>
<p>当前页数<s:property value="currPage"/>/总页数<s:property value="totalPage"/>
				&nbsp;&nbsp;&nbsp;
				总记录数：<s:property value="totalCount" />/每页显示：<s:property value="pageSize" />条</p>
<table class="table-bordered col-xs-12">
		<tr>
			<td>班级编号</td>
			<td>班级名称</td>
			<td>所属院系</td>
			<td>编辑</td>
			<td>删除</td>
		</tr>			
		<s:iterator var="pc" value="list">
			<tr>
				<td><s:property value="#pc.pcNo"/> </td>
				<td><s:property value="#pc.pcName"/></td>
				<td><s:property value="#pc.college.collegeName"/></td>
				<td><a href="wardenproc_modify.action?pcId=<s:property value="#pc.pcId"/>">修改</a></td>
				<td><a href="wardenproc_delete.action?pcId=<s:property value="#pc.pcId"/>">删除</a></td>
			</tr>
		 </s:iterator>		
	</table>
	<nav aria-label="Page navigation">
	<ul class="pager">
	   <s:if test="currPage != 1">
		<li><a href="wardenproc_show.action?currPage=1">首页</a></li>
		<li><a href="wardenproc_show.action?currPage=<s:property value="currPage-1"/>">上一页</a></li>
	   </s:if>
	   <s:if test="currPage != totalPage">	
		<li><a href="wardenproc_show.action?currPage=<s:property value="currPage+1"/>">下一页</a></li>
		<li><a href="wardenproc_show.action?currPage=<s:property value="totalPage"/>">尾页</a></li>
	   </s:if>
	</ul>
	</nav>
	<%-- <table>
		<tr>
			<td>
				当前页数<s:property value="currPage"/>/总页数<s:property value="totalPage"/>
				&nbsp;&nbsp;&nbsp;
				总记录数：<s:property value="totalCount" />/每页显示：<s:property value="pageSize" />条
			</td>
		  <s:if test="currPage !=1">
		  	<td><a href="wardenproc_findAll.action?currPage=1">首页</a></td>
			<td><a href="wardenproc_findAll.action?currPage=<s:property value="currPage-1"/>">上一页</a></td>
		  </s:if>
		  <s:if test="currPage != totalPage">
			<td><a href="wardenproc_findAll.action?currPage=<s:property value="currPage+1"/>">下一页</a></td>
			<td><a href="wardenproc_findAll.action?currPage=<s:property value="totalPage"/>">尾页</a></td>
		  </s:if>
		</tr>
	</table> --%>
</body>

</html>