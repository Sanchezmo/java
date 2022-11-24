<%@ page language="java" session="true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Datos del profesor </h1>
<form action="datoscapturados.jsp" method="post">
<p>Profesor: <input type="text" name="profesor">
</p>
<p><select name="asignaturas">
	<option value="lengua">Lengua</option>
	<option value="matematicas">Matematicas</option>
	<option value="historia">Historia</option>
</select>
</p>
<p> <input type="submit" value="Enviar datos">
</p>
</form>
<p>
<%

	if(!(request.getParameter("error")==null))// si esto es no falso, es decir, si existe el error, dependiendo de por donde nos entre el usuario.
	{
		out.println(request.getParameter("error"));// con esto evito que si no pongo el if  y solo pongo el out.print me ponga como mensaje null. 
		// como delega es quien envia este mensaje y como delga no lo ha enviado porque aun no hemos dado enviar 
		// entonces al iniciar la pagina sale un null de entrada cuando cargo la pagina. 
		
	}
	if(!(request.getParameter("cerrar")==null))
	{
		out.println(request.getParameter("cerrar"));
	}
	//if(!(request.getParameter("comprueba")==""))
	//{
	//	out.println(request.getParameter("comprueba"));
	//}

%></p>
</body>
</html>