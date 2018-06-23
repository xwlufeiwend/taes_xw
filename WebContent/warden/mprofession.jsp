<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/warden/mprofession.js"></script>
<style>
.dialog-button{
text-align:center;
}
.textbox{
height:22px;    		
padding : 0 2px;
}
</style>
<table id="mprofession"></table>

<div id="profession_tools" style="padding: 5px;">
		<div style="margin-bottom: 5px;">
			<a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-add" onclick="profession_tool.add()">添加</a>
			<a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-edit" onclick="profession_tool.edit()">修改</a>
			<a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-remove" onclick="profession_tool.remove()">删除</a>
			<a id="save" href="#" class="easyui-linkbutton" plain="true" iconCls="icon-reload" onclick="profession_tool.reload()">刷新</a>
			<a id="redo" href="#" class="easyui-linkbutton" plain="true" iconCls="icon-redo" onclick="profession_tool.redo()">取消选择</a>
		</div>
		<div style="padding: 0 0 0 7px;">
			查询专业:<input class="textbox" type="text" name="keyword"/>
			<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="profession_tool.search()">查询</a>
		</div>
</div>

<form id="profession_add" style="margin: 0;padding: 5px 0 0 25px;color: #333;">
	<p>专业编号：<input class="textbox" name="pNo" id="pNo" type="text" style="width: 200px;"></p>
	<p>专业名称：<input class="textbox" name="pName" id="pName" type="text" style="width: 200px;"></p>
	<p>所属学院：<input id="college" name="college" style="width: 200px;"></p>
</form>
<form id="profession_edit" style="margin: 0;padding: 5px 0 0 25px;color: #333;">
	<input class="textbox" name="pId_edit" type="text" style="width: 200px;">
	<p>专业编号：<input class="textbox" name="pNo_edit" id="pNo" type="text" style="width: 200px;"></p>
	<p>专业名称：<input class="textbox" name="pName_edit" id="pName" type="text" style="width: 200px;"></p>
	<p>所属学院：<input id="college_edit" name="college_edit" style="width: 200px;"></p>
</form>