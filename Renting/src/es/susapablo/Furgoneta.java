package es.susapablo;

public class Furgoneta extends Peso {

	

	public Furgoneta(String matricula) {
		super(matricula);
		
	}

	@Override
	public String toString() {
		return "Furgoneta []";
	}

	@Override
	public double calc_coste(int dias) {
		
		return Vehiculo.precio*dias+Peso.pma;
	}
	
}
