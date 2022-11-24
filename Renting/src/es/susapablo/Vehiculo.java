package es.susapablo;

public abstract class Vehiculo {

	private String matricula;
	public static double precio=50;
	
	
	public Vehiculo(String matricula) {
		
		this.matricula = matricula;
		
	}
	
	public String getMatricula() {
		return matricula;
	}
	public double getPrecio() {
		return precio;
	}
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", precio=" + precio + "]";
	}
	public abstract double calc_coste(int dias);

	
}
