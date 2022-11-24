<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Resultado.jsp" method="post">
<p>Numero 1<input type="number" size="20" name="num1" step="any"></p>
<p>Numero 2<input type="number" size="20" name="num2" step="any"></p>
<p><input type="checkbox" name="check"value="suma">SUMA</p>
<p><input type="checkbox" name="check"value="resta">RESTA</p>
<p><input type="checkbox" name="check"value="multiplica">MULTIPLICA</p>
<p><input type="checkbox" name="check"value="divide">DIVIDE</p>
<p><input type="submit" value="CALCULAR"></p>

</form>
</body>
</html>