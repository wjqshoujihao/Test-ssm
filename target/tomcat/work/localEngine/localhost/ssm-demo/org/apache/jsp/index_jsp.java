package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("\t\t<div data-options=\"region:'north',title:'上',split:true\" style=\"height:100px;\">\r\n");
      out.write("\t\t<h1>欢迎</h1>\r\n");
      out.write("\t</div>   \r\n");
      out.write("    \t<div data-options=\"region:'west',title:'左',split:true\" style=\"width:180px;\">\r\n");
      out.write("    \t\t<div id=\"aa\" class=\"easyui-accordion\" data-options=\"fit:true\" style=\"width:300px;height:200px;\">   \r\n");
      out.write("\t    \t\t<div title=\"Title1\" data-options=\"iconCls:'icon-save',selected:true\" style=\"overflow:auto;padding:10px;\">   \r\n");
      out.write("\t       \t \t\t<ul id=\"shu\" class=\"easyui-tree\">   \r\n");
      out.write("\t\t\t\t\t    <li>   \r\n");
      out.write("\t\t\t\t\t        <span>员工管理</span>   \r\n");
      out.write("\t\t\t\t\t    </li>   \r\n");
      out.write("\t\t\t\t\t    <li>   \r\n");
      out.write("\t\t\t\t\t        <span>用户管理</span>   \r\n");
      out.write("\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t    <li>   \r\n");
      out.write("\t\t\t\t\t        <span>角色管理</span>   \r\n");
      out.write("\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t    <li>   \r\n");
      out.write("\t\t\t\t\t        <span>组织机构管理</span>   \r\n");
      out.write("\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t    <li>   \r\n");
      out.write("\t\t\t\t\t        <span>操作权限管理</span>   \r\n");
      out.write("\t\t\t\t\t    </li>  \r\n");
      out.write("\t\t\t\t\t    <li>   \r\n");
      out.write("\t\t\t\t\t        <span>用户权限管理</span>   \r\n");
      out.write("\t\t\t\t\t    </li> \r\n");
      out.write("\t\t\t\t\t    <li>   \r\n");
      out.write("\t\t\t\t\t        <span>角色权限管理</span>   \r\n");
      out.write("\t\t\t\t\t    </li> \r\n");
      out.write("\t\t\t\t\t</ul>  \r\n");
      out.write("\t   \t\t\t</div>   \r\n");
      out.write("\t\t    \t<div title=\"Title2\" data-options=\"iconCls:'icon-reload'\" style=\"padding:10px;\">   \r\n");
      out.write("\t\t        \t  \r\n");
      out.write("\t\t    \t</div>  \r\n");
      out.write("\t\t</div>  \r\n");
      out.write("   \t</div>  \r\n");
      out.write("   \t<div data-options=\"region:'center',title:'中'\">\r\n");
      out.write("    \t\t\t<div id=\"tt\" class=\"easyui-tabs\" data-options=\"fit:true\" style=\"width:500px;height:250px;\">   \r\n");
      out.write("\t    \t<div title=\"首页\" >   \r\n");
      out.write("\t        \t欢迎欢迎热烈欢迎\r\n");
      out.write("\t    \t</div> \r\n");
      out.write("\t    \t</div> \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    $('#shu').tree({\r\n");
      out.write("    \tonClick: function(node){\r\n");
      out.write("    \t\t$(\"#tt\").tabs(\"add\",{\r\n");
      out.write("\t\t\t    title:node.text,    \r\n");
      out.write("\t\t\t\t    closable:true,  \r\n");
      out.write("\t\t\t\t    href:\"z.jsp\",\r\n");
      out.write("\t\t\t\t    tools:[{    \r\n");
      out.write("\t\t\t\t        iconCls:'icon-reload',    \r\n");
      out.write("\t\t\t\t        handler:function(){    \r\n");
      out.write("\t\t\t\t           var tabs_select = $(\"#tt\").tabs(\"getSelected\",node.text);\r\n");
      out.write("\t\t\t\t          tabs_select.panel(\"refresh\",\"");
      out.print(request.getContextPath());
      out.write("/\"+node.url)\r\n");
      out.write("\t\t\t\t        }    \r\n");
      out.write("\t\t\t\t    }]    \r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("    \t}\r\n");
      out.write("    })\r\n");
      out.write("    </script>\r\n");
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
