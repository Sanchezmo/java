package Herencia4;

public abstract class Empleado {
 private String nombre;
 private String dni;
 private int dialta,mesalta,anoalta;
 private double sueldo;


public Empleado(String nombre, String dni, int dialta, int mesalta, int anoalta, double sueldo) {
	super();
	this.nombre = nombre;
	this.dni = dni;
	this.dialta = dialta;
	this.mesalta = mesalta;
	this.anoalta = anoalta;
	this.sueldo = sueldo;
}

public double getSueldo() {
	return sueldo;
}

public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public int getDialta() {
	return dialta;
}

public void setDialta(int dialta) {
	this.dialta = dialta;
}

public int getMesalta() {
	return mesalta;
}

public void setMesalta(int mesalta) {
	this.mesalta = mesalta;
}

public int getAnoalta() {
	return anoalta;
}

public void setAnoalta(int anoalta) {
	this.anoalta = anoalta;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

@Override
public String toString() {
	return "Empleado [nombre=" + nombre + ", dni=" + dni + ", dialta=" + dialta + ", mesalta=" + mesalta + ", anoalta="
			+ anoalta + ", sueldo=" + sueldo + "]";
}

public abstract double calcularSalario();

}
