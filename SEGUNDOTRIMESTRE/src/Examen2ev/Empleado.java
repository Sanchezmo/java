package Examen2ev;

public abstract class Empleado {
private String nombre,apellido,clave;
private int precioContrato;



public Empleado(String nombre, String apellido, int precioContrato) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.precioContrato = precioContrato;
	char[] nom=new char[3];
	char[] ape=new char[3];
	nombre.toUpperCase().getChars(0,3,nom, 0);
	apellido.toUpperCase().getChars((apellido.length()-3), apellido.length(), ape, 0);
	String nom1=new String(nom);
	String nom2=new String(ape);
	String cla=nom1+nom2;
	cla.replace("a", "1");
	this.clave =cla;
}
public String getClave() {
	return clave;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public int getPrecioContrato() {
	return precioContrato;
}
public void setPrecioContrato(int precioContrato) {
	this.precioContrato = precioContrato;
}

@Override
public String toString() {
	return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", clave=" + clave + ", precioContrato="
			+ precioContrato + "]";
}
public abstract int precioContrato();

}
