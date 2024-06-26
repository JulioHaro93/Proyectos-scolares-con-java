<%-- 
    Document   : index
    Created on : 11-sep-2022, 2:10:45
    Author     : josue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>     
        <title>Página de Prueba</title>
    </head>
    <body>
      <h1 align="center">Formulario</h1>
	<form action="resultados.jsp" method=post>
		Introduce a x: <input  type="text" name="valorX" size="15"><br><br>
		Introduce a y: <input  type="text" name="valorY" size="15"><br><br>
                
        <select name="Operacion">
            <option>suma</option>
	    <option>resta</option>
            <option>multiplicacion</option>
	    <option>division</option>
        <select>
                <br><br>
		<input type="submit" value="enviar datos">
    	</form>
       
    </body>
</html>
