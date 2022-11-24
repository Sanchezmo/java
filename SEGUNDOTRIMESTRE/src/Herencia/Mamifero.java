package Herencia;

public class Mamifero extends Animal {
	private int numeroCrias,mesesEmbarazo;
	public Mamifero(String nombreComun, String nombreEspecifico, double peso, double tamano,int crias, int mesesemb) {
		super(nombreComun, nombreEspecifico, peso, tamano);
		this.numeroCrias=crias;
		this.mesesEmbarazo=mesesemb;
	}
	public int getNumeroCrias() {
		return numeroCrias;
	}
	public void setNumeroCrias(int numeroCrias) {
		this.numeroCrias = numeroCrias;
	}
	public int getMesesEmbarazo() {
		return mesesEmbarazo;
	}
	public void setMesesEmbarazo(int mesesEmbarazo) {
		this.mesesEmbarazo = mesesEmbarazo;
	}
	@Override
	public String toString() {
		return "nombre = "+super.getNombreComun()+" nombre especifico= "+super.getNombreEspecifico()+" peso= "+super.getPeso()+" tamaño= "+super.getTamano()+"Mamifero [mesesEmbarazo=" + mesesEmbarazo + ", numeroCrias=" + numeroCrias + "]";
	}

}
