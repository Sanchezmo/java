<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Beans.jsp" method="post">
<p>porfavor introduce nombre:
<input type="text" name="nombre"></p>
<p>Elige tu lenguaje de programacion favorito</p>
<select name="lenguaje">
<option value="java">Java
<option value="C++">C++
<option value="Perl">Pearl

</select>
<p><input type="submit" value="Enviar Informacion"/></p>
</form>
</body>
</html>