package Herencia2;

public class Hexagono extends Poligono {
	private double lado,apotema;
	public Hexagono(String color, int lados,double lado,double apotema) {
		super(color, lados);
		this.apotema=apotema;
		this.lado=lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	@Override
	public double perimetro() {
		
		return this.getLados()*this.getLado();
	}

	@Override
	public double area() {
		
		return (this.perimetro()*this.getApotema())/2;
	}

	@Override
	public String toString() {
		return "Soy una figura de color "+super.getColor()+". Ademas soy un poligono de lados: "+super.getLados()+" y mi area es: "+this.area()+" y mi perimetro es "+this.perimetro();
	}
	
}
