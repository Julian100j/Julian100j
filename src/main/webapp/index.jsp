<%@page import="java.util.List"%>
<%@page import="umariana.automovil.Moto"%>
<%@include file="lib/header.jsp" %>

<div class="container p-4">
    <div class="row">
         <div class="col-md-12">
         <div class="card card-body">
             <center><h1> MOTOS </h1></center>
         </div>
         </div>
        <div class="col-md-4"> 
            <div class="card card-body">
                <h5>agregar motos </h5>
                <form action="recibirDatos" method="post">
                    <label for="id">Id:</label>
                    <input type="text" name="id" class="form-control">
                    <label for="placa">Placa:</label>
                    <input type="text" name="placa" class="form-control">
                    <label for="marca">Marca:</label>
                    <input type="text" name="marca" class="form-control">
                    <label for="linea">Linea:</label>
                    <input type="text" name="linea" class="form-control">
                    <label for="color">Color:</label>
                    <input type="text" name="color" class="form-control"><br>
                    
                   
                    <input type="submit" name="enviar" value="Agregar"  class="btn btn-success btn-block form-control">
                    
                    
                </form>
            </div>
        </div>
        <div class="col-md-8">
            <div class="card card-body">
                <h5>listado de motos</h5>
                <table border="1">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Placa</th>
                            <th>Marca</th>
                            <th>Linea</th>
                            <th>Color</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                      <% List<Moto> listaMotores = (List<Moto>) session.getAttribute("listaMotores");
                      
    
                    
                      if (listaMotores != null && !listaMotores.isEmpty()) {
                      for (Moto motor : listaMotores) { %>
                      <tr>
                      <td><%= motor.getId() %></td>
                      <td><%= motor.getPlaca() %></td>
                      <td><%= motor.getLinea() %></td>
                      <td><%= motor.getMarca() %></td>
                      <td><%= motor.getColor() %></td>
                      <td> <a href="editarMoto?id=<%= motor.getId() %>" class="btn btn-secondary"><i class="fa fa-pencil"></i></a> 
                           <a href="borrarMoto?id=<%= motor.getId() %>" class="btn btn-secondary" onclick="return confirm('¿Estás seguro de que deseas borrar esta moto?')">
                           <i class="fa fa-trash"></i></a> </td
                      </tr>
                     <% 
                        }
                      } else {
                         
                            %>
                       <tr>
                        <td colspan="6">No hay motos registradas.</td>
                       </tr>
                        <%
                           }
                        %>
                    </tbody>
                </table>
            </div>
        </div>
     </div>
</div>
<%@include file="lib/footer.jsp" %>