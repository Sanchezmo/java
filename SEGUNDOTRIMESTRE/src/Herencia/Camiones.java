package Herencia;

public class Camiones extends Vehiculo {
	private int limitecarga,carga;
	private String conductor;
	public Camiones(String marca, String matricula, int ruedas, int autonomia,int limitecarga,int carga, String conductor) {
		super(marca, matricula, ruedas, autonomia);
		this.limitecarga=limitecarga;
		this.carga=carga;
		this.conductor=conductor;
		if(carga>limitecarga) {
			this.limitecarga=carga;
		}
		
	}
	public int getLimitecarga() {
		return limitecarga;
	}
	public void setLimitecarga(int limitecarga) {
		this.limitecarga = limitecarga;
	}
	public int getCarga() {
		return carga;
	}
	public void Cargar(int carga) {
		if(this.limitecarga<(this.carga+carga)) {
			this.limitecarga=(this.carga+carga);
		}
		this.carga += carga;
	}
	public void descargar(int descarga) {
		if(descarga>this.carga) {
			this.carga=0;
		}else {
			this.carga-=descarga;
		}
		
	}
	public String getConductor() {
		return conductor;
	}
	public void cambiarConductor(String conductor) {
		this.conductor = conductor;
	}
	public String listar() {
		return super.toString()+" Camiones [limitecarga=" + limitecarga + ", carga=" + carga + ", conductor=" + conductor + "]";
	}

}
