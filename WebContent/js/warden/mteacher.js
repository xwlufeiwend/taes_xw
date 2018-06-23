/**
 * 教师
 */
$(function() {
	teacher_tool = {
		reload : function() {
			$('#mteacher').datagrid('reload');
		},
		redo : function() {
			$('#mteacher').datagrid('unselectAll');
		},
			
		search : function() {
			alert($('input[name="keyword"]').val());
			$('#mteacher').datagrid('load',{
				teacherName : $.trim($('input[name="keyword"]').val()),
			});
		},
		add : function() {
			$('#teacher_add').dialog('open');
			$('input[name="teacherNo"]').focus();
			//专业下拉框
			$('#profession').combobox({
				valueField : 'professionId',
				textField : 'professionName',
				url : 'teacher_getProfessionName.action',
				width : 200,
				panelHeight : 200,
				required : true,
				missingMessage : '请选择专业',
				editable : true,
			});
		},
		edit : function(){
			var rows = $('#mteacher').datagrid('getSelections');
			console.log(rows);
			if (rows.length>1) {
				$.messager.alert('警告','编辑时只能选择一条进行修改！','waring');
			}else if (rows.length == 0) {
				$.messager.alert('警告','请选择一条记录进行编辑！','waring');
			} else if(rows.length == 1){
				$('#profession_edit').combobox({
					valueField : 'professionId',
					textField : 'professionName',
					url : 'teacher_getProfessionName.action',
					width : 200,
					panelHeight : 200,
					required : true,
					missingMessage : '请选择专业',
					editable : true,
				});
				//alert(rows[0].teacherId);
				$.ajax({
					url : 'teacher_edit.action',
					type : 'post',
					data : {
						teacherId : rows[0].teacherId,
					},
					beforeSend : function() {
						$.messager.progress({
							text : '正在请求中。。。',
						});
					},
					success : function(data,response,status) {
						$.messager.progress('close');
						if (data) {
							console.log(data);
							
							$('#teacher_edit').form('load',{
								teacherId_edit : data.teacherId,
								teacherNo_edit : data.teacherNo,
								teacherName_edit : data.teacherName,
								profession_edit : data.profession,
								
							}).dialog('open');
						}else {
							$.messager.alert('请求失败！','未知错误！请重试','warning');
						}
					}
				
				});
				
				
			}
		},
		
		remove : function() {
			var rows = $('#mteacher').datagrid('getSelections');
			if (rows.length>0) {
				$.messager.confirm('确定操作','确认删除这些数据？',function(flag){
					if (flag) {
						var ids=[];
						for (var i = 0; i < rows.length; i++) {
							ids.push(rows[i].teacherId);
						}
						//console.log(ids.join(','));
						//以ajax方式提交给后台删除所选记录
						$.ajax({
							url : 'teacher_delete.action',
							type : 'POST',
							data : {
								ids : ids.join(','),
							},
							dataType : 'text',
							//传递之前
							beforeSend : function() {
								$('#mteacher').datagrid('loading');
							},
							
							success : function(data) {
								if (data) {
									//alert(data);
									$('#mteacher').datagrid('loaded');
									$('#mteacher').datagrid('load');
									$('#mteacher').datagrid('unselectAll');
									$.messager.show({
										title : '提示',
										msg : data + '个教师被删除！',
									});
								}
							}
						});
					}
				});
			}else {
				$.messager.alert('提示','请选择要删除的数据','info');
			}
		}	
	};
	
	
	
	$('#mteacher').datagrid({
		title : '教师员列表',
		url : 'showTeacher.action',
		fitColumns : true,
		border : false,
		rownumbers : true,
		columns : [[
			{
				title : '主键',
				field : 'teacherId',
				width : 100,
				sortable : true,
				checkbox : true,
				align : 'center'
			},
			{
				title : '教师编号',
				field : 'teacherNo',
				width : 100,
				sortable : true,
				align : 'center'
			},
			{
				title : '教师名称',
				field : 'teacherName',
				width : 100,
				sortable : true,
				align : 'center'
			},
			{
				title : '专业',
				field : 'profession',
				width : 100,
				align : 'center',
				formatter : function(index ,row ,value) {
					return row.profession.professionName;
				}
			}
		]],
		
		pagination : true,
		pageNumber : 1,
		pageSize : 5,
		pageList : [5,10,15,20],
		pagePosition : 'bottom',
		sortName : 'teacherNo',
		sortOrder : 'ASC',
		remoteSort : true,
		toolbar : '#teacher_tools'
		
	});
	//添加弹窗
	$('#teacher_add').dialog({
		width : 350,
		title : '新增教师',
		iconCls : 'icon-add',
		modal : true,
		closed : true,
		buttons : [{
			text : '添加',
			iconCls : 'icon-add',
			handler : function() {
				if ($('#teacher_add').form('validate')) {
					//alert($('#profession').combobox('getValue'));
					$.ajax({
						url : 'teacher_add.action',
						type : 'post',
						data : {
							teacherNo : $('input[name="teacherNo"]').val(),
							teacherName : $('input[name="teacherName"]').val(),
							professionId : $('#profession').combobox('getValue'),
						},
						beforeSend : function() {
							/*$.messager.progress({
								text : '正在新增中。。。',
							});*/
						},
						success : function(data,response,status) {
							/*$.messager.progress('close');*/
							if (data>0) {
								$.messager.show({
									title : '提示',
									msg : '添加教师信息成功！',
								});
								$('#teacher_add').dialog('close').form('reset');
								$('#mteacher').datagrid('reload');
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
				$('#teacher_add').dialog('close').form('reset');
			},
		}]
	});
	//编辑弹窗
	$('#teacher_edit').dialog({
		width : 350,
		title : '编辑教师',
		iconCls : 'icon-edit',
		modal : true,
		closed : true,
		buttons : [{
			text : '修改',
			iconCls : 'icon-edit',
			handler : function() {
				if ($('#teacher_edit').form('validate')) {
					$.ajax({
						url : 'teacher_update.action',
						type : 'post',
						data : {
							teacherId : $('input[name="teacherId_edit"]').val(),
							teacherNo : $('input[name="teacherNo_edit"]').val(),
							teacherName : $('input[name="teacherName_edit"]').val(),
							professionId : $('#profession_edit').combobox('getValue'),
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
									msg : '修改教师信息成功！',
								});
								$('#teacher_edit').dialog('close').form('reset');
								$('#mteacher').datagrid('reload');
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
				$('#teacher_edit').dialog('close').form('reset');
			},
		}]
	});
	
	
	
	//教师编号
	$('input[name="teacherNo"]').validatebox({
		required : true,
		validType : 'length[4,10]',
		missingMessage : '请输入编号',
		invalidMessage : '账号在4~10位',
	});
	//教师名称验证
	$('input[name="teacherName"]').validatebox({
		required : true,
		missingMessage : '请输入教师',
	});
	//查询验证
	$('input[name="keyword"]').validatebox({
		required : true,
		missingMessage : '请输入教师名称关键字',
	});
	

});