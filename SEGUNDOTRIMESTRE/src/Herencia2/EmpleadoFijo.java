package Herencia2;
import objetosOrdenables.Ordenable;

public class EmpleadoFijo extends Empleado{
	private double salario;
	public EmpleadoFijo(String nombre, String dni, String telefono,double salario) {
		super(nombre, dni, telefono);
		this.salario=salario;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double calcularSalario() {
		return  salario;
	}
	@Override
	public boolean esMenor(Ordenable o) {
		if (o instanceof Empleado)
			return(this.calcularSalario()<((Empleado)o).calcularSalario());
		else
			return false;
	}
	@Override
	public boolean esMayor(Ordenable o) {
		if (o instanceof Empleado)
			return(this.calcularSalario()>((Empleado)o).calcularSalario());
		else
			return false;
	}
	

}
