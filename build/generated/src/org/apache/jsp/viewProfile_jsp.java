package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import scrapKart.model.scrapKartModel;
import java.util.ArrayList;
import scrapKart.pojo.Customer;

public final class viewProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>ViewProfile</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/register.css\">\n");
      out.write("     \n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script> -->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("         <div class=\"row myrow\" >\n");
      out.write("            <div class=\"col-sm-2\"><a href=\"logout.jsp\"><img src=\"images/logo.jpg\" class=\"img-fluid\"></a></div>\n");
      out.write("            <div class=\"col-sm-10 myheader\">\n");
      out.write("                <span><a href=\"www.google.com\">Contact</a></span>\n");
      out.write("                <span><a href=\"www.google.com\">Request PickUp</a></span>\n");
      out.write("                <span><a >Price List</a></span>\n");
      out.write("                <span><a href=\"login.jsp\">Login/Register</a></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");

            String user=session.getAttribute("user_mail").toString();
            ArrayList<Customer> cust =new ArrayList<Customer>();
             try
            {
                cust=scrapKartModel.getAllCustomer(user);
            }
            catch(SQLException e)
             {
                 e.printStackTrace();
             }
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"row\"  >\n");
      out.write("            <div class=\"col-sm-12 registerform\">\n");
      out.write("                <h1 class=\"heading\">Profile</h1>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"col-sm-6\" style=\"text-align:center\">\n");
      out.write("                    <label>Name :</label><br>\n");
      out.write("                    <label>Email :</label><br>\n");
      out.write("                    <label>Contact :</label><br>\n");
      out.write("                    <label>Address</label><br>\n");
      out.write("                    <label>House No:</label><br>\n");
      out.write("                    <label>Street:</label><br>\n");
      out.write("                    <label>Landmark:</label><br>\n");
      out.write("                    <label>City:</label><br>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-6\"  style=\"text-align:left\">\n");
      out.write("                    ");
 for(Customer c :cust)
                    { 
      out.write("          \n");
      out.write("                    <label style=\"color: black;\">");
      out.print( c.getName());
      out.write("</label><br>\n");
      out.write("                    <label style=\"color: black;\">");
      out.print( c.getEmail() );
      out.write("</label><br>\n");
      out.write("                    <label style=\"color: black;\">");
      out.print( c.getContact() );
      out.write("</label><br><br><br>\n");
      out.write("                    <label style=\"color: black;\">");
      out.print( c.getHouse_no());
      out.write("</label><br>\n");
      out.write("                    <label style=\"color: black;\">");
      out.print(  c.getStreet());
      out.write("</label><br>\n");
      out.write("                    <label style=\"color: black;\">");
      out.print( c.getLandmark());
      out.write("</label><br>\n");
      out.write("                    <label style=\"color: black;\">");
      out.print( c.getCity());
      out.write("</label><br><br> \n");
      out.write("                    ");
}
                    
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                    <a href=\"editProfile.jsp\"><label  class=\" btn btn-success myclick\" style=\"background-color: green;margin-left: 20px; color:white; text-align:center;float:right; font-size:20px;font-weight: bold;\">Edit Profile</label></a><br>                \n");
      out.write("                <button type=“button”  class=\" btn btn-success myclick\" style=\"background-color: green; color:white; text-align:center;float:right;  font-size:20px;font-weight: bold;\"><a href=\"requestForm.jsp\">Back</a></button>\n");
      out.write("\n");
      out.write("        \n");
      out.write("                 \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid\" style=\"height: 300px; background-color:#003F2A;\">\n");
      out.write("    </body>\n");
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
