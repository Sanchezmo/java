package Herencia3;

public class LlamadaLocal extends Llamada {
	private double coste;
	public LlamadaLocal(String origen, String destino, double duracion,double coste) {
		super(origen, destino, duracion);
		
	}
	public double getCoste() {
		return coste;
	}
	

}
