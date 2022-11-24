<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="lenguajesBean" class="pkgbeans.lenguajesBean" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="lenguajesBean"/>
<h1>Resultados de Bean:</h1>
<p>Bienvenido: <jsp:getProperty property="nombre" name="lenguajesBean"/></p>
<p>Tu lenguaje favorito es: <jsp:getProperty property="lenguaje" name="lenguajesBean"/>
<p>Comentarios del Lenguaje elegido:
<% out.println(lenguajesBean.getcometariosLenguaje()); %></p>

<p> Otra vez el comentario 
<jsp:getProperty property="cometariosLenguaje" name="lenguajesBean"/></p>
</body>
</html>