package ejercicio3empresaDptos;

public class Departamento {
	
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

	public int getCodigoDpto() {
		return codigoDpto;
	}

	public void setCodigoDpto(int codigoDpto) {
		this.codigoDpto = codigoDpto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroEmp() {
		return numeroEmp;
	}

	public void setNumeroEmp(int numeroEmp) {
		this.numeroEmp = numeroEmp;
	}
	
	
	public Empleado[] getArrayEmp() {
		return arrayEmp;
	}
	
	public Empleado buscar(int codEmp){		
		return arrayEmp[codEmp];
	}	
	
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

	public void asignarEmp (Empleado emp){
		
		int codEmp=emp.getCodigoEmp();

		arrayEmp[codEmp]=emp;
		System.out.println("Se ha dado da alta el empleado en el dpto"+emp.toString());
		}
	
	public void visualizarEmp (){
		
		System.out.println("Datos de los empleados");
		for (int i=0; i<arrayEmp.length;i++){
			if (arrayEmp[i]!=null)
				System.out.println(arrayEmp[i].toString());
		}
	}
	
	public void borrar(Empleado emp){ //se pone a null la componente del array que viene indicada por el codigo de empleado
		arrayEmp[emp.getCodigoEmp()]=null;
	}
	
	public boolean verDptoVacio(){
		boolean vacio=true;
		for (int i=0; i<arrayEmp.length && vacio; i++){
			if (arrayEmp[i]!=null) //si encuentra algún empleado distinto de null, es que el dpto no está vacío
				vacio=false;
		}
		return vacio;
	}
	
	
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
