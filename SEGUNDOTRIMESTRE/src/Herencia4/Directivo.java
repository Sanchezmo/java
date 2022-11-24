package Herencia4;

public class Directivo extends Empleado {
	private double complementodirectivo;
	public Directivo(String nombre, String dni, int dialta, int mesalta, int anoalta, double sueldo,
			double complementodirectivo) {
		super(nombre, dni, dialta, mesalta, anoalta, sueldo);
		this.complementodirectivo = complementodirectivo;
	}
	


	public double getComplementodirectivo() {
		return complementodirectivo;
	}



	public void setComplementodirectivo(double complementodirectivo) {
		this.complementodirectivo = complementodirectivo;
	}


	@Override
	public String toString() {
		return super.toString()+" Directivo [complementodirectivo=" + complementodirectivo + "]";
	}



	@Override
	public double calcularSalario() {
		return this.complementodirectivo+this.getSueldo();
		
	}

}
