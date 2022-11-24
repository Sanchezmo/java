package ejercicio3empresaDptos;

import java.util.Scanner;


public class Empresa {
	
	private Departamento[] arrayDpto;
	private static Scanner entrada=new Scanner(System.in);
	
	public Empresa(){
		arrayDpto=new Departamento[4];
	}
	
	
	/***********************************ALTA DE DEPARTAMENTO**************************************/
	
	public void alta (){

		System.out.println("Alta de departamento");
		String resp;
		int codDpto, numEmp;
		String nbDpto;
		Departamento dptoAux;

		do { //también se podría haber hecho con un for (int i=0; i<4; i++)

			codDpto = introducirCodDpto();
			
			/*Para ver si el departamento está ya dado de alta en este ejemplo podríamos preguntar if (arrayDpto[codDpto]!=null) 
			 * o llamar al método buscarDptoCod(codDpto) que devuelve un dpto y luego preguntar si ha devuelto null*/
			dptoAux=buscar(codDpto);
			
			if (dptoAux!=null) 
			
				System.out.println("El departamento ya está dado de alta "+dptoAux.toString());
			
			else //el departamento no existe
			{
				System.out.println("Introduce nombre de departamento");
				nbDpto=entrada.next();
				//podemos validar también que no exista el nombre del departamento 
				dptoAux=buscarNb(nbDpto);
				
				if (dptoAux!=null) 
					
					System.out.println("El departamento ya está dado de alta "+dptoAux.toString());
				
				else //el departamento no existe
				{
				
				System.out.println("Introduce el número de empleados del departamento");
				numEmp=entrada.nextInt();
				dptoAux=new Departamento(codDpto,nbDpto,numEmp);
				insertarDpto(dptoAux);
				
				/*También podría haberse hecho aquí:
				 * arrayDpto[codDpto]=dpto;//guarda el objeto dpto en el array en la posicion que indica codDpto
				System.out.println("Se ha dado de alta el departamento "+dpto.toString());
				*/
				}
			}
			System.out.println("¿Deseas dar de alta otro departamento(s/n)");
			resp=entrada.next();

		}

		while (resp.toLowerCase().equals("s"));

	}

	/***********************************INTRODUCIR Y VALIDAR  CÓDIGO DE DPTO*****************************************/
	public int introducirCodDpto() {
		int codDpto;
		do{ //valida que el codigo de departamento sea correcto
			System.out.println("Introduce codigo de departamento (entre 0 y 3)");
			codDpto=entrada.nextInt();
		}
		while (codDpto<0||codDpto>3);
		return codDpto;
	}
	
	public Departamento buscar(int codDpto){
		return arrayDpto[codDpto];
	}
	public Departamento buscarNb(String nbDpto){
		
		boolean encontrado=false;
		Departamento dptoAux=null;
		for (int i=0; i<arrayDpto.length&&!encontrado ; i++){
			if (arrayDpto[i]!=null && arrayDpto[i].getNombre().compareTo(nbDpto)==0){
				encontrado=true;
				dptoAux=arrayDpto[i];
				
				//break; 
				//se podria romper el for con un break si se encuentra en lugar de usar el switch en la condición del for
			}
		}
		return dptoAux;
	}
	/***********************************INSERTAR DPTO EN EL ARRAY DE DEPARTAMENTOS*****************************************/
	
	public void insertarDpto (Departamento dpto){
		arrayDpto[dpto.getCodigoDpto()]=dpto;//guarda el objeto dpto en el array en la posicion que indica codDpto
		System.out.println("Se ha dado de alta el departamento "+dpto.toString());
	}
	
	
	
	/************************************ASIGNAR EMPLEADO AL DPTO**************************************/

	public void asignarEmpDpto(){
		
		System.out.println("Asignación de un empleado a un departamento");

		String resp;
		int codDpto,codEmp;
		String nombre;
		double sueldo;
		int numeroEmp;
		Departamento dptoAux;
		Empleado emp;
		
		codDpto = introducirCodDpto();

		dptoAux=buscar(codDpto);
		if (dptoAux==null)//no existe el dpto en el array de dpto
			System.out.println("Lo sentimos. No se ha dado de alta este departamento");

		else {//existe el dpto

			System.out.println("Se va a dar de alta un empleado en el departamento "+dptoAux.toString());
			numeroEmp=dptoAux.getNumeroEmp()-1;
			//guardo el nºde empleados del departamento introducido

			do{ //valida que el código de empleado esté comprendido entre 0 y el número máximo de empleados del dpto
				System.out.println("Alta del empleado");
				codEmp = introducirCodEmpl(numeroEmp);

				if (dptoAux.buscar(codEmp)!=null)//existe el codigo de empleado
					System.out.println("El empleado ya existe ");

				else {

					System.out.println("Introduce nombre del empleado");
					nombre=entrada.next();
					System.out.println("Introduce sueldo del empleado");
					sueldo=entrada.nextDouble();

					emp=new Empleado(codEmp,nombre,sueldo);
					dptoAux.asignarEmp(emp);//asigna el empleado al dpto

				}

				System.out.println("¿Deseas dar de alta otro empleado en el departamento(s/n)");
				resp=entrada.next();
			}

			while (resp.toLowerCase().equals("s"));	
		}


	}

	/***********************************INTRODUCIR Y VALIDAR  CÓDIGO DE EMPLEADO*****************************************/
	public int introducirCodEmpl(int numeroEmp) { //recibe el nº máximo de empleados del dpto 
		int codEmp;
		do {
			System.out.println("Introduce codigo del empleado (0-"+numeroEmp+")");
			codEmp=entrada.nextInt();
		}
		while (codEmp<0||codEmp>numeroEmp);
		return codEmp;
	}

	/************************************LISTAR DPTO**************************************/
		
	public void listarDpto(){
		
		int codDpto;
		Departamento dptoAux;
		
		codDpto = introducirCodDpto();

		dptoAux=buscar(codDpto);
		
		if (dptoAux==null)//no existe el dpto en el array de dpto
		
			System.out.println("Lo sentimos. No se ha dado de alta este departamento");
		
		else {//existe el dpto
			
			System.out.println(dptoAux.toString());
			dptoAux.visualizarEmp(); 
		
		}
	}
	
	public void borrar(){
		
		int codDpto;
		Departamento dptoAux;
		String borrar;
		
		codDpto = introducirCodDpto();

		dptoAux=buscar(codDpto);
		
		if (dptoAux==null)//no existe el dpto en el array de dpto
		
			System.out.println("Lo sentimos. No se ha dado de alta este departamento");
		
		else {//existe el dpto
			
			System.out.println(dptoAux.toString());
			System.out.println("¿Es este el departamento a borrar (s/n)?");
			borrar=entrada.next();
			if (borrar.equalsIgnoreCase("s"))
				if (dptoAux.verDptoVacio()){
					System.out.println("El departamento se puede borrar porque no tiene empleados");
					bajaDpto(dptoAux);
				}
					
				else{
					System.out.println("Lo sentimos el departamento tiene empleados y no se puede dar de baja");
					dptoAux.visualizarEmp();
				}
		}
	}
	
	/***********************************BAJA DE UN DPTO EN EL EMPRESA***************************************/
	
	public void bajaDpto (Departamento dpto){
		arrayDpto[dpto.getCodigoDpto()]=null;//guarda el objeto dpto en el array en la posicion que indica codDpto
		System.out.println("Se ha dado de baja el departamento ");
	}
	
	/************************************BUSCAR UN EMPLEADO EN UN DPTO**************************************/
	
	public void buscarEmpDptoCod(){
		
		int codDpto, numeroEmp, codEmp;
		Departamento dptoAux;
		Empleado emplAux;
		String resp;
			
		codDpto = introducirCodDpto();

		dptoAux=buscar(codDpto);
		
		if (dptoAux==null)//no existe el dpto en el array de dpto
			System.out.println("Lo sentimos. No se ha dado de alta este departamento");

		else {//existe el dpto

			System.out.println("Se va a buscar un empleado en el departamento "+dptoAux.toString());
			numeroEmp=dptoAux.getNumeroEmp()-1;
			//guardo el nºde empleados del departamento introducido

			do{ //valida que el código de empleado esté comprendido entre 0 y el número máximo de empleados del dpto
				System.out.println("Búsqueda del empleado");
				codEmp = introducirCodEmpl(numeroEmp);
				emplAux=dptoAux.buscar(codEmp);
				if (emplAux==null)//existe el codigo de empleado
					System.out.println("El empleado no existe ");

				else {
					System.out.println(emplAux.toString());
					
				}
			System.out.println("¿Deseas buscar otro empleado en el departamento(s/n)");
			resp=entrada.next();
		}
		
		while (resp.toLowerCase().equals("s"));	
			 
		}
	}
	
/************************************BUSCAR UN EMPLEADO EN UN DPTO  POR NOMBRE**************************************/
	
	public void buscrEmpDptoNombre(){
		
		int codDpto;
		Departamento dptoAux;
		Empleado emplAux;
		String nombreAux, resp;
			
		codDpto = introducirCodDpto();

		dptoAux=buscar(codDpto);
		
		if (dptoAux==null)//no existe el dpto en el array de dpto
			System.out.println("Lo sentimos. No se ha dado de alta este departamento");

		else {//existe el dpto

			System.out.println("Se va a buscar un empleado en el departamento "+dptoAux.toString());
			
			

			do{ //valida que el código de empleado esté comprendido entre 0 y el número máximo de empleados del dpto
				System.out.println("Búsqueda del empleado: Introduzca el nombre ");
				nombreAux=entrada.next();
				emplAux=dptoAux.buscarNb(nombreAux);
				if (emplAux==null)//existe el codigo de empleado
					System.out.println("El empleado no existe ");

				else {
					System.out.println(emplAux.toString());
					
				}
			System.out.println("¿Deseas buscar otro empleado en el departamento(s/n)");
			resp=entrada.next();
		}
		
		while (resp.toLowerCase().equals("s"));	
			 
		}
	}
/************************************INCREMENTAR SUELDO DE UN EMPLEADO **************************************/
	
	public void incremSueldoEmpl(){
		
		int codDpto, numeroEmp, codEmp;
		Departamento dptoAux;
		Empleado emplAux;
		String resp;
			
		codDpto = introducirCodDpto();

		dptoAux=buscar(codDpto);
		
		if (dptoAux==null)//no existe el dpto en el array de dpto
			System.out.println("Lo sentimos. No se ha dado de alta este departamento");

		else {//existe el dpto

			numeroEmp=dptoAux.getNumeroEmp()-1;
			//guardo el nºde empleados del departamento introducido

			do{ //valida que el código de empleado esté comprendido entre 0 y el número máximo de empleados del dpto
				System.out.println("Incremento del sueldo de un empleado");
				codEmp = introducirCodEmpl(numeroEmp);
				emplAux=dptoAux.buscar(codEmp);
				if (emplAux==null)//existe el codigo de empleado
					System.out.println("El empleado no existe ");

				else {
					System.out.println("El empleado cuyo sueldo se va a incrementar es "+emplAux.toString());
					emplAux.incrementarSueldo();
					System.out.println("El nuevo sueldo es ahora "+emplAux.getSueldo());
					
				}
			System.out.println("¿Deseas incrementar el sueldo de otro empleado en el departamento(s/n)?");
			resp=entrada.next();
		}
		
		while (resp.toLowerCase().equals("s"));	
			 
		}
	}
	
/************************************BORRAR UN EMPLEADO DE UN DPTO**************************************/
	
	public void borrarEmpl(){
		
		int codDpto, numeroEmp, codEmp;
		Departamento dptoAux;
		Empleado emplAux;
		String borrar, resp;
			
		codDpto = introducirCodDpto();

		dptoAux=buscar(codDpto);
		
		if (dptoAux==null)//no existe el dpto en el array de dpto
			System.out.println("Lo sentimos. No se ha dado de alta este departamento");

		else {//existe el dpto

			System.out.println("Se va a borrar un empleado en el departamento "+dptoAux.toString());
			numeroEmp=dptoAux.getNumeroEmp()-1;
			//guardo el nºde empleados del departamento introducido

			do{ //valida que el código de empleado esté comprendido entre 0 y el número máximo de empleados del dpto
				System.out.println("Búsqueda del empleado");
				codEmp = introducirCodEmpl(numeroEmp);
				emplAux=dptoAux.buscar(codEmp);
				if (emplAux==null)//existe el codigo de empleado
					System.out.println("El empleado no existe ");

				else {
					
					System.out.println(emplAux.toString());
					System.out.println("¿Es este el empleado a borrar (s/n)? ");
					borrar=entrada.next();
					if (borrar.equalsIgnoreCase("s")){
						dptoAux.borrar(emplAux);
						System.out.println("Se ha borrado al empleado");						
					}	
					
				}
			System.out.println("¿Deseas borrar otro empleado en el departamento(s/n)");
			resp=entrada.next();
		}
		
		while (resp.toLowerCase().equals("s"));	
			 
		}
	}
	/***********************************EMPLEADO DE MAYOR SUELDO EN EL DPTO**************************/
	
	public void mayorSueldoDpto(){

		int codDpto;
		Departamento dptoAux;
		String resp;
		
		do{
			codDpto = introducirCodDpto();
	
			dptoAux=buscar(codDpto);
			
			if (dptoAux==null)//no existe el dpto en el array de dpto
			
				System.out.println("Lo sentimos. No se ha dado de alta este departamento");
			
			else {//existe el dpto
				
					System.out.println("Se va a dar a buscar el empleado de mayor sueldo en el departamento "+dptoAux.toString());
					System.out.println("El empleado de mayor sueldo es "+dptoAux.mayorSueldoDpto().toString());
	
				}
				System.out.println("¿Deseas buscar en otro departamento(s/n)");
				resp=entrada.next();
			
			}
			while (resp.toLowerCase().equals("s"));	
	}

	/***********************************EMPLEADO DE MAYOR SUELDO EN LA EMPRESA**************************/
	public void mayorSueldo(){
		
		double max=0;
		Empleado empMaxEmpresa=null, empMaxDpto;		
		Departamento dpto;
		
		for (int i=0;i<arrayDpto.length;i++){
			if (arrayDpto[i]!=null){
				dpto=arrayDpto[i];
				empMaxDpto=dpto.mayorSueldoDpto();
				if (max<empMaxDpto.getSueldo()){
					max=empMaxDpto.getSueldo();
					empMaxEmpresa=empMaxDpto;
				}
			}			
		}
		System.out.println("El empleado de mayor sueldo de la empresa es "+empMaxEmpresa.toString());
	}
}
	




			
		
		
	
	
	

