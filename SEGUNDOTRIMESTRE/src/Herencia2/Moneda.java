package Herencia2;

public class Moneda extends Sorteo {

	public Moneda(int posibilidades) {
		super(posibilidades);
		// TODO Auto-generated constructor stub
	}
	public double probabilidad() {
		
		return 1/this.posibilidades;
	}
	@Override
	public String lanzar() {
		String salida="";
		int ab=(int)((Math.random()*2)+1);
		if(ab==1){
			salida="Cara";
		}else if(ab==2) {
			salida="Cruz";
		}
		return "Moneda sale "+salida ;
	}
	public String verDatos() {
		return "Los datos del sorteo: posibilidad="+this.posibilidades+" probabilidad="+this.probabilidad();
	}
}
