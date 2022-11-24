package Herencia;

public class Vivienda {
	private int numHab,metros2,num;
	private String calle;
	public Vivienda(int numHab, int metros2, String calle, int num) {
		
		this.numHab = numHab;
		this.metros2 = metros2;
		this.calle = calle;
		this.num = num;
	}
	public int getNumHab() {
		return numHab;
	}
	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}
	public int getMetros2() {
		return metros2;
	}
	public void setMetros2(int metros2) {
		this.metros2 = metros2;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	@Override
	public String toString() {
		return "Vivienda [numHab=" + numHab + ", metros2=" + metros2 + ", num=" + num + ", calle=" + calle + "]";
	}
	
}
