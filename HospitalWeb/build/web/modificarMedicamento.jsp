<%-- 
    Document   : modificarMedicamento
    Created on : 27 sep. 2022, 03:06:30
    Author     : DELL
--%>

<%@page import="Datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Medicamento</title>
    </head>
    <body>
        <h1>Modificar Medicamento</h1>
         <%
            OperacionBD op = new OperacionBD();
            op.conectar();
            
            //Verificamos que no vengan vacíos los valores
            if(!request.getParameter("clave").equals("") && !request.getParameter("nombreCom").equals("")){
                String clave = request.getParameter("clave");
                String nombreCom= request.getParameter("nombreCom");
                
                op.actualizarMedicamento(clave, nombreCom);
                
                op.desconectar();
            
            }
            response.sendRedirect("medicamentos.jsp");
        
        %>
        
    </body>
</html>
