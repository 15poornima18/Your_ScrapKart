package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import scrapKart.model.scrapKartModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import scrapKart.dbutil.DBConnection;
import java.sql.Connection;
import scrapKart.pojo.PickUpBoy;
import scrapKart.pojo.Material;
import scrapKart.pojo.Request;

public final class RequestInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Request Information</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/register.css\">\n");
      out.write("     \n");
      out.write("    </head>\n");
      out.write("    <body style =\"background-color: #003F2A;\">\n");
      out.write("     <div class=\"row myrow\" >\n");
      out.write("            <div class=\"col-sm-2\"><a href=\"logout.jsp\"><img src=\"images/logo.jpg\" class=\"img-fluid\"></a></div>\n");
      out.write("            <div class=\"col-sm-10 myheader\">\n");
      out.write("                <span><a href=\"www.google.com\">Contact</a></span>\n");
      out.write("                <span><a href=\"www.google.com\">Price List</a></span>\n");
      out.write("                <span><a onclick=\"alert('Please Login first!');\">Request PickUp</a></span>\n");
      out.write("                <span><a href=\"login.jsp\">Login/Register</a></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
  
                String request_id=request.getParameter("req_id");
                String user=session.getAttribute("user_mail").toString();
                Request req=new Request();
                PickUpBoy pkb=new PickUpBoy();
                Float total_weight=0.0f,total_cost=0.0f;
                ArrayList<Material> material_List=new ArrayList<Material>();
               
                try
                { 
                    req=scrapKartModel.getRequestDetails(request_id);
                    pkb=scrapKartModel.getPickUpBoyDetails(request_id);
                    material_List=scrapKartModel.getMaterialDetails(request_id);
                }
                catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
                
             
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-5\" style=\"text-align:center;  background-color:rgba(255, 255, 255, 0.945); margin-top:40px ;\" >\n");
      out.write("                        <h2 class=\"heading\">Request Information</h2>\n");
      out.write("                        <hr>\n");
      out.write("                        \n");
      out.write("                            <div class=\"col-sm-6\"  style=\"text-align:left;\">\n");
      out.write("                                <label>Requested Date :</label><br>\n");
      out.write("                                <label>Scheduled Date :</label><br>\n");
      out.write("                               \n");
      out.write("                            \n");
      out.write("                                <label>Address of PickUp</label><br><br><br>\n");
      out.write("                                <label>Assigned PickUp Boy:</label><br><br>\n");
      out.write("                                <label>Assigned PickUp Boy Contact information:</label><br>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                            <div class=\"col-sm-6\"  style=\"text-align:left\">\n");
      out.write("                                    \n");
      out.write("                                <label style=\"color: black;\">");
      out.print( req.getReq_date());
      out.write("</label><br>\n");
      out.write("                                <label style=\"color: black;\">");
      out.print( req.getSchd_date());
      out.write("</label><br>\n");
      out.write("                                <!--<label style=\"color: black;\"><></label><br>-->\n");
      out.write("                                <label style=\"color: black;\">");
      out.print( req.getAddress());
      out.write("</label><br><br>\n");
      out.write("                                <label style=\"color: black;\">");
      out.print( pkb.getName());
      out.write("</label><br><br>\n");
      out.write("                                <label style=\"color: black;\">");
      out.print( pkb.getContact_no());
      out.write("</label><br>\n");
      out.write("    \n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-1\"></div>\n");
      out.write("                    <div class=\"col-sm-6\" style=\"text-align:center; background-color:rgba(255, 255, 255, 0.945);margin-top:40px ;\">\n");
      out.write("                        <h1 class=\"heading\"> Scrap Information</h1>\n");
      out.write("                        <hr>\n");
      out.write("                            <div class=\"col-sm-12 \">\n");
      out.write("                                <table style=\"text-align:center\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Scrap Item</th>\n");
      out.write("                                        <th>Rate(Rs per kg)</th>\n");
      out.write("                                        <th>Weight</th>\n");
      out.write("                                        <th>Cost</th> \n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
for( Material mt: material_List )
                                    {
                                        total_weight+= mt.getWeight();
                                        total_cost+= mt.getCost();
                                     
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>");
      out.print( mt.getScrapItem());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( mt.getRate());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( mt.getWeight());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( mt.getCost());
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
}
                                      
      out.write("\n");
      out.write("                                \n");
      out.write("                                </table><br>\n");
      out.write("                               \n");
      out.write("                                <p style=\"text-align: left;font-size: 30px;\">Total weight :");
      out.print( total_weight );
      out.write(" kgs</p>\n");
      out.write("                                <p style=\"text-align: left;font-size: 30px;\">Total Cost : Rs ");
      out.print( total_cost );
      out.write("</p><br>\n");
      out.write("                                 \n");
      out.write("           \n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("                       \n");
      out.write("                </div>\n");
      out.write("                  \n");
      out.write("                           <br>  <a href=\"requestForm.jsp\"><button class=\"btn btn-primary\" style=\"padding-left: 30px;padding-right: 30px;\">Back</button></a>\n");
      out.write("                </div>\n");
      out.write("                <br><br><br>\n");
      out.write("        </div>\n");
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
