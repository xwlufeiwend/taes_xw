<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/warden/mteacher.js"></script>
<style>
.dialog-button{
text-align:center;
}
.textbox{
height:22px;    		
padding : 0 2px;
}
</style>
<table id="mteacher"></table>

<div id="teacher_tools" style="padding: 5px;">
		<div style="margin-bottom: 5px;">
			<a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-add" onclick="teacher_tool.add()">添加</a>
			<a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-edit" onclick="teacher_tool.edit()">修改</a>
			<a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-remove" onclick="teacher_tool.remove()">删除</a>
			<a id="save" href="#" class="easyui-linkbutton" plain="true" iconCls="icon-reload" onclick="teacher_tool.reload()">刷新</a>
			<a id="redo" href="#" class="easyui-linkbutton" plain="true" iconCls="icon-redo" onclick="teacher_tool.redo()">取消选择</a>
		</div>
		<div style="padding: 0 0 0 7px;">
			查询教师:<input class="textbox" type="text" name="keyword"/>
			<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="teacher_tool.search()">查询</a>
		</div>
</div>

<form id="teacher_add" style="margin: 0;padding: 5px 0 0 25px;color: #333;">
	<p>编号：<input class="textbox" name="teacherNo" id="teacherNo" type="text" style="width: 200px;"></p>
	<p>姓名：<input class="textbox" name="teacherName" id="teacherName" type="text" style="width: 200px;"></p>
	<p>专业：<input id="profession" name="profession" style="width: 200px;"></p>
</form>
<form id="teacher_edit" style="margin: 0;padding: 5px 0 0 25px;color: #333;">
	<input class="textbox" name="teacherId_edit" type="text" style="width: 200px;">
	<p>编号：<input class="textbox" name="teacherNo_edit" id="teacherNo" type="text" style="width: 200px;"></p>
	<p>姓名：<input class="textbox" name="teacherName_edit" id="teacherName" type="text" style="width: 200px;"></p>
	<p>专业：<input id="profession_edit" name="profession_edit" style="width: 200px;"></p>
</form>