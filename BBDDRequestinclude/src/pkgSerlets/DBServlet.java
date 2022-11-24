package pkgSerlets;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBServlet
 */
@WebServlet("/DBServlet")
public class DBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       //Declaro el metodo conexion como atributo
	private Connection con;
	private PrintWriter out;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBServlet() {
        super();
        
      
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		//cargamos el driver de conexion con mysql
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			   //Conectarnos con un gestor MYSQL para accerder a BD
			   this.con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/prueba2", "root", "");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("Text/html");
		
		out=response.getWriter();
		
		//out.println("</body>");
		//out.println("</html>");
		
		//creamos el statement
		try {
			Statement stmt= con.createStatement();
			//operacion de insertar datos
				//Recogemos los datos
			String nombre = request.getParameter("nombre");
			String apellido =request.getParameter("apellido");
			//hacemos la operacion insert de sql para introducir valor a los bd.
			// insert into alumno values("jose","lopez");
			// Debemos de hacer un insert que reemplace el dato del nombre por la varia nombre
			//y el dato del apellido por la variable apellido
			
			String sql = "INSERT INTO alumno VALUES('"+nombre+"','"+apellido+"')";
			stmt.executeUpdate(sql);
			//-------------------------------------------------------------
			/*hacemos la orden para mostrar los datos de la tabla alumno
			 * de la base de datos */
			out.println("<h3>Resultados</h3>");
			String sql1="SELECT * FROM alumno;";
			ResultSet rs=stmt.executeQuery(sql1);
			out.println("<ul>");
			while(rs.next()) {
				out.println("<li>"+rs.getString(1)+" - "+rs.getString(2)+"</li>");
				}
				out.println("</ul>");	
				rs.close();
				stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			out.println("</body>");
			out.println("</html>");
		
	}

}
