<%@ page language="java" session="true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="pkgProfesor.ProfesorBeans"%>
<%@page import="java.util.Iterator"%>
<%@page import= "java.util.ArrayList" %>
<%@page import="pkgAlumno.Alumno"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	HttpSession session2 = request.getSession();

	ProfesorBeans profe= (ProfesorBeans)session2.getAttribute("datos_capturados");
	
	/*Object profeo=session2.getAttribute("datos_capturados");
	ProfesorBeans profeobeans=(ProfesorBeans)profeo;*/
	  
	%>
<h1>Alumnos calificados por el profesor : <%=profe.getProfesor() %> </h1>
<h2>Calificando la asignatura: <%= profe.getAsignaturas() %></h2>


<p>Entran valores: 
<table>
	<tr>
		<th>Nombre </th>
		<th>Nota 1</th>
		<th>Nota 2</th>
		<th>Nota 3</th>
		<th>Media </th>
	</tr>
	<% 
	 ArrayList<Alumno> lista_alum =profe.getList();
	 Iterator<Alumno> i= lista_alum.iterator(); 
	 
	 while(i.hasNext())
	 {
		 Alumno a =i.next();
		 
	%><tr> 
			<td> <% out.println(a.getNombre()); %></td>
		 	<td> <% out.println(a.getNota1()); %></td>
		 	<td> <% out.println(a.getNota2()); %></td>
		 	<td> <% out.println(a.getNota3()); %></td>
		 	<td> <% out.println((a.getNota1()+a.getNota2()+a.getNota3())/3); %></td>
	 <% }%>
	
	
</table>

<a href="datoscapturados.jsp">Volver atrás</a>

</body>
</html>