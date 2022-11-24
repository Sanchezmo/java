package Herencia2;

import objetosOrdenables.Ordenable;

public abstract class Empleado implements Ordenable {
	private String nombre,dni,telefono;

	public Empleado(String nombre, String dni, String telefono) {
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono=telefono;
	}
	public abstract double calcularSalario();

}
