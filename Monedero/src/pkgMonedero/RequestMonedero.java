package pkgMonedero;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestMonedero
 */
@WebServlet("/RequestMonedero")
public class RequestMonedero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestMonedero() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
		out.println("<head>");
		out.println("<title>Monedero</title>");
		out.println("<style>");
		out.println("h1{background-color: blue;color:white;text-align:center;}");
		out.println("body{background-color: lightgrey;color:black}");
		out.println(".head{background-color: blue;color:white;text-align:center;");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Monedero</h1>");
		out.println("<table>");
		out.println("<tr><td class='head'>Fecha</td><td class='head'>Importe(E)</td><td class='head'>Tipo</td><td class='head'>Cod. Asiento</td><td class='head'>Descripción</td>");
		out.println("</tr>");
		
		String fecha = request.getParameter("fecha");
		String importe =request.getParameter("importe");
		
		String tipo= request.getParameter("tipo");
		String asiento= request.getParameter("asiento");
		String descripcion = request.getParameter("descripcion");
		if(fecha!=null  ||importe!=null||tipo!=null  ||asiento!=null   ||descripcion!=null  ) {
			
		RequestDispatcher rd = request.getRequestDispatcher("/DBServletMonedero");
		rd.include(request, response);
		
			this.Formulario(out);
		}else {
		
			
			this.Formulario(out);
		}
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}
	private void Formulario(PrintWriter obj) {
		
		obj.println("<form action='RequestMonedero' method='post'>");
		obj.println("<tr><td><input type='date'name='fecha'size='14 required'></td>");
		obj.println("<td><input type='number' step='any'name='importe'size='14 required'></td>");
		obj.println("<td><select name='tipo'><option value='Ingreso'>Ingreso</option><option value='Gasto'>Gasto</option></select></td>");
		obj.println("<td><select name='asiento'><option value='Teléfono'>Teléfono</option><option value='Alimentos'>Alimentos</option><option value='Nóminas'>Nóminas</option><option value='Recibo Luz'>Recibo Luz</option><option value='Varios'>Varios</option><option value='Gasolina'>Gasolina</option><option value='Comunidad'>Comunidad</option></select></td>");
		obj.println("<td><input type='text'name='descripcion' size='30' required></td>");
		obj.println("<td><input type='submit'value='Añadir Asiento'><td></tr>");
		obj.println("</form>");
		obj.println("</table>");
	}
}
