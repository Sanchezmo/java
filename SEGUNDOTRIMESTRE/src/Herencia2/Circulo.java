package Herencia2;

import Operaciones.Operable;
import objetosOrdenables.Ordenable;

public class Circulo extends Figura {
	private double radio;
	
	public Circulo(String color,double radio) {
		super(color);
		this.radio=radio;
		// TODO Auto-generated constructor stub
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double perimetro() {
		
		return 2*3.1415926535897932384*this.radio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.1415926535897932384*this.radio*this.radio;
	}

	@Override
	public String toString() {
		return "Soy una figura de color "+super.getColor()+" tengo un radio "+this.getRadio()+". Y mi perimetro es "+this.perimetro()+" y mi area es "+this.area();
	}

	@Override
	public boolean esMenor(Ordenable o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esMayor(Ordenable o) {
		// TODO Auto-generated method stub
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
