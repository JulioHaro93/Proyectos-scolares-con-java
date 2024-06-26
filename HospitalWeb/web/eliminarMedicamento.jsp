<%-- 
    Document   : eliminarMedicamento
    Created on : 27 sep. 2022, 03:55:05
    Author     : DELL
--%>

<%@page import="Datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Medicamento</title>
    </head>
    <body>
        <h1>Elimnar Medicamento</h1>
        
        <%
            OperacionBD op = new OperacionBD();
            op.conectar();
            
            //Verificamos que no vengan vacíos los valores
            if(!request.getParameter("clave").equals("")){
                String clave = request.getParameter("clave");
                
                op.eliminarMedicamento(clave);
                
                op.desconectar();
            
            }
            response.sendRedirect("medicamentos.jsp");
            %>
    </body>
</html>
