<%-- 
    Document   : CancelReqM2
    Created on : 14 Jul, 2020, 7:41:59 PM
    Author     : HARSHITA JMA
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="scrapKart.model.scrapKartModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
      System.out.println("Inside Cancel Req jsp");
            String req_id=request.getParameter("req_id");
            System.out.println("req in servlet"+req_id);
            try
            {
                System.out.println("Inside req servlet");
                boolean result= scrapKartModel.cancelRequest(req_id);
                if(result==true)
                {
                    System.out.println("Request Canceled");
                  response.sendRedirect("ViewFilteredRequestM2.jsp");
                }
           }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
%>
