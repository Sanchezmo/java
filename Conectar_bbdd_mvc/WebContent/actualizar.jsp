<%@page import="model.Persona"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%//recogemos arraylist y  camp1 uno nombre camp2 ape camp 3 enlace que direcciona a procesar y envia el id del enlace pulsado
	ArrayList<Persona> consulta= new ArrayList<Persona>();
	consulta = (ArrayList<Persona>)request.getAttribute("seleccion");
	out.println("<table id=\"tabla\" style='margin-left:40%;margin-right:30%'; border:solid 2px lightblue;>" + 
			"	<tr style='background-color:lightblue;border:2px solid #8F10B2;'>" + 
			"		<th>     ID</th>\r\n" + 
			"		<th>     Nombre</th>\r\n" + 
			"		<th>     Apellido</th>\r\n" + 
			
			"	</tr>");
	for(Persona per:consulta){
		out.println("<tr><td>"+per.getId()+"</td><td>"+per.getNombre()+"</td><td>"+per.getApellido()+"</td><td><a name='id' href='Procesar?id="+per.getId()+"&operacion=actualizar'>Actualizar</a><a name='id' href='Procesar?id="+per.getId()+"&operacion=borrar'>Borrar</a></tr>");
		
		}
	out.println("</table>");
			%>
</body>
</html>