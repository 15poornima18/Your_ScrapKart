package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import scrapKart.pojo.PkDetails;
import scrapKart.model.scrapKartModel;
import java.util.ArrayList;

public final class DashBoard2M2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>ScrapKart DashBoard</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Dashboard.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <!-- <div>\n");
      out.write("        <ul>\n");
      out.write("            <li id=\"logo\"><img src=\"images/logo.jpg\" alt=\"ScrapKart\" height=\"60\" width=\"100\"></li>\n");
      out.write("            <li><a href=\"EmployeeLogin.html\">Log out</a></li>\n");
      out.write("            <li><a href=\"DashBoard.html\">DashBoard</a></li>\n");
      out.write("            <li><a href=\"ViewRequest.jsp\">View Request</a></li>\n");
      out.write("            <li><a href=\"request.html\">Profile</a></li> \n");
      out.write("        </ul>\n");
      out.write("    </div> -->\n");
      out.write("    \n");
      out.write("     ");

         
              String total_purchase ="";
              try
              { 
                  total_purchase=scrapKartModel.purchaseAmount();
              }
              catch(SQLException e)
              {
                   e.printStackTrace();
              }      
           
              ArrayList<PkDetails> request_List=new ArrayList<PkDetails>();
                    
                if(!(request.getParameter("PickUpBoy Name")==null))
                    {
                        System.out.println("cusstomerrr");
                        String PkName=request.getParameter("PickUpBoy Name");
                        try
                        {
                            request_List=scrapKartModel.FetchDetailsPkName(PkName);
                        }
                        catch(Exception e)
                        {
                            e.printStackTrace();
                        }     
                    }              
                    else
                    {
                        String fromdate=request.getParameter("fromdate");
                        String todate=request.getParameter("toDate");
                        try
                        {
                            request_List=scrapKartModel.FetchDetailsOnFromdate(fromdate,todate);
                        }
                        catch(Exception e)
                        {
                            e.printStackTrace();
                        } 
                    }  
                    System.out.println(request_List);
        
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"row myrow\">\n");
      out.write("        <div class=\"col-sm-2\"><img src=\"images/logo.jpg\" class=\"img-fluid\"></div>\n");
      out.write("        <div class=\"col-sm-10 myheader\">\n");
      out.write("            <span class=\"myspan\" ><a >View Request</a></span>\n");
      out.write("            <span class=\"myspan\"><a href=\"DashBoard.html\">DashBoard</a></span>\n");
      out.write("            <span class=\"myspan\"><a href=\"EmployeeLogin.html\">Log out</a></span>\n");
      out.write("       </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"heading\">\n");
      out.write("        <h3 style=\"margin-left: 27px;\">DASHBOARD</h3>\n");
      out.write("    </div>   \n");
      out.write("    <div class=\"major\">\n");
      out.write("    <div class=\"minor1\">\n");
      out.write("         <form method=\"post\" action=\"DashBoardM2.jsp\">\n");
      out.write("            <h3>Filters</h3>\n");
      out.write("            <br>\n");
      out.write("            <a onclick=\"enable()\" class=\"resetAnchor\" > <p style=\"color:graytext; font-size: small;float:right\" onMouseOver=\"this.style.color=red\" onMouseOut=\"this.style.color=gray\">Reset Filters</p></a>\n");
      out.write("            \n");
      out.write("            <label for=\"Customer Name\">Search by PickUp Boy Name</label>\n");
      out.write("            <a onclick=\"disable1()\"><input type=\"text\" id=\"PickUpBoyName\" name=\"PickUpBoy Name\" placeholder=\"PickUpBoy Name\"></a><br>\n");
      out.write("           <label >Search by Date Range</label><br>\n");
      out.write("            <label > From</label><br>\n");
      out.write("            <a onclick=\"disable2()\"><input type=\"text\" pattern=\"\\d{1,2}/\\d{1,2}/\\d{4}\" class=\"datepicker\" name=\"fromdate\"  placeholder=\"dd/mm/yyyy\" id=\"fromdate\"></a>\n");
      out.write("            <label> To</label><br>\n");
      out.write("            <a onclick=\"disable2()\"><input type=\"text\" pattern=\"\\d{1,2}/\\d{1,2}/\\d{4}\" class=\"datepicker\" name=\"todate\" placeholder=\"dd/mm/yyyy\" id=\"todate\"></a>\n");
      out.write("            <input type=\"submit\" value=\"Search\">\n");
      out.write("        </form\n");
      out.write("         <input type=\"submit\" value=\"Search Again\" onclick=\"window.location.href='DashBoardM2.jsp'\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container-fluid\" style=\" height:200px;\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\" col-sm-5 minor2\">\n");
      out.write("                <h4 style=\"text-align: center;\">PURCHASE</h4>\n");
      out.write("                <p style=\"text-align:center;\">Today's overall purchase</p>\n");
      out.write("                <br>\n");
      out.write("                <span>\n");
      out.write("                    \n");
      out.write("                    <h1 style=\"text-align: center;\">");
      out.print( total_purchase);
      out.write("</h1>\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-2\" style=\"width:8%;\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!--<div class=\" col-sm-5 minor2\">\n");
      out.write("                <h4 style=\"text-align: center;\">EXPENSES</h4>\n");
      out.write("                <p style=\"text-align:center;\">Today's overall expenses</p>\n");
      out.write("                <br>\n");
      out.write("                <span>\n");
      out.write("                    <h1 style=\"text-align: center;\">Rs 500</h1>\n");
      out.write("                </span>\n");
      out.write("            </div>-->\n");
      out.write("        </div> \n");
      out.write("    </div>\n");
      out.write("    <div class=\"minor3\">\n");
      out.write("        <h4>PICKUP BOY DETAILS</h4>\n");
      out.write("\n");
      out.write("        <table class=\"table  reqTable\" >\n");
      out.write("            <thead class=\"rowhead\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>PickUp Boy Id</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Req. Assigned</th>\n");
      out.write("                    <th>Status</th>\n");
      out.write("                    <th>Scheduled Date</th>    \n");
      out.write("               </tr>\n");
      out.write("           </thead>\n");
      out.write("           <tbody>\n");
      out.write("               ");

                   for(PkDetails d:request_List)
                   {
               
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                   <td>");
      out.print(d.getPk_Id() );
      out.write("</td> \n");
      out.write("                  <td>");
      out.print(d.getName() );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(d.getReq_id() );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(d.getStatus() );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(d.getScheduled_date() );
      out.write("</td>\n");
      out.write("               </tr>\n");
      out.write("               ");
}
               
      out.write("\n");
      out.write("           </tbody>\n");
      out.write("   </table>\n");
      out.write("    </div>    \n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("      function disableAll()\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"PickUpBoyName\").disabled=true;\n");
      out.write("            document.getElementById(\"fromdate\").disabled=true;\n");
      out.write("            document.getElementById(\"todate\").disabled=true;\n");
      out.write("            document.getElementById(\"PickUpBoyName\").disabled=\"PickUpBoy Name\";\n");
      out.write("            document.getElementById(\"fromdate\").placeholder = \"dd-mm-yyyy\";\n");
      out.write("            document.getElementById(\"todate\").placeholder = \"dd-mm-yyyy\";\n");
      out.write("        }\n");
      out.write("</script>\n");
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
}
