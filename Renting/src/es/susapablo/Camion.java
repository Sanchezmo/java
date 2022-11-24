package es.susapablo;

public class Camion extends Peso {
 private int increpvp;

public Camion(String matricula) {
	super(matricula);
	
}


public int getIncrepvp() {
	return increpvp;
}


@Override
public String toString() {
	return "Camion [increpvp=" + increpvp + ", getMatricula()=" + getMatricula() + ", getPrecio()=" + getPrecio()
			+ ", toString()=" + super.toString() + "]";
}


@Override
public double calc_coste(int dias) {
	
	return Vehiculo.precio*dias+Peso.pma+this.increpvp;
}



}
