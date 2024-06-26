<%-- 
    Document   : eliminarEmpleado
    Created on : 27 sep. 2022, 03:36:38
    Author     : DELL
--%>

<%@page import="Datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Empleado</title>
    </head>
    <body>
        <h1>Eliminar Empleado</h1>
        
        <%
            OperacionBD op = new OperacionBD();
            op.conectar();
            
            //Verificamos que no vengan vacíos los valores
            if(!request.getParameter("empleadoNum").equals("")){
                String empleadoNum = request.getParameter("empleadoNum");
                
                op.eliminarEmpleado(empleadoNum);
                
                op.desconectar();
            
            }
            response.sendRedirect("empleados.jsp");
            %>
    </body>
</html>
