<%@ page language="java" session="true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

String profesor=""; 
String asignaturas="";
if(request.getParameter("asignaturas")!=null)
	asignaturas=request.getParameter("asignaturas");
if(request.getParameter("profesor")=="Arturo" &&request.getParameter("profesor")=="Andres"&&request.getParameter("profesor")=="Antonio"){
	

	profesor=request.getParameter("profesor");



if((profesor.toUpperCase().equals("Arturo") && asignaturas.equals("matematicas"))||
		(profesor.toUpperCase().equals("Andres") && asignaturas.equals("lengua"))||
		(profesor.toUpperCase().equals("Antonio") && asignaturas.equals("historia")))
{
	
	
	HttpSession sesionOk= request.getSession();
	sesionOk.setAttribute("profesor", profesor);
	%>
	<jsp:forward page="datoscapturados.jsp"></jsp:forward>
<%
}else {
%>
<jsp:forward page="index.jsp">

	<jsp:param value="El profesor no está en la lista y/o la asignatura no es la correcta" name="error"/>
</jsp:forward>

<%} %>

</body>
</html>