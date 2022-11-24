package Examen2ev;

public class Jugador extends Empleado {
	private String puesto;
	private static int num;
	public Jugador(String nombre, String apellido,String puesto) {
		super(nombre+(num++), apellido, (int)(Math.random()*500+100));
		// TODO Auto-generated constructor stub
		this.puesto=puesto;
		
	}

	@Override
	public int precioContrato() {
		int precio =(int)(Math.random()*500+100);
		return precio;
		
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return super.toString()+" Jugador [puesto=" + puesto + "]";
	}
	
	

}
