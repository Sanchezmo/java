package Herencia;

public class Ave extends Animal {
	private int numHuevos;
	private boolean volar;
	public Ave(String nombreComun, String nombreEspecifico, double peso, double tamano,int numHuevos, boolean volar) {
		super(nombreComun, nombreEspecifico, peso, tamano);
		this.numHuevos=numHuevos;
		this.volar=volar;
	}
	public int getNumHuevos() {
		return numHuevos;
	}
	public void setNumHuevos(int numHuevos) {
		this.numHuevos = numHuevos;
	}
	public boolean isVolar() {
		return volar;
	}
	public void setVolar(boolean volar) {
		this.volar = volar;
	}
	@Override
	public String toString() {
		return "nombre = "+super.getNombreComun()+" nombre especifico= "+super.getNombreEspecifico()+" peso= "+super.getPeso()+" tamaño= "+super.getTamano()+"Ave [numHuevos=" + numHuevos + ", volar=" + volar + "]";
	}

}
