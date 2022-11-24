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
String nom=request.getParameter("userName");
String con=request.getParameter("password");

%>
<p>valores:<% out.println(nom+"  "+con);%></p>
</body>
</html>