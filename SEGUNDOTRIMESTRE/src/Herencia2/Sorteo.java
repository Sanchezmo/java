package Herencia2;

public abstract class Sorteo {
	protected int posibilidades;

	public Sorteo(int posibilidades) {
		super();
		this.posibilidades = posibilidades;
	}

	public int getPosibilidades() {
		return posibilidades;
	}

	public void setPosibilidades(int posibilidades) {
		this.posibilidades = posibilidades;
	}
	
	public abstract String lanzar();
	
	public double probabilidad() {
		
		return 1/this.getPosibilidades();
	}
	
	public String verDatos() {
		return "Los datos del sorteo: posibilidad="+this.posibilidades+" probabilidad="+this.probabilidad();
	}
}
