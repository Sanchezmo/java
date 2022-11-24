package ejercicio2;

public class Alumno extends Personaa {
private String dni;	
private String nombre;
private int numMatricula;
private int numeroAsignaturas;
private CalificacionAsignatura[] calificaciones;
private int indice;//cuantas asignaturas llevas rellenas en el array
private double media;


public Alumno(String dni, String nombre, int numMatricula,
		int numeroAsignaturas) {
	this.dni = dni;
	this.nombre = nombre;
	this.numMatricula = numMatricula;
	this.numeroAsignaturas = numeroAsignaturas;
	this.calificaciones = new CalificacionAsignatura[numeroAsignaturas];
	this.indice=0;
}
public int getNumMatricula() {
	return numMatricula;
}
public void setNumMatricula(int numMatricula) {
	this.numMatricula = numMatricula;
}

public int getNumeroAsignaturas(){
	return numeroAsignaturas;
}
public void setNumeroAsignaturas(int numeroAsignaturas) {
	this.numeroAsignaturas = numeroAsignaturas;
}

public boolean insertarCalificacion(CalificacionAsignatura calificacion){
	boolean colocado=false;
	if(indice < numeroAsignaturas){
		calificaciones[indice]=calificacion;
		indice++;
		colocado=true;
	}
	return colocado;	
}

public CalificacionAsignatura[] obtenerCalificacion(){
	return calificaciones;
}

public double calcularMedia(){
	double suma=0;
	for (int i = 0; i < indice; i++) {		
		suma+=calificaciones[i].getCalificacion();
	}
	media=suma/indice;
	return media;
}

}
