package Herencia4;

public class Tecnico extends Operario {
	private String oficialasignado;
	public Tecnico(String nombre, String dni, int dialta, int mesalta, int anoalta, double sueldo, String jefeasignado,
			double horasextra,String oficialasignado) {
		super(nombre, dni, dialta, mesalta, anoalta, sueldo, jefeasignado, horasextra);
		this.oficialasignado=oficialasignado;
		// TODO Auto-generated constructor stub
	}
	
	public String getOficialasignado() {
		return oficialasignado;
	}

	public void setOficialasignado(String oficialasignado) {
		this.oficialasignado = oficialasignado;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Tecnico [oficialasignado=" + oficialasignado + "]";
	}

	@Override
	public double calcularSalario() {
		double preciohora=8;
		return this.getSueldo()+(this.getHorasextra()*preciohora);
	}

}
