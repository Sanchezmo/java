package pkgSesionProfesor;

import java.io.IOException;
import java.io.PrintWriter;

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
public class BBDDsalida extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
	private PrintWriter out;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BBDDsalida() {
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
		out=response.getWriter();
		
		try {
			Statement stmt=con.createStatement();
			String sql="select * from alumnos";
			ResultSet rs=stmt.executeQuery(sql);
			
			out.println("<table>");
			out.println("<tr><td>Nombre</td><td>Nota1</td><td>Nota2</td><td>Nota3</td><td>Media</td></tr>");
			while(rs.next()) {
				 Double sumatorio= rs.getDouble(2)+rs.getDouble(3)+rs.getDouble(4);
				out.println("<tr><td>"+rs.getString(1)+" </td><td> "+rs.getDouble(2)+" </td><td> "+rs.getDouble(3)+" </td><td> "+rs.getDouble(4)+"</td><td>"+sumatorio/3+"</td></tr>");	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("</table>");
	}

}
