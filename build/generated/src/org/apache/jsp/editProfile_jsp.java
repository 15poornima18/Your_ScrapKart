package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>EditProfile</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/register.css\">\n");
      out.write("       \n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script> -->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <ul>\n");
      out.write("                <li id=\"logo\"><a href=\"logout.jsp\"><img src=\"images/logo.jpg\" alt=\"ScrapKart\" height=\"60\" width=\"100\"></a></li>\n");
      out.write("                <li><a href=\"www.google.com\">Contact</a></li>\n");
      out.write("                <li><a href=\"request.html\">Request PickUp</a></li>\n");
      out.write("                <li><a href=\"www.google.com\">Price List</a></li>\n");
      out.write("                <li><a href=\"www.google.com\">Login/Register</a></li>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"row\"  >\n");
      out.write("            <div class=\"col-sm-12 registerform\">\n");
      out.write("                <h1 class=\"heading\">Edit Profile</h1>\n");
      out.write("                <hr>\n");
      out.write("                <form method=\"post\" action=\"EditProfileServlet\">\n");
      out.write("                    <div class=\"row\" style=\"width:91% ;\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                                <label>Name :</label><br>\n");
      out.write("                                <input type=\"text\" name=\"Name\" placeholder=\"Enter Name\" required>\n");
      out.write("                        </div>\n");
      out.write("       \n");
      out.write("                    </div><br>\n");
      out.write("                    <div class=\"row\" style=\"width:91% ;\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                                <label>Contact :</label><br>\n");
      out.write("                                <input type=\"text\" name=\"Contact\" placeholder=\"+91\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <label>Address:</label><br>\n");
      out.write("                    <div class=\"row\" style=\"width:91% ;\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" name=\"City\" placeholder=\"Enter City\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" name=\"Street\" placeholder=\"Enter Street\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"text\" name=\"Landmark\" placeholder=\"Enter Landmark\" required><br><br>\n");
      out.write("                    <input type=\"text\" name=\"House_no\" placeholder=\"Enter Houseno\" required><br><br>\n");
      out.write("                    <input type=\"text\" name=\"Add_type\" placeholder=\"Enter Address Type\" required><br><br>\n");
      out.write("                  \n");
      out.write("                    <label onclick=\"document.getElementById('id01').style.display='block'\" class=\"w3-button w3-large myclick\" style=\"background-color: green;margin-left: 20px; color:white; text-align:center;float:right;\">Change Password</label><br> \n");
      out.write("                    <button type=“button”  class=\"w3-button w3-large myclick\" style=\"background-color: green; color:white; text-align:center;float:right;\"><a href=\"requestForm.jsp\">Back</a></button>\n");
      out.write("\n");
      out.write("                    <input  type=\"submit\" value=\"Submit\" class=\"w3-button w3-large myclick\" style=\"color: green; float:right; color:white; margin-top: 5px; margin-left:10px;\"><br><br>\n");
      out.write("                </form>\n");
      out.write("                <div id=\"id01\" class=\"w3-modal\">\n");
      out.write("                    <div class=\"w3-modal-content w3-card-4 w3-animate-zoom\" style=\"max-width:600px\">\n");
      out.write("     \n");
      out.write("                     <div class=\"w3-center\"><br>\n");
      out.write("                         <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"w3-button w3-xlarge w3-hover-red w3-display-topright\" title=\"Close Modal\">&times;</span>\n");
      out.write("     \n");
      out.write("                         <form  class=\"w3-container \" method=\"post\" action=\"changePasswordServlet\">\n");
      out.write("                         <div class=\"w3-section\">\n");
      out.write("                             <div class=\"form-group\" style=\"text-align: center\">\n");
      out.write("                                 <label style=\" font-weight: bold; font-size: 30px; text-align: center; \">Change Password</label><br><br>\n");
      out.write("                                 <label>Previous Password:</label><br>\n");
      out.write("                                 <input type=\"password\" name=\"password\" required><br>\n");
      out.write("                                 <label>New Password:</label><br>\n");
      out.write("                                 <input type=\"password\" name=\"new_password\" required><br>\n");
      out.write("                                 <label>Re-Enter Password:</label><br>\n");
      out.write("                                 <input type=\"password\" name=\"new_password\" required><br><br>\n");
      out.write("                                 \n");
      out.write("                                 <input  type=\"submit\" value=\"Confirm\" style=\"margin-left:50%\"><br><br>\n");
      out.write("     \n");
      out.write("                               </div>        \n");
      out.write("                         </div>\n");
      out.write("                         \n");
      out.write("                     </form>\n");
      out.write("                </div> \n");
      out.write("     \n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("                 \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"height:100px;background-color:rgb(6, 121, 92);\"></div>\n");
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
