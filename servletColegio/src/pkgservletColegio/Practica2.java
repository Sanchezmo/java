package pkgservletColegio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pkgRecursos.Alumno;
import pkgRecursos.Asignaturas;
import pkgRecursos.Profesor;

/**
 * Servlet implementation class Practica2
 */
@WebServlet("/Practica2")
public class Practica2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Practica2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//Creo una instancia del tipo/clase PrintWriter
		PrintWriter out;
		//
		out= response.getWriter();
		//
		response.setContentType("text/html");
		
		//Recojo formulario: si quiero recoger formulario tengo que crear objetos de mis clases 
		//para ello hago objetos y empiezo por el de menor dependencia -->Asignaturas
//ASIGNATURA 1		
		String nota1= request.getParameter("nota1");//el formulario siempre nos devuelve un string
		double nota1num=Integer.parseInt(nota1);//cambio de tipo de dato
		Asignaturas asignatura1 = new Asignaturas(request.getParameter("asig1"));
		asignatura1.setNota(nota1num);//le paso la nota a la asignatura
//ASIGNATURA 2
		String nota2= request.getParameter("nota2");//el formulario siempre nos devuelve un string
		double nota2num=Integer.parseInt(nota2);//cambio de tipo de dato
		Asignaturas asignatura2 = new Asignaturas(request.getParameter("asig2"));
		asignatura2.setNota(nota2num);//le paso la nota a la asignatura
		
//ASIGNATURA 3
		String nota3= request.getParameter("nota3");//el formulario siempre nos devuelve un string
		double nota3num=Integer.parseInt(nota3);//cambio de tipo de dato
		Asignaturas asignatura3 = new Asignaturas(request.getParameter("asig3"));
		asignatura3.setNota(nota3num);//le paso la nota a la asignatura
//ASIGNATURA 4
		String nota4= request.getParameter("nota4");//el formulario siempre nos devuelve un string
		double nota4num=Integer.parseInt(nota4);//cambio de tipo de dato
		Asignaturas asignatura4 = new Asignaturas(request.getParameter("asig4"));
		asignatura4.setNota(nota4num);//le paso la nota a la asignatura
//ASIGNATURA 5
		String nota5= request.getParameter("nota5");//el formulario siempre nos devuelve un string
		double nota5num=Integer.parseInt(nota5);//cambio de tipo de dato
		Asignaturas asignatura5 = new Asignaturas(request.getParameter("asig5"));
		asignatura5.setNota(nota5num);//le paso la nota a la asignatura

//ASIGNATURA 6
		String nota6= request.getParameter("nota6");//el formulario siempre nos devuelve un string
		double nota6num=Integer.parseInt(nota6);//cambio de tipo de dato
		Asignaturas asignatura6 = new Asignaturas(request.getParameter("asig6"));
		asignatura6.setNota(nota6num);//le paso la nota a la asignatura
		
		
		
		
		
		
//ALUMNO 1-->CONSTRUIMOS ALUMNO 1 CON LO ANTES HECHO
		
		Alumno alum1 = new Alumno(request.getParameter("alum1"), asignatura1, asignatura2, asignatura3);
		
		Alumno alum2 = new Alumno(request.getParameter("alum2"), asignatura4, asignatura5, asignatura6);
	 
				
//CONSTRUIMOS EL PROFESOR
		
		 Profesor profesor= new Profesor(request.getParameter("nombre"));
		 
		 profesor.setAlum1(alum1);
		 profesor.setAlum2(alum2);
		 
//CALCULAMOS LA MEDIA
		 
		 
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
