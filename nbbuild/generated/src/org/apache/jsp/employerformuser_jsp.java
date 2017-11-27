package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import smailpackage.employerdao;
import smailpackage.employer;

public final class employerformuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("    <title>ajouter user</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("    <link href=\"css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"starter-template.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\r\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n");
      out.write("    <script src=\"../../assets/js/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"employerform.jsp\">intervention</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"collapse navbar-collapse\">\r\n");
      out.write("          <ul class=\"nav navbar-nav\">\r\n");
      out.write("             <li ><a href=\"consultreqnom.jsp\">consultation</a></li>\r\n");
      out.write("            \r\n");
      out.write("              \r\n");
      out.write("           \r\n");
      out.write("            \r\n");
      out.write("          \r\n");
      out.write("             <li><a href=\"#contact\">help</a></li>\r\n");
      out.write("             \r\n");
      out.write("             \r\n");
      out.write("             </ul>\r\n");
      out.write("             \r\n");
      out.write("             \r\n");
      out.write("             \r\n");
      out.write("             \r\n");
      out.write("          \r\n");
      out.write("        </div><!--/.nav-collapse -->\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("      <div class=\"starter-template\">\r\n");
      out.write("       <br><br><br>\r\n");
      out.write("          \r\n");
      out.write("       \r\n");
      out.write(" \r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  <div class=\"jumbotron\">\r\n");
      out.write("  <img src=\"css/cwc_splash.jpg\" class=\"img-rounded\" alt=\"naftal\" width=\"400\" height=\"236\" style=\"float:right\">\r\n");
      out.write("<form action=\"addemployer.jsp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
List<employer>l=employerdao.getdepartementt(); 
      out.write("\r\n");
      out.write("<label>departement:</label>\r\n");
      out.write("<select name=\"departement\"  class=\"form-control\">\r\n");
      out.write("<option value=\"\"></option>\r\n");
for(employer t:l){ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<option value=\"");
      out.print(t.getNdepartement());
      out.write('"');
      out.write('>');
      out.print(t.getNdepartement());
      out.write("</option>\r\n");
      out.write("\r\n");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("</select><br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
List<employer> lii=employerdao.getservice(); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<label for=\"usr\">service:</label>\r\n");
      out.write("<select name=\"service\" class=\"form-control\">\r\n");
      out.write("<option value=\"\"></option>\r\n");
for(employer tt:lii){ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<option value=\"");
      out.print(tt.getNservice());
      out.write('"');
      out.write('>');
      out.print(tt.getNservice() );
      out.write("</option>\r\n");
      out.write("\r\n");
} 
      out.write("\r\n");
      out.write("</select><br><br>\r\n");
      out.write("\r\n");
      out.write("<label for=\"usr\">nom:</label>\r\n");
      out.write("<input type=\"text\" name=\"nom\"  class=\"form-control\" /><br>\r\n");
      out.write("<label for=\"usr\">nature:</label>\r\n");
      out.write("<select name=\"nature\"  class=\"form-control\" >\r\n");
      out.write("<option value=\"\"></option>\r\n");
      out.write("  <option value=\"hard\">hard</option>\r\n");
      out.write("  <option value=\"soft\">soft</option>\r\n");
      out.write("\r\n");
      out.write("</select><br><br>\r\n");
      out.write("<label for=\"usr\">panne:</label>\r\n");
      out.write("<select name=\"panne\"  class=\"form-control\">\r\n");
      out.write("<option value=\"\"></option>\r\n");
      out.write("  <option value=\"imprimante\">imprimante</option>\r\n");
      out.write("  <option value=\"onduleur\">onduleur</option>\r\n");
      out.write("\r\n");
      out.write("</select><br><br>\r\n");
      out.write("<label for=\"usr\">date:</label>\r\n");
      out.write("<input type=\"date\" name=\"date\"  class=\"form-control\"/><br><br>\r\n");
      out.write("<label for=\"usr\">datetr:</label>\r\n");
      out.write("<input type=\"date\" name=\"datetr\"  class=\"form-control\"/><br><br>\r\n");
      out.write("<label for=\"usr\">etat:</label>\r\n");
      out.write("<input type=\"text\" name=\"etat\"  class=\"form-control\"/><br><br>\r\n");
      out.write("<label for=\"usr\">observation:</label>\r\n");
      out.write("  \r\n");
      out.write("<textarea class=\"form-control\" rows=\"5\" name=\"observation\"></textarea><br><br>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<input type=\"submit\" value=\"ajouter_requete\" class=\"btn btn-primary\"/>\r\n");
      out.write("<a href=\"employerform.jsp\"   type=\"button\" class=\"btn btn-warning btn-md\">annule</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write(" <!-- /.container -->\r\n");
      out.write("      </div>\r\n");
      out.write("</div></div>\r\n");
      out.write("    </div><!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core JavaScript\r\n");
      out.write("    ================================================== -->\r\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery.min.js\"><\\/script>')</script>\r\n");
      out.write("    <script src=\"../../dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("    <script src=\"../../assets/js/ie10-viewport-bug-workaround.js\"></script>\r\n");
      out.write("  </body>\r\n");
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
}
