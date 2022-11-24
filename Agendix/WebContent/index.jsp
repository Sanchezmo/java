<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="com.vipper.modelo.Contacto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Crud Agenda</title>
</head>
<body>
<h1>Opciones Agenda</h1>
<a href="daraltacontacto.jsp">Dar de alta un Contacto</a>
<br/>
<a href="eliminarcontacto.jsp">Eliminar un Contacto</a>
<br/>
<a href="modificaremail.jsp">Modificar Email de un contacto</a>
<br/>
<%HttpSession sesion = request.getSession(); %>
<%List<Contacto> c1=(List<Contacto>)sesion.getAttribute("agenda");%>
<%if(c1.size()>0){ %>
 <h1>Contactos</h1>
                        <table>
                                <tr>
                                        <th>id Contacto</th>
                                        <th>Nombre</th>
                                        <th>Telefono</th>
                                        <th>Email</th>
                                </tr>
                                <%for(Contacto a: c1) {%>
                                  <tr>
                                                <td><%=a.getId() %></td>
                                                <td><%=a.getNombre() %></td>
                                                <td><%=a.getTelefono() %></td>
                                                <td><%=a.getEmail() %></td>
                                        </tr>
                                <%} %>
                                </table>
                                <%} %>
</body>
</html>