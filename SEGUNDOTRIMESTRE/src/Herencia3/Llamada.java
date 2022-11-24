package Herencia3;

public abstract class Llamada {
	private String origen,destino;
	private double duracion;
	public Llamada(String origen, String destino, double duracion) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.duracion = duracion;
		
	}
	public String getOrigen() {
		return origen;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public double getDuracion() {
		return duracion;
	}
	
	
	
}
