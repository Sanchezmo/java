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
String usuario="";
String clave="";
if(request.getParameter("usuario")!=null){
	usuario=request.getParameter("usuario");
}
if(request.getParameter("clave")!=null){
	clave=request.getParameter("clave");
}
if(usuario.equals("admin")&& clave.equals("12345")){
//hacemos el objeto sesion
HttpSession sesion =request.getSession();
//al objeto sesion, le asignamos las variables que queremos utilizar en al sesion
//para realizar el proceso de asignacion le tenemos que dar atributos
//con el metodo setAttribute(identificador,valor);
sesion.setAttribute("usuario", usuario);
%>
<jsp:forward page="menu.jsp"></jsp:forward>

<%}else{ %>
<jsp:forward page="login.jsp">
<jsp:param value="usuario y/o clave incorrectos; introduzca de nuevo." name="error"/>
</jsp:forward>
<%} %>
</body>
</html>