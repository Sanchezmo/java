package com.vipper.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.parser.ParserBasicInformation;

import com.vipper.modelo.Contacto;
import com.vipper.persistencia.AccessoBBDD;

/**
 * Servlet implementation class Sagenda
 */
@WebServlet("/sagenda")
public class Sagenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sagenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);		
		String nombre=request.getParameter("nombre");
		String telefono=request.getParameter("telefono");
		int id=Integer.parseInt(request.getParameter("id"));
		String email=request.getParameter("email");
		Contacto c1=new Contacto(id,nombre,email,telefono);
		RequestDispatcher rd=null;
		AccessoBBDD ab1=new AccessoBBDD();
		try {
			int exito=ab1.altaContacto(c1);
			if (exito>=1) {
				request.setAttribute("mensaje","Su gestión se ha realizado con éxito");
			}else {
				request.setAttribute("mensaje","Se ha producido un error");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			request.setAttribute("mensaje","Compruebe si el id esta duplicado");
		}
		rd=request.getRequestDispatcher("/Mensaje.jsp");
		rd.forward(request, response);
	}
}