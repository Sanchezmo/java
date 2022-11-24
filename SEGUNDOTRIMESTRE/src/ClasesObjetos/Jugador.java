package ClasesObjetos;

public class Jugador {
private String nombre;
private double ranking;

public Jugador(String nombre, double ranking) {
	this.nombre = nombre;
	this.ranking = ranking;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getRanking() {
	return ranking;
}

public void setRanking(double ranking) {
	this.ranking = ranking;
}

@Override
public String toString() {
	return "Jugador [nombre=" + nombre + ", ranking=" + ranking + "]";
}


}
