/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RA21551794
 */
public class ProcessarParImpar extends HttpServlet {

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
        
        String op = request.getParameter("opcao");
            int numero = Integer.parseInt(request.getParameter("numero"));
            
            int numServidor = new Random().nextInt(10);
            
            int soma = numero + numServidor;
            
            String resultado = "p";
            
            if((soma % 2) != 0){
                resultado = "i";
            }
            
            String resp = "Perdeu!";
            
            if(op.equals(resultado)){
                resp = "ganhou";
            }
            
            request.setAttribute("rsp", resp);
            request.setAttribute("numUsu", numero);
            request.setAttribute("numCpu", numServidor);
            
            request.getRequestDispatcher("resultadoParImpar.jsp").forward(request, response);
         
            
            
            
            
        /*
            if(op.equals(resultado)){
                out.println("<h2> Você Ganhou!</h2>");
            } else {
                out.println("<h2> Você Perdeu!</h2>");
            }
                    
            out.println("Eu joguei (" + numServidor + ") e você jogou (" + numero + ")");
        */
        
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
