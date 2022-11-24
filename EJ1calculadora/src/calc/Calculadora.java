package calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculadora
 */
@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out;
		out=response.getWriter();
		response.setContentType("text/html");
		
		String n1 = request.getParameter("num1");
		String n2 = request.getParameter("num2");
		
		int nn1= Integer.parseInt(n1);
		int nn2= Integer.parseInt(n2);
		
		int total =nn1+nn2;
		
		out.println("<html>");
		out.println("<head><title>Resultado</title></head>");
		out.println("<body><p>El resultado de sumar "+nn1+" y "+nn2+" es : "+total+"</p></body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out;
		out=response.getWriter();
		response.setContentType("text/html");
		
		String sexo = request.getParameter("sexo");
		String nombre = request.getParameter("nombre");
		String city = request.getParameter("city");
		String pais = request.getParameter("pais");
		String telefono = request.getParameter("tlf");
		try{int movil = Integer.parseInt(telefono);
		
		}catch(Exception e) {
			out.println("<html>");
			out.println("<head><title>Error</title></head>");
			out.println("<body><p>No se admiten valores alfabeticos para el telefono</p><p> usted ha escrito"+telefono+"</p>");
			out.println("</body></html>");
			return;
		}
		
		String[] checkArray = request.getParameterValues("check");
		
		String[] radioArray =request.getParameterValues("radius");
		
		
		out.println("<html>");
		out.println("<head><title>Resultado encuesta</title></head>");
		out.println("<body><p>Los resultados son:</p></br><p>titulo:"+sexo+"</p></br><p>nombre:"+nombre+"</p></br><p>ciudad:"+city+"</p></br><p>pais :"+pais+"</p></br><p>telefono :"+telefono+"</p></br>");
		for(int i=0;  i<checkArray.length; i++) {
			
			out.println(checkArray[i]+"</br>");
			 		
				}
for(int i=0;  i<radioArray.length; i++) {
			
			out.println(radioArray[i]+"</br>");
			 		
				}
		out.println("</body></html>");
		
		}

}
