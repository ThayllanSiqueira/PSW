/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RA21551794
 */
@WebServlet(urlPatterns = {"/Joken"})
public class Joken extends HttpServlet {

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
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Joken</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Joken  </h1>");
            
            String jogada = request.getParameter("jogada");
                
            switch (jogada){
                case "pedra":
                    out.println("<h3>Você: " + jogada + " X papel : Computador</h3>");
                    out.println("<h3>You Lose</h3>");
                    break;
                case "papel":
                    out.println("<h3>Você: " + jogada + " X tesoura : Computador</h3>");
                    out.println("<h3>You Lose</h3>");
                    break;
                case "tesoura":
                    out.println("<h3>Você: " + jogada + " X pedra : Computador</h3>");
                    out.println("<h3>You Lose</h3>");
                    break;
                case "jacare":
                    out.println("<h3>Você: " + jogada + " X pedra : Computador</h3>");
                    out.println("<h3>You Lose</h3>");
                    break;
                case "spock":
                    out.println("<h3>Você: " + jogada + " X papel : Computador</h3>");
                    out.println("<h3>You Lose</h3>");
                    break;
                default:
                    out.println("<h3> Invalido </h3>");
            }
            
          
            
            
            out.println("</body>");
            out.println("</html>");
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
