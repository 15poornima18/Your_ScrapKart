package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PriceList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>PriceList</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/PriceList.css\">\n");
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
      out.write("                <span><a href=\"www.google.com\">Price List</a></span>\n");
      out.write("                <span><a onclick=\"alert('Please Login first!');\">Request PickUp</a></span>\n");
      out.write("                <span><a href=\"login.jsp\">Login/Register</a></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <!-- <hr> -->\n");
      out.write("        <div class=\"container-fluid\" >\n");
      out.write("            <div class=\"container\" style=\"background-color: white; height: 1200px;\">\n");
      out.write("                    <h3 style=\"text-align: center;\">Rates of Scrap</h3>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\" col-sm-3 scrapbox\" >\n");
      out.write("                            <img src=\"images/pricelist/aluminium.png\" style=\"margin-left: 30px; margin-bottom: 0px; margin-top: 10px;\" height=\"100\" width=\"100\">\n");
      out.write("                            <br>\n");
      out.write("                            <h4 style=\"text-align: center; color:green;margin-top: 0px; font-weight: bold;\">Aluminium</h4>\n");
      out.write("                            <h4  style=\"text-align: center; color:black;margin-top: 0px; font-weight: bold;\">Rate</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\" col-sm-3 scrapbox\" >\n");
      out.write("\n");
      out.write("                            <img src=\"images/pricelist/books.png\" style=\"margin-left: 30px; margin-bottom: 0px; margin-top: 10px;\" height=\"100\" width=\"100\">\n");
      out.write("                            <br>\n");
      out.write("                            <h4 style=\"text-align: center; color:green;margin-top: 0px; font-weight: bold;\">Books</h4>\n");
      out.write("                            <h4  style=\"text-align: center; color:black;margin-top: 0px; font-weight: bold;\">Rate</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\" col-sm-3 scrapbox\" >\n");
      out.write("                            <img src=\"images/pricelist/brass.png\" style=\"margin-left: 30px; margin-bottom: 0px; margin-top: 10px;\" height=\"100\" width=\"100\">\n");
      out.write("                            <br>\n");
      out.write("                            <h4 style=\"text-align: center; color:green;margin-top: 0px; font-weight: bold;\">Brass</h4>\n");
      out.write("                            <h4  style=\"text-align: center; color:black;margin-top: 0px; font-weight: bold;\">Rate</h4>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\" col-sm-3 scrapbox\" >\n");
      out.write("                            <img src=\"images/pricelist/carton.png\" style=\"margin-left: 30px; margin-bottom: 0px; margin-top: 10px;\" height=\"100\" width=\"100\">\n");
      out.write("                            <br>\n");
      out.write("                            <h4 style=\"text-align: center; color:green;margin-top: 0px; font-weight: bold;\">Carton House</h4>\n");
      out.write("                            <h4  style=\"text-align: center; color:black;margin-top: 0px; font-weight: bold;\">Rate</h4>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- row 1 -->\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\" col-sm-3 scrapbox\" >\n");
      out.write("                            <img src=\"images/pricelist/carton.png\" style=\"margin-left: 30px; margin-bottom: 0px; margin-top: 10px;\" height=\"100\" width=\"100\">\n");
      out.write("                            <br>\n");
      out.write("                            <h4 style=\"text-align: center; color:green;margin-top: 0px; font-weight: bold;\">Ccarton Shop</h4>\n");
      out.write("                            <h4  style=\"text-align: center; color:black;margin-top: 0px; font-weight: bold;\">Rate</h4>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\" col-sm-3 scrapbox\" >\n");
      out.write("                            <img src=\"images/pricelist/ewaste.png\" style=\"margin-left: 30px; margin-bottom: 0px; margin-top: 10px;\" height=\"100\" width=\"100\">\n");
      out.write("                            <br>\n");
      out.write("                            <h4 style=\"text-align: center; color:green;margin-top: 0px; font-weight: bold;\">E-Waste</h4>\n");
      out.write("                            <h4  style=\"text-align: center; color:black;margin-top: 0px; font-weight: bold;\">Rate</h4>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\" col-sm-3 scrapbox\" >\n");
      out.write("                            <img src=\"images/pricelist/fiber.png\" style=\"margin-left: 30px; margin-bottom: 0px; margin-top: 10px;\" height=\"100\" width=\"100\">\n");
      out.write("                            <br>\n");
      out.write("                            <h4 style=\"text-align: center; color:green;margin-top: 0px; font-weight: bold;\">Fiber</h4>\n");
      out.write("                            <h4  style=\"text-align: center; color:black;margin-top: 0px; font-weight: bold;\">Rate</h4>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\" col-sm-3 scrapbox\" >\n");
      out.write("                            <img src=\"images/pricelist/hardplastic.png\" style=\"margin-left: 30px; margin-bottom: 0px; margin-top: 10px;\" height=\"100\" width=\"100\">\n");
      out.write("                            <br>\n");
      out.write("                            <h4 style=\"text-align: center; color:green;margin-top: 0px; font-weight: bold;\">Hard Plastic</h4>\n");
      out.write("                            <h4  style=\"text-align: center; color:black;margin-top: 0px; font-weight: bold;\">Rate</h4>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- row 2 -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\" col-sm-3 scrapbox\" >\n");
      out.write("                            <img src=\"images/pricelist/iron.png\" style=\"margin-left: 30px; margin-bottom: 0px; margin-top: 10px;\" height=\"100\" width=\"100\">\n");
      out.write("                            <br>\n");
      out.write("                            <h4 style=\"text-align: center; color:green;margin-top: 0px; font-weight: bold;\">Iron</h4>\n");
      out.write("                            <h4  style=\"text-align: center; color:black;margin-top: 0px; font-weight: bold;\">Rate</h4>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\" col-sm-3 scrapbox\" >\n");
      out.write("                            <img src=\"images/pricelist/newspaper.png\" style=\"margin-left: 30px; margin-bottom: 0px; margin-top: 10px;\" height=\"100\" width=\"100\">\n");
      out.write("                            <br>\n");
      out.write("                            <h4 style=\"text-align: center; color:green;margin-top: 0px; font-weight: bold;\">Newspaper</h4>\n");
      out.write("                            <h4  style=\"text-align: center; color:black;margin-top: 0px; font-weight: bold;\">Rate</h4>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\" col-sm-3 scrapbox\" >\n");
      out.write("                            <img src=\"images/pricelist/oilcovers.png\" style=\"margin-left: 30px; margin-bottom: 0px; margin-top: 10px;\" height=\"100\" width=\"100\">\n");
      out.write("                            <br>\n");
      out.write("                            <h5 style=\"text-align: center; color:green;margin-top: 0px; font-weight: bold;\">Oil,WaterCovers</h5>\n");
      out.write("                            <h4  style=\"text-align: center; color:black;margin-top: 0px; font-weight: bold;\">Rate</h4>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\" col-sm-3 scrapbox\" >\n");
      out.write("                            <img src=\"images/pricelist/paperwaste.png\" style=\"margin-left: 30px; margin-bottom: 0px; margin-top: 10px;\" height=\"100\" width=\"100\">\n");
      out.write("                            <br>\n");
      out.write("                            <h4 style=\"text-align: center; color:green;margin-top: 0px; font-weight: bold;\">Paper Waste</h4>\n");
      out.write("                            <h4  style=\"text-align: center; color:black;margin-top: 0px; font-weight: bold;\">Rate</h4>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- row 3 -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\" col-sm-3 scrapbox\" >\n");
      out.write("                            <img src=\"images/pricelist/polyethene.png\" style=\"margin-left: 30px; margin-bottom: 0px; margin-top: 10px;\" height=\"100\" width=\"100\">\n");
      out.write("                            <br>\n");
      out.write("                            <h4 style=\"text-align: center; color:green;margin-top: 0px; font-weight: bold;\">Polyethene</h4>\n");
      out.write("                            <h4  style=\"text-align: center; color:black;margin-top: 0px; font-weight: bold;\">Rate</h4>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\" col-sm-3 scrapbox\" >\n");
      out.write("                            <img src=\"images/pricelist/steel.png\" style=\"margin-left: 30px; margin-bottom: 0px; margin-top: 10px;\" height=\"100\" width=\"100\">\n");
      out.write("                            <br>\n");
      out.write("                            <h4 style=\"text-align: center; color:green;margin-top: 0px; font-weight: bold;\">Steel</h4>\n");
      out.write("                            <h4  style=\"text-align: center; color:black;margin-top: 0px; font-weight: bold;\">Rate</h4>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\" col-sm-3 scrapbox\" >\n");
      out.write("                            <img src=\"images/pricelist/tin.png\" style=\"margin-left: 30px; margin-bottom: 0px; margin-top: 10px;\" height=\"100\" width=\"100\">\n");
      out.write("                            <br>\n");
      out.write("                            <h4 style=\"text-align: center; color:green;margin-top: 0px; font-weight: bold;\">Tin</h4>\n");
      out.write("                            <h4  style=\"text-align: center; color:black;margin-top: 0px; font-weight: bold;\">Rate</h4>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\" col-sm-3 scrapbox\" >\n");
      out.write("                            <img src=\"images/pricelist/tyre.png\" style=\"margin-left: 30px; margin-bottom: 0px;margin-top: 10px;\" height=\"100\" width=\"100\">\n");
      out.write("                            <br>\n");
      out.write("                            <h4 style=\"text-align: center; color:green;margin-top: 0px; font-weight: bold;\">Tyre</h4>\n");
      out.write("                            <h4  style=\"text-align: center; color:black;margin-top: 0px; font-weight: bold;\">Rate</h4>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- row 4 -->\n");
      out.write("\n");
      out.write("                    <br><br>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" style=\"margin-left: 35%; font-size: x-large;\" onclick=\"location.href='Calculator/calculator.html'\"> Calculate Estimate Price of your Scrap</button>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
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
