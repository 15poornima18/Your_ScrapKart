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

public final class ViewRequestM2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Requests@Manager</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/ViewRequest.css\">\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body style=\" background-color: rgba(178, 238, 144, 0.685)\" >\n");
      out.write("    \n");
      out.write("     <div class=\"row myrow\" >\n");
      out.write("            <div class=\"col-sm-2\"><a href=\"logout.jsp\"><img src=\"images/logo.jpg\" class=\"img-fluid\"></a></div>\n");
      out.write("            <div class=\"col-sm-10 myheader\">\n");
      out.write("                \n");
      out.write("                <span class=\"myspan\" ><a >View Request</a></span>\n");
      out.write("                <span class=\"myspan\"><a href=\"PriceListM2.jsp\">PriceList</a></span>\n");
      out.write("                <span class=\"myspan\"><a href=\"DashBoardM2.jsp\">DashBoard</a></span>\n");
      out.write("                <span class=\"myspan\"><a href=\"LoginM2.html\">Log out</a></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    <div>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

              ArrayList<ViewRequestM2> request_List=new ArrayList<ViewRequestM2>();
              try
              { 
                  request_List=scrapKartModel.getTodaysRequest();
              }
              catch(SQLException e)
              {
                   e.printStackTrace();
              }
             
              System.out.println("SIZE OF ARRAYLIST:"+request_List.size());
        
      out.write("\n");
      out.write("           \n");
      out.write("            <h3 style=\"text-align:center\">REQUESTS</h3>\n");
      out.write("             \n");
      out.write("            <div class=\"major\">\n");
      out.write("               <div class=\"minor1\">\n");
      out.write("                   <form  method=\"post\" action=\"ViewFilteredRequestM2.jsp\">\n");
      out.write("                    <h3>Filters</h3>\n");
      out.write("                 \n");
      out.write("                       <a onclick=\"enable()\" class=\"resetAnchor\" > <p style=\"color:graytext; font-size: small;float:right\" onMouseOver=\"this.style.color=red\" onMouseOut=\"this.style.color=gray\">Reset Filters</p></a>\n");
      out.write("                   <br>\n");
      out.write("                    <label>Search by Request Id</label>\n");
      out.write("                    <a onclick=\"disable1()\"><input type=\"text\" id=\"ReqId\" name=\"req_id\" placeholder=\"Request Id\" ></a>\n");
      out.write("                    <label >Search by Customer Name </label>\n");
      out.write("                   <a onclick=\"disable2()\"> <input type=\"text\" id=\"CustName\" name=\"cust_name\" placeholder=\"Customer Name\"><br></a>\n");
      out.write("                    <label >Search by Date </label><br>\n");
      out.write("                   \n");
      out.write("                    <a onclick=\"disable3()\"><input type=\"text\" pattern=\"\\d{1,2}/\\d{1,2}/\\d{4}\" class=\"datepicker\" name=\"ondate\"  placeholder=\"dd/mm/yyyy\" id=\"ondate\" /></a>\n");
      out.write("          \n");
      out.write("                    \n");
      out.write("                    <!--<label >Search by Date Range</label><br>-->\n");
      out.write("<!--                    <label > From</label><br>\n");
      out.write("                    <a onclick=\"disable4()\"><input type=\"text\"  class=\"datepicker\" name=\"fromdate\"  placeholder=\"DD-Mon-YYYY\" id=\"fromdate\"></a>\n");
      out.write("                    <label> To</label><br>\n");
      out.write("                    <a onclick=\"disable4()\"><input type=\"text\"  class=\"datepicker\" name=\"todate\" placeholder=\"DD-Mon-YYYY\" id=\"todate\"></a>-->\n");
      out.write("                    <input type=\"submit\" value=\"Search\">\n");
      out.write("                   \n");
      out.write("                </form>\n");
      out.write("               </div>\n");
      out.write("               \n");
      out.write("               <div class=\"minor2\"> \n");
      out.write("                \n");
      out.write("                <button class=\"refresh\" onclick=\"window.location.reload();\">\n");
      out.write("                    <img class=\"myicon\" src=\"images/ref.png\"  > \n");
      out.write("                     <span>Refresh</span>\n");
      out.write("                 </button>\n");
      out.write("                   <button class=\"refresh\" style=\"background-color:#ff9900; border-radius: 5px;\" >\n");
      out.write("                    <img  class=\"myicon\" src=\"images/product.png\"  >\n");
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
      out.write("                        </thead>        \n");
      out.write("                        <tbody>\n");
      out.write("\n");
      out.write("                             ");

                                
                                for(ViewRequestM2 r:request_List)
                                {
                                      String action="";
                             
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
      out.write("                                               ");
 
                                                     if(r.getStatus().equals("Completed")) 
                                                            action= "View Request";
                                                    else if(r.getStatus().equals("Assigned")) 
                                                            action= "Cancel Request";
                                                    else if(r.getStatus().equals("Pending"))
                                                            action= "Assign Request";
                                                    else 
                                                            action= "No Action";  
                                                    
      out.write("\n");
      out.write("                                                        <a data-id=\"");
      out.print( r.getReqId());
      out.write("\"  onclick=\"fetchReqId(this,'");
      out.print( action );
      out.write("');\" style=\"font-size: 12px\">");
      out.print(action);
      out.write("</a>\n");
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
      out.write("                        \n");
      out.write("       <!--                                               MODAL                                         -->\n");
      out.write("     \n");
      out.write("     <div class=\"w3 container\">\n");
      out.write("           <div id=\"id01\" class=\"w3-modal\">\n");
      out.write("               <div class=\"w3-modal-content w3-card-4 w3-animate-zoom\" style=\"max-width:600px\">\n");
      out.write("\n");
      out.write("                <div class=\"w3-center\"><br>\n");
      out.write("                    <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"w3-button w3-xlarge w3-hover-red w3-display-topright\" title=\"Close Modal\">&times;</span>\n");
      out.write("\n");
      out.write("                    <form  class=\"w3-container \" method=\"post\" action=\"AssignReqServletM2\">\n");
      out.write("                    <div class=\"w3-section\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"sel1\" style=\"font-size:15px\" >SELECT PICKUP BOY ID AND DATE:</label><br>\n");
      out.write("                            <label>Select PickUp Boy </label><br>\n");
      out.write("                            <select class=\"form-control\" id=\"sel1\" name=\"pkID\"><br>\n");
      out.write("                                <!--ArrayList to be displayed using for loop-->\n");
      out.write("                                <option value=\"PB101\" style=\"font-size:15px\">PB101</option>\n");
      out.write("                                <option value=\"PB102\" style=\"font-size:15px\">PB102</option>\n");
      out.write("                                <option value=\"PB103\" style=\"font-size:15px\">PB103</option>\n");
      out.write("                                <option value=\"PB104\" style=\"font-size:15px\">PB104</option>\n");
      out.write("                                <option value=\"PB105\" style=\"font-size:15px\">PB105</option>\n");
      out.write("                             \n");
      out.write("                              <label>Schedule On </label><br>\n");
      out.write("                              <input type=\"text\" class=\"datepicker\" name=\"scheduleDate\"  placeholder=\"dd-MON-yyyy\" id=\"ondate\" /><br>\n");
      out.write("                              <label>Please confirm Request Id </label><br>\n");
      out.write("                              <input type=\"text\" name=\"requestId\" placeholder=\"Enter Request Id here\">\n");
      out.write("                      \n");
      out.write("                            </select><br><br>\n");
      out.write("                                <!--Add a text to enter date-->\n");
      out.write("                            <button class=\"btn btn-success\" type=\"submit\">Submit</button>\n");
      out.write("                          </div>        \n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("           </div> \n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("       </div> \n");
      out.write("      \n");
      out.write("       \n");
      out.write("<script>\n");
      out.write("        function disable1()\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"CustName\").disabled=true;\n");
      out.write("            document.getElementById(\"ondate\").disabled=true;\n");
      out.write("            document.getElementById(\"fromdate\").disabled=true;\n");
      out.write("            document.getElementById(\"todate\").disabled=true;\n");
      out.write("        }\n");
      out.write("          function disable2()\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"ReqId\").disabled=true;\n");
      out.write("            document.getElementById(\"ondate\").disabled=true;\n");
      out.write("            document.getElementById(\"fromdate\").disabled=true;\n");
      out.write("            document.getElementById(\"todate\").disabled=true;\n");
      out.write("        }\n");
      out.write("           function disable3()\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"ReqId\").disabled=true;\n");
      out.write("            document.getElementById(\"CustName\").disabled=true;\n");
      out.write("            document.getElementById(\"fromdate\").disabled=true;\n");
      out.write("            document.getElementById(\"todate\").disabled=true;\n");
      out.write("        }\n");
      out.write("            function disable4()\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"ReqId\").disabled=true;\n");
      out.write("            document.getElementById(\"CustName\").disabled=true;\n");
      out.write("            document.getElementById(\"ondate\").disabled=true;\n");
      out.write("          \n");
      out.write("        }\n");
      out.write("        function enable()\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"ReqId\").disabled=false;\n");
      out.write("            document.getElementById(\"CustName\").disabled=false;\n");
      out.write("            document.getElementById(\"ondate\").disabled=false;\n");
      out.write("            document.getElementById(\"fromdate\").disabled=false;\n");
      out.write("            document.getElementById(\"todate\").disabled=false; \n");
      out.write("            document.getElementById(\"ReqId\").placeholder = \"Request Id\";\n");
      out.write("            document.getElementById(\"CustName\").placeholder = \"Customer Name\";\n");
      out.write("            document.getElementById(\"ondate\").placeholder = \"dd/mm/yyyy\";\n");
      out.write("            document.getElementById(\"fromdate\").placeholder = \"dd/mm/yyyy\";\n");
      out.write("            document.getElementById(\"todate\").placeholder = \"dd/mm/yyyy\";\n");
      out.write("        }\n");
      out.write("        function fetchReqId(d, action)\n");
      out.write("           {   \n");
      out.write("               var req_id=d.getAttribute(\"data-id\");\n");
      out.write("               if(action==\"View Request\")\n");
      out.write("                    window.location.replace(\"RequestInfoM2.jsp?req_id=\"+req_id);\n");
      out.write("               else if(action==\"Cancel Request\")\n");
      out.write("               {\n");
      out.write("                   if(confirm(\"Confirm cancel request ?\"))\n");
      out.write("                        window.location.replace(\"CancelReqM2.jsp?req_id=\"+req_id);\n");
      out.write("               }\n");
      out.write("               else if(action==\"Assign Request\")\n");
      out.write("               {\n");
      out.write("                    //alert(action);\n");
      out.write("//                   window.location.replace(\"AssignRequestM2.jsp?req_id=\"+req_id);\n");
      out.write("                     document.getElementById('id01').style.display='block';           \n");
      out.write("               }\n");
      out.write("               else\n");
      out.write("               {\n");
      out.write("                   \n");
      out.write("                   alert(\"Request has been cancelled !!\");\n");
      out.write("               }\n");
      out.write("           }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("\n");
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
