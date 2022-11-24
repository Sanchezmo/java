package Examen2ev;

public class Entrenador extends Empleado {
	public static int num;
	public Entrenador(String nombre, String apellido) {
		super(nombre+(num++), apellido, (int)(Math.random()*300+100));
		
	}

	@Override
	public int precioContrato() {
		int precio =(int)(Math.random()*300+100);
		return precio;
	}

	@Override
	public String toString() {
		return super.toString()+ " Entrenador []";
	}

}
