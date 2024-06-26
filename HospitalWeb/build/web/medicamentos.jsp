<%-- 
    Document   : medicamentos
    Created on : 25 sep. 2022, 21:58:09
    Author     : DELL
--%>

<%@page import="Modelo.Medicamento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Empleado"%>
<%@page import="Modelo.Hospital"%>
<%@page import="Datos.OperacionBD"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Medicamentos</title>
        <link href="css/estilos.css" rel="stylesheet"/>
    </head>
    <body style="background-color: #FFF5EE">
        
        <h1>Lista de Medicamentos disponibles en CHIMSS</h1>

            <%
                int ampo =0;
                int comp = 0;
                int inh =0;
            %>
        <table border="1" border-collapse="collapse">
            <caption>Lista Medicamentos</caption>
            <%
                
                OperacionBD op = new OperacionBD();
                op.conectar();
            %>
            <tr>
                <th>Clave del medicamento</th><th>Nombre Comercial</th><th>Principio Activo</th><th>presentación</th><th>Toma</th>
            </tr>
                
                    <%
                            
                    ArrayList<Medicamento> medicamentos = new ArrayList<>();
                    medicamentos = op.mostrarMedicamentos();
                    for (int i =0; i<medicamentos.size(); i++) {
                    Medicamento med = medicamentos.get(i);
                    out.println("<tr>");
                    out.println("<td>" + med.getClave()+ "</td>");
                    out.println("<td>" + med.getNombreCom() + "</td>");
                    out.println("<td>" + med.getPrincipioAct() + "</td>");
                    out.println("<td>" + med.getPresentacion() + "</td>");
                    out.println("<td>" + med.getToma() + "</td>");
                    out.println("</tr>");
                    i++;
                }
            %>
            
        </table>
           
            <br><br><a href="index.html">Index</a><br><br>
            <br><br><a href="estadisticasHospital.jsp">Estadísticas del Hospital</a>
    </body>
</html>
