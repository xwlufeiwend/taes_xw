/**
 * 学院管理
 */
$(function() {
	$('#mcollege').datagrid({
		title : '学院列表',
		url : 'showCollege.action',
		fitColumns : true,
		striped : true,
		pagination : true,
		pageNumber : 1,
		pageSize : 5,
		pageList : [5,10,15,20],
		sortName : 'collegeNo',
		sortOrder : 'ASC',
		remoteSort : true,
		rownumbers : true,
		toolbar : '#college_tools',
		border : false,
		
		columns : [[
			{
				title : '主键',
				field : 'collegeId',
				checkbox : true,
				width : 100,
				align : 'center',
				sortable : true,
			},
			{
				title : '编号',
				field : 'collegeNo',
				width : 100,
				align : 'center',
				sortable : true,
			},
			{
				title : '学院名称',
				field : 'collegeName',
				width : 100,
				align : 'center',
				sortable : true,
			}
		]],
		
		
	});
	//添加弹窗
	$('#college_add').dialog({
		width : 350,
		title : '新增学院',
		iconCls : 'icon-add',
		modal : true,
		closed : true,
		buttons : [{
			text : '添加',
			iconCls : 'icon-add',
			handler : function() {
				if ($('#college_add').form('validate')) {
					$.ajax({
						url : 'college_add.action',
						type : 'post',
						data : {
							collegeNo : $('input[name="collegeNo"]').val(),
							collegeName : $('input[name="collegeName"]').val(),
						},
						beforeSend : function() {
							$.messager.progress({
								text : '正在新增中。。。',
							});
						},
						success : function(data,response,status) {
							$.messager.progress('close');
							if (data>0) {
								$.messager.show({
									title : '提示',
									msg : '添加学院成功！',
								});
								$('#college_add').dialog('close').form('reset');
								$('#mcollege').datagrid('reload');
							}else {
								$.messager.alert('新增失败！','未知错误！请重试','warning');
							}
						}
					});
				}
			},
		},{
			text : '取消',
			iconCls : 'icon-redo',
			handler : function() {
				$('#college_add').dialog('close').form('reset');
			},
		}]
	});
	//编辑弹窗
	$('#college_edit').dialog({
		width : 350,
		title : '编辑管理',
		iconCls : 'icon-edit',
		modal : true,
		closed : true,
		buttons : [{
			text : '修改',
			iconCls : 'icon-edit',
			handler : function() {
				if ($('#college_edit').form('validate')) {
					$.ajax({
						url : 'college_update.action',
						type : 'post',
						data : {
							collegeId : $('input[name="collegeId_edit"]').val(),
							collegeNo : $('input[name="collegeNo_edit"]').val(),
							collegeName : $('input[name="collegeName_edit"]').val(),
						},
						beforeSend : function() {
							$.messager.progress({
								text : '正在修改中。。。',
							});
						},
						success : function(data,response,status) {
							$.messager.progress('close');
							if (data>0) {
								$.messager.show({
									title : '提示',
									msg : '修改学院信息成功！',
								});
								$('#college_edit').dialog('close').form('reset');
								$('#mcollege').datagrid('reload');
							}else {
								$.messager.alert('修改失败！','未知错误！请重试','warning');
							}
						}
					
					});
				}
			},
		},{
			text : '取消',
			iconCls : 'icon-redo',
			handler : function() {
				$('#college_edit').dialog('close').form('reset');
			},
		}]
	});
	
	//编号验证
	$('input[name="collegeNo"]').validatebox({
		required : true,
		validType : 'length[3,6]',
		missingMessage : '请输入学院编号',
		invalidMessage : '账号在3~6位',
	});
	$('input[name="collegeNo_edit"]').validatebox({
		required : true,
		validType : 'length[3,6]',
		missingMessage : '请输入学院编号',
		invalidMessage : '账号在3~6位',
	});
	//姓名验证
	$('input[name="collegeName"]').validatebox({
		required : true,
		missingMessage : '请输入学院名称',
	});
	
	//查询提示
	$('input[name="keyword"]').validatebox({
		required : true,
		missingMessage : '请输入学院关键字',
	});
	
	//全局变量
	college_tool = {
			reload : function() {
				$('#mcollege').datagrid('reload');
			},
			redo : function() {
				$('#mcollege').datagrid('unselectAll');
			},
				
			search : function() {
				//alert($('input[name="keyword"]').val());
				$('#mcollege').datagrid('load',{
					collegeName : $.trim($('input[name="keyword"]').val()),
				});
			},
			add : function() {
				$('#college_add').dialog('open');
				$('input[name="collegeNo"]').focus();
			},
			edit : function(){
				var rows = $('#mcollege').datagrid('getSelections');
				//alert(rows.length);
				if (rows.length>1) {
					$.messager.alert('警告','编辑时只能选择一条进行修改！','waring');
				}else if (rows.length == 0) {
					$.messager.alert('警告','请选择一条记录进行编辑！','waring');
				} else if(rows.length == 1){
					//alert(rows[0].collegeId);
					$.ajax({
						url : 'college_edit.action',
						type : 'post',
						data : {
							collegeId : rows[0].collegeId,
						},
						beforeSend : function() {
							$.messager.progress({
								text : '正在请求中。。。',
							});
						},
						success : function(data,response,status) {
							$.messager.progress('close');
							if (data) {
								//console.log(data);
								
								$('#college_edit').form('load',{
									collegeId_edit : data.collegeId,
									collegeNo_edit : data.collegeNo,
									collegeName_edit : data.collegeName,
								}).dialog('open');
							}else {
								$.messager.alert('修改失败！','未知错误！请重试','warning');
							}
						}
					
					});
				}
			},
			
			remove : function() {
				var rows = $('#mcollege').datagrid('getSelections');
				if (rows.length>0) {
					$.messager.confirm('确定操作','确认删除这些数据？',function(flag){
						if (flag) {
							var ids=[];
							for (var i = 0; i < rows.length; i++) {
								ids.push(rows[i].collegeId);
							}
							//console.log(ids.join(','));
							//以ajax方式提交给后台删除所选记录
							$.ajax({
								url : 'college_delete.action',
								type : 'POST',
								data : {
									ids : ids.join(','),
								},
								dataType : 'text',
								//传递之前
								beforeSend : function() {
									$('#mcollege').datagrid('loading');
								},
								
								success : function(data) {
									if (data) {
										//alert(data);
										$('#mcollege').datagrid('loaded');
										$('#mcollege').datagrid('load');
										$('#mcollege').datagrid('unselectAll');
										$.messager.show({
											title : '提示',
											msg : data + '个学院被删除！',
										});
									}
								}
							});
						}
					});
				}else {
					$.messager.alert('提示','请选择要删除的学院','info');
				}
			},
	};
	
	
});

