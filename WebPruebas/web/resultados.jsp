<%-- 
    Document   : resultados
    Created on : 11-sep-2022, 2:18:48
    Author     : josue
--%>

<%@page import="mx.azc.uam.mx.Operacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <title>Resultados</title>
       
    <body>
       <% Operacion op= new Operacion();
        int x = Integer.parseInt(request.getParameter("valorX"));
        int y= Integer.parseInt(request.getParameter("valorY"));
        String ar= request.getParameter("Operacion");
        if(ar.equals("suma"))
            out.println("El resultado es: "+op.suma(x, y)); 
        else if(ar.equals("resta"))
            out.println("El resultado es: "+op.resta(x, y));
        else if(ar.equals("multiplicacion"))
            out.println("El resultado es: "+op.multiplicacion(x, y));
        else
            out.println("El resultado es: "+op.division(x, y));

       %>
    </body>
</html>
