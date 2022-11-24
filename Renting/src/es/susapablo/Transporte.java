package es.susapablo;

public abstract class Transporte extends Vehiculo {
private int num_plazas;







public Transporte(String matricula, int num_plazas) {
	super(matricula);
	this.num_plazas = num_plazas;
}







public int getNum_plazas() {
	return num_plazas;
}







@Override
public abstract double calc_coste(int dias);
	

}
