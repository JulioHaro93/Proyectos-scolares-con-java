<%-- 
    Document   : agregarPaciente
    Created on : 26 sep. 2022, 08:17:16
    Author     : DELL
--%>

<%@page import="Modelo.Paciente"%>
<%@page import="Datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Agregar Paciente</h1>
        
        <%
            OperacionBD op = new OperacionBD();
            op.conectar();
            //verifica que en el formulario se envien datos no vacios     
            if (!request.getParameter("nss").equals("") && !request.getParameter("nombre").equals("") && !request.getParameter("padecimiento").equals("")) {
                String nss = request.getParameter("nss");
                String nom = request.getParameter("nombre");
                String pad = request.getParameter("padecimiento");

                Paciente pa = new Paciente(nss, nom, pad);

                op.agregarPaciente(pa);
            }

            response.sendRedirect("pacientes.jsp");

            op.desconectar();


        %>
    </body>
</html>
