<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form id="add_form">
		 <table>
          <tr>
             <td>编号</td>
             <td>
                <input type="text" name="bh" value="${u.bh}" class="easyui-textbox" data-options="iconCls:'icon-search'">
             </td>
          </tr>
          <tr>
             <td>姓名</td>
             <td>
                <input type="text" name="name" value="${u.name}" class="easyui-textbox" data-options="iconCls:'icon-search'">
             </td>
          </tr>
          <tr>
             <td>性别</td>
             <td>
                <input type="radio" name="sex" value="1" ${u.sex==1?"checked":""}>男
                <input type="radio" name="sex" value="2" ${u.sex==2?"checked":""}>女
             </td>
          </tr>
          <tr>
             <td>手机号</td>
             <td>
                <input type="text" name="sjh" value="${u.sjh}" class="easyui-textbox" data-options="iconCls:'icon-search'">
             </td>
          </tr>
          <tr>
             <td>电话</td>
             <td>
                <input type="text" name="dh" value="${u.dh}" class="easyui-textbox" data-options="iconCls:'icon-search'">
             </td>
          </tr>
          <tr>
             <td>邮箱地址</td>
             <td>
                <input type="text" name="yxiang" value="${u.yxiang}" class="easyui-textbox" data-options="iconCls:'icon-search'">
             </td>
          </tr>
           <tr>
             <td>描述</td>
             <td>
                <input type="text" name="ms" value="${u.ms}" class="easyui-textbox" data-options="iconCls:'icon-search'">
             </td>
          </tr>
       </table>
	</form>
		<a id="btn5" onclick="addform()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">新增</a>
	<a id="btn6" onclick="qx()" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">取消</a>
		<script type="text/javascript">
function addform(){
		 $.ajax({
			 url:"<%=request.getContextPath()%>/userController/insertUser.action",
			 type:"post",
			 data:$("#add_form").serialize(),
			 dataType:"text",
			 success:function(){
				$("#dialogs").dialog("close");
				$("#table_datagrids").datagrid("reload"); 
			 },
			 error:function(){
				 $("#dialogs").dialog("close");
			 }
		 })
}
function qx(){
	 $("#dialogs").dialog("close");
}
</body>
</html>