/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrapKart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import scrapKart.model.scrapKartModel;

/**
 *
 * @author HARSHITA JMA
 */
@WebServlet(name = "CancelReqServlet2", urlPatterns = {"/CancelReqServlet2"})
public class CancelReqServlet2 extends HttpServlet
{    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CancelReqServlet2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CancelReqServlet2 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
             System.out.println("Inside Cancel Req Servlet");
            String req_id=request.getParameter("req_id");
            System.out.println("req in servlet"+req_id);
            
            try
            {
                System.out.println("Inside req servlet");
                  boolean result= scrapKartModel.cancelRequest(req_id);
            if(result==true)
                System.out.println("Request Canceled");
            }
           catch(SQLException e){
               e.printStackTrace();
               
           }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
