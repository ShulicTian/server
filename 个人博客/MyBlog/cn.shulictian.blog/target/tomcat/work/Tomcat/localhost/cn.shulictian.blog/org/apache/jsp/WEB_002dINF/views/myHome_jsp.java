/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2018-03-15 08:23:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import shulictian.ssm.po.*;
import java.util.*;

public final class myHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");

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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/homePage.css\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#sdf {\r\n");
      out.write("\twidth: 600px;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tcolor: gray;\r\n");
      out.write("\tbackground-color: #f5f6f7;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"userTit\">\r\n");
      out.write("\t\t\t<h2>我的个人主页</h2>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<input id=\"sdf\" type=\"text\" v-model=\"sdf\" @click=\"upSdf\"\r\n");
      out.write("\t\t\t\t\t@blur=\"saveSdf\" placeholder=\"您还没有设置签名,点击此行进行编辑。\"\r\n");
      out.write("\t\t\t\t\tclass=\"layui-input\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"width: 100%;\">\r\n");
      out.write("\t\t\t<div style=\"width: 100%; margin: auto;\">\r\n");
      out.write("\t\t\t\t<div id=\"rContent\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"photo\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/user/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userCus.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(".jpg\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"name\">\r\n");
      out.write("\t\t\t\t\t\t\t<a id=\"userName2\" href=\"javascript:void(0)\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userCus.nickName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"orderMsg\">\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float: left;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a :href=\"toFans(3)\">粉丝</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float: right;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a :href=\"toFans(4)\">大神</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float: left;\">{{fans}}</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float: right;\">{{attention}}</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"width: 100%; text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t<hr style=\"margin: 0px;\" />\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"\" id=\"userMsg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"text-align: right;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>原创:</span><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>{{original}}</span><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"text-align: right;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>访问量:</span><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>{{look}}</span><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<hr style=\"margin: 0px;\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"height: 200px;\">\r\n");
      out.write("\t\t\t\t\t\t<h6 style=\"width: 100%; text-align: center; padding-top: 10px;\">公告栏</h6>\r\n");
      out.write("\t\t\t\t\t\t<p\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"text-align: left; width: 190px; margin: auto; font-size: 14px; line-height: 25px; font-family: STHeiTi; letter-spacing: 3px; color: black;\">测试公告栏测试公告栏测试公告栏测试公告栏测试公告栏测试公告栏测试公告栏测试公告栏测试公告栏测试公告栏测试公告栏测试公告栏测试公告栏</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"margin-top: 10px;\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"gitTit\">GitHub分享站</div>\r\n");
      out.write("\t\t\t\t\t\t<hr style=\"margin: 0px;\" />\r\n");
      out.write("\t\t\t\t\t\t<div id=\"gitText\">\r\n");
      out.write("\t\t\t\t\t\t\t<h6 style=\"margin-top: 10px;\">主页网址：</h6>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a :href=\"git\" target=\"_blank\">{{git}}</a>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t\t\t<div v-for=\"pro in pros\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6>项目名称：{{pro.name}}</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6>项目简介：</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>{{pro.descs}}</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t项目路径：<a :href=\"git+pro.address\" target=\"_blank\">{{pro.address}}</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div lay-filter=\"tabs\" class=\"layui-tab layui-tab-brief\">\r\n");
      out.write("\t\t\t\t\t<div id=\"topics\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 60%; background-color: white; float: right; height: 1075px;\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"layui-tab-title\" id=\"tabF\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"layui-this\"\r\n");
      out.write("\t\t\t\t\t\t\t\t@click=\"getUserTops('bigCow/topic/getByUserId')\">首页</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t@click=\"getUserTops('bigCow/topic/getOriginalByUserId')\">原创</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t@click=\"getUserTops('bigCow/topic/getTransmitByUserId')\">转发</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t@click=\"getUserTops('bigCow/topic/getTranslateByUserId')\">译文</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"localSo\" style=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"userId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userCus.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"findLocal\" type=\"submit\" value=\"本页搜索\" @click=\"homeFind\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"float: right; margin-right: 20px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"layui-btn layui-btn-primary layui-btn-sm\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" id=\"inp\" name=\"ctx\" placeholder=\"请输入关键字\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"float: right; margin-right: 5px; width: 110px; height: 30px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"layui-input\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div v-if=\"isHave()\">此博主暂时没有发帖!&nbsp;</div>\r\n");
      out.write("\t\t\t\t\t\t<div v-for=\"top in topics\" class=\"topic\"\r\n");
      out.write("\t\t\t\t\t\t\t@click=\"toPage('bigCow/topic/get/'+top.id)\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"imgHead\" style=\"padding-left: 30px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img :src=\"'img/topic/'+top.id+'.jpg'\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"tit\" style=\"width: 59%; padding-left: 18px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a v-bind:href=\"'bigCow/topic/get/'+top.id\" target=\"_blank\"><h6>{{top.title}}</h6></a><br />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"time\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\"color: gray;\">{{top.sendTime | formatDate}}</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"userName\" style=\"float: left;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:void(0)\">{{top.user.nickName}}</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"text\" style=\"padding-left: 20px; font-size: 12px;\">{{top.text\r\n");
      out.write("\t\t\t\t\t\t\t\t| formatText}}</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"readed\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a v-bind:href=\"'bigCow/topic/get/'+top.id\" target=\"_blank\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"layui-btn layui-btn-normal layui-btn-sm\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"layui-icon\" style=\"color: green\"></i>评论({{top.readNum}})</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a v-bind:href=\"'bigCow/topic/get/'+top.id\" target=\"_blank\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"layui-btn layui-btn-normal layui-btn-sm\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"layui-icon\" style=\"color: gray\"></i>阅读({{top.readNum}})</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t\t\t\t<hr style=\"margin: 0px; margin-left: 20px;\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"homePaging\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"text-align: center; clear: both; margin-right: 120px;\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"bottomCtx\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$(\"#inp\").focus(function(){\r\n");
      out.write("\t\t$(\"#inp\").animate({width:'200px'});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t$(\"#inp\").focusout(function(){\r\n");
      out.write("\t\t$(\"#inp\").animate({width:'110px'});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("/* $(document).ready(function(){\r\n");
      out.write("\t$(\".topic\").click(function(){\r\n");
      out.write("\t\tvar elem = $(this).children(\"div\")[1]\r\n");
      out.write("\t\tvar href = $(elem).children(\"a\").attr(\"href\")\r\n");
      out.write("\t\twindow.open(href)\r\n");
      out.write("\t})\r\n");
      out.write("}) */\r\n");
      out.write("</script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("layui.use(['carousel', 'form','laydate','layedit','laypage'], function(){\r\n");
      out.write("\t  var laydate = layui.laydate\r\n");
      out.write("\t  ,layedit = layui.layedit,\r\n");
      out.write("\t  carousel = layui.carousel,\r\n");
      out.write("\t  laypage = layui.laypage,\r\n");
      out.write("\t  form = layui.form;\r\n");
      out.write("\t  \r\n");
      out.write("\t  element.on('tab(tabs)', function(data){\r\n");
      out.write("\t\t  if(this.attributes[0].value===\"layui-this\"){\r\n");
      out.write("\t\t\t  laypage.render({\r\n");
      out.write("\t\t\t\t    elem: 'homePaging'\r\n");
      out.write("\t\t\t\t    ,count: app.count\r\n");
      out.write("\t\t\t\t    ,limit: app.limit\r\n");
      out.write("\t\t\t\t    ,theme: '#1E9FFF'\r\n");
      out.write("\t\t\t\t    ,jump: function(obj, first){\r\n");
      out.write("\t\t\t\t    \t $.post(app.url,{'nowPage':obj.curr,\"userId\":app.userid,\"ctx\":app.ctx,\"genre\":app.genre,\"num\":10},function(data){\r\n");
      out.write("\t\t\t\t\t\t\t\tapp.topics=JSON.parse(data.data.topics)\r\n");
      out.write("\t\t\t\t\t\t\t},'json')\r\n");
      out.write("\t\t\t\t     }\r\n");
      out.write("\t\t\t\t  });\r\n");
      out.write("\t\t  }else{\r\n");
      out.write("\t\t\t  laypage.render({\r\n");
      out.write("\t\t\t\t    elem: 'homePaging'\r\n");
      out.write("\t\t\t\t    ,count: app.count\r\n");
      out.write("\t\t\t\t    ,limit: app.limit\r\n");
      out.write("\t\t\t\t    ,theme: '#1E9FFF'\r\n");
      out.write("\t\t\t\t    ,jump: function(obj, first){\r\n");
      out.write("\t\t\t\t    \t $.post(app.url,{'nowPage':obj.curr,\"userId\":app.userid,\"ctx\":app.ctx,\"genre\":app.genre,\"num\":10},function(data){\r\n");
      out.write("\t\t\t\t\t\t\t\tapp.topics=JSON.parse(data.data.topics)\r\n");
      out.write("\t\t\t\t\t\t\t},'json')\r\n");
      out.write("\t\t\t\t     }\r\n");
      out.write("\t\t\t\t  });\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t});\r\n");
      out.write("\t  \r\n");
      out.write("\t  $('#findLocal').on('click', function(){\r\n");
      out.write("\t\t  laypage.render({\r\n");
      out.write("\t\t\t    elem: 'homePaging'\r\n");
      out.write("\t\t\t    ,count: app.count\r\n");
      out.write("\t\t\t    ,limit: app.limit\r\n");
      out.write("\t\t\t    ,theme: '#1E9FFF'\r\n");
      out.write("\t\t\t    ,jump: function(obj, first){\r\n");
      out.write("\t\t\t    \t $.post(app.url,{'nowPage':obj.curr,\"userId\":app.userid,\"ctx\":app.ctx,\"genre\":app.genre,\"num\":10},function(data){\r\n");
      out.write("\t\t\t\t\t\t\tapp.topics=JSON.parse(data.data.topics)\r\n");
      out.write("\t\t\t\t\t\t},'json')\r\n");
      out.write("\t\t\t     }\r\n");
      out.write("\t\t\t  });\r\n");
      out.write("\t\t  });\r\n");
      out.write("\t  \r\n");
      out.write("\t  laydate.render({\r\n");
      out.write("\t\t    elem: '#dateView'\r\n");
      out.write("\t\t    ,position: 'static'\r\n");
      out.write("\t\t  });\r\n");
      out.write("\t  \r\n");
      out.write("\t  carousel.render({\r\n");
      out.write("\t\t    elem: '#ad'\r\n");
      out.write("\t\t    ,width: '99%'\r\n");
      out.write("\t\t    ,height: '270px'\r\n");
      out.write("\t\t    ,interval: 4000\r\n");
      out.write("\t\t  });\r\n");
      out.write("\t  \r\n");
      out.write("\t  laypage.render({\r\n");
      out.write("\t\t    elem: 'homePaging'\r\n");
      out.write("\t\t    ,count: app.count\r\n");
      out.write("\t\t    ,limit: app.limit\r\n");
      out.write("\t\t    ,theme: '#1E9FFF'\r\n");
      out.write("\t\t    ,jump: function(obj, first){\r\n");
      out.write("\t\t    \t $.post(app.url,{'nowPage':obj.curr,\"userId\":app.userid,\"ctx\":app.ctx,\"genre\":app.genre,\"num\":10},function(data){\r\n");
      out.write("\t\t\t\t\t\tapp.topics=JSON.parse(data.data.topics)\r\n");
      out.write("\t\t\t\t\t},'json')\r\n");
      out.write("\t\t     }\r\n");
      out.write("\t\t  });\r\n");
      out.write("\t  \r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("var app=new Vue({\r\n");
      out.write("\tel: '#content',\r\n");
      out.write("\tdata: {\r\n");
      out.write("\t\toriginal: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userCus.zeroNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(",\r\n");
      out.write("\t\tlook: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userCus.lookNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(",\r\n");
      out.write("\t\tfans: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userCus.fansNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(",\r\n");
      out.write("\t\tattention: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userCus.atteNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(",\r\n");
      out.write("\t\tallTopHot: [],\r\n");
      out.write("\t\trelatedTop: [],\r\n");
      out.write("\t\tnewTypeTop: [],\r\n");
      out.write("\t\thotTop: [],\r\n");
      out.write("\t\tnewTop: [],\r\n");
      out.write("\t\tuserid: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userCus.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(",\r\n");
      out.write("\t\ttopics: [],\r\n");
      out.write("\t\tcount: \"\",\r\n");
      out.write("\t\tlimit: \"\",\r\n");
      out.write("\t\tctx: '',\r\n");
      out.write("\t\tgenre: \"\",\r\n");
      out.write("\t\tsdf: '',\r\n");
      out.write("\t\tpros: [],\r\n");
      out.write("\t\tprosById: [],\r\n");
      out.write("\t\tgit:'https://www.github.com/',\r\n");
      out.write("\t\turl: 'bigCow/paging/userTopic'\r\n");
      out.write("\t},\r\n");
      out.write("\tmethods: {\r\n");
      out.write("\t\tgetUserTops: function(url){\r\n");
      out.write("\t\t\tvar temp=this;\r\n");
      out.write("\t\t\ttemp.url=url==\"bigCow/topic/getByUserId\"?\"bigCow/paging/userTopic\":\"bigCow/paging/genreTopic\"\r\n");
      out.write("\t\t\ttemp.genre= url==\"bigCow/topic/getOriginalByUserId\"?0:url==\"bigCow/topic/getTransmitByUserId\"?1:2\r\n");
      out.write("\t\t    $.ajax({ \r\n");
      out.write("\t              type : \"post\", \r\n");
      out.write("\t              url : url, \r\n");
      out.write("\t              data : {\"userId\":this.userid}, \r\n");
      out.write("\t              async : false, \r\n");
      out.write("\t              dataType: 'json',\r\n");
      out.write("\t              success : function(data){ \r\n");
      out.write("\t  \t\t\t\ttemp.topics=JSON.parse(data.data.topics.pageJSON)\r\n");
      out.write("\t\t\t\t\ttemp.count=data.data.topics.allNum\r\n");
      out.write("\t\t\t\t\ttemp.limit=data.data.topics.nowPageNum\r\n");
      out.write("\t              } \r\n");
      out.write("\t         }); \r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tjud: function(top){\r\n");
      out.write("\t\t\tif(top.length<=0){\r\n");
      out.write("\t\t\t\treturn true\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn false\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tisHave:function(){\r\n");
      out.write("\t\t\tif(this.topics.length<=0){\r\n");
      out.write("\t\t\t\treturn true\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\treturn false\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tupSdf:function(){\r\n");
      out.write("\t\t\t$(\"#sdf\").css({\"border\":\"1px solid\"})\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tsaveSdf:function(){\r\n");
      out.write("\t\t\tvar descs=this.sdf\r\n");
      out.write("\t\t\t$(\"#sdf\").css({\"border\":\"none\"})\r\n");
      out.write("\t\t\t$.post(\"bigCow/other/upSdf\",{\"userId\":temp.userid,\"descs\":descs})\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tgetSdf:function(){\r\n");
      out.write("\t\t\tvar temp=this\r\n");
      out.write("\t\t\t$.post(\"bigCow/other/getSdf\",{\"userId\":temp.userid},function(data){\r\n");
      out.write("\t\t\t\ttemp.sdf=data\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tgetPros:function(){\r\n");
      out.write("\t\t\tvar temp=this\r\n");
      out.write("\t\t\t$.post(\"bigCow/other/getPro\",{\"userId\":temp.userid},function(data){\r\n");
      out.write("\t\t\t\ttemp.pros=data\r\n");
      out.write("\t\t\t},\"json\")\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tgetGit:function(){\r\n");
      out.write("\t\t\tvar temp=this\r\n");
      out.write("\t\t\t$.post(\"bigCow/other/getGit\",{\"userId\":temp.userid},function(data){\r\n");
      out.write("\t\t\t\ttemp.git+=data\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\ttoFans:function(num){\r\n");
      out.write("\t\t\treturn \"bigCow/page/toBlog?p=\"+num\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\thomeFind:function(){\r\n");
      out.write("\t\t\tvar userId = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userCus.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\tvar temp = this\r\n");
      out.write("\t\t\ttemp.ctx = $(\"#inp\").val()\r\n");
      out.write("\t\t\ttemp.url=\"bigCow/paging/homeFind\"\r\n");
      out.write("\t\t    $.ajax({ \r\n");
      out.write("\t              type : \"post\", \r\n");
      out.write("\t              url : \"bigCow/topic/findFromHome\", \r\n");
      out.write("\t              data : {\"userId\":temp.userid,\"ctx\":temp.ctx}, \r\n");
      out.write("\t              async : false, \r\n");
      out.write("\t              dataType: 'json',\r\n");
      out.write("\t              success : function(data){ \r\n");
      out.write("\t  \t\t\t\ttemp.topics=JSON.parse(data.data.topics.pageJSON)\r\n");
      out.write("\t\t\t\t\ttemp.count=data.data.topics.allNum\r\n");
      out.write("\t\t\t\t\ttemp.limit=data.data.topics.nowPageNum\r\n");
      out.write("\t              } \r\n");
      out.write("\t         }); \r\n");
      out.write("\t\t},\r\n");
      out.write("\t\ttoPage:function(href){\r\n");
      out.write("\t\t\t/* window.open(href) */\r\n");
      out.write("\t\t}\r\n");
      out.write("\t},\r\n");
      out.write("\tcreated: function(){\r\n");
      out.write("\t\tthis.getPros()\r\n");
      out.write("\t\tthis.getGit()\r\n");
      out.write("\t\tthis.getUserTops('bigCow/topic/getByUserId')\r\n");
      out.write("\t\tthis.getSdf()\r\n");
      out.write("\t},\r\n");
      out.write("\tfilters: {\r\n");
      out.write("\t\tformatText(text){\r\n");
      out.write("\t\t\tvar reg=new RegExp(/\\<p\\>([\\w\\s\\.\\u4e00-\\u9fa5]+)\\<\\/p\\>/g)\r\n");
      out.write("\t\t\ttext=reg.exec(text)\r\n");
      out.write("\t\t\ttext=text[1].substring(0,155)\r\n");
      out.write("\t\t\ttext+=\" ...\"\r\n");
      out.write("\t\t\treturn text\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tformatDate: function(date){\r\n");
      out.write("\t\t\tdate = new Date(date)\r\n");
      out.write("\t\t\tvar m=(date.getMinutes())<9?'0'+(date.getMinutes()):(date.getMinutes())\r\n");
      out.write("\t\t\treturn date=date.getFullYear()+\"-\"+(date.getMonth()+1)+\"-\"+date.getDate()+\" \"+date.getHours()+\":\"+m\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("})\r\n");
      out.write("\r\n");
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
