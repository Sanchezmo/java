<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="pkgCalc.Calcum"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="Calcum" class="pkgCalc.Calcum" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="Calcum"/>
<h1>Resultados:</h1>
<p>El numero 1 es:<jsp:getProperty property="num1" name="Calcum"/></p>
<p>El numero 2 es:<jsp:getProperty property="num2" name="Calcum"/></p>
<%
	String[] caja= request.getParameterValues("check");
/*if(caja!=null){*/
	try{
	for(int i=0;i<caja.length;i++)
	{
		if(caja[i].equals("suma"))
		{
			out.println("<p>La suma es:"+Calcum.getsuma(Calcum.getNum1(),Calcum.getNum2())+"</p>");
		}
		if(caja[i].equals("resta"))
		{
			out.println("<p>La resta es:"+Calcum.getresta(Calcum.getNum1(), Calcum.getNum2())+"</p>");
		}
		if(caja[i].equals("multiplica"))
		{
			out.println("<p>La multiplicacion es:"+Calcum.getmultiplica(Calcum.getNum1(), Calcum.getNum2())+"</p>");
		}
		if(caja[i].equals("divide")){ 
			if(Calcum.getNum2()!=0)
			out.println("<p>La division es:"+Calcum.getdivision(Calcum.getNum1(), Calcum.getNum2())+"</p>");
			else
			out.println("<p>No se puede dividir por Cero</p>");
		}
	}
	}catch(Exception e){out.println("<p>Seleccione una operacion</p>");}
/*}else{out.println("<p>Seleccione una operacion</p>");}*/
	
String[] res=Calcum.getoperacion2();
for(int i=0;i<res.length;i++){
	out.println(res[i]);
}


	%>


</body>
</html>