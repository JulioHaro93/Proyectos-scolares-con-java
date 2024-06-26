<%-- 
    Document   : estadisticasHospital
    Created on : 27 sep. 2022, 00:36:01
    Author     : DELL
--%>

<%@page import="Datos.OperacionBD"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Medicamento"%>
<%@page import="Modelo.Hospital"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilos.css" rel="stylesheet"/>
        <title>Estadísticas del hospital CHIMSS</title>
        
    </head>
    <body style="background-color: #FFF5EE">
        <h1>Estadísticas</h1>
        
        <h2>Estadísticas y datos generales de los empleados</h2>
        <h2>En nuestro hospital tenemos el siguiente balance de empleados por sexo</h2>
            <%
                Hospital ho = new Hospital();
                out.println(ho.empleadoSex());
            %>
            
            <h2>Los sueldos brutos que tenemos de nuestros empleados van están en el siguiente rango</h2>
            
            <%
                out.println(ho.salarioMenoryMayor());
            %>
            
            <h2>El promedio de edades de los empleados de CHIMSS es el siguiente: </h2>
            <%
                int empleadosPromEntero = (int) Math.floor(ho.empleadoEdadesProm());
                out.println(empleadosPromEntero);
            %>
        
             <h2>Agregar Empleado</h2>
             <form action="agregarEmpleado.jsp" method="post">
                
                Numero de Empleado: <input type="text" name="empleadoNum" size="15"/><br><br>
                Nombre: <input type="text" name="nombre" size="15"/><br><br>
                Edad: <input type ="text" name="edad" size="15"/><br><br>
                Sexo: <input type="text" name="sexo"  size="15"/><br><br>
                Salario: <input type="text" name ="salario" size="15"/><br><br>
                <input type="submit" value=agregar>
               
              </form>
             <h2>Modificar el salario de un Empleado</h2>
             <form action="modificarEmpleado.jsp" method="post">
                 
                 Por favor Agrege el numero del empleado: <input type="text" name="empleadoNum" size="15"/><br><br> 
                 Por favor, agrege el nuevo salario del empleado: <input type="text" name="salario" size="15"/><br><br>
                 <input type="submit" value=agregar>
             </form>
             <h2>Para eliminar del registro a un Empleado que ya no trabaje en CHIMSS agrege su número de empleado</h2>
             <form action="eliminarEmpleado.jsp" method="post">
                 Número de Empleado: <input type="text" name="empleadoNum" size="15"/><br><br>
                 <input type="submit" value="eliminar">
             </form>     
            
        
             <h2>Agregar Paciente</h2>
             <form action="agregarPaciente.jsp" method="post">
             Numero de Seguridad Social: <input type="text" name="nss" size="15"/><br><br>
             Nombre del Paciente: <input type="text" name="nombre" size="15"/><br><br>
             Padecimiento o motivo de ingreso:<br> 
             <input type="textarea" name="padecimiento" size="400"><br><br> 
             <input type="submit" value=agregar/>
             </form>
             <h2>Modificar La condición de salud del Paciente</h2>
             <form action="modificarPaciente.jsp" method="post">
             Por favor ingrese el NSS: <input type="text" name="nss" size="15"/><br><br><!-- comment -->
             Por favor ingrese si el paciente tiene un nuevo padecimiento o si se ha dado de alta: <br> 
             <input type="textarea" name="padecimiento" size="15"/><br><br>
             <input type="submit" value="agregar"/><br><br>
             </form>
             <h2>Para dar de baja a un Paciente que ya no es derechohabiente agrege su Numero de Seguridad Social</h2>
             <form action="eliminarPaciente.jsp" method="post"> 
                 NSS: <input type="text" name="nss" size="15"/><br><br>
                 <input type="submit" value="dar de baja"/>
             </form>
             
              <h2>Medicamentos por presentación</h2>
                          <%
                int ampo =0;
                int comp = 0;
                int inh =0;
            
            
                
                OperacionBD op = new OperacionBD();
                op.conectar();
            
                
                            
                    ArrayList<Medicamento> medicamentos = new ArrayList<>();
                    medicamentos = op.mostrarMedicamentos();
                    for (int i =0; i<medicamentos.size(); i++) {
                    Medicamento med = medicamentos.get(i);
                    i++;
                }
            %>
            <p>
                <%
                        for (int i =0; i<medicamentos.size(); i++) {
                            Medicamento med = medicamentos.get(i);
                            if(med.getPresentacion().equals("ampoyeta")){ampo++;}
                            if(med.getPresentacion().equals("comprimido")){comp++;}
                            if(med.getPresentacion().equals("inhalador")){inh++;}
                            i++;
                        }
                        out.println("\nel numero de medicamentos de ampoyeta es: \n" + ampo);
                        out.println("\nel numero de medicamentos comprimidos es: \n" + comp);
                        out.println("\nel numero de medicamentos por inhalador es: \n"+ inh);
                    
                %>
            </p>
             
             <h2>Agregar Medicamento</h2>
             <form action ="agregarMedicamento.jsp" method="post">
                 Clave del medicamento: <input type="text" name="clave" size="15"/><br><br>
                 Nombre Comercial: <input type="text" name="nombreCom" size="15"/><br><br>
                 Principio Activo del fármaco: <input type="text" name="principioAct" size="15"/><br><br>
                 Presentación: <input type ="text" name="presentacion" size="15"/><br><br>
                 Ingesta o Administración: <input type="text" name="toma" size="15"/><br><br> 
                 <input type="submit" value=agregar><br><br>
             </form>
             <h2>Modificar Medicamento</h2>
             <form action="modificarMedicamento.jsp" method="post">
                 Ingrese la calve del mediamento en caso de que haya cambiado el nombre comercial: <br>
                 <input type="text" name="clave" size="15"/><br><br><!-- comment -->
                 Ingrese el nuevo nombre comercial: <br><!-- comment -->
                 <input type ="text" name="nombreCom" size="15"/><br><br>
                 <input type ="submit" value="agregar"><!-- comment -->
                 
             </form>
             <h2>Para eliminar un Medicamento que ha sido descontinuado agrege la clave del medicamento</h2>
             <form action="eliminarMedicamento.jsp" method="post">
                 Clave del Medicamento:<input type="text" name="clave" size="15"/><br><br><!-- comment -->
                 <input type="submit" value="eliminar"/><br><br>
             </form>
            <br><br><a href="index.html">Index</a>
            
    </body>
</html>
