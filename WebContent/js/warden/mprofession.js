/**
 * 专业
 */
$(function() {
	profession_tool = {
		reload : function() {
			$('#mprofession').datagrid('reload');
		},
		redo : function() {
			$('#mprofession').datagrid('unselectAll');
		},
			
		search : function() {
			alert($('input[name="keyword"]').val());
			$('#mprofession').datagrid('load',{
				pName : $.trim($('input[name="keyword"]').val()),
			});
		},
		add : function() {
			$('#profession_add').dialog('open');
			$('input[name="pNo"]').focus();
			//学院下拉框
			$('#college').combobox({
				valueField : 'collegeId',
				textField : 'collegeName',
				url : 'profession_getCollegeName.action',
				width : 200,
				panelHeight : 200,
				required : true,
				missingMessage : '请选择学院',
				editable : true,
			});
		},
		edit : function(){
			var rows = $('#mprofession').datagrid('getSelections');
			console.log(rows);
			if (rows.length>1) {
				$.messager.alert('警告','编辑时只能选择一条进行修改！','waring');
			}else if (rows.length == 0) {
				$.messager.alert('警告','请选择一条记录进行编辑！','waring');
			} else if(rows.length == 1){
				$('#college_edit').combobox({
					valueField : 'collegeId',
					textField : 'collegeName',
					url : 'profession_getCollegeName.action',
					width : 200,
					panelHeight : 200,
					required : true,
					missingMessage : '请选择学院',
					editable : true,
				});
				//alert(rows[0].pId);
				$.ajax({
					url : 'profession_edit.action',
					type : 'post',
					data : {
						pId : rows[0].pId,
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
							
							$('#profession_edit').form('load',{
								pId_edit : data.pId,
								pNo_edit : data.pNo,
								pName_edit : data.pName,
								college_edit : data.college,
								
							}).dialog('open');
						}else {
							$.messager.alert('请求失败！','未知错误！请重试','warning');
						}
					}
				
				});
				
				
			}
		},
		
		remove : function() {
			var rows = $('#mprofession').datagrid('getSelections');
			if (rows.length>0) {
				$.messager.confirm('确定操作','确认删除这些数据？',function(flag){
					if (flag) {
						var ids=[];
						for (var i = 0; i < rows.length; i++) {
							ids.push(rows[i].pId);
						}
						//console.log(ids.join(','));
						//以ajax方式提交给后台删除所选记录
						$.ajax({
							url : 'profession_delete.action',
							type : 'POST',
							data : {
								ids : ids.join(','),
							},
							dataType : 'text',
							//传递之前
							beforeSend : function() {
								$('#mprofession').datagrid('loading');
							},
							
							success : function(data) {
								if (data) {
									//alert(data);
									$('#mprofession').datagrid('loaded');
									$('#mprofession').datagrid('load');
									$('#mprofession').datagrid('unselectAll');
									$.messager.show({
										title : '提示',
										msg : data + '个专业被删除！',
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
	
	
	
	$('#mprofession').datagrid({
		title : '管理员列表',
		url : 'showProfession.action',
		fitColumns : true,
		border : false,
		rownumbers : true,
		columns : [[
			{
				title : '主键',
				field : 'pId',
				width : 100,
				sortable : true,
				checkbox : true,
				align : 'center'
			},
			{
				title : '专业编号',
				field : 'pNo',
				width : 100,
				sortable : true,
				align : 'center'
			},
			{
				title : '专业名称',
				field : 'pName',
				width : 100,
				sortable : true,
				align : 'center'
			},
			{
				title : '学院',
				field : 'college',
				width : 100,
				align : 'center',
				formatter : function(index ,row ,value) {
					return row.college.collegeName;
				}
			}
		]],
		
		pagination : true,
		pageNumber : 1,
		pageSize : 5,
		pageList : [5,10,15,20],
		pagePosition : 'bottom',
		sortName : 'pNo',
		sortOrder : 'ASC',
		remoteSort : true,
		toolbar : '#profession_tools'
		
	});
	//添加弹窗
	$('#profession_add').dialog({
		width : 350,
		title : '新增专业',
		iconCls : 'icon-add',
		modal : true,
		closed : true,
		buttons : [{
			text : '添加',
			iconCls : 'icon-add',
			handler : function() {
				if ($('#profession_add').form('validate')) {
					//alert($('#college').combobox('getValue'));
					$.ajax({
						url : 'profession_add.action',
						type : 'post',
						data : {
							pNo : $('input[name="pNo"]').val(),
							pName : $('input[name="pName"]').val(),
							collegeId : $('#college').combobox('getValue'),
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
									msg : '添加专业信息成功！',
								});
								$('#profession_add').dialog('close').form('reset');
								$('#mprofession').datagrid('reload');
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
				$('#profession_add').dialog('close').form('reset');
			},
		}]
	});
	//编辑弹窗
	$('#profession_edit').dialog({
		width : 350,
		title : '编辑管理',
		iconCls : 'icon-edit',
		modal : true,
		closed : true,
		buttons : [{
			text : '修改',
			iconCls : 'icon-edit',
			handler : function() {
				if ($('#profession_edit').form('validate')) {
					$.ajax({
						url : 'profession_update.action',
						type : 'post',
						data : {
							pId : $('input[name="pId_edit"]').val(),
							pNo : $('input[name="pNo_edit"]').val(),
							pName : $('input[name="pName_edit"]').val(),
							collegeId : $('#college_edit').combobox('getValue'),
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
									msg : '修改专业信息成功！',
								});
								$('#profession_edit').dialog('close').form('reset');
								$('#mprofession').datagrid('reload');
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
				$('#profession_edit').dialog('close').form('reset');
			},
		}]
	});
	
	
	
	//专业编号
	$('input[name="pNo"]').validatebox({
		required : true,
		validType : 'length[4,10]',
		missingMessage : '请输入编号',
		invalidMessage : '账号在4~10位',
	});
	//专业名称验证
	$('input[name="pName"]').validatebox({
		required : true,
		missingMessage : '请输入专业',
	});
	//查询验证
	$('input[name="keyword"]').validatebox({
		required : true,
		missingMessage : '请输入专业名称关键字',
	});
	

});