package pkgRecursos;

public class Alumno {
	//Atributos
	private String alumno;
	private Asignaturas asig1;
	private Asignaturas asig2;
	private Asignaturas asig3;
	//Constructor
	public Alumno(String alumno, Asignaturas asig1, Asignaturas asig2, Asignaturas asig3)
	{
		this.alumno=alumno;
		this.asig1=asig1;
		this.asig2=asig2;
		this.asig3=asig3;
	}
		
	//encapsulamiento
	public String getAlumno()
	{
		return this.alumno;
	}
	
	public Asignaturas getAsig1()
	{
		return this.asig1;
	}
	public Asignaturas getAsig2()
	{
		return this.asig2;
	}
		
	public Asignaturas getAsig3()
	{
		return this.asig3;
	}	


}
