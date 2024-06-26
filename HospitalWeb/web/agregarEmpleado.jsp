<%-- 
    Document   : agregarEmpleado
    Created on : 26 sep. 2022, 08:29:49
    Author     : DELL
--%>

<%@page import="Modelo.Empleado"%>
<%@page import="Datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Agregar Empleado</h1>
        <%
            OperacionBD op = new OperacionBD();
            op.conectar();
            //verifica que en el formulario se envien datos no vacios     
            if (!request.getParameter("empleadoNum").equals("") && !request.getParameter("nombre").equals("") && !request.getParameter("edad").equals("") && !request.getParameter("sexo").equals("") && !request.getParameter("salario").equals("")) {
                String empN = request.getParameter("empleadoNum");
                String nom = request.getParameter("nombre");
                int age = Integer.parseInt(request.getParameter("edad"));
                String sex = request.getParameter("sexo");
                double salario = Double.parseDouble(request.getParameter("salario"));
                
                Empleado emp = new Empleado(empN, nom, age, sex, salario);

                op.agregarEmpleado(emp);
            }

            response.sendRedirect("empleados.jsp");

            op.desconectar();


        %>
            
    </body>
</html>
