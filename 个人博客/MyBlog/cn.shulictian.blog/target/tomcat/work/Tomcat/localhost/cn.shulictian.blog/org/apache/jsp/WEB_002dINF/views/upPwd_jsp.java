/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2018-03-14 16:15:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import shulictian.ssm.po.*;

public final class upPwd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "resources.jsp", out, false);
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".lab{width:100px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div style=\"padding:30px;\" id=\"content\">\r\n");
      out.write("\t\t<div class=\"layui-tab\" style=\"margin-top:0px;\">\r\n");
      out.write("\t\t  <ul class=\"layui-tab-title\" style=\"width:200px;margin:auto;\">\r\n");
      out.write("\t\t    <li class=\"layui-this\">原密码修改</li>\r\n");
      out.write("\t\t    <li>手机号修改</li>\r\n");
      out.write("\t\t  </ul>\r\n");
      out.write("\t\t  <div class=\"layui-tab-content\" style=\"width:440px;margin:auto;margin-top:30px;\">\r\n");
      out.write("\t\t    <div class=\"layui-tab-item layui-show\">\r\n");
      out.write("\t\t      \t<form class=\"layui-form\" action=\"bigCow/user/upPwd\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"layui-form-label lab\">旧密码</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-input-block\" style=\"width:200px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"oldPwd\" style=\"display:none;\" placeholder=\"输入旧密码\" type=\"password\" class=\"layui-input\" autocompelete=\"off\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"oldPwd\" placeholder=\"输入旧密码\" type=\"text\" class=\"layui-input\" autocompelete=\"off\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"layui-form-label lab\">新密码</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-input-block\" style=\"width:200px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"newPwd\" autocompelete=\"off\" placeholder=\"输入新密码\" type=\"password\" class=\"layui-input\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"layui-form-label lab\">再次输入</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-input-block\" style=\"width:200px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<input placeholder=\"再次输入密码\" autocompelete=\"off\" type=\"password\" class=\"layui-input\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"width:100px;margin:auto;margin-top:30px;\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"确认修改\" class=\"layui-btn layui-btn-normal\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t    <div class=\"layui-tab-item\">\r\n");
      out.write("\t\t    \t<form class=\"layui-form\" action=\"\">\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"layui-form-label lab\">手机号码</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-input-block\" style=\"width:200px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"nickName\" autocomplete=\"off\" type=\"text\" class=\"layui-input\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"layui-form-label lab\">验证码</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-input-block\" style=\"width:100px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"nickName\" autocomplete=\"off\" type=\"text\" class=\"layui-input\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"width:100px;margin:auto;margin-top:30px;\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"确认修改\" class=\"layui-btn layui-btn-normal\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("layui.use(['element'], function(){\r\n");
      out.write("\t  var $ = layui.jquery\r\n");
      out.write("\t  ,element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块\r\n");
      out.write("\t  \r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tnew Vue({\r\n");
      out.write("\t\tel:'#content',\r\n");
      out.write("\t\tdata:{\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tmethods:{\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tcreated:function(){\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
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
