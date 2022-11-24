package pktServletHolaMundo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HolaMundo
 */
@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HolaMundo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//instancia de printWrite
		PrintWriter out;
		//iniciamos out con el metodo getwriter() de la clase httpservlet
		out=response.getWriter();
		//indicar el tipo de salida
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head><title>Ejemplo Servlet</title></head>");
		out.println("<body><h1>HOLA MUNDO¡¡</h1></body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out;
		out=response.getWriter();
		String usuario = request.getParameter("usuario");
		String pwd= request.getParameter("clave");
		
		int pwd1= Integer.parseInt(pwd);
		
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head><title>Ejemplo Servlet</title></head>");
		out.println("<body><p>Nombre recibido es: "+usuario+"</p></br><p>clave recibido es: "+pwd+"</p></body>");
		out.println("</html>");
	}

}
