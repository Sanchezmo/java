package ejercicio3empresaDptos;

public class Departamento implements IDepartamento {
	
	private int codigoDpto;
	private String nombre;
	private int numeroEmp;
	private Empleado[] arrayEmp;
	
	public Departamento(int codigoDpto, String nombre, int numeroEmp) {
		this.codigoDpto = codigoDpto;
		this.nombre = nombre;
		this.numeroEmp = numeroEmp;
		arrayEmp=new Empleado[numeroEmp];
	}

	@Override
	public int getCodigoDpto() {
		return codigoDpto;
	}

	@Override
	public void setCodigoDpto(int codigoDpto) {
		this.codigoDpto = codigoDpto;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int getNumeroEmp() {
		return numeroEmp;
	}

	@Override
	public void setNumeroEmp(int numeroEmp) {
		this.numeroEmp = numeroEmp;
	}
	
	
	@Override
	public Empleado[] getArrayEmp() {
		return arrayEmp;
	}
	
	@Override
	public Empleado buscar(int codEmp){		
		return arrayEmp[codEmp];
	}	
	
	@Override
	public Empleado buscarNb(String nbEmpl){
		
		boolean encontrado=false;
		Empleado emplAux=null;
		for (int i=0; i<arrayEmp.length&&!encontrado ; i++){
			if (arrayEmp[i]!=null && arrayEmp[i].getNombre().compareTo(nbEmpl)==0){
				encontrado=true;
				emplAux=arrayEmp[i];				
				//break; 
				//se podria romper el for con un break si se encuentra en lugar de usar el switch en la condición del for
			}
		}
		return emplAux;
	}

	@Override
	public void asignarEmp (Empleado emp){
		
		int codEmp=emp.getCodigoEmp();

		arrayEmp[codEmp]=emp;
		System.out.println("Se ha dado da alta el empleado en el dpto"+emp.toString());
		}
	
	@Override
	public void visualizarEmp (){
		
		System.out.println("Datos de los empleados");
		for (int i=0; i<arrayEmp.length;i++){
			if (arrayEmp[i]!=null)
				System.out.println(arrayEmp[i].toString());
		}
	}
	
	@Override
	public void borrar(Empleado emp){ //se pone a null la componente del array que viene indicada por el codigo de empleado
		arrayEmp[emp.getCodigoEmp()]=null;
	}
	
	@Override
	public boolean verDptoVacio(){
		boolean vacio=true;
		for (int i=0; i<arrayEmp.length && vacio; i++){
			if (arrayEmp[i]!=null) //si encuentra algún empleado distinto de null, es que el dpto no está vacío
				vacio=false;
		}
		return vacio;
	}
	
	
	@Override
	public Empleado mayorSueldoDpto(){
		Empleado empMax=null;
		double max=0;
		for (int i=0;i<arrayEmp.length; i++){
			if (arrayEmp[i]!=null)
				if (arrayEmp[i].getSueldo()>max){
					max=arrayEmp[i].getSueldo();
					empMax=arrayEmp[i];
				}
		}
		return empMax;
	}

	@Override
	public String toString() {
		return "Departamento [codigoDpto=" + codigoDpto + ", nombre=" + nombre
				+ ", numero de empleados=" + numeroEmp + "]";
	}
	
	
	
	
	
	

}
