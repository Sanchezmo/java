package es.susapablo;

public class Coche extends Transporte {
private double pvpdia=1.5;




public Coche(String matricula, int num_plazas) {
	super(matricula, num_plazas);
	
}


@Override
public String toString() {
	return "Coche [pvpdia=" + pvpdia + "]";
}


public double getPvpdia() {
	return pvpdia;
}


public double calc_coste(int dias) {
	
	return Vehiculo.precio*dias+this.pvpdia*dias+super.getNum_plazas();
}
}


