package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_form_modelAttribute_method_cssClass_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_errors_path_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sf_form_modelAttribute_method_cssClass_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sf_errors_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.release();
    _jspx_tagPool_sf_form_modelAttribute_method_cssClass_action.release();
    _jspx_tagPool_sf_errors_path_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\"\r\n");
      out.write("      integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/signin.css\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Редактирование</title>\r\n");
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
      out.write("                <li class=\"active\"><a href=\"/\">Главная</a></li>\r\n");
      out.write("                <li><a href=\"/all_users\">Пользователи</a></li>\r\n");
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
      out.write("<div class=\"container\" style=\"margin-top: 75px\">\r\n");
      out.write("    ");
      //  sf:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_sf_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_sf_form_modelAttribute_method_cssClass_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_sf_form_0.setPageContext(_jspx_page_context);
      _jspx_th_sf_form_0.setParent(null);
      _jspx_th_sf_form_0.setCssClass("form-signin");
      _jspx_th_sf_form_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/edit?id=${item.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      _jspx_th_sf_form_0.setMethod("post");
      _jspx_th_sf_form_0.setModelAttribute("itemform");
      int[] _jspx_push_body_count_sf_form_0 = new int[] { 0 };
      try {
        int _jspx_eval_sf_form_0 = _jspx_th_sf_form_0.doStartTag();
        if (_jspx_eval_sf_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("        <h2 class=\"form-signin-heading\">Изменить товар</h2>\r\n");
            out.write("        <div class=\"panel panel-default panel-body\">\r\n");
            out.write("            ");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_errors_0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_sf_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_errors_0.setPageContext(_jspx_page_context);
            _jspx_th_sf_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
            _jspx_th_sf_errors_0.setPath("itemName");
            int[] _jspx_push_body_count_sf_errors_0 = new int[] { 0 };
            try {
              int _jspx_eval_sf_errors_0 = _jspx_th_sf_errors_0.doStartTag();
              if (_jspx_th_sf_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_errors_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_errors_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_errors_0.doFinally();
              _jspx_tagPool_sf_errors_path_nobody.reuse(_jspx_th_sf_errors_0);
            }
            out.write("\r\n");
            out.write("            ");
            if (_jspx_meth_sf_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
              return;
            out.write(" <br>\r\n");
            out.write("            ");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_errors_1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_sf_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_errors_1.setPageContext(_jspx_page_context);
            _jspx_th_sf_errors_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
            _jspx_th_sf_errors_1.setPath("description");
            int[] _jspx_push_body_count_sf_errors_1 = new int[] { 0 };
            try {
              int _jspx_eval_sf_errors_1 = _jspx_th_sf_errors_1.doStartTag();
              if (_jspx_th_sf_errors_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_errors_1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_errors_1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_errors_1.doFinally();
              _jspx_tagPool_sf_errors_path_nobody.reuse(_jspx_th_sf_errors_1);
            }
            out.write("\r\n");
            out.write("            ");
            if (_jspx_meth_sf_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
              return;
            out.write(" <br>\r\n");
            out.write("            ");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_errors_2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_sf_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_errors_2.setPageContext(_jspx_page_context);
            _jspx_th_sf_errors_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
            _jspx_th_sf_errors_2.setPath("city");
            int[] _jspx_push_body_count_sf_errors_2 = new int[] { 0 };
            try {
              int _jspx_eval_sf_errors_2 = _jspx_th_sf_errors_2.doStartTag();
              if (_jspx_th_sf_errors_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_errors_2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_errors_2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_errors_2.doFinally();
              _jspx_tagPool_sf_errors_path_nobody.reuse(_jspx_th_sf_errors_2);
            }
            out.write("\r\n");
            out.write("            ");
            if (_jspx_meth_sf_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
              return;
            out.write(" <br>\r\n");
            out.write("            ");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_errors_3 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_sf_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_errors_3.setPageContext(_jspx_page_context);
            _jspx_th_sf_errors_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
            _jspx_th_sf_errors_3.setPath("address");
            int[] _jspx_push_body_count_sf_errors_3 = new int[] { 0 };
            try {
              int _jspx_eval_sf_errors_3 = _jspx_th_sf_errors_3.doStartTag();
              if (_jspx_th_sf_errors_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_errors_3[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_errors_3.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_errors_3.doFinally();
              _jspx_tagPool_sf_errors_path_nobody.reuse(_jspx_th_sf_errors_3);
            }
            out.write("\r\n");
            out.write("            ");
            if (_jspx_meth_sf_input_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
              return;
            out.write(" <br>\r\n");
            out.write("            ");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_errors_4 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_sf_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_errors_4.setPageContext(_jspx_page_context);
            _jspx_th_sf_errors_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
            _jspx_th_sf_errors_4.setPath("amount");
            int[] _jspx_push_body_count_sf_errors_4 = new int[] { 0 };
            try {
              int _jspx_eval_sf_errors_4 = _jspx_th_sf_errors_4.doStartTag();
              if (_jspx_th_sf_errors_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_errors_4[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_errors_4.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_errors_4.doFinally();
              _jspx_tagPool_sf_errors_path_nobody.reuse(_jspx_th_sf_errors_4);
            }
            out.write("\r\n");
            out.write("            ");
            if (_jspx_meth_sf_input_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
              return;
            out.write(" <br>\r\n");
            out.write("            <button class=\"btn btn-primary\" type=\"submit\">Сохранить</button>\r\n");
            out.write("        </div>\r\n");
            out.write("        <a class=\"center\" href=\"/\">На главную</a>\r\n");
            out.write("    ");
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
        _jspx_tagPool_sf_form_modelAttribute_method_cssClass_action.reuse(_jspx_th_sf_form_0);
      }
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_sf_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_input_0.setPageContext(_jspx_page_context);
    _jspx_th_sf_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_input_0.setDynamicAttribute(null, "placeholder", new String("Название"));
    _jspx_th_sf_input_0.setCssClass("form-control");
    _jspx_th_sf_input_0.setPath("itemName");
    int[] _jspx_push_body_count_sf_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_sf_input_0 = _jspx_th_sf_input_0.doStartTag();
      if (_jspx_th_sf_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_input_0.doFinally();
      _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.reuse(_jspx_th_sf_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_sf_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_input_1.setPageContext(_jspx_page_context);
    _jspx_th_sf_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_input_1.setDynamicAttribute(null, "placeholder", new String("Описание"));
    _jspx_th_sf_input_1.setCssClass("form-control");
    _jspx_th_sf_input_1.setPath("description");
    int[] _jspx_push_body_count_sf_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_sf_input_1 = _jspx_th_sf_input_1.doStartTag();
      if (_jspx_th_sf_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_input_1.doFinally();
      _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.reuse(_jspx_th_sf_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_sf_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_input_2.setPageContext(_jspx_page_context);
    _jspx_th_sf_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_input_2.setDynamicAttribute(null, "placeholder", new String("Город склада"));
    _jspx_th_sf_input_2.setCssClass("form-control");
    _jspx_th_sf_input_2.setPath("city");
    int[] _jspx_push_body_count_sf_input_2 = new int[] { 0 };
    try {
      int _jspx_eval_sf_input_2 = _jspx_th_sf_input_2.doStartTag();
      if (_jspx_th_sf_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_input_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_input_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_input_2.doFinally();
      _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.reuse(_jspx_th_sf_input_2);
    }
    return false;
  }

  private boolean _jspx_meth_sf_input_3(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_input_3 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_input_3.setPageContext(_jspx_page_context);
    _jspx_th_sf_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_input_3.setDynamicAttribute(null, "placeholder", new String("Адрес склада"));
    _jspx_th_sf_input_3.setCssClass("form-control");
    _jspx_th_sf_input_3.setPath("address");
    int[] _jspx_push_body_count_sf_input_3 = new int[] { 0 };
    try {
      int _jspx_eval_sf_input_3 = _jspx_th_sf_input_3.doStartTag();
      if (_jspx_th_sf_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_input_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_input_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_input_3.doFinally();
      _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.reuse(_jspx_th_sf_input_3);
    }
    return false;
  }

  private boolean _jspx_meth_sf_input_4(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_input_4 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_input_4.setPageContext(_jspx_page_context);
    _jspx_th_sf_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_input_4.setDynamicAttribute(null, "placeholder", new String("Количество единиц товара"));
    _jspx_th_sf_input_4.setCssClass("form-control");
    _jspx_th_sf_input_4.setPath("amount");
    int[] _jspx_push_body_count_sf_input_4 = new int[] { 0 };
    try {
      int _jspx_eval_sf_input_4 = _jspx_th_sf_input_4.doStartTag();
      if (_jspx_th_sf_input_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_input_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_input_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_input_4.doFinally();
      _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.reuse(_jspx_th_sf_input_4);
    }
    return false;
  }
}
