package pkgRecursos;

public class Asignaturas {
	//declaro atributos
	
	private String nombre_asignatura;
	private double nota;
	
	//Constructor
	public Asignaturas(String nombre_asignaturas)
	{
		this.nombre_asignatura=nombre_asignaturas;
		
	}
	//encapsulamiento
	public String getNombre_asignatura()
	{
		return this.nombre_asignatura;
		
	}
	
	public double getNota()
	{
		return this.nota;
		
	}	
	public void setNota(double nota)
	{
		this.nota=nota;
	}

}
