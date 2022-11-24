<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="persona" class="pkgBeans.Persona" scope="page"></jsp:useBean>
<!-- Psamos valores al bean -->
<jsp:setProperty property="nombre" name="persona" value="Maria"/>
<%= "El nombre de la persona es: " %>
<h1><jsp:getProperty property="nombre" name="persona"/></h1>
</body>
</html>