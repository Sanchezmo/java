package ArrayObj;

public class Departamento {
	private int codigoDpto;
	private String nombreDpto;
	private int numeroEmpleados;
	private Empleado[] empleados=new Empleado[numeroEmpleados];
	public Departamento(int codigoDpto, String nombreDpto, int numeroEmpleados, Empleado[] empleados) {
		super();
		this.codigoDpto = codigoDpto;
		this.nombreDpto = nombreDpto;
		this.numeroEmpleados = numeroEmpleados;
		this.empleados = empleados;
	}
	public int getCodigoDpto() {
		return codigoDpto;
	}
	public void setCodigoDpto(int codigoDpto) {
		this.codigoDpto = codigoDpto;
	}
	public String getNombreDpto() {
		return nombreDpto;
	}
	public void setNombreDpto(String nombreDpto) {
		this.nombreDpto = nombreDpto;
	}
	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}
	public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}
	public Empleado[] getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}
	
}

