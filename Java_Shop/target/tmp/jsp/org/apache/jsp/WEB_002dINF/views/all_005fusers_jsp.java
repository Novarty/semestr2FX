package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class all_005fusers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_select_path;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_button_value_name_class;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_form_modelAttribute_method_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sf_select_path = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sf_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sf_button_value_name_class = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sf_form_modelAttribute_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sf_select_path.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_sf_option_value.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_sf_button_value_name_class.release();
    _jspx_tagPool_sf_form_modelAttribute_method_action.release();
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Список пользователей</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://meyerweb.com/eric/tools/css/reset/reset.css\">\r\n");
      out.write("    <link href=\"/resources/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"/resources/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"/\">Java_Shop</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                <li><a href=\"/\">Главная</a></li>\r\n");
      out.write("                <li class=\"active\"><a href=\"/all_users\">Пользователи</a></li>\r\n");
      out.write("                <li><a href=\"/new\">Добавить товар</a></li>\r\n");
      out.write("                <li><a href=\"/logout\">Выйти</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <form class=\"navbar-form navbar-right\" action=\"/\">\r\n");
      out.write("                <input type=\"text\" name=\"params\" class=\"form-control\" placeholder=\"Поиск по названию...\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </div><!--/.nav-collapse -->\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\" style=\"margin-top: 75px;\">");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("            <h1>Список пользователей</h1>\r\n");
      out.write("            <table class=\"table table-bordered table-hover white\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th class=\"bold\">Email</th>\r\n");
      out.write("                    <th class=\"bold\">Имя пользователя</th>\r\n");
      out.write("                    <th class=\"bold\">Роль</th>\r\n");
      out.write("                    <th class=\"bold\">Статус активности</th>\r\n");
      out.write("                    <th></th>\r\n");
      out.write("                    <th></th>\r\n");
      out.write("                    <th></th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("user");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <tbody>\r\n");
            out.write("                    <tr>\r\n");
            out.write("                        ");
            //  sf:form
            org.springframework.web.servlet.tags.form.FormTag _jspx_th_sf_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_sf_form_modelAttribute_method_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
            _jspx_th_sf_form_0.setPageContext(_jspx_page_context);
            _jspx_th_sf_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
            _jspx_th_sf_form_0.setAction("/all_users");
            _jspx_th_sf_form_0.setMethod("post");
            _jspx_th_sf_form_0.setModelAttribute("userform");
            int[] _jspx_push_body_count_sf_form_0 = new int[] { 0 };
            try {
              int _jspx_eval_sf_form_0 = _jspx_th_sf_form_0.doStartTag();
              if (_jspx_eval_sf_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("                            <td>");
                  if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
                    return;
                  out.write("</td>\r\n");
                  out.write("                            <td>");
                  if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
                    return;
                  out.write("</td>\r\n");
                  out.write("                            <td>");
                  if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
                    return;
                  out.write("</td>\r\n");
                  out.write("                            <td>");
                  if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
                    return;
                  out.write("\r\n");
                  out.write("                                ");
                  if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
                    return;
                  out.write("</td>\r\n");
                  out.write("                            <td>");
                  //  sf:select
                  org.springframework.web.servlet.tags.form.SelectTag _jspx_th_sf_select_0 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_sf_select_path.get(org.springframework.web.servlet.tags.form.SelectTag.class);
                  _jspx_th_sf_select_0.setPageContext(_jspx_page_context);
                  _jspx_th_sf_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
                  _jspx_th_sf_select_0.setPath("is_confirm");
                  int[] _jspx_push_body_count_sf_select_0 = new int[] { 0 };
                  try {
                    int _jspx_eval_sf_select_0 = _jspx_th_sf_select_0.doStartTag();
                    if (_jspx_eval_sf_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n");
                        out.write("                                ");
                        //  sf:option
                        org.springframework.web.servlet.tags.form.OptionTag _jspx_th_sf_option_0 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_sf_option_value.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                        _jspx_th_sf_option_0.setPageContext(_jspx_page_context);
                        _jspx_th_sf_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_select_0);
                        _jspx_th_sf_option_0.setValue(new String("true"));
                        int[] _jspx_push_body_count_sf_option_0 = new int[] { 0 };
                        try {
                          int _jspx_eval_sf_option_0 = _jspx_th_sf_option_0.doStartTag();
                          if (_jspx_eval_sf_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_sf_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_sf_option_0[0]++;
                              _jspx_th_sf_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_sf_option_0.doInitBody();
                            }
                            do {
                              out.write("подтвердить");
                              int evalDoAfterBody = _jspx_th_sf_option_0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_sf_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_sf_option_0[0]--;
                          }
                          if (_jspx_th_sf_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_sf_option_0[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_sf_option_0.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_sf_option_0.doFinally();
                          _jspx_tagPool_sf_option_value.reuse(_jspx_th_sf_option_0);
                        }
                        out.write("\r\n");
                        out.write("                                ");
                        //  sf:option
                        org.springframework.web.servlet.tags.form.OptionTag _jspx_th_sf_option_1 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_sf_option_value.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                        _jspx_th_sf_option_1.setPageContext(_jspx_page_context);
                        _jspx_th_sf_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_select_0);
                        _jspx_th_sf_option_1.setValue(new String("false"));
                        int[] _jspx_push_body_count_sf_option_1 = new int[] { 0 };
                        try {
                          int _jspx_eval_sf_option_1 = _jspx_th_sf_option_1.doStartTag();
                          if (_jspx_eval_sf_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_sf_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_sf_option_1[0]++;
                              _jspx_th_sf_option_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_sf_option_1.doInitBody();
                            }
                            do {
                              out.write("отменить подтверждение");
                              int evalDoAfterBody = _jspx_th_sf_option_1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_sf_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_sf_option_1[0]--;
                          }
                          if (_jspx_th_sf_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_sf_option_1[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_sf_option_1.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_sf_option_1.doFinally();
                          _jspx_tagPool_sf_option_value.reuse(_jspx_th_sf_option_1);
                        }
                        out.write("\r\n");
                        out.write("                            ");
                        int evalDoAfterBody = _jspx_th_sf_select_0.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_sf_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_sf_select_0[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_sf_select_0.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_sf_select_0.doFinally();
                    _jspx_tagPool_sf_select_path.reuse(_jspx_th_sf_select_0);
                  }
                  out.write("</td>\r\n");
                  out.write("                            <td>\r\n");
                  out.write("                                ");
                  if (_jspx_meth_sf_button_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
                    return;
                  out.write("\r\n");
                  out.write("                            </td>\r\n");
                  out.write("                        ");
                  int evalDoAfterBody = _jspx_th_sf_form_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_sf_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_form_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_form_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_form_0.doFinally();
              _jspx_tagPool_sf_form_modelAttribute_method_action.reuse(_jspx_th_sf_form_0);
            }
            out.write("\r\n");
            out.write("                        <form action=\"/all_users\" method=\"post\">\r\n");
            out.write("                            <td>\r\n");
            out.write("                                <button type=\"submit\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" name=\"name\"\r\n");
            out.write("                                           class=\"btn btn-danger\">Удалить</button>\r\n");
            out.write("                            </td>\r\n");
            out.write("                        </form>\r\n");
            out.write("                    </tr>\r\n");
            out.write("                    </tbody>\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("            <a class=\"btn btn-default\" href=\"/\">На главную</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.role}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.is_confirm == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("подтвержден");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.is_confirm != true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("не подтвержден");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_sf_button_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:button
    org.springframework.web.servlet.tags.form.ButtonTag _jspx_th_sf_button_0 = (org.springframework.web.servlet.tags.form.ButtonTag) _jspx_tagPool_sf_button_value_name_class.get(org.springframework.web.servlet.tags.form.ButtonTag.class);
    _jspx_th_sf_button_0.setPageContext(_jspx_page_context);
    _jspx_th_sf_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_button_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sf_button_0.setName("id");
    _jspx_th_sf_button_0.setDynamicAttribute(null, "class", new String("btn btn-success"));
    int[] _jspx_push_body_count_sf_button_0 = new int[] { 0 };
    try {
      int _jspx_eval_sf_button_0 = _jspx_th_sf_button_0.doStartTag();
      if (_jspx_eval_sf_button_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Изменить");
          int evalDoAfterBody = _jspx_th_sf_button_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sf_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_button_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_button_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_button_0.doFinally();
      _jspx_tagPool_sf_button_value_name_class.reuse(_jspx_th_sf_button_0);
    }
    return false;
  }
}
