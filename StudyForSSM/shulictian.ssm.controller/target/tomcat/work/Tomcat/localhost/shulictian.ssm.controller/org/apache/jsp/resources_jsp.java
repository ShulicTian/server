/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2018-01-18 08:08:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import shulictian.ssm.po.*;
import java.util.*;

public final class resources_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=GB18030");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=GB18030\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("/webUtils/javascripts/layer/skin/layer.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("/webUtils/stylesheets/reset.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("/webUtils/stylesheets/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("/webUtils/stylesheets/common.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("/webUtils/javascripts/datetimepicker/jquery.datetimepicker.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("/webUtils/stylesheets/nav/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("/webUtils/stylesheets/nav/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("/webUtils/easyui/themes/color.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("/webUtils/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("/webUtils/easyui/themes/default/easyui.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/jquery/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/easyui/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/vue.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/javascripts/fileupload/jquery.ui.widget.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/javascripts/fileupload/jquery.iframe-transport.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/javascripts/fileupload/jquery.fileupload.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/javascripts/fileupload/jquery.fileupload-process.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/javascripts/fileupload/jquery.fileupload-validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/javascripts/datetimepicker/jquery.datetimepicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/javascripts/layer/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/javascripts/avalon/avalon.modern.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/javascripts/custom/jscommon.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/javascripts/custom/validator.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/javascripts/nav/nav.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/javascripts/easyui/jquery.edatagrid.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/webUtils/vue.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
