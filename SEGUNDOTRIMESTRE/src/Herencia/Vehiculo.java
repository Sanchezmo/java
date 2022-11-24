package Herencia;

public class Vehiculo {
	private String marca,matricula;
	private int ruedas,autonomia;
	public Vehiculo(String marca, String matricula, int ruedas, int autonomia) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.ruedas = ruedas;
		this.autonomia = autonomia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public int getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", matricula=" + matricula + ", ruedas=" + ruedas + ", autonomia="
				+ autonomia + "]";
	}
}
