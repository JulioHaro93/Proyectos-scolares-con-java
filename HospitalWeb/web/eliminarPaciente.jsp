<%-- 
    Document   : eliminarPaciente
    Created on : 27 sep. 2022, 03:58:12
    Author     : DELL
--%>

<%@page import="Datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Paciente</title>
    </head>
    <body>
        <h1>Eliminar Paciente</h1>
        
        <%
            OperacionBD op = new OperacionBD();
            op.conectar();
            
            //Verificamos que no vengan vacíos los valores
            if(!request.getParameter("nss").equals("")){
                String nss = request.getParameter("nss");
                
                op.eliminarPaciente(nss);
                
                op.desconectar();
            
            }
            response.sendRedirect("pacientes.jsp");
            %>
    </body>
</html>
