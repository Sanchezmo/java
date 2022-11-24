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
if(!(request.getParameter("userName").equals(null))&&!(request.getParameter("userName").equals(""))
		&&!(request.getParameter("password").equals(null))&&!(request.getParameter("password").equals(""))){
	%>
	<jsp:forward page="saludo.jsp"></jsp:forward>
	<%}else{ %>
	<jsp:forward page="forward.jsp">
		<jsp:param value="Usuario y password deben rellenarse" name="mensaje"/>
	</jsp:forward>
	<%} %>
</body>
</html>