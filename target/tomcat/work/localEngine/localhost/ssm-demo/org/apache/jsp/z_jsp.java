package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class z_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"cc\" class=\"easyui-layout\" data-options=\"fit:true\"  style=\"width:600px;height:400px;\">   \r\n");
      out.write("    \t<div data-options=\"region:'west',title:'组织机构',split:true\" style=\"width:180px;\">\r\n");
      out.write("    \t\t <div id=\"treelx\"></div>\r\n");
      out.write("    \t</div>  \r\n");
      out.write("\t   \t<div data-options=\"region:'center',title:'员工管理'\">\r\n");
      out.write("\t\t\t   \t<div id=\"tt\" class=\"easyui-tabs\" data-options=\"fit:true\" style=\"width:500px;height:250px;\">   \r\n");
      out.write("\t\t\t\t    <div title=\"首页\">   \r\n");
      out.write("\t\t\t\t       \t\t <div id=\"add_dialogs\">\r\n");
      out.write("\t\t\t\t\t<a id=\"btn5\" onclick=\"sx()\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-add'\">刷新</a>  \r\n");
      out.write("\t\t\t\t\t<a id=\"btn5\" onclick=\"add()\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-add'\">新增</a>  \r\n");
      out.write("\t\t\t     \t<a id=\"btn5\" onclick=\"del()\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-add'\">删除</a>\r\n");
      out.write("\t\t\t     \t<a id=\"btn8\" onclick=\"xg()\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-edit'\">修改</a>\r\n");
      out.write("\t\t\t     \t<a id=\"btn9\" onclick=\"dc()\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-edit'\">导出全部</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t   \t\t\t<div id=\"table_datagrids\"></div>\r\n");
      out.write("\t   \t\t\t<div id=\"dialogs\"></div>\r\n");
      out.write("\t\t\t\t    </div>   \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t   \t\t\t\r\n");
      out.write("\t   \t</div>\r\n");
      out.write("\t</div>  \r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("   \r\n");
      out.write("   function add(){\r\n");
      out.write("\t\t$(\"#dialogs\").dialog({\r\n");
      out.write("\t\t\ttitle:\"新增员工\",\r\n");
      out.write("\t\t\twidth:\"500\",\r\n");
      out.write("\t\t\theight:\"300\",\r\n");
      out.write("\t\t\thref: 'adduser.jsp',    \r\n");
      out.write("\t\t\tmodal: true,\r\n");
      out.write("\t\t})\r\n");
      out.write("\t}\r\n");
      out.write("   $(function(){\r\n");
      out.write("\t\t$(\"#treelx\").tree({   \r\n");
      out.write("\t\t\t url:\"");
      out.print(request.getContextPath());
      out.write("/treeController/asyncTreeList.action\",\r\n");
      out.write("\t\t      data:getHtml(),\r\n");
      out.write("\t\t      onClick: function(node){\r\n");
      out.write("\t\t\t    \t \r\n");
      out.write("\t\t\t    \t var id= $(\"#tabs\").tabs('exists',node.text)\r\n");
      out.write("\t\t\t    \t\t if(id==false){\r\n");
      out.write("\t\t\t    \t\t\t $('#tabs').tabs('add',{    \r\n");
      out.write("\t\t\t\t\t\t    \t    title:node.text, \r\n");
      out.write("\t\t\t\t\t\t    \t    href:\"");
      out.print(request.getContextPath());
      out.write("/\"+node.href,\r\n");
      out.write("\t\t\t\t\t\t    \t    closable:true,\r\n");
      out.write("\t\t\t\t\t\t    \t    method:\"post\",\r\n");
      out.write("\t\t\t\t\t\t    \t}); \r\n");
      out.write("\t\t\t    \t\t\t  \r\n");
      out.write("\t\t\t    \t\t }else{\r\n");
      out.write("\t\t\t    \t\t\r\n");
      out.write("\t\t\t    \t\t$(\"#tabs\").tabs('select',node.text) \r\n");
      out.write("\t\t\t    \t\t\t \r\n");
      out.write("\t\t\t    \t\t }\r\n");
      out.write("\t\t\t    \t\t   \r\n");
      out.write("\t\t\t    \t\t    \r\n");
      out.write("\t\t\t    \t  \r\n");
      out.write("\t\t\t    \t  \r\n");
      out.write("\t\t\t  \t}\r\n");
      out.write("\t\t}); \r\n");
      out.write("\t})\r\n");
      out.write("\t  \r\n");
      out.write("\r\n");
      out.write("\tfunction getHtml(){\r\n");
      out.write("\t\tvar html=\"\";\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t url:\"");
      out.print(request.getContextPath());
      out.write("/treeController/asyncTreeList.action\",\r\n");
      out.write("\t     type:\"post\",\r\n");
      out.write("\t     async:false,\r\n");
      out.write("\t    dataType:\"json\",\r\n");
      out.write("\t    success:function(data){\r\n");
      out.write("\t    \thtml=data;\r\n");
      out.write("\t    \t\r\n");
      out.write("\t    }\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn html;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("   function dc(){\r\n");
      out.write("\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/userController/testpoi.action\";\r\n");
      out.write("\t}\r\n");
      out.write("   function xg(){\r\n");
      out.write("\t  \t  //获得所有被选中的行\r\n");
      out.write("\t  \t  var select_options = $(\"#table_datagrids\").datagrid(\"getSelections\");\r\n");
      out.write("\t  \t  if(select_options.length==1){\r\n");
      out.write("\t  \t\t  //获得当前选择的数据的id\r\n");
      out.write("\t  \t\t  var productId = select_options[0].id;\r\n");
      out.write("\t  \t\t  $('#dialogs').dialog({    \r\n");
      out.write("\t    \t\t    title: '修改',    \r\n");
      out.write("\t    \t\t    width: 700,    \r\n");
      out.write("\t    \t\t    height: 300,  \r\n");
      out.write("\t    \t\t    //定义是否可关闭窗口\r\n");
      out.write("\t    \t\t    closed: false,\r\n");
      out.write("\t    \t\t    //是否显示关闭按钮\r\n");
      out.write("\t    \t\t    closable:true,\r\n");
      out.write("\t    \t\t    cache: false,    \r\n");
      out.write("\t    \t\t    modal: true,\r\n");
      out.write("\t    \t\t    href:\"");
      out.print(request.getContextPath());
      out.write("/userController/toupdateById.action?id=\"+productId,\r\n");
      out.write("\t\t\t\t\ttoolbar:[{\r\n");
      out.write("\t\t\t\t\t\ttext:'保存',\r\n");
      out.write("\t\t\t\t\t\ticonCls:'icon-save',\r\n");
      out.write("\t\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\turl:\"");
      out.print(request.getContextPath());
      out.write("/userController/updateUser.action\",\r\n");
      out.write("\t\t\t\t\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\t\t\t\t\tdata:$(\"#formUpdate\").serialize(),\r\n");
      out.write("\t\t\t\t\t\t\t\tdataType:\"text\",\r\n");
      out.write("\t\t\t\t\t\t\t\tsuccess:function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#dialogs\").dialog(\"close\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#table_datagrids').datagrid('reload');    // 重新载入当前页面数据  \r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\terror:function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#dialogs\").dialog(\"close\");\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\t\ttext:'取消',\r\n");
      out.write("\t\t\t\t\t\ticonCls:'icon-cancel',\r\n");
      out.write("\t\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#add_dialogs\").dialog(\"close\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}]\t\t\r\n");
      out.write("\t    \t\t}); \r\n");
      out.write("\t  \t\t  \r\n");
      out.write("\t  \t\t  \r\n");
      out.write("\t  \t  }else{\r\n");
      out.write("\t  \t\t  alert(\"抢选择一个\")\r\n");
      out.write("\t  \t  }\r\n");
      out.write("\t    }\r\n");
      out.write("   function del(){\r\n");
      out.write("\t\t\t  var select_options = $(\"#table_datagrids\").datagrid(\"getSelections\");\r\n");
      out.write("\t\t\t  var ids=\"\";\r\n");
      out.write("\t\t\t  if(select_options!=null && select_options!=\"\"){\r\n");
      out.write("\t\t\t\t  for ( var i = 0; i < select_options.length; i++) {\r\n");
      out.write("\t\t\t\t\tids+=\",\"+select_options[i].id;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t\t\tids=ids.substr(1);\r\n");
      out.write("\t\t\talert(ids)\r\n");
      out.write("\t\t\t$.messager.confirm('确定','你确定删除这些数据么',function(r){\r\n");
      out.write("\t\t\t\tif (r) {\r\n");
      out.write("\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\turl:\"");
      out.print(request.getContextPath());
      out.write("/userController/deleteUser.action\",\r\n");
      out.write("\t\t\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\t\t\tdata:{\"ids\":ids},\r\n");
      out.write("\t\t\t\t\t\tdataType:\"text\",\r\n");
      out.write("\t\t\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#table_datagrids\").datagrid(\"reload\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("   }\r\n");
      out.write("   \t\tfunction sx(){\r\n");
      out.write("   \t\t\tvar current_tab = $('#tt').tabs('getSelected');  \r\n");
      out.write("\t\t\t $('#tt').tabs('update',{  \r\n");
      out.write("\t\t\t      tab:current_tab,  \r\n");
      out.write("\t\t\t      options : {  \r\n");
      out.write("\t\t\t           content : '<iframe scrolling=\"auto\" frameborder=\"0\"  src=\"'+URL+'\" style=\"width:100%;height:100%;\"></iframe>',  \r\n");
      out.write("\t\t\t       //或者 href : '';  \r\n");
      out.write("\t\t\t      }  \r\n");
      out.write("\t\t\t }); \r\n");
      out.write("   \t\t}\r\n");
      out.write("   $(\"#table_datagrids\").datagrid({\r\n");
      out.write(" \t  url:'");
      out.print(request.getContextPath());
      out.write("/userController/toSelectUser.action',\r\n");
      out.write(" \t  columns:[[\r\n");
      out.write(" \t            {field:'id',title:'',width:100},\r\n");
      out.write(" \t           {\r\n");
      out.write(" \t \t        \t field:'bh',\r\n");
      out.write(" \t                  title:'编号',\r\n");
      out.write(" \t \t        \t width:100\r\n");
      out.write(" \t \t         }, \r\n");
      out.write(" \t         {\r\n");
      out.write(" \t        \t field:'name',\r\n");
      out.write("                  title:'姓名',\r\n");
      out.write(" \t        \t width:100\r\n");
      out.write(" \t         }, \r\n");
      out.write(" \t        {\r\n");
      out.write(" \t        \t field:'sex',\r\n");
      out.write("                  title:'性别',\r\n");
      out.write(" \t        \t width:100,\r\n");
      out.write(" \t        \t formatter:function(value,row,index){\r\n");
      out.write(" \t                    switch(value){\r\n");
      out.write(" \t                    case 1 : return \"男\";\r\n");
      out.write(" \t                    case 2 : return \"女\";\r\n");
      out.write(" \t                    default: return \"未知\";\r\n");
      out.write(" \t                    }\r\n");
      out.write(" \t    \t          }\r\n");
      out.write(" \t         },\r\n");
      out.write(" \t         {\r\n");
      out.write(" \t        \t field:'createdatetime',\r\n");
      out.write("                  title:'生日',\r\n");
      out.write(" \t        \t width:100\r\n");
      out.write(" \t         },\r\n");
      out.write(" \t        \r\n");
      out.write(" \t         {\r\n");
      out.write(" \t        \t field:'sjh',\r\n");
      out.write("                  title:'手机号',\r\n");
      out.write(" \t        \t width:100\r\n");
      out.write(" \t         },\r\n");
      out.write(" \t        \r\n");
      out.write(" \t         {\r\n");
      out.write(" \t        \t field:'dh',\r\n");
      out.write("                  title:'办公电话',\r\n");
      out.write(" \t        \t width:100\r\n");
      out.write(" \t         },\r\n");
      out.write(" \t        {\r\n");
      out.write(" \t        \t field:'yxiang',\r\n");
      out.write("                  title:'邮箱地址',\r\n");
      out.write(" \t        \t width:100\r\n");
      out.write(" \t         },\r\n");
      out.write(" \t        {\r\n");
      out.write(" \t        \t field:'yx',\r\n");
      out.write("                  title:'有效',\r\n");
      out.write(" \t        \t width:100,\r\n");
      out.write(" \t        \t formatter:function(value,row,index){\r\n");
      out.write(" \t                    switch(value){\r\n");
      out.write(" \t                    case 1 : return \"有效\";\r\n");
      out.write(" \t                    case 2 : return \"无效\";\r\n");
      out.write(" \t                    }\r\n");
      out.write(" \t    \t          }\r\n");
      out.write(" \t         },\r\n");
      out.write(" \t        {\r\n");
      out.write(" \t        \t field:'ms',\r\n");
      out.write("                  title:'描述',\r\n");
      out.write(" \t        \t width:100\r\n");
      out.write(" \t         }\r\n");
      out.write(" \t         \r\n");
      out.write(" \t          ]]\r\n");
      out.write(" \t})\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
