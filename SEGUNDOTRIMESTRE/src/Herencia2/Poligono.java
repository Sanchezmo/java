package Herencia2;

public abstract class Poligono extends Figura {
	//debe ser abstracta para no sea obligatorio implementar
	//los metodos abstractos
	private int lados;
	public Poligono(String color,int lados) {
		super(color);
		this.lados=lados;
	}
	public int getLados() {
		return lados;
	}
	public void setLados(int lados) {
		this.lados = lados;
	}
	@Override
	public String toString() {
		return super.toString()+" Poligono [lados=" + lados + "]";
	}
	
	
	

}
