/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RA21551794
 */
public class ConsultarSigno extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String data = request.getParameter("nasc");
            
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = (Date)formatter.parse(data);
            
            String signo = "aries";
            
            if(date.getMonth() == 0){
                signo = "Aquario";
            } else if (date.getMonth() == 1){
                signo = "Capricornio";
            } else if (date.getMonth() == 2){
                signo = "Peixes";
            } else if (date.getMonth() == 3){
                signo = "Aries";
            } else if (date.getMonth() == 4){
                signo = "Touro";
            } else if (date.getMonth() == 5){
                signo = "Gemeos";
            } else if (date.getMonth() == 6){
                signo = "Cancer";
            } else if (date.getMonth() == 7){
                signo = "Leão";
            } else if (date.getMonth() == 8){
                signo = "Virgem";
            } else if (date.getMonth() == 9){
                signo = "Libra";
            } else if (date.getMonth() == 10){
                signo = "Escorpião";
            } else if (date.getMonth() == 11){
                signo = "Sargitário";
            }
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Portal astral</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Bem vindo ao Portal Astral </h1>");
            out.println("<h2>Seu signo é: " + signo +"</h2>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
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
