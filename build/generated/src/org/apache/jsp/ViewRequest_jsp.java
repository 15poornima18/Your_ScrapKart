package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import scrapKart.pojo.FilterOptions;
import java.sql.SQLException;
import scrapKart.model.scrapKartModel;
import java.util.ArrayList;
import scrapKart.pojo.ViewRequestM2;

public final class ViewRequest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <title>ScrapKart DashBoard</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/ViewRequest.css\">\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body style=\" background-color: rgba(178, 238, 144, 0.685)\">\n");
      out.write("    \n");
      out.write("    <div>\n");
      out.write("        <ul>\n");
      out.write("            <li id=\"logo\"><img src=\"images/logo.jpg\" alt=\"ScrapKart\" height=\"60\" width=\"100\"></li>\n");
      out.write("            <li><a href=\"EmployeeLogin.html\">Log out</a></li>\n");
      out.write("            <li><a href=\"DashBoard.html\">DashBoard</a></li>\n");
      out.write("            <li><a href=\"request.html\">View Request</a></li>\n");
      out.write("            <li><a href=\"request.html\">Profile</a></li>    \n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("        ");

              System.out.println("**1");
              ArrayList<ViewRequestM2> request_List=new ArrayList<ViewRequestM2>();
              System.out.println("%%");
              try
              {
                  System.out.println("***2");
                  request_List=scrapKartModel.getTodaysRequest();
              }
              catch(SQLException e)
              {
                   System.out.println("&&");
                   e.printStackTrace();
              }
              System.out.println("***3");
              System.out.println("SIZE OF ARRAYLIST:"+request_List.size());
        
      out.write("\n");
      out.write("            <div class=\"heading\">\n");
      out.write("                    <h2>REQUESTS</h2>\n");
      out.write("            </div>   \n");
      out.write("            <div class=\"major\">\n");
      out.write("               <div class=\"minor1\">\n");
      out.write("                   <form  method=\"post\" action=\"ViewRequestServletM2\">\n");
      out.write("                    <h3>Filters</h3>\n");
      out.write("                   \n");
      out.write("<!--             <a onclick=\"enableAll()\" onMouseOver=\"this.style.color='green'\" > <p style=\"color:graytext; font-size: small;float:right\">Reset Filters</p></a>-->\n");
      out.write("                   \n");
      out.write("                  <a onclick=\"disable()\"\n");
      out.write("                  onMouseOver=\"this.style.color='red'; this.style.cursor='pointer'\"\n");
      out.write("                  onMouseOut=\"this.style.color='gray'\" ><p style=\"color:graytext; font-size: small;float:right\">Reset Filters</p></a>\n");
      out.write("                  \n");
      out.write("                   <br>\n");
      out.write("                    <label>Search by Request Id</label>\n");
      out.write("                    <a onclick=\"disable1()\"><input type=\"text\" id=\"ReqId\" name=\"Request Id\" placeholder=\"Request Id\" ></a>\n");
      out.write("                    <label >Search by Customer Name </label>\n");
      out.write("                    <input type=\"text\" id=\"CustName\" name=\"Customer Name\" placeholder=\"Customer Name\"><br>\n");
      out.write("                    <label >Search by Date </label><br>\n");
      out.write("                    <input type=\"date\"  id=\"ondate\" name=\"ondate\">\n");
      out.write("                    \n");
      out.write("                    <label >Search by Date Range</label><br>\n");
      out.write("                    <label> From</label><br>\n");
      out.write("                    <input type=\"date\" name=\"fromDate\" id=\"fromdate\">\n");
      out.write("                    <label> To</label><br>\n");
      out.write("                    <input type=\"date\" name=\"toDate\" id=\"todate\">\n");
      out.write("                    <input type=\"submit\" value=\"Search\">\n");
      out.write("                </form>\n");
      out.write("               </div>\n");
      out.write("               ");

                    System.out.println("***4");
                    //String user=session.getAttribute("user_mail").toString();
                    FilterOptions options=new FilterOptions();
                    String request_id=request.getParameter("Request Id");
                    String customer_name=request.getParameter("Customer Name");
                    String ondate=request.getParameter("ondate");
                    String fromDate=request.getParameter("fromDate");
                    String toDate=request.getParameter("toDate");
               
      out.write("\n");
      out.write("               <div class=\"minor2\"> \n");
      out.write("                \n");
      out.write("                <button class=\"refresh\">\n");
      out.write("                    <a onclick=\"window.location.reload();\">  <img src=\"images/ref.png\" height=\"20\" width=\"20\"> </a>\n");
      out.write("                     <span>Refresh</span>\n");
      out.write("                 </button>\n");
      out.write("                 <button class=\"refresh\">\n");
      out.write("                    <img src=\"images/product.png\" height=\"20\" width=\"20\">\n");
      out.write("                    <span>Today's Requests</span>\n");
      out.write("                 </button>\n");
      out.write("\n");
      out.write("                <br><br>   \n");
      out.write("                <table class=\"table table-hover reqTable\" >\n");
      out.write("                         <thead class=\"rowhead\">\n");
      out.write("                             <tr>\n");
      out.write("                                 <th>Id</th>\n");
      out.write("                                 <th>Requester</th>\n");
      out.write("                                 <th>Schedule</th>\n");
      out.write("                                 <th>Request Date</th>\n");
      out.write("                                 <th>Status</th>\n");
      out.write("                                 <th>Address</th> \n");
      out.write("                                 <th></th>   \n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("\n");
      out.write("                             ");

                                 System.out.println("******5");
                                for(ViewRequestM2 r:request_List)
                                {
                                
                             
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                           <td>");
      out.print( r.getReqId());
      out.write("</td> \n");
      out.write("                                           <td>");
      out.print( r.getName());
      out.write("</td>\n");
      out.write("                                           <td>");
      out.print( r.getSchedule());
      out.write("</td>\n");
      out.write("                                           <td>");
      out.print( r.getReq_date());
      out.write("</td>\n");
      out.write("                                           <td>");
      out.print( r.getStatus());
      out.write("</td>\n");
      out.write("                                           <td>");
      out.print( r.getAddress());
      out.write("</td>\n");
      out.write("                                           <td>\n");
      out.write("                                            <div class=\"dropdown\">\n");
      out.write("                                                <button class=\"dropbtn\">Action</button>\n");
      out.write("                                                <div class=\"dropdown-content\">\n");
      out.write("                                                <a href=\"RequestInfoM2.jsp?request_id=");
      out.print(request_id);
      out.write("\">View Request</a>\n");
      out.write("                                                <a href=\"#\">Assign Request</a>\n");
      out.write("                                                <a href=\"#\">Cancel Request</a>\n");
      out.write("                                                </div>\n");
      out.write("                                              </div>\n");
      out.write("                                           </td>\n");
      out.write("                                        </tr>\n");
      out.write("                             ");

                                }
                             
      out.write("                      \n");
      out.write("                        </tbody>\n");
      out.write("                </table>\n");
      out.write("     \n");
      out.write("               </div>\n");
      out.write("\n");
      out.write("            </div>  \n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("        function disable1()\n");
      out.write("        {\n");
      out.write("            alert(\"trrfddddddddf\");\n");
      out.write("            document.getElementById(\"CustName\").disable=true;\n");
      out.write("            document.getElementById(\"ondate\").disable=true;\n");
      out.write("            document.getElementById(\"fromdate\").disable=true;\n");
      out.write("            document.getElementById(\"todate\").disable=true;\n");
      out.write("        }\n");
      out.write("        function enable()\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"\").disable=false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    \n");
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
