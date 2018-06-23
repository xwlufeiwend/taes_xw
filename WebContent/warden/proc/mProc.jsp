<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>班级管理</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
			body{
				padding-top: 70px;
			}
			.navbar{
				margin-bottom: -1px;
			}
</style>
</head>
<body>
	<!-- <p>显示所有班级信息<a href="wardenproc_findAll.action">显示</a></p> -->
<%-- 	<p>点击<a id="xianshi" href="wardenproc_findAll.action?currPage=1">显示</a><a href="wardenproc_findAll.action?currPage=0">关闭</a></p>
	<s:if test="currPage >= 1">
	<table>
		<tr>
			<td>班级编号</td>
			<td>班级名称</td>
			<td>所属院系</td>
			<td align="center">编辑</td>
			<td align="center">删除</td>
		</tr>			
		<s:iterator var="pc" value="list">
			<tr>
				<td><s:property value="#pc.pcNo"/> </td>
				<td><s:property value="#pc.pcName"/></td>
				<td><s:property value="#pc.college.collegeName"/></td>
				<td align="center"><a href="wardenproc_modify.action?pcId=<s:property value="#pc.pcId"/>">修改</a></td>
				<td align="center"><a href="wardenproc_delete.action?pcId=<s:property value="#pc.pcId"/>">删除</a></td>
			</tr>
		 </s:iterator>		
	</table>
	<table>
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
	</table>
	</s:if>
	<p>查询班级信息</p>
	<p>点击<a href="wardenproc_find.action">查询</a></p>
	<p>添加班级信息</p>
	<p>点击<a href="wardenproc_add.action">添加</a></p> --%>
	
	<!--导航栏-->
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" 
							class="navbar-toggle collapsed" 
							data-toggle="collapse" 
							data-target="#bs-example-navbar-collapse-2" 
							aria-expanded="false">
        					 <span class="sr-only">Toggle navigation</span>
        					 <span class="icon-bar"></span>
       						 <span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="../warden.jsp" target="_top">首页</a>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="#">管理班级
								<span class="sr-only">
									(current)
								</span>
							</a>
						</li>
						<li>
							<a href="wardenproc_findAll.action?currPage=1" target="brand">显示所有班级</a>
						</li>
						<li>
							<a href="wardenproc_add.action" target="brand">添加班级</a>
						</li>
						<li>
							<a href="#" target="brand">批量操作班级数据</a>
						</li>
					</ul>
					<s:form target="brand" class="navbar-form navbar-left" action="wardenproc_findByName" method="get" namespace="/warden" theme="simple">
						<div class="form-group">
							<input type="text" name="pcName" id="pcName" value="${model.pcName }" class="form-control" placeholder="查询班级">
						</div>
						<button type="submit" class="btn btn-default">查询</button>
					</s:form>
				</div>
			</div>
		</nav><!--nav标签结束-->
	
</body>
</html>