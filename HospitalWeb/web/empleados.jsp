<%-- 
    Document   : empleados
    Created on : 25 sep. 2022, 21:12:55
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Empleado"%>
<%@page import="Modelo.Hospital"%>
<%@page import="Datos.OperacionBD"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilos.css" rel="stylesheet"/>
        <title>Empleados CHIMSS</title>
    </head>
    <body style="background-color: #FFF5EE">
        <h1>Empleados</h1>
                <h1>Empleados CHIMSS</h1>
                <img src="imagenes/doctor_cheems.jpg" alt="Doctor Cheems" title="Su Domgtor de Commfamsa" width="25%">
        <%
            OperacionBD op = new OperacionBD();
            op.conectar();
            
        %>
        
        <table border="1" border-collapse="collapse">
            <caption>Lista de Empleados CHIMSS</caption>
            <tr>
                <th>Número de Empleado</th><th>Nombre del Empleado</th><th>Edad</th><th>Sexo</th><th>Salario bruto</th>
            </tr>
                
                    <%  
                    ArrayList<Empleado> empleados = new ArrayList<>();
                    empleados = op.mostrarEmpleados();
                    for (int i =0; i<empleados.size(); i++) {
                    Empleado emp = empleados.get(i);
                    out.println("<tr>");
                    out.println("<td>" + emp.getEmpleadoNum()+ "</td>");
                    out.println("<td>" + emp.getNombre() + "</td>");
                    out.println("<td>" + emp.getEdad() + "</td>");
                    out.println("<td>" + emp.getSexo() + "</td>");
                    out.println("<td>" + emp.getSalario() + "</td>");
                    out.println("</tr>");
                    i++;
                }
            %>
            
        </table>
            
            <br><br><a href="index.html">Index</a><br><br>
            <br><br><a href="estadisticasHospital.jsp">Estadísticas del Hospital</a>
    </body>
</html>
