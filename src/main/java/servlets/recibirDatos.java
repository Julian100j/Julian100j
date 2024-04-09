package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import umariana.automovil.Moto;

@WebServlet(name = "recibirDatos", urlPatterns = {"/recibirDatos"})
public class recibirDatos extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");

    HttpSession session = request.getSession();
    List<Moto> listaMotores = (List<Moto>) session.getAttribute("listaMotores");
    if (listaMotores == null) {
        listaMotores = new ArrayList<>();
    }

    int id = Integer.parseInt(request.getParameter("id"));
    String placa = request.getParameter("placa");
    String marca = request.getParameter("marca");
    String linea = request.getParameter("linea");
    String color = request.getParameter("color");

    Moto motor = new Moto(id, placa, linea, marca, color);
    listaMotores.add(motor);

    session.setAttribute("listaMotores", listaMotores);
    request.getRequestDispatcher("/index.jsp").forward(request, response);
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
        return "Recibe datos y crea un objeto Motores para ser utilizado en otra página";
    }
}