<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Bienvenido profesor: <%
out.println(request.getParameter("profesor"));
%></h1>
<h2>Su asignatura es: <%
out.println(request.getParameter("asignaturas"));

%></h2>
</body>
</html>