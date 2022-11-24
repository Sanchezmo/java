package ejercicio2;

public class TestCalificaciones {
public static void main(String[]args){
	Alumno alumno=new Alumno("123456-Y", "Pepe", 12345, 3);
	Profesor prof=new Profesor("45678-P", "Juan", "Matematicas", "Licenciado");
	prof.ponerCalificaciones(alumno);
	CalificacionAsignatura[]cal=alumno.obtenerCalificacion();
	for(int i=0;i<cal.length;i++){
		System.out.println(cal[i].getIdentificador());
		System.out.println(cal[i].getNombre());
		System.out.println(cal[i].getCalificacion());
	}
	System.out.println("Media "+alumno.calcularMedia());
}
}
