<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改学生信息页面</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />

<script type="text/javascript">
function changeSelect(x){
	alert(x);
	$.ajax({
		type:"post",
		url:"JsonAction_findProc.action",//需要用来处理ajax请求的action，findProc为处理的方法
		data:{collegeId:x},//设置数据源
		dataType:"json",
		success:function(data){
			alert(data)
			//将数据转换成json数据类型，可以使用alert显示
			var d = eval("("+data+")");
			alert(d);
			$("#one").text(""+d.pcName+"");
			 /* var obj = $.parseJSON(data); //使用这个方法解析json
             var state_value = obj.result; //result是和action中定义的result变量的get方法对应的

             $.each(state_value, function(i, item) {
                 alert(item.pcName);
             }); */
		},
		error:function(data){
			alert("出现错误");
		}
	});	
}
	
	
</script>
<style type="text/css">
	p,td {
	text-align: center;
}
</style>
</head>
<body>
	<p>修改学生信息页面</p>
	<p><a href="javascript:history.go(-1)">返回</a></p>
	<s:form action="wardenstu_update" method="post" namespace="/warden" theme="simple">
	<s:hidden name="studentId" value="%{model.studentId}"/>
		<table class="table-bordered col-xs-12">
			<tr>
				<td>学号</td>
				<td><input type="text" name="studentNo" value="${model.studentNo}"></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" name="studentName" value="${model.studentName}"></td>
			</tr>
			<tr>
				<td>学制</td>
				<td><input type="text" name="academic" value="${model.academic}"></td>
			</tr>
			<tr>
				<td>入学日期</td>
				<td><input name="admissionDate" value="<s:date name="model.admissionDate" format="yyyy-MM-dd" />" /></td>
			</tr>
			<tr>
				<td>学院</td>
				<td><s:select name="college.collegeId" list="clist" value="%{model.college.collegeId}" listKey="collegeId" listValue="collegeName" headerKey="" headerValue="--请选择学院--" onchange="changeSelect(this.value)"></s:select></td>
			</tr>
			<tr>
				<td>班级</td>
				<td><%-- <s:select name="professionalClass.pcId" list="plist" value="%{model.professionalClass.pcId}" listKey="pcId" listValue="pcName" headerKey="" headerValue="--请选择班级--"></s:select> --%>
					<select id="pcSelect" >
						<option selected="selected">${model.professionalClass.pcName}</option>
						<option id="one"></option>
					</select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="修改"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</s:form>
</body>
</html>