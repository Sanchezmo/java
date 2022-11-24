package Herencia2;

public class EmpleadoEventual extends Empleado {
	private double salarioporhora,horas;
	public EmpleadoEventual(String nombre, String dni, String telefono,double salarioporhora,double horas) {
		super(nombre, dni, telefono);
		this.salarioporhora=salarioporhora;
		this.horas=horas;
	}
	public double getSalarioporhora() {
		return salarioporhora;
	}
	public void setSalarioporhora(double salarioporhora) {
		this.salarioporhora = salarioporhora;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public double calcularSalario() {
		return this.getSalarioporhora()*this.getHoras();
	}
		
}
