<%-- 
    Document   : alumnos
    Created on : 13/09/2022, 03:29:22 PM
    Author     : Profesor
--%>

<%@page import="modelo.Noticia"%>
<%@page import="java.util.ArrayList"%>
<%@page import="datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Examen 2</title>
    </head>
    <body background="#ADD8E6">
        <h1>Noticias</h1>
        <%
            OperacionBD op = new OperacionBD();
            op.conectar();
            ArrayList<Noticia> noticias = op.consultarNoticias();

        %>

        <table border width="500">
            <tr>
                <Th>idNoticia</Th> <th>titulo</th> <th>Descripcion</th><th>fecha</th>
            </tr>
            <%  for (Noticia noti : noticias) {
                    out.println("<tr>");
                    out.println("<td>" + noti.getIdNoticia() + "</td>");
                    out.println("<td>" + noti.getTitulo() + "</td>");
                    out.println("<td>" + noti.getDescripcion() + "</td>");
                    out.println("<td>" + noti.getFecha() + "</td>");
                    out.println("</tr>");
                }
            %>

        </table>
        

        <h2>Agregar Noticia</h2>
        
        <form action="agregarNoticia.jsp" method="post">
            Id: <input type="text" name="idNoticia" size="15"><br><br>
            Título: <input type="text" name="titulo" size="15"><br><br>
            Descripcion: <input type="textarea" name="descripcion" size="200"><br><br>
            fecha<input type ="text" name ="fecha" size="15"><br><br>
            <input type="submit" value=agregar>
        </form>  
        <br><br><a href="index.jsp">Index</a>
    </body>
</html>
