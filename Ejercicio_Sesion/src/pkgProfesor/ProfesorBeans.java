package pkgProfesor;

import java.util.ArrayList;
import pkgAlumno.Alumno;

public class ProfesorBeans {

	
		private String profesor; 
		private ArrayList<Alumno>list= new ArrayList<Alumno>();
		private String asignaturas;
		
		public String getAsignaturas() {
			return asignaturas;
		}
		public void setAsignaturas(String asignaturas) {
			this.asignaturas = asignaturas;
		}
		public String getProfesor() {
			return profesor;
		}
		public void setProfesor(String profesor) {
			this.profesor = profesor;
		}
		public ArrayList<Alumno> getList() {
			return list;
		}
		public void setList(ArrayList<Alumno> list) {
			this.list = list;
		}
		
		public void getanadir_alumno(Alumno a)
		{
			this.list.add(a);
		}
		/*public void  getponetnota(double n1,double n2, double n2)
		{
		;
		}*/
}
