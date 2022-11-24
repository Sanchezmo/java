package Herencia4;

public abstract class Operario extends Empleado {
	protected String jefeasignado;
	protected double horasextra;
	
	public Operario(String nombre, String dni, int dialta, int mesalta, int anoalta, double sueldo, String jefeasignado,
			double horasextra) {
		super(nombre, dni, dialta, mesalta, anoalta, sueldo);
		this.jefeasignado = jefeasignado;
		this.horasextra = horasextra;
	}
	
	public String getJefeasignado() {
		return jefeasignado;
	}

	public void setJefeasignado(String jefeasignado) {
		this.jefeasignado = jefeasignado;
	}

	public double getHorasextra() {
		return horasextra;
	}

	public void setHorasextra(double horasextra) {
		this.horasextra = horasextra;
	}

	@Override
	public String toString() {
		return super.toString()+" Operario [jefeasignado=" + jefeasignado + ", horasextra=" + horasextra + "]";
	}

	public abstract double calcularSalario();

}
