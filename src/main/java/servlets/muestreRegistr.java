package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import umariana.automovil.Moto;

@WebServlet(name = "muestreRegistr", urlPatterns = {"/muestreRegistr"})
public class muestreRegistr extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // Asumiendo que id es un entero, pero placa, marca y linea son Strings.
            int id = Integer.parseInt(request.getParameter("id"));
            String placa = request.getParameter("placa");
            String marca = request.getParameter("marca");
            String linea = request.getParameter("linea");
            String color = request.getParameter("color");
           
            Moto motor = new Moto(id, placa, marca, linea, color); 
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Información del Motor</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Información del Motor Registrado</h1>");
            out.println("ID: " + motor.getId() + "<br>");
            out.println("Placa: " + motor.getPlaca() + "<br>");
            out.println("Marca: " + motor.getMarca() + "<br>");
            out.println("Linea: " + motor.getLinea() + "<br>");
            out.println("Color: " + motor.getColor() + "<br>");
            out.println("<a href='/motoras/formulario.jsp'>Volver al formulario</a>");
            out.println("</body>");
            out.println("</html>");
        }
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
        return "Muestra los datos de un motor registrado";
    }
}