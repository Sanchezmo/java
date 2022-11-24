package ejercicio2;

public class Profesor {
	private String dni;	
	private String nombre;
	private String especialidad;
	private String titulacion;
	
public Profesor(String dni, String nombre, String especialidad,
			String titulacion) {
		this.dni = dni;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.titulacion = titulacion;
	}

public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getEspecialidad() {
	return especialidad;
}
public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}
public String getTitulacion() {
	return titulacion;
}
public void setTitulacion(String titulacion) {
	this.titulacion = titulacion;
}
public void ponerCalificaciones(Alumno alumno){
	double nota;
	int ident=1;
	for(int i=0;i<alumno.getNumeroAsignaturas();i++){
		nota=Math.random()*10+1;
		CalificacionAsignatura calificacionAsigntura=new CalificacionAsignatura(ident,"asig");
		calificacionAsigntura.setCalificacion(nota);
		boolean colocado=alumno.insertarCalificacion(calificacionAsigntura);
		if(colocado)
			System.out.println("Se ha colocado la asignatura "+ ident +" con nota " + nota );
		ident++;
	}
}
}
