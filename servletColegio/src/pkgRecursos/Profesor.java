package pkgRecursos;

public class Profesor {
	//Atributos
	private String nombre;
	private Alumno alum1;
	private Alumno alum2;
	
	//constructor
	public Profesor(String nombre)
	{
		this.nombre=nombre;
	}
	
	//encapsulamiento
	public Alumno getAlum1() 
	{
		
		return this.alum1;
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alumno getAlum2() 
	{
		
		return this.alum2;
		
	}
	public void setAlum1(Alumno alum1) 
	{
		
		this.alum1=alum1;
		
	}
	
	public void setAlum2(Alumno alum2) 
	{
		
		this.alum2=alum2;
		
	}
	
	
	public void calcular(double nota1,double nota2,double nota3,double nota4,double nota5,double nota6) {
		
		double nota[]= {nota1,nota2,nota3,nota4,nota5,nota6};
		double sumatoria1=0;
		double sumatoria2=0;
		int x=0;
		for (x=0;x<nota.length;x++) {
			if(x<3) {sumatoria1 +=nota[x];}else {sumatoria2 +=nota[x];};
		};
	}

	public double calcularmedia(double sumatoria)
	
	{
	  return sumatoria/3;
	  
		
	}

}