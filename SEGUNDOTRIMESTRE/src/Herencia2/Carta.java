package Herencia2;

public class Carta extends Sorteo {

	public Carta(int posibilidades) {
		super(posibilidades);
		// TODO Auto-generated constructor stub
	}
	public double probabilidad() {
		
		return 1/this.posibilidades;
	}
	@Override
	public String lanzar() {
		int i=(int)(Math.random()*4);
		int j=(int)(Math.random()*10);
		String[] palos= {"Oros","Copas","Espadas","Bastos"};
		String[] cartas= {"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Sota","Caballo","Rey"};
		return "La carta es: "+cartas[j]+" de "+palos[i];
	}
	public String verDatos() {
		return "Los datos del sorteo: posibilidad="+this.posibilidades+" probabilidad="+this.probabilidad();
	}
}
