package pruebaBBDD;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EjemBBDD
 */
@WebServlet("/EjemBBDD")
public class EjemBBDD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjemBBDD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//variables que voy a utilizar
		//1variable conexion
		Connection conexion=null;
		//2variable statement para las ordenes SQL
		Statement stmt=null;
		//3variable para guardar el resultado de la consulta
		ResultSet rs=null;
		PrintWriter out= response.getWriter();
		response.setContentType("Text/html");
		try {
			//Empezamos a generar el codigo para conectar con la BBDD
			//1-cargamos los driver
			Class.forName("com.mysql.jdbc.Driver");
			//2-conectamos con nuestra BBDD
			conexion=DriverManager.getConnection("jdbc:mysql://127.0.0.1/curso", "root", "");
			//3-inicializar el objeto que usaremos para hacer las consultas es decir statement
			stmt=conexion.createStatement();
			//4-Realizar la consulta usando el objeto Statement
			rs=stmt.executeQuery("SELECT * FROM departamentos");
			//5-Recorrer la tabla resultado
			while(rs.next()) {
				out.println(rs.getInt(1)+"-");
				out.println(rs.getString(2)+"-");
				out.println(rs.getString(3)+"<br>");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
