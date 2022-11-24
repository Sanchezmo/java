package com.vipper.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vipper.modelo.Contacto;
import com.vipper.persistencia.AccessoBBDD;

/**
 * Servlet implementation class Smodificar
 */
@WebServlet("/smodificar")
public class Smodificar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Smodificar() {
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
		int id=Integer.parseInt(request.getParameter("id"));
		String email=request.getParameter("email");
		Contacto c1=new Contacto(id,email);
		RequestDispatcher rd=null;
		AccessoBBDD ab1=new AccessoBBDD();
		try {
			int exito=ab1.modificarContacto(c1);
			if (exito>=1) {
				request.setAttribute("mensaje","Su gestión se ha realizado con éxito");
			}else {
				request.setAttribute("mensaje","El id introducido no es correcto");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			rd=request.getRequestDispatcher("/eliminarcontacto.jsp");
		}
		rd=request.getRequestDispatcher("/Mensaje.jsp");
		rd.forward(request, response);
	}
}
