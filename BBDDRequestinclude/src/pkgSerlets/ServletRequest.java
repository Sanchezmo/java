package pkgSerlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRequest
 */
@WebServlet("/ServletRequest")
public class ServletRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Ejemplo de parametros request</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Ejemplo de parametros de request</h3>");
		//generamos variables
		/*variables de captura del formulario
		 * 
		 */
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
			if(nombre!=null || apellido!=null) {
				//Haremos la operaciones para la base de datos
				//comprobar que nombre y apellido tienen una cadena de texto
				//solo hara la insercion cuando tengamos texto
				if(nombre.length()!=0 && apellido.length()!=0) {
					//insercion de datos en la BD
					out.println("<p>Nombre recibido:"+nombre+"</p>");
					out.println("<p>Apellido recibido:"+apellido+"</p>");
					this.pintarFormulario(out);
					//incluimos el servlet para insertar en la base datos
					RequestDispatcher rd = request.getRequestDispatcher("/DBServlet");
					rd.include(request, response);
				}else {
					out.println("Debe insertar valores");
					this.pintarFormulario(out);
				}
			}else {
				out.println("<p>No hay valores introducidos, porfavor introduzcalos</p>");
				this.pintarFormulario(out);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private void pintarFormulario(PrintWriter obj) {
		obj.println("<form action='ServletRequest' method='post'>");
		obj.println("<p>Nombre: <input type='text'name='nombre'></p>");
		obj.println("<p>Apellido: <input type='text'name='apellido'></p>");
		obj.println("<p> <input type='submit'value='Enviar'></p>");
		obj.println("</form>");
	}

}
