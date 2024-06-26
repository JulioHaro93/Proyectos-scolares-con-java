<%-- 
    Document   : modificarEmpleado
    Created on : 27 sep. 2022, 02:16:37
    Author     : DELL
--%>

<%@page import="Datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Empleado</title>
    </head>
    <body>
        <h1>Modificar Empleado</h1>
        <%
            OperacionBD op = new OperacionBD();
            op.conectar();
            
            //Verificamos que no vengan vacíos los valores
            if(!request.getParameter("empleadoNum").equals("") && !request.getParameter("salario").equals("")){
                String empleadoNum = request.getParameter("empleadoNum");
                double salario = Double.parseDouble(request.getParameter("salario"));
                
                op.actualizarEmpleado(empleadoNum, salario);
                
                op.desconectar();
            
            }
            response.sendRedirect("empleados.jsp");
        
        %>
        
        
    </body>
</html>
