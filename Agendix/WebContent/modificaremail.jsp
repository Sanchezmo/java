<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Modificar Email de un contacto</title>
</head>
<body>
<h1>Introduzca el id y el nuevo email del contacto que desea modificar</h1>
<form action="smodificar" method="post">
id del contacto: <input type="number" name="id" required/>
<br/>
Email: <input type="email" name="email"/>
<br/>
<input type="submit" value="modificar email"/>
</form>
</body>
</html>