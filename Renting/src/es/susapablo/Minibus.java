package es.susapablo;

public class Minibus extends Transporte {
    private double pvpdia=2.0;
	public Minibus(String matricula, int num_plazas) {
		super(matricula, num_plazas);
		
	}

	@Override
	public double calc_coste(int dias) {
		
		return Vehiculo.precio*dias+this.pvpdia*dias+super.getNum_plazas();
	}

	

	
	
}
