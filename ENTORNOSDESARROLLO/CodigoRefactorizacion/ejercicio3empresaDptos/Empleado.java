package ejercicio3empresaDptos;

public class Empleado {
	
	private int codigoEmp;
	private String nombre;
	private double sueldo;
	
	public Empleado(int codigoEmp, String nombre, double sueldo) {
		this.codigoEmp = codigoEmp;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public int getCodigoEmp() {
		return codigoEmp;
	}

	public void setCodigoEmp(int codigoEmp) {
		this.codigoEmp = codigoEmp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void incrementarSueldo(){
		
		this.sueldo*=1.1;
	}

	@Override
	public String toString() {
		return "Empleado [codigoEmp=" + codigoEmp + ", nombre=" + nombre
				+ ", sueldo=" + sueldo + "]";
	}
	
	
	
	

}
