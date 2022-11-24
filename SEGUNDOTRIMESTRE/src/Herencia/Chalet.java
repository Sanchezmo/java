package Herencia;

public class Chalet extends Vivienda {
	private int metrosJardin;
	private boolean piscina;
	public Chalet(int numHab, int metros2, String calle, int num,int jardin, boolean piscina) {
		super(numHab, metros2, calle, num);
		this.metrosJardin=jardin;
		this.piscina=piscina;
	}
	public int getMetrosJardin() {
		return metrosJardin;
	}
	public void setMetrosJardin(int metrosJardin) {
		this.metrosJardin = metrosJardin;
	}
	public boolean isPiscina() {
		return piscina;
	}
	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}
	@Override
	public String toString() {
		return super.toString()+" Chalet [metrosJardin=" + metrosJardin + ", piscina=" + piscina + "]";
	}
	

}
