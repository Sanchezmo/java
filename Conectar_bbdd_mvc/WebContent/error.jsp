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
//downcasting a string
	String error=(String)request.getAttribute("error"); %>
<h1>Ha ocurrido un error...<%=error %></h1>
</body>
</html>