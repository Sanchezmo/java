package Herencia;

public class Palacio extends Vivienda {
	private boolean chofer;
	public Palacio( int metros2, String calle, int num,boolean chofer) {
		super(10, metros2, calle, num);
		this.chofer=chofer;
	}
	public boolean isChofer() {
		return chofer;
	}
	public void setChofer(boolean chofer) {
		this.chofer = chofer;
	}
	@Override
	public String toString() {
		return super.toString()+" Palacio [chofer=" + chofer + "]";
	}

}
