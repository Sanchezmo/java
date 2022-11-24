<%@page import="model.Persona"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	Persona p=(Persona)request.getAttribute("Persona");
	%>
<form action="Procesar" method="post">
<input type="hidden" name="clave" value="<%=p.getId() %>">
<input type="text" name="nombre" value="<%=p.getNombre() %>">
<input type="text" name="apellido" value="<%=p.getApellido() %>">
<input type="submit" name="Actualizar" value="Actualizar">
<input type="submit" name="Borrar" value="Borrar">


</form>
</body>
</html>