package Herencia;

public class Coches extends Vehiculo {
	private String color;
	private int pasajeros;
	private boolean descapotable;
	public Coches(String marca, String matricula, int autonomia,String color,int pasajeros,boolean descapotable) {
		super(marca, matricula, 4, autonomia);
		this.color=color;
		this.pasajeros=pasajeros;
		this.descapotable=descapotable;
	}
	public String getColor() {
		return color;
	}
	public void pintar(String color) {
		this.color = color;
	}
	public int getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}
	public boolean isDescapotable() {
		return descapotable;
	}
	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}
	public String listar() {
		return super.toString()+" Coches [color=" + color + ", pasajeros=" + pasajeros + ", descapotable=" + descapotable + "]";
	}
	

}
