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
	Persona p1= (Persona)request.getAttribute("persona1");
%>
<h1><%= 
request.getAttribute("exito")


%></h1>
<p>Nombre: <%=p1.getNombre() %></p>
<p>Apellido: <%=p1.getApellido() %></p>

</body>
</html>