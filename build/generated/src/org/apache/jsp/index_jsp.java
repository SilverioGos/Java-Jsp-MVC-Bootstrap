package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Document</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("      <div class=\"loginbox\">\n");
      out.write("        <img src=\"img/logblank.png\" alt=\"\" class=\"avatar\">\n");
      out.write("        <br>\n");
      out.write("        <h1>Login</h1>\n");
      out.write("        <br>\n");
      out.write("        <h3>Bienvenido al sistema</h3>\n");
      out.write("        <br>\n");
      out.write("        <form class=\"form-sign\" action=\"Validar\" method=\"POST\">\n");
      out.write("          <p>Usuario</p>\n");
      out.write("          <input type=\"text\" name=\"txtuser\" placeholder=\"Ingresa tu usuario\">\n");
      out.write("          <p>Contraseña</p>\n");
      out.write("          <input type=\"password\" name=\"txtpass\" placeholder=\"Ingresa tu contraseña\">\n");
      out.write("          <br>\n");
      out.write("          <br>\n");
      out.write("          <input type=\"submit\" name=\"accion\" value=\"Ingresar\">\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container mt-4 col-lg-4\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-body text-center\">\n");
      out.write("                    <form class=\"form-sign\" action=\"Validar\" method=\"POST\">\n");
      out.write("                        <div class=\"form-group text-center\">\n");
      out.write("                            <h3>Login</h3>\n");
      out.write("                            <img src=\"img/logo.png\" alt=\"70\" widht=\"170\"/>\n");
      out.write("                            <label>Bienvenidos al Sistema</label>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Usuario:</label>\n");
      out.write("                            <input type=\"text\" name=\"txtuser\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Contraseña:</label>\n");
      out.write("                            <input type=\"password\" name=\"txtpass\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"Ingresar\" class=\"btn btn-primary btn-block\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>          \n");
      out.write("        </div>\n");
      out.write("           <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>-->\n");
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
}
