package pkgSesionProfesor;

import java.io.IOException;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class BBDD
 */
@WebServlet("/BBDD")
public class BBDDentrada extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BBDDentrada() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			this.con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/prueba2","root","");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			Statement stmt=con.createStatement();
			String nombre=request.getParameter("nombre");
			double nota1 = Double.parseDouble(request.getParameter("nota1"));
			double nota2 = Double.parseDouble(request.getParameter("nota2"));
			double nota3 = Double.parseDouble(request.getParameter("nota3"));
			String sql2="INSERT INTO alumnos VALUES('"+nombre+"','"+nota1+"','"+nota2+"','"+nota3+"')";
			stmt.executeUpdate(sql2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
