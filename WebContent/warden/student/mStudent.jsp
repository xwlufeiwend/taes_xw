<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生管理页面</title>
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
							<a href="#">学生管理
								<span class="sr-only">
									(current)
								</span>
							</a>
						</li>
						<li>
							<a href="wardenstu_findAll.action?currPage=1" target="brand">显示所有学生</a>
						</li>
						<li>
							<a href="wardenstu_add.action" target="brand">添加学生信息</a>
						</li>
						<li>
							<a href="#" target="brand">查询学生分数</a>
						</li>
						<li>
							<a href="#" target="brand">查询学生选课信息</a>
						</li>
					</ul>
					<s:form  class="navbar-form navbar-left" action="wardenstu_inquireto" method="get" name="form1" namespace="/warden" theme="simple">
						<div class="form-group">
							<input type="text" name="studentNo" id="studentNo" value="${model.studentNo }" class="form-control" placeholder="查询班级">
						</div>
						<button type="submit" class="btn btn-default">查询</button>
					</s:form>
				</div>
			</div>
		</nav><!--nav标签结束-->
	<%-- <p>管理学生界面</p>
	<p>显示所有已存在的学生<a href="wardenstu_findAll.action?currPage=1">显示所有</a>
		<a href="wardenstu_findAll.action?currPage=0">关闭</a>
	</p>
	<s:if test="currPage>=1">
	<table>
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>学制</th>
			<th>入学日期</th>
			<th>专业班级</th>
			<th>学院</th>
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
	<table>
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
	</table>
	</s:if>
	<p>查询学生信息<a href="wardenstu_inquire.action">跳转到查询页面</a></p>
	<p>添加学生信息<a href="wardenstu_add.action">跳转到添加页面</a></p> --%>
</body>
</html>