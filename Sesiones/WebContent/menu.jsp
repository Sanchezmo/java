<%@  page session="true" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menú</title>
</head>
<body>
<%
String usuario="";
/*capturamos el objeto sesion, con getSession se genera y recoje el objeto sesion
cuando ha sido creado*/
HttpSession sesionmenu= request.getSession();//recoge el objeto sesion que se creo en login.jsp
//comprobamos que el atributo de sesion no sea nulo(esta entrando sin login)
if(sesionmenu.getAttribute("usuario")!=null){
	usuario=(String)sesionmenu.getAttribute("usuario");//downcasting de objeto string a string
	%><%
}else{
%>
<h1>Debe registrarse para entrar en la pagina</h1>
<jsp:forward page="login.jsp">
<jsp:param value="Es obligatorio identificarse" name="error"/>
</jsp:forward>

<%} %>
<p><b>Usuario activo en esta sesion: <%= usuario %></b></p>
<p><a href="cerrarsesion.jsp">Cerrar Sesión</a></p>
</body>
</html>