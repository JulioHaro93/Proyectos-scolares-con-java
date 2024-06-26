<%-- 
    Document   : modificarPaciente
    Created on : 27 sep. 2022, 02:55:34
    Author     : DELL
--%>

<%@page import="Datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Paciente</title>
    </head>
    <body>
        <h1>Modificar Paciente</h1>
        
         <%
            OperacionBD op = new OperacionBD();
            op.conectar();
            
            //Verificamos que no vengan vacíos los valores
            if(!request.getParameter("nss").equals("") && !request.getParameter("padecimiento").equals("")){
                String nss = request.getParameter("nss");
                String padeci= request.getParameter("padecimiento");
                
                op.actualizarPaciente(nss, padeci);
                
                op.desconectar();
            
            }
            response.sendRedirect("pacientes.jsp");
        
        %>
    </body>
</html>
