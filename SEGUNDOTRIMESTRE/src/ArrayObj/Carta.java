package ArrayObj;

public class Carta {
	private String palo;
	private String nombre;
	private double valor;
	private boolean uso;
	
	
	public Carta(String palo, String nombre, double valor, boolean uso) {
		super();
		this.palo = palo;
		this.nombre = nombre;
		this.valor = valor;
		this.uso = uso;
	}
	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", nombre=" + nombre + ", valor=" + valor + ", uso=" + uso + "]";
	}
	public boolean isUso() {
		return uso;
	}
	public void setUso(boolean uso) {
		this.uso = uso;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
