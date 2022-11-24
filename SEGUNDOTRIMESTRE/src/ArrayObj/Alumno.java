package ArrayObj;

public class Alumno {
	private String nombre;
	private double nota;
	private int codigo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nota=" + nota + ", codigo=" + codigo + "]";
	}
	public Alumno(int codigo,String nombre, double nota ) {
		super();
		this.nombre = nombre;
		this.nota = nota;
		this.codigo = codigo;
	}
}
