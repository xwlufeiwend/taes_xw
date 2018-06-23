<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示所有学生信息</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
			p{
				text-align: center;
			}
			th{
				text-align: center;
			}
			td{
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
			<td>学院编号</td>
			<td>学院名称</td>
			<td align="center">编辑</td>
			<td align="center">删除</td>
		</tr>
		<s:iterator var="co" value="list">
		<tr>
			<td><s:property value="#co.collegeNo"/> </td>
			<td><s:property value="#co.collegeName"/></td>
			<td align="center"><a href="wardencollege_edit.action?collegeId=<s:property value="#co.collegeId"/>">修改</a></td>
			<td align="center"><a href="wardencollege_delete.action?collegeId=<s:property value="#co.collegeId"/>">删除</a></td>
		</tr>
		</s:iterator>
	</table>
	<br>
	<%-- <table class="table-bordered col-xs-6">
		<tr>
			<td>
				当前页数<s:property value="currPage"/>/总页数<s:property value="totalPage"/>
				&nbsp;&nbsp;&nbsp;
				总记录数：<s:property value="totalCount" />/每页显示：<s:property value="pageSize" />条
			</td>
		  <s:if test="currPage !=1">
		  	<td><a href="wardencollege_findAll.action?currPage=1">首页</a></td>
			<td><a href="wardencollege_findAll.action?currPage=<s:property value="currPage-1"/>">上一页</a></td>
		  </s:if>
		  <s:if test="currPage != totalPage">
			<td><a href="wardencollege_findAll.action?currPage=<s:property value="currPage+1"/>">下一页</a></td>
			<td><a href="wardencollege_findAll.action?currPage=<s:property value="totalPage"/>">尾页</a></td>
		  </s:if>
		</tr>
	</table> --%>
	<nav aria-label="Page navigation">
	<ul class="pager">
	   <s:if test="currPage != 1">
		<li><a href="wardencollege_show.action?currPage=1">首页</a></li>
		<li><a href="wardencollege_show.action?currPage=<s:property value="currPage-1"/>">上一页</a></li>
	   </s:if>
	   <s:if test="currPage != totalPage">	
		<li><a href="wardencollege_show.action?currPage=<s:property value="currPage+1"/>">下一页</a></li>
		<li><a href="wardencollege_show.action?currPage=<s:property value="totalPage"/>">尾页</a></li>
	   </s:if>
	</ul>
	</nav>
</body>
</html>