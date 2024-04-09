/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import umariana.automovil.Moto;
import umariana.automovil.GestionarMoto;


@WebServlet(name = "borrarMoto", urlPatterns = {"/borrarMoto"})
public class borrarMoto extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet borrarMoto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet borrarMoto at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
   @WebServlet(name = "eliminarMoto", urlPatterns = {"/eliminarMoto"})
   public class eliminarMoto extends HttpServlet {
    
    GestionarMoto gestionar = new GestionarMoto();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Obtener el ID de la moto a eliminar
        int id = Integer.parseInt(request.getParameter("id"));

        // Aquí deberías llamar al método apropiado de GestionarMoto para eliminar la moto
        gestionar.eliminarMoto(id);

        // Redirigir de vuelta a la página principal
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
   }
}

