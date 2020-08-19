package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>ScrapKart Register</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/register.css\">\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("         <div class=\"row myrow\" >\n");
      out.write("            <div class=\"col-sm-2\"><a href=\"logout.jsp\"><img src=\"images/logo.jpg\" class=\"img-fluid\"></a></div>\n");
      out.write("            <div class=\"col-sm-10 myheader\">\n");
      out.write("                <span><a href=\"www.google.com\">Contact</a></span>\n");
      out.write("                <span><a href=\"www.google.com\">Price List</a></span>\n");
      out.write("                <span><a >Request PickUp</a></span>\n");
      out.write("                <span><a href=\"login.jsp\">Login/Register</a></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"row\"  >\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("            <div class=\"col-sm-8 registerform\">\n");
      out.write("                <h1 class=\"heading\">Register</h1>\n");
      out.write("                <form method=\"post\" action=\"RegisterServlet\">\n");
      out.write("                    <label>Name:</label><br>\n");
      out.write("                    <input type=\"text\" name=\"Name\" required><br>\n");
      out.write("                    <label>Email:</label><br>\n");
      out.write("                    <input type=\"text\" name=\"email\" required><br>\n");
      out.write("                    <label>Password:</label><br>\n");
      out.write("                 \n");
      out.write("                    <input type=\"password\" id=\"pwd\" name=\"password\" onkeyup=\"validatePassword(this.value);\" required><br><span id=\"msg\"></span><br>\n");
      out.write("                    <label>Re-Enter Password:</label><br>\n");
      out.write("                    <input type=\"password\" name=\"confirm_password\" required><br>\n");
      out.write("                    <label>Contact:</label><br>\n");
      out.write("                    <input type=\"text\" name=\"Contact\" required><br>\n");
      out.write("                    <label>Address:</label><br>\n");
      out.write("                    <div class=\"row\" style=\"width:94% ;\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" name=\"City\" placeholder=\"Enter City\" required>\n");
      out.write("                        </div>\n");
      out.write("                      \n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" name=\"Street\" placeholder=\"Enter Street\" required>\n");
      out.write("                        </div>\n");
      out.write("                         <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" name=\"Add_type\" placeholder=\"Enter Address Type\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"text\" name=\"Landmark\" placeholder=\"Enter Landmark\" required><br><br>\n");
      out.write("                    <input type=\"text\" name=\"House_no\" placeholder=\"Enter Houseno\" required><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    <input  type=\"submit\" value=\"Submit\"><br><br>\n");
      out.write("                </form>\n");
      out.write("                <p class=\"confirm\">Already have an account?<a href=\"login.jsp\" style=\"color:green ;margin-left:6;\">Login</a></p>\n");
      out.write("                 \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-2\"></div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("               ");

        String status=request.getParameter("RegisValid");
        if(status!=null&&status.equals("false")){   
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("         alert(\"This Email_id has already been registered!!\");\n");
      out.write("     </script>\n");
      out.write("     ");

         }
        else if(status!=null&&status.equals("true"))
            {  
      
      out.write("\n");
      out.write("       <script>\n");
      out.write("         alert(\"Successfully Registered! Please login to continue.\");\n");
      out.write("     </script>\n");
      out.write("     ");
}
     
      out.write("\n");
      out.write("     <script>\n");
      out.write("        function validatePassword(password)\n");
      out.write("        {\n");
      out.write("            if(password.length<8)\n");
      out.write("            {    document.getElementById(\"msg\").innerHTML = \"Password must be atleast 8 charaters long!\";\n");
      out.write("                 document.getElementById(\"msg\").style.color = \"red\";\n");
      out.write("                return;\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"msg\").innerHTML = \"\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("     </script>\n");
      out.write("     \n");
      out.write("      <div class=\"container-fluid\" style=\"height: 300px; background-color:#003F2A;\">\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("\n");
      out.write("      \n");
      out.write("</html>\n");
      out.write("\n");
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
