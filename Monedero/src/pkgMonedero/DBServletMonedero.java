package pkgMonedero;
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
 * Servlet implementation class DBServletMonedero
 */
@WebServlet("/DBServletMonedero")
public class DBServletMonedero extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private Connection con;
 	 private PrintWriter out;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBServletMonedero() {
        super();
       
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/monedero", "root", "");
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
		out=response.getWriter();
		
		
		
		
		try {
			Statement stmt = con.createStatement();
			
			String fecha = request.getParameter("fecha");
			double impo = Double.parseDouble(request.getParameter("importe"));
			//String importe =request.getParameter("importe");
			/*if(importe.length()!=0 && importe!=null) {
			double impo = Double.parseDouble(request.getParameter("importe"));
			}else {
				out.println("<p>introduce importe con decimales</p>");
			}*/
			String tipo= request.getParameter("tipo");
			String asiento= request.getParameter("asiento");
			String descripcion = request.getParameter("descripcion");
			
			
			String sql = "INSERT INTO monedero VALUES('"+fecha+"','"+impo+"','"+tipo+"','"+asiento+"','"+descripcion+"')";
			stmt.executeUpdate(sql);
			
			String sql1="SELECT * FROM monedero;";
			ResultSet rs=stmt.executeQuery(sql1);
			out.println("");
			while(rs.next()) {
				out.println("<tr><td>"+rs.getString(1)+"</td><td> "+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td> "+rs.getString(4)+"</td><td> "+rs.getString(5)+"</td></tr>");
				}
				out.println("");	
				rs.close();
				stmt.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
	}
}
