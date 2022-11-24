package Herencia4;

public class Oficial extends Operario {

	public Oficial(String nombre, String dni, int dialta, int mesalta, int anoalta, double sueldo, String jefeasignado,
			double horasextra) {
		super(nombre, dni, dialta, mesalta, anoalta, sueldo, jefeasignado, horasextra);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString()+" Oficial [jefeasignado=" + jefeasignado + ", horasextra=" + horasextra + "]";
	}

	@Override
	public double calcularSalario() {
		double preciohora=10;
		return this.getSueldo()+(this.getHorasextra()*preciohora);
	}

}
