<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="cc" class="easyui-layout" data-options="fit:true"  style="width:600px;height:400px;">   
    	<div data-options="region:'west',title:'组织机构',split:true" style="width:180px;">
    		 <div id="treelx"></div>
    	</div>  
	   	<div data-options="region:'center',title:'员工管理'">
			   	<div id="tt" class="easyui-tabs" data-options="fit:true" style="width:500px;height:250px;">   
				    <div title="首页">   
				       		 <div id="add_dialogs">
					<a id="btn5" onclick="sx()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">刷新</a>  
					<a id="btn5" onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">新增</a>  
			     	<a id="btn5" onclick="del()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">删除</a>
			     	<a id="btn8" onclick="xg()" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
			     	<a id="btn9" onclick="dc()" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">导出全部</a>
				</div>
	   			<div id="table_datagrids"></div>
	   			<div id="dialogs"></div>
				    </div>   
				</div>
	   			
	   	</div>
	</div>  
   <script type="text/javascript">
   
   function add(){
		$("#dialogs").dialog({
			title:"新增员工",
			width:"500",
			height:"300",
			href: 'adduser.jsp',    
			modal: true,
		})
	}
   $(function(){
		$("#treelx").tree({   
			 url:"<%=request.getContextPath()%>/treeController/asyncTreeList.action",
		      data:getHtml(),
		      onClick: function(node){
			    	 
			    	 var id= $("#tabs").tabs('exists',node.text)
			    		 if(id==false){
			    			 $('#tabs').tabs('add',{    
						    	    title:node.text, 
						    	    href:"<%=request.getContextPath()%>/"+node.href,
						    	    closable:true,
						    	    method:"post",
						    	}); 
			    			  
			    		 }else{
			    		
			    		$("#tabs").tabs('select',node.text) 
			    			 
			    		 }
			    		   
			    		    
			    	  
			    	  
			  	}
		}); 
	})
	  

	function getHtml(){
		var html="";
		$.ajax({
		 url:"<%=request.getContextPath()%>/treeController/asyncTreeList.action",
	     type:"post",
	     async:false,
	    dataType:"json",
	    success:function(data){
	    	html=data;
	    	
	    }
		})
		
		return html;
		
	}
   function dc(){
		location.href="<%=request.getContextPath()%>/userController/testpoi.action";
	}
   function xg(){
	  	  //获得所有被选中的行
	  	  var select_options = $("#table_datagrids").datagrid("getSelections");
	  	  if(select_options.length==1){
	  		  //获得当前选择的数据的id
	  		  var productId = select_options[0].id;
	  		  $('#dialogs').dialog({    
	    		    title: '修改',    
	    		    width: 700,    
	    		    height: 300,  
	    		    //定义是否可关闭窗口
	    		    closed: false,
	    		    //是否显示关闭按钮
	    		    closable:true,
	    		    cache: false,    
	    		    modal: true,
	    		    href:"<%=request.getContextPath()%>/userController/toupdateById.action?id="+productId,
					toolbar:[{
						text:'保存',
						iconCls:'icon-save',
						handler:function(){
							$.ajax({
								url:"<%=request.getContextPath()%>/userController/updateUser.action",
								type:"post",
								data:$("#formUpdate").serialize(),
								dataType:"text",
								success:function(){
									$("#dialogs").dialog("close");
									$('#table_datagrids').datagrid('reload');    // 重新载入当前页面数据  
								},
								error:function(){
									$("#dialogs").dialog("close");
								}
								
							})
						}
					},{
						text:'取消',
						iconCls:'icon-cancel',
						handler:function(){
							$("#add_dialogs").dialog("close");
						}
					}]		
	    		}); 
	  		  
	  		  
	  	  }else{
	  		  alert("抢选择一个")
	  	  }
	    }
   function del(){
			  var select_options = $("#table_datagrids").datagrid("getSelections");
			  var ids="";
			  if(select_options!=null && select_options!=""){
				  for ( var i = 0; i < select_options.length; i++) {
					ids+=","+select_options[i].id;
				}
			  }
			ids=ids.substr(1);
			alert(ids)
			$.messager.confirm('确定','你确定删除这些数据么',function(r){
				if (r) {
					$.ajax({
						url:"<%=request.getContextPath()%>/userController/deleteUser.action",
						type:"post",
						data:{"ids":ids},
						dataType:"text",
						success:function(data){
							$("#table_datagrids").datagrid("reload");
						}
					})
				}
			})
   }
   		function sx(){
   			var current_tab = $('#tt').tabs('getSelected');  
			 $('#tt').tabs('update',{  
			      tab:current_tab,  
			      options : {  
			           content : '<iframe scrolling="auto" frameborder="0"  src="'+URL+'" style="width:100%;height:100%;"></iframe>',  
			       //或者 href : '';  
			      }  
			 }); 
   		}
   $("#table_datagrids").datagrid({
 	  url:'<%=request.getContextPath()%>/userController/toSelectUser.action',
 	  columns:[[
 	            {field:'id',title:'',width:100},
 	           {
 	 	        	 field:'bh',
 	                  title:'编号',
 	 	        	 width:100
 	 	         }, 
 	         {
 	        	 field:'name',
                  title:'姓名',
 	        	 width:100
 	         }, 
 	        {
 	        	 field:'sex',
                  title:'性别',
 	        	 width:100,
 	        	 formatter:function(value,row,index){
 	                    switch(value){
 	                    case 1 : return "男";
 	                    case 2 : return "女";
 	                    default: return "未知";
 	                    }
 	    	          }
 	         },
 	         {
 	        	 field:'createdatetime',
                  title:'生日',
 	        	 width:100
 	         },
 	        
 	         {
 	        	 field:'sjh',
                  title:'手机号',
 	        	 width:100
 	         },
 	        
 	         {
 	        	 field:'dh',
                  title:'办公电话',
 	        	 width:100
 	         },
 	        {
 	        	 field:'yxiang',
                  title:'邮箱地址',
 	        	 width:100
 	         },
 	        {
 	        	 field:'yx',
                  title:'有效',
 	        	 width:100,
 	        	 formatter:function(value,row,index){
 	                    switch(value){
 	                    case 1 : return "有效";
 	                    case 2 : return "无效";
 	                    }
 	    	          }
 	         },
 	        {
 	        	 field:'ms',
                  title:'描述',
 	        	 width:100
 	         }
 	         
 	          ]]
 	})
	</script>
</body>
</html>