<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mensaje</title>
</head>
<body>
<h1>Mensaje de resultado de la acción</h1>
<%=request.getAttribute("mensaje") %>
</body>
</html>