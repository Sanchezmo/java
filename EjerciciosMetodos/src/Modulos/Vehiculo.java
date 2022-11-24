package Modulos;

public class Vehiculo {
private int numruedas;
private String tipo;
private int velocidad;

public Vehiculo(int ruedas,String tipo,int velocidad) {
	this.numruedas=ruedas;
	this.tipo=tipo;
	this.velocidad=velocidad;
	
}

@Override
public String toString() {
	return "Vehiculo [numruedas=" + numruedas + ", tipo=" + tipo + ", velocidad=" + velocidad + "]";
}

public int getNumruedas() {
	return numruedas;
}

public void setNumruedas(int numruedas) {
	this.numruedas = numruedas;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public int getVelocidad() {
	return velocidad;
}

public void setVelocidad(int velocidad) {
	this.velocidad = velocidad;
}
}
