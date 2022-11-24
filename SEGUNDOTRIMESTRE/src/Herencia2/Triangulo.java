package Herencia2;

import Operaciones.Operable;
import objetosOrdenables.Ordenable;

public class Triangulo extends Poligono {
	private double base,altura;
	public Triangulo(String color, int lados,double altura,double base) {
		super(color, lados);
		this.altura=altura;
		this.base=base;
		// TODO Auto-generated constructor stub
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double perimetro() {
		
		return this.getLados()*3;
	}

	@Override
	public double area() {
		
		return (this.altura*this.base)/2;
	}

	@Override
	public String toString() {
		return "Soy una figura de color "+super.getColor()+" ademas soy un poligono de "+super.getLados()+" y mi base es "+this.getBase()+" y mi altura es "+this.getAltura()+" mi area es "+this.area();
	}

	@Override
	public boolean esMenor(Ordenable o) {
		if (o instanceof Figura)
			return(this.calcArea()<((Figura)o).calcArea());
		else
			return false;
	}

	@Override
	public boolean esMayor(Ordenable o) {
		if (o instanceof Figura)
			return(this.calcArea()>((Figura)o).calcArea());
		else
			return false;
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return (this.altura*this.base)/2;
	}

	@Override
	public double calcPerimetro() {
		// TODO Auto-generated method stub
		return this.getLados()*3;
	}

	@Override
	public void sumar(Operable o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicar(Operable o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restar(Operable o) {
		// TODO Auto-generated method stub
		
	}
	

}
