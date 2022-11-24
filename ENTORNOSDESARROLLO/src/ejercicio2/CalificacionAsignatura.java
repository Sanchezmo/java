package ejercicio2;

public class CalificacionAsignatura {
private int identificadorAsig;
private String nombreAsig;
private double calificacionAsig;

public CalificacionAsignatura(int identificadorAsig, String nombreAsig){
	this.identificadorAsig=identificadorAsig;
	this.nombreAsig=nombreAsig;
}
public int getIdentificador(){
	return identificadorAsig;
}
public String getNombre(){
	return nombreAsig;
}
public double getCalificacion(){
	return calificacionAsig;
}
public void setCalificacion(double calificacionAsig){
	this.calificacionAsig=calificacionAsig;
}
}
