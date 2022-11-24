<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="checklogin.jsp" method="post">
<p>usuario:<input type="text" name="usuario"/></p>
<p>contraseña<input type="text" name="clave"/></p>
<p><input type="submit" value="Enviar" name="login"></p>
<%
	if(!(request.getParameter("error")==null)){
		out.println(request.getParameter("error"));
	}
%>

</form> 
</body>
</html>