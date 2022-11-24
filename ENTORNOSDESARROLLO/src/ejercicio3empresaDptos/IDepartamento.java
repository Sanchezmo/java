package ejercicio3empresaDptos;

public interface IDepartamento {

	int getCodigoDpto();

	void setCodigoDpto(int codigoDpto);

	String getNombre();

	void setNombre(String nombre);

	int getNumeroEmp();

	void setNumeroEmp(int numeroEmp);

	Empleado[] getArrayEmp();

	Empleado buscar(int codEmp);

	Empleado buscarNb(String nbEmpl);

	void asignarEmp(Empleado emp);

	void visualizarEmp();

	void borrar(Empleado emp);

	boolean verDptoVacio();

	Empleado mayorSueldoDpto();

	String toString();

}