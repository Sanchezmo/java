package es.susapablo;

abstract class Peso extends Vehiculo {
protected static double pma=20;

public Peso(String matricula) {
	super(matricula);
	
}

public static double getPma() {
	return pma;
}

public abstract double calc_coste(int dias);

}
