<%-- 
    Document   : agregarAlumno
    Created on : 13/09/2022, 04:38:41 PM
    Author     : Profesor
--%>

<%@page import="modelo.Noticia"%>
<%@page import="datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Noticia</title>
    </head>
    <body>
        <%
            OperacionBD op = new OperacionBD();
            op.conectar();
            //verifica que en el formulario se envien datos no vacios     
            if (!request.getParameter("idNoticia").equals("") && !request.getParameter("titulo").equals("") && !request.getParameter("descripcion").equals("") && !request.getParameter("fecha").equals("")) {
                int id = Integer.parseInt(request.getParameter("idNoticia"));
                String title = request.getParameter("titulo");
                String description = request.getParameter("descripcion");
                String fecha = request.getParameter("fecha");
                

                Noticia noti1 = new Noticia(id, title, description, fecha);

                op.agregarNoticia(noti1);
            }

            response.sendRedirect("noticias.jsp");

            op.desconectar();


        %>
    </body>
</html>
