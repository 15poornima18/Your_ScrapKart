package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import scrapKart.model.scrapKartModel;
import scrapKart.pojo.Request;
import java.util.ArrayList;

public final class requestForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>My Request</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/request.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("         <div class=\"row myrow\" >\n");
      out.write("            <div class=\"col-sm-2\"><a href=\"logout.jsp\"><img src=\"images/logo.jpg\" class=\"img-fluid\"></a></div>\n");
      out.write("            <div class=\"col-sm-10 myheader\">\n");
      out.write("                <span><a href=\"www.google.com\">LogOut</a></span>\n");
      out.write("                <span><a href=\"www.google.com\">Contact</a></span>\n");
      out.write("                <span><a onclick=\"alert('Please Login first!');\">Request PickUp</a></span>\n");
      out.write("                <span><a href=\"login.jsp\">Price List</a></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("             ");

            String user=session.getAttribute("user_mail").toString();
            ArrayList<Request> req=new ArrayList<Request>();
           
            try
            {
                System.out.println("Inside try of requestform where function is called before getall request is called!!");
                req=scrapKartModel.getAllRequests(user);
                System.out.println("Inside try of requestform where function is called!!");
            }
            catch(SQLException e)
             {
                 e.printStackTrace();
             }
            int count=0;
            //            Function for canceling request              //
//            System.out.println("Ready to call camcel request!!");
//            String cancel_req=request.getParameter("cancel_Req");
//            System.out.println("cancel request="+cancel_req);
//            String req_id=request.getParameter("req_id");
//            if(cancel_req.equals("true"))
//            {
//                try
//                {
//                     System.out.println(" call camcel request!!");
//                    boolean result=scrapKartModel.cancelRequest(req_id);
//                     System.out.println(" called camcel request!!");
//                }
//                catch(SQLException e)
//                {
//                    e.printStackTrace();
//                }
//            }
            
         
      out.write("\n");
      out.write("         \n");
      out.write("       <div class=\"username\"><h2>Welcome ");
      out.print( user);
      out.write("!</h2></div>\n");
      out.write("       <div class=\"nav2\">\n");
      out.write("            <a href=\"viewProfile.jsp\" >View Profile</a>\n");
      out.write("            <a href=\"editProfile.jsp\" >Edit Profile</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"row\" >  \n");
      out.write("            <div class=\"heading\"><h2>Request Status</h2></div>  \n");
      out.write("            <div class=\"col-sm-12 requestTable\">\n");
      out.write("            \n");
      out.write("               <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Request</th>\n");
      out.write("                        <th>Requested Date</th>\n");
      out.write("                        <th>Scheduled Date</th>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                        <th>Type</th>\n");
      out.write("                        <th>Status</th>\n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("                                                                                                                                                                                                               ");

                        for(Request r:req)
                        { 
                            count++;
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                    <tr id=\"");
      out.print( r.getReq_id());
      out.write("\"> \n");
      out.write("                        <td>");
      out.print( count);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r.getReq_date() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r.getSchd_date() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r.getAddress() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r.getReq_type() );
      out.write("</td>\n");
      out.write("                        ");
if(r.getStatus().equals("Completed")) {
      out.write("\n");
      out.write("                        <td ><a data-id=\"");
      out.print( r.getReq_id());
      out.write("\"  onclick=\"fetchReqId(this);\"data-toggle=\"tooltip\" title=\"Click to view Description\">");
      out.print( r.getStatus() );
      out.write("</a></td>\n");
      out.write("                         ");
 }
                        else{  
      out.write("\n");
      out.write("                         <td><a data-id=\"");
      out.print( r.getReq_id());
      out.write("\" onclick=\"CancelReq(this);\" data-toggle=\"tooltip\" title=\"Click to Cancel Request\">");
      out.print( r.getStatus() );
      out.write(" </a></td>\n");
      out.write("                         ");
 } 
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
                    
      out.write("\n");
      out.write("                 \n");
      out.write("               </table>\n");
      out.write("               <br><br>   \n");
      out.write("                 \n");
      out.write("               <button onclick=\"document.getElementById('id01').style.display='block'\" class=\"w3-button w3-large myclick\">+ Add Request</button>\n");
      out.write("            </div>\n");
      out.write("           <div class=\"w3 container\">\n");
      out.write("           <div id=\"id01\" class=\"w3-modal\">\n");
      out.write("               <div class=\"w3-modal-content w3-card-4 w3-animate-zoom\" style=\"max-width:600px\">\n");
      out.write("\n");
      out.write("                <div class=\"w3-center\"><br>\n");
      out.write("                    <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"w3-button w3-xlarge w3-hover-red w3-display-topright\" title=\"Close Modal\">&times;</span>\n");
      out.write("\n");
      out.write("                    <form  class=\"w3-container \" method=\"post\" action=\"AddReqServlet\">\n");
      out.write("                    <div class=\"w3-section\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"sel1\" style=\"font-size:20px\" >Select Request Type:</label>\n");
      out.write("                            <select class=\"form-control\" id=\"sel1\" name=\"reqType\">\n");
      out.write("                                <option value=\"pickup\" style=\"font-size:15px\">PickUp</option>\n");
      out.write("                                <option value=\"visit\" style=\"font-size:15px\">Visit</option>\n");
      out.write("                            </select><br><br>\n");
      out.write("                      \n");
      out.write("                            <label for=\"comment\" style=\"font-size:20px\">Add Description:</label>\n");
      out.write("                            <textarea class=\"form-control\"rows=\"5\" id=\"comment\" name=\"desc\"></textarea><br><br>\n");
      out.write("                            <button class=\"btn btn-success\" type=\"submit\">Submit</button>\n");
      out.write("\n");
      out.write("                          </div>        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("           </div> \n");
      out.write("\n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("       </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("      ");

        String status=request.getParameter("addReqisValid");
        if(status!=null&&status.equals("false")){
        
     
      out.write("\n");
      out.write("      <script>\n");
      out.write("         alert(\"Something went Wrong! Please Add request Again!\");\n");
      out.write("     </script>\n");
      out.write("     ");

         }
            else if(status!=null)
        {
      
      out.write("\n");
      out.write("    <script>\n");
      out.write("         alert(\"Request Added!!\");\n");
      out.write("     </script>\n");
      out.write("     ");

         }
      
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("      <script>\n");
      out.write("          function add_req_fun()\n");
      out.write("          {\n");
      out.write("              document.getElementById('id01').style.display='block';\n");
      out.write("          }\n");
      out.write("      </script>\n");
      out.write("      <script>\n");
      out.write("           function fetchReqId(d)\n");
      out.write("           {   \n");
      out.write("               var req_id=d.getAttribute(\"data-id\");\n");
      out.write("               window.location.replace(\"RequestInfo.jsp?req_id=\"+req_id);\n");
      out.write("           } \n");
      out.write("           function CancelReq(d)\n");
      out.write("           {\n");
      out.write("               alert(\"Pending Clicked\");\n");
      out.write("               var req_id=d.getAttribute(\"data-id\");\n");
      out.write("               \n");
      out.write("               alert(req_id);\n");
      out.write("               var url=\"CancelReqServlet2?req_id=\"+req_id;\n");
      out.write("               if(window.XMLHttpRequest)\n");
      out.write("               {\n");
      out.write("                   request=new XMLHttpRequest();\n");
      out.write("               }\n");
      out.write("               request.onreadystatechange=function(){\n");
      out.write("                   \n");
      out.write("                        if(this.readyState==4&&this.status==0)\n");
      out.write("                        {\n");
      out.write("                            var this_request_id=request.responseText;     \n");
      out.write("                            document.getElementById(\"req_id\").remove();  \n");
      out.write("                        }\n");
      out.write("                   };\n");
      out.write("                   request.open(\"GET\",url,true);\n");
      out.write("                   request.send();\n");
      out.write("\n");
      out.write("              alert(\"***\");\n");
      out.write("               \n");
      out.write("           }\n");
      out.write("           \n");
      out.write("//           function getInfo(var req_id)\n");
      out.write("//           {\n");
      out.write("//               if(request.readyState==4)\n");
      out.write("//               {\n");
      out.write("//                   var this_request_id=request.responseText;     \n");
      out.write("//                   document.getElementById(\"req_id\").remove();  \n");
      out.write("//               }\n");
      out.write("//           }\n");
      out.write("      </script>\n");
      out.write("      ");
  
        String request_id=request.getParameter("req_id");
        System.out.println(request_id);
       
      out.write("\n");
      out.write("       \n");
      out.write("\n");
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
