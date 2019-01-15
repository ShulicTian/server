/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2018-03-15 05:24:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import shulictian.ssm.po.*;

public final class handlerTopic_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "resources.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div style=\"background-color: #f5f6f7;\">\r\n");
      out.write("\t\t<div style=\"height: 100px; width: 100%;\">广告位</div>\r\n");
      out.write("\t\t<div id=\"globleCtx\">\r\n");
      out.write("\t\t\t<div id=\"topics\"\r\n");
      out.write("\t\t\t\tstyle=\"height: 752px; width: 99%; margin: auto; background-color: white; padding-top: 40px;\">\r\n");
      out.write("\t\t\t\t<div v-if=\"isHave()\" style=\"padding: 15px 30px;\">此处暂无帖子！</div>\r\n");
      out.write("\t\t\t\t<div v-for=\"top in topics\" class=\"topic\" style=\"padding: 0px 45px;\">\r\n");
      out.write("\t\t\t\t\t<div id=\"imgHead\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"tit\">\r\n");
      out.write("\t\t\t\t\t\t<a v-bind:href=\"'getTopic/'+top.id\" target=\"_blank\"><h6>{{top.title}}</h6></a><br />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"time\" style=\"width: 150px; padding: 0px; display: inline;\">\r\n");
      out.write("\t\t\t\t\t\t<span style=\"color: gray;\">{{top.sendTime | formatDate}}</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"text\">{{top.text | formatText}}</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"readed\" style=\"clear: right;\" v-if=\"top.sendTime!=null\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"rec\" href=\"javascript:void(0)\" @mouseenter=\"rec(top.id)\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 60px; margin-right: 15px;\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"layui-btn layui-btn-normal layui-btn-sm\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"layui-icon\" style=\"color: green;\"></i>恢复</a> <a class=\"del\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"javascript:void(0)\" @mouseenter=\"del(top.id)\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 80px; margin-right: 30px;\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"layui-btn layui-btn-normal layui-btn-sm\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"layui-icon\" style=\"color: gray\"></i>彻底删除</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"readed\" style=\"clear: right;\" v-else>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:void(0)\" style=\"width: 60px;\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"layui-btn layui-btn-normal layui-btn-sm\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"layui-icon\" style=\"color: green\"></i>编辑</a> <a class=\"rem\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"javascript:void(0)\" @mouseenter=\"rem(top.id)\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 80px;\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"layui-btn layui-btn-normal layui-btn-sm\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"layui-icon\" style=\"color: gray\"></i>删除</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t\t\t\t<hr style=\"margin: 0px; margin-top: 10px;\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"handlerPaging\" style=\"text-align: center;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$(\".rem\").click(function(){\r\n");
      out.write("\t\t\tvar topId=app.topId\r\n");
      out.write("\t\t\t$.post(\"bigCow/topic/remove\",{\"topId\":topId})\r\n");
      out.write("\t\t\t$(this).parent().parent().remove()\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$(\".del\").click(function(){\r\n");
      out.write("\t\t\tvar topId=app.topId\r\n");
      out.write("\t\t\t$.post(\"bigCow/topic/delete\",{\"topId\":topId})\r\n");
      out.write("\t\t\t$(this).parent().parent().remove()\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$(\".rec\").click(function(){\r\n");
      out.write("\t\t\tvar topId=app.topId\r\n");
      out.write("\t\t\t$.post(\"bigCow/topic/recover\",{\"topId\":topId})\r\n");
      out.write("\t\t\t$(this).parent().parent().remove()\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("/* $(document).ready(function(){\r\n");
      out.write("\t$(\".topic\").click(function(){\r\n");
      out.write("\t\tvar elem = $(this).children(\"div\")[1]\r\n");
      out.write("\t\tvar href = $(elem).children(\"a\").attr(\"href\")\r\n");
      out.write("\t\twindow.open(href)\r\n");
      out.write("\t})\r\n");
      out.write("}) */\r\n");
      out.write("</script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write(" \tlayui.use(['carousel', 'element','laypage'], function(){\r\n");
      out.write("\t\t  var carousel = layui.carousel,\r\n");
      out.write("\t\t  laypage = layui.laypage,\r\n");
      out.write("\t\t  element = layui.element;\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  carousel.render({\r\n");
      out.write("\t\t    elem: '#imgs'\r\n");
      out.write("\t\t    ,width: '75%'\r\n");
      out.write("\t\t    ,height: '350px'\r\n");
      out.write("\t\t    ,interval: 4000\r\n");
      out.write("\t\t  });\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  carousel.render({\r\n");
      out.write("\t\t\t    elem: '#ad'\r\n");
      out.write("\t\t\t    ,width: '99%'\r\n");
      out.write("\t\t\t    ,height: '260px'\r\n");
      out.write("\t\t\t    ,interval: 4000\r\n");
      out.write("\t\t\t  });\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  laypage.render({\r\n");
      out.write("\t\t\t    elem: 'handlerPaging'\r\n");
      out.write("\t\t\t    ,count: app.count\r\n");
      out.write("\t\t\t    ,limit: app.limit\r\n");
      out.write("\t\t\t    ,theme: '#1E9FFF'\r\n");
      out.write("\t\t\t    ,jump: function(obj, first){\r\n");
      out.write("\t\t\t    \tvar url = 'bigCow/paging/draft'\r\n");
      out.write("\t\t\t    \tif(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${state}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("!=6){\r\n");
      out.write("\t\t\t    \t\turl = 'bigCow/paging/dustbin'\r\n");
      out.write("\t\t\t    \t}\r\n");
      out.write("\t\t\t    \t $.post(url,{'nowPage':obj.curr,\"userId\":");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("},function(data){\r\n");
      out.write("\t\t\t\t\t\t\tapp.topics=JSON.parse(data.data.topics)\r\n");
      out.write("\t\t\t\t\t\t},'json')\r\n");
      out.write("\t\t\t     }\r\n");
      out.write("\t\t\t  });\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t}); \r\n");
      out.write("</script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tvar app=new Vue({\r\n");
      out.write("\t\t\tel:'#globleCtx',\r\n");
      out.write("\t\t\tdata:{\r\n");
      out.write("\t\t\t\ttopics: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pages.pageJSON}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(",\r\n");
      out.write("\t\t\t\tcount: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pages.allNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(",\r\n");
      out.write("\t\t\t\tlimit: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pages.nowPageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(",\r\n");
      out.write("\t\t\t\tsendUrl: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user==null}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("?'bigCow/page/toGlobalLogin':'bigCow/topic/toAdd',\r\n");
      out.write("\t\t\t\ttopId: ''\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tmethods:{\r\n");
      out.write("\t\t\t\tisHave:function(){\r\n");
      out.write("\t\t\t\t\tif(this.topics.length<=0){\r\n");
      out.write("\t\t\t\t\t\treturn true\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\treturn false\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\trem:function(id){\r\n");
      out.write("\t\t\t\t\tthis.topId=id\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tdel:function(id){\r\n");
      out.write("\t\t\t\t\tthis.topId=id\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\trec:function(id){\r\n");
      out.write("\t\t\t\t\tthis.topId=id\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcreated: function(){\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tfilters: {\r\n");
      out.write("\t\t\t\tformatText(text){\r\n");
      out.write("\t\t\t\t\tvar reg=new RegExp(/\\<p\\>([\\w\\s\\.\\u4e00-\\u9fa5]+)\\<\\/p\\>/g)\r\n");
      out.write("\t\t\t\t\ttext=reg.exec(text)\r\n");
      out.write("\t\t\t\t\ttext=text[1].substring(0,155)\r\n");
      out.write("\t\t\t\t\ttext+=\" ...\"\r\n");
      out.write("\t\t\t\t\treturn text\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tformatDate: function(date){\r\n");
      out.write("\t\t\t\t\tdate = new Date(date)\r\n");
      out.write("\t\t\t\t\tvar m=(date.getMinutes())<9?'0'+(date.getMinutes()):(date.getMinutes())\r\n");
      out.write("\t\t\t\t\treturn date=date.getFullYear()+\"-\"+(date.getMonth()+1)+\"-\"+date.getDate()+\" \"+date.getHours()+\":\"+m\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
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
