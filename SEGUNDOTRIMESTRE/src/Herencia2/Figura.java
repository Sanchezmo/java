package Herencia2;

import objetosOrdenables.Ordenable;
import geometria.Geometria;
import Operaciones.Operable;

public abstract class Figura implements Ordenable,Geometria, Operable{
	private String color;

	public Figura(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double perimetro();
	
	public abstract double area();

	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}
	
}
