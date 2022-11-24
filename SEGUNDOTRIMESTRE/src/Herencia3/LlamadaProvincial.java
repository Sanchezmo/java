package Herencia3;

public class LlamadaProvincial extends Llamada {
	private int franja;
	public LlamadaProvincial(String origen, String destino, double duracion, int franja) {
		super(origen, destino, duracion);
		this.franja=franja;
	}
	public int getFranja() {
		return franja;
	}
	
	

}
