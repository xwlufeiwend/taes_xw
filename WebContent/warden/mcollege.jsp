<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/warden/mcollege.js"></script>
<style>
.dialog-button{
text-align:center;
}
.textbox{
height:22px;    		
padding : 0 2px;
}
</style>
<table id="mcollege"></table>

<div id="college_tools" style="padding: 5px;">
		<div style="margin-bottom: 5px;">
			<a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-add" onclick="college_tool.add()">添加</a>
			<a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-edit" onclick="college_tool.edit()">修改</a>
			<a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-remove" onclick="college_tool.remove()">删除</a>
			<a id="save" href="#" class="easyui-linkbutton" plain="true" iconCls="icon-reload" onclick="college_tool.reload()">刷新</a>
			<a id="redo" href="#" class="easyui-linkbutton" plain="true" iconCls="icon-redo" onclick="college_tool.redo()">取消选择</a>
		</div>
		<div style="padding: 0 0 0 7px;">
			查询学院:<input class="textbox" type="text" name="keyword"/>
			<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="college_tool.search()">查询</a>
		</div>
</div>

<form id="college_add" style="margin: 0;padding: 5px 0 0 25px;color: #333;">
	<p>学院编号：<input class="textbox" name="collegeNo" id="collegeNo" type="text" style="width: 200px;"></p>
	<p>学院名称：<input class="textbox" name="collegeName" id="collegeName" type="text" style="width: 200px;"></p>
</form>
<form id="college_edit" style="margin: 0;padding: 5px 0 0 25px;color: #333;">
	<input class="textbox" name="collegeId_edit" type="text" style="width: 200px;">
	<p>学院编号：<input class="textbox" name="collegeNo_edit" id="collegeNo" type="text" style="width: 200px;"></p>
	<p>学院名称：<input class="textbox" name="collegeName_edit" id="collegeName" type="text" style="width: 200px;"></p>
</form>