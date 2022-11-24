<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="delega.jsp" method="post">
<p>usuario:<input type="text" name="userName"/></p>
<p>contraseña<input type="text" name="password"/></p>
<p><input type="submit" value="Enviar" name="login"></p>
<%
	if(!(request.getParameter("mensaje")==null)){
		out.println(request.getParameter("mensaje"));
	}
%>
</form> 
</body>
</html>