package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;

public final class ImparPar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Par ou Impar advanced plus plus!</h1>\n");
      out.write("        \n");
      out.write("        <form action=\"ImparPar.jsp\">\n");
      out.write("            Par: <input type=\"radio\" name=\"opcao\" value=\"p\" checked/> <br/>\n");
      out.write("            Impar: <input type=\"radio\" name=\"opcao\" value=\"i\" /> <br/>\n");
      out.write("            Seu numero: <input type=\"number\" name=\"numero\" />\n");
      out.write("            <input type=\"submit\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        ");

            String op = request.getParameter("opcao");
            int numero = Integer.parseInt(request.getParameter("numero"));
            
            int numServidor = new Random().nextInt(10);
            
            int soma = numero + numServidor;
            
            String resultado = "p";
            
            if((soma % 2) != 0){
                resultado = "i";
            }
            
            if(op.equals(resultado)){
                out.println("<h2> Você Ganhou!</h2>");
            } else {
                out.println("<h2> Você Perdeu!</h2>");
            }
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
