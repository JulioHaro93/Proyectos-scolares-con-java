<%-- 
    Document   : pacientes
    Created on : 25 sep. 2022, 19:52:29
    Author     : Julio Cesar Haro Capetillo
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Paciente"%>
<%@page import="Datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pacientes</title>
        <link href="css/estilos.css" rel="stylesheet"/>
    </head>
    <body style="background-color: #FFF5EE">
        <h1>Pacientes CHIMSS</h1>
        <img src="imagenes/cheems_enfermo.png" alt="Cheems enfermo"></a>
        <%
            OperacionBD op = new OperacionBD();
            op.conectar();
            
        %>
        <table border="1" border-colapse="colapse">
            <caption>Lista de personas afiliadas</caption>
            <tr>
                <th>Número de Seguridad Social</th><th>Nombre del Paciente</th><th>Padecimiento o motivo de ingreso</th>
            </tr>
                
                    <%  
                    ArrayList<Paciente> pacientes = new ArrayList<>();
                    pacientes = op.mostrarPacientes();
                    for (int i =0; i<pacientes.size(); i++) {
                    Paciente pa = pacientes.get(i);
                    out.println("<tr>");
                    out.println("<td>" + pa.getNss()+ "</td>");
                    out.println("<td>" + pa.getNombre() + "</td>");
                    out.println("<td>" + pa.getPadecimiento() + "</td>");
                    out.println("</tr>");
                    i++;
                }
            %>
        </table>
        <p>
            Los primeros cuatro números del Numero de Seguridad Social representan <br>
            el año en el cuál el paciente fue registrado al Seguro Social CHEEMS
        </p>
        <table>
            <caption>Pacientes cuyo padecimiento inicia con vocal</caption>
            <tr>
                <th>Nombre del Paciente</th><th>Padecimiento o motivo de ingreso</th>
            </tr>
                <%
                ArrayList<Paciente> paV = new ArrayList();
                pacientes = op.mostrarPacientes();

                for(int i = 0; i<pacientes.size(); i++){
                    Paciente pa = pacientes.get(i);
                    if (pa.getPadecimiento().charAt(0) == 'a' || 
                            pa.getPadecimiento().charAt(0) == 'e' || pa.getPadecimiento().charAt(0) =='i' 
                            || pa.getPadecimiento().charAt(0) == 'o' || pa.getPadecimiento().charAt(0) == 'u' ||
                            pa.getPadecimiento().charAt(0) == 'A' || 
                            pa.getPadecimiento().charAt(0) == 'E' || pa.getPadecimiento().charAt(0) =='I' 
                            || pa.getPadecimiento().charAt(0) == 'O' || pa.getPadecimiento().charAt(0) == 'U') {
                        paV.add(pa);
                        out.println("<tr>");
                        out.println("<td>"+pa.getNombre()+"</td>");
                        out.println("<td>" + pa.getPadecimiento()+"</td>");
                    }
                    i++;
                }
                %>
            
        </table>
       
        <br><br><a href="index.html">Index</a><br><br>
        <br><br><a href="estadisticasHospital.jsp">Estadísticas del Hospital</a>
    </body>
</html>
