<%@ page session="true" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
HttpSession sesionmenu= request.getSession();
sesionmenu.invalidate();
%>
<jsp:forward page="login.jsp">
<jsp:param value="Sesion cerrada" name="error"/>
</jsp:forward>
</body>
</html>