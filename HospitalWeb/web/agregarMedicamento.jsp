<%-- 
    Document   : agregarMedicamento
    Created on : 27 sep. 2022, 01:49:29
    Author     : DELL
--%>

<%@page import="Modelo.Medicamento"%>
<%@page import="Datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JAgregar Medicamento</title>
    </head>
    <body>
        <h1>Agregar Medicamento</h1>
         <%
            OperacionBD op = new OperacionBD();
            op.conectar();
            //verifica que en el formulario se envien datos no vacios     
            if (!request.getParameter("clave").equals("") && !request.getParameter("nombreCom").equals("") && !request.getParameter("principioAct").equals("") && !request.getParameter("presentacion").equals("")&& !request.getParameter("toma").equals("")) {
                String clave = request.getParameter("clave");
                String nom = request.getParameter("nombreCom");
                String prin = request.getParameter("principioAct");
                String pres = request.getParameter("presentacion");
                String toma = request.getParameter("toma");

                Medicamento med = new Medicamento(clave, nom, prin, pres, toma);

                op.agregarMedicamento(med);
            }

            response.sendRedirect("medicamentos.jsp");

            op.desconectar();
            %>
    </body>
</html>
