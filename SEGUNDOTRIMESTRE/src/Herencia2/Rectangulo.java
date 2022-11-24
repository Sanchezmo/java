package Herencia2;

import Operaciones.Operable;
import objetosOrdenables.Ordenable;

public class Rectangulo extends Poligono implements Ordenable{
	private double base,altura;
	public Rectangulo(String color, int lados,double base,double altura) {
		super(color, lados);
		this.altura=altura;
		this.base=base;
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
		
		return (2*this.getBase())+(2*this.getAltura()) ;
	}

	@Override
	public double area() {
		
		return this.getAltura()*this.getBase();
	}

	@Override
	public String toString() {
		return "Soy una figura de color "+super.getColor()+". Ademas soy un poligono de lados: "+super.getLados()+" y mi area es: "+this.area()+" y mi perimetro es "+this.perimetro();
	}

	@Override
	public boolean esMenor(Ordenable o) {
		if (o instanceof Figura)
			return(this.area()<((Figura)o).area());
		else
			return false;
	}
	
	@Override
	public boolean esMayor(Ordenable o) {
		if (o instanceof Figura)
			return(this.area()>((Figura)o).area());
		else
			return false;
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcPerimetro() {
		// TODO Auto-generated method stub
		return 0;
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
