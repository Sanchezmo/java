<%@ page language="java" session="true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cerrar sesion</title>
</head>
<body>

<%
	HttpSession finalizar = request.getSession();
	finalizar.invalidate();
%>
<jsp:forward page="index.jsp">
		<jsp:param value="Sesion finalizada" name="cerrar"/>
	</jsp:forward>
</body>
</html>