<%@page import="java.util.Iterator"%>
<%@page import="pkgProfesor.ProfesorBeans"%>
<%@page import="pkgAlumno.Alumno"%>
<%@ page language="java" session="true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import= "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Bienvenido</h1>

<% if(request.getParameter("profesor")==""){ %>
<jsp:forward page="index.jsp">
	<jsp:param value="Introduzca nombre del profesor" name="error"/>
		
	</jsp:forward>
	
<%}else{ %>	
<jsp:useBean id="datos_capturados" class="pkgProfesor.ProfesorBeans" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="datos_capturados"/>
<p>Profesor:<jsp:getProperty property="profesor" name="datos_capturados"/></p>
<p>Esta calificando la asignatura:<jsp:getProperty property="asignaturas" name="datos_capturados"/></p>

<%

		HttpSession sesionOk = request.getSession();
	

%>

<form action="datoscapturados.jsp" method="post">
<p>Nombre del alumno: <input type="text" name="alumno" placeholder="nombre del alumno"></p>

<p>Nota 1: <input type="text" name="nota1"/></p>
<p>Nota 2: <input type="text" name="nota2"/></p>
<p>Nota 3: <input type="text" name="nota3"/></p>

<p> <input type="submit" name="insertar" value="Insertar"/>
<input type="submit" name="mostrar" value="Mostrar"/>
 <input type="submit" name="cerrar_sesion" value="Cerrar sesión"/></p>
</form>
	
<!-- hastNext comprueba que hay objetos y apunta al siguiente 
con while(it.hasNext()) recorreo los elementos del array list y ver si hay objeto , si hay objeto hasNext() devuelve true
si devuelve true puedo obtener el objeto ,el objeto le obtengo con next 
 -->

<%
if(request.getParameter("insertar")!=null){
	String nombre_alum = request.getParameter("alumno");
	double n1 = Double.parseDouble(request.getParameter("nota1"));
	double n2 = Double.parseDouble(request.getParameter("nota2"));
	double n3 = Double.parseDouble(request.getParameter("nota3"));
	
	Alumno alum = new Alumno(nombre_alum, n1, n2, n3);
	
	/*Object alumo= new Alumno(nombre_alum,n1,n2,n3);
	Alumno almno1= (Alumno)alumo;*/
	
	datos_capturados.getanadir_alumno(alum);
	out.println("El alumno ha sido insertado");
}
if (request.getParameter("mostrar")!=null)
{
	
	%>
	<jsp:forward page="mostrardatos.jsp"></jsp:forward>
	<% 

	
	 /*ArrayList<Alumno> lista_alum =datos_capturados.getList();
	 Iterator<Alumno> i= lista_alum.iterator(); 
	 
	 while(i.hasNext())
	 {
		Alumno a =i.next();  con esto obtenemos el objeto en el que se encuentra hashNext()
		out.println(a.getNombre());
		out.println(a.getNota1());
		out.println(a.getNota2());
		out.println(a.getNota3());
	 }*/
}
%>

<%
if(request.getParameter("cerrar_sesion")!=null){
%>
<jsp:forward page="cerrar.jsp"></jsp:forward>

<%} %>
<%} %>
	
</body>
</html>