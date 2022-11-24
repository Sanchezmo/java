package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bean;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("entrada.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*PrintWriter out= response.getWriter();
		out.println("ENTRADA");*/
		/*Enlazamos el controlador con el modelo
		 * Hacemos uns instancia u objeto del modelo*/
		Bean b= new Bean();
		/*Pasamos los datos al modelo para 
		 * que los pueda operar*/
		String nom_profe= request.getParameter("profesor");
		String nom_asig= request.getParameter("asignaturas");
		b.setNombre_profe(nom_profe);
		b.setAsignatura(nom_asig);
		if(b.comprobar())
		{
			request.getRequestDispatcher("entrada_correcta.jsp").forward(request, response);
		}else {
		request.setAttribute("error", "Profesor no registrado");
		request.getRequestDispatcher("entrada.jsp").forward(request, response);
		}
		}

}
