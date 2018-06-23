<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息添加</title>
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">

	
</script>
</head>
<body>
	<p>添加学生信息</p><p><a href="javascript:history.go(-1)">返回</a></p>
	<s:form action="wardenstu_findProc" method="post" namespace="/warden">
		<table>
			<tr>
				<td>确认院系：</td>
				<td>
					<s:select id="college" name="college.collegeId" list="clist" listKey="collegeId" listValue="collegeName" headerKey=""  headerValue="--选择好学院--"></s:select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="提交"></td>	
			</tr>
		</table>
	</s:form>
</body>
</html>