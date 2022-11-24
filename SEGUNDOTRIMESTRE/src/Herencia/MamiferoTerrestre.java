package Herencia;

public class MamiferoTerrestre extends Mamifero {
	private  int numPatas;
	public MamiferoTerrestre(String nombreComun, String nombreEspecifico, double peso, double tamano, int crias,
			int mesesemb,int numPatas) {
		super(nombreComun, nombreEspecifico, peso, tamano, crias, mesesemb);
		this.numPatas=numPatas;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	@Override
	public String toString() {
		return "nombre = "+super.getNombreComun()+" nombre especifico= "+super.getNombreEspecifico()+" peso= "+super.getPeso()+" tamaño= "+super.getTamano()+" meses embarazo= "+super.getMesesEmbarazo()+"MamiferoTerrestre [numPatas=" + numPatas + "]";
	}

}
