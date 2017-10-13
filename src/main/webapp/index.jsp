<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="base.jsp"></jsp:include>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body class="easyui-layout">
		<div data-options="region:'north',title:'上',split:true" style="height:100px;">
		<h1>欢迎</h1>
	</div>   
    	<div data-options="region:'west',title:'左',split:true" style="width:180px;">
    		<div id="aa" class="easyui-accordion" data-options="fit:true" style="width:300px;height:200px;">   
	    		<div title="Title1" data-options="iconCls:'icon-save',selected:true" style="overflow:auto;padding:10px;">   
	       	 		<ul id="shu" class="easyui-tree">   
					    <li>   
					        <span>员工管理</span>   
					    </li>   
					    <li>   
					        <span>用户管理</span>   
					    </li>
					    <li>   
					        <span>角色管理</span>   
					    </li>
					    <li>   
					        <span>组织机构管理</span>   
					    </li>
					    <li>   
					        <span>操作权限管理</span>   
					    </li>  
					    <li>   
					        <span>用户权限管理</span>   
					    </li> 
					    <li>   
					        <span>角色权限管理</span>   
					    </li> 
					</ul>  
	   			</div>   
		    	<div title="Title2" data-options="iconCls:'icon-reload'" style="padding:10px;">   
		        	  
		    	</div>  
		</div>  
   	</div>  
   	<div data-options="region:'center',title:'中'">
    			<div id="tt" class="easyui-tabs" data-options="fit:true" style="width:500px;height:250px;">   
	    	<div title="首页" >   
	        	欢迎欢迎热烈欢迎
	    	</div> 
	    	</div> 
    </div>
    
    <script type="text/javascript">
    $('#shu').tree({
    	onClick: function(node){
    		$("#tt").tabs("add",{
			    title:node.text,    
				    closable:true,  
				    href:"z.jsp",
				    tools:[{    
				        iconCls:'icon-reload',    
				        handler:function(){    
				           var tabs_select = $("#tt").tabs("getSelected",node.text);
				          tabs_select.panel("refresh","<%=request.getContextPath()%>/"+node.url)
				        }    
				    }]    

			});
    	}
    })
    </script>
</body>
</html>