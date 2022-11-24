package Herencia2;

public class Dado extends Sorteo {

	public Dado(int posibilidades) {
		super(posibilidades);
		
	}
	public double probabilidad() {
		
		return 1/this.posibilidades;
	}
	@Override
	public String lanzar() {
		// TODO Auto-generated method stub
		return "Dado sale un "+(int)((Math.random()*6)+1);
	}
	public String verDatos() {
		return "Los datos del sorteo: posibilidad="+this.posibilidades+" probabilidad="+this.probabilidad();
	}
}
