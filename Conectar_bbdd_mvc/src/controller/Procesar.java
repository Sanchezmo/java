package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Conexion;
import model.Persona;

/**
 * Servlet implementation class Procesar
 */
@WebServlet("/Procesar")
public class Procesar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Procesar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//recoge valor id que queremos actualizar get parameter
		Conexion cn= new Conexion();
		String id = request.getParameter("id");
		String operacion=request.getParameter("operacion");
		Persona p= new Persona();
		
		
		p=cn.comprobar(Integer.parseInt(id));
		if(operacion.equals("actualizar")){
		request.setAttribute("Persona", p);	
		request.getRequestDispatcher("modificar.jsp").forward(request, response);
		}else if(operacion.equals("borrar")){
			
		request.setAttribute("Persona", p);	
		request.getRequestDispatcher("modificar.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("Insertar")!=null) {
			String nombre=request.getParameter("txtNombre");
			String apellido=request.getParameter("txtApe");
			
			if(nombre.equals("")|| apellido.equals("")) {
				request.setAttribute("error", "Campos vacios");
				request.getRequestDispatcher("error.jsp").forward(request, response);
			}else {
				Conexion cn= new Conexion();
				Persona per=new Persona();
				
				per.setNombre(nombre);
				per.setApellido(apellido);
				if(cn.insertar(per)>0) {
					request.setAttribute("persona1", per);
					request.setAttribute("exito", "Se ha insertado correctamente");
					request.getRequestDispatcher("exito.jsp").forward(request, response);
				}else {
					request.setAttribute("error", "No se ha podido insertar");
					request.getRequestDispatcher("error.jsp").forward(request, response);
				}

			}
		} else if(request.getParameter("Seleccionar")!=null) {
			//Direccionar a una pagina actualizar.jsp
			//Envia,ps a actualiza jsp el resultado de la consulta select de la tabla, seleccionar de conexion, y devolverá el array de la tabla.
			Conexion cn= new Conexion();
			ArrayList<Persona> consulta = new ArrayList<Persona>();
			consulta = cn.seleccionar();
			request.setAttribute("seleccion", consulta);
			request.getRequestDispatcher("actualizar.jsp").forward(request, response);		
			
		
		}else if(request.getParameter("Actualizar")!=null) {
			int id = Integer.parseInt(request.getParameter("clave"));
			String nombre = request.getParameter("nombre");
			String apellidos = request.getParameter("apellido");
			Persona p = new Persona();
			p.setId(id);
			p.setNombre(nombre);
			p.setApellido(apellidos);
			Conexion cn= new Conexion();
			if(cn.actualizar(p)==0) {
				request.setAttribute("error","Error de actualización" );
				request.getRequestDispatcher("error.jsp").forward(request, response);
				
			}else {
				request.setAttribute("persona1", p);
				request.setAttribute("exito", "Se ha actualizado");
				request.getRequestDispatcher("exito.jsp").forward(request, response);
			}

			
		}else if(request.getParameter("Borrar")!=null) {
			int id2 = Integer.parseInt(request.getParameter("clave"));
			String nombre = request.getParameter("nombre");
			String apellidos = request.getParameter("apellido");
			Persona p2 = new Persona();
			p2.setId(id2);
			p2.setNombre(nombre);
			p2.setApellido(apellidos);
			Conexion cn = new Conexion();
			if(cn.borrar(p2)==0) {
				request.setAttribute("error", "No se ha podido borrar");
				request.getRequestDispatcher("error.jsp").forward(request, response);
			}else {
				request.setAttribute("persona1", p2);
				request.setAttribute("exito", "Se ha eliminado");
				request.getRequestDispatcher("exito.jsp").forward(request, response);
			}
		}
	}

}
