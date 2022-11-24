package ejercicio3empresaDptos;

import java.util.Scanner;



public class PrincipalDpto {

	
	public static void main(String[] args) {
		
		Empresa empresa=new Empresa();
		Scanner entrada=new Scanner(System.in);
		int opcion;
		 
		do {
			
			System.out.println("MENU");
			System.out.println(" 1.- Dar de alta departamentos");
			System.out.println(" 2.- Asignar un empleado a un departamento ");
			System.out.println(" 3.- Listar datos de un departamento");
			System.out.println(" 4.- Buscar un empleado en un departamento por código");
			System.out.println(" 5.- Buscar un empleado en un departamento por nombre");
			System.out.println(" 6.- Incrementar el sueldo de un empleado");
			System.out.println(" 7.- Borrar un empleado");
			System.out.println(" 8.- Borrar un departamento");		
			System.out.println(" 9.- Buscar el empleado de mayor sueldo en el departamento");
			System.out.println("10.- Buscar el empleado de mayor sueldo en la empresa");
			System.out.println("11.- Salir");
			
			do {
				System.out.println("Introduce opcion (1-11)");
				opcion = entrada.nextInt();
			} while (opcion < 1 || opcion > 11);
		
			switch (opcion){
			case 1: empresa.alta() ;break;
			case 2: empresa.asignarEmpDpto();break;
			case 3: empresa.listarDpto();break;
			case 4: empresa.buscarEmpDptoCod();break;
			case 5: empresa.buscrEmpDptoNombre();break;
			case 6: empresa.incremSueldoEmpl();break;
			case 7: empresa.borrarEmpl();break;			
			case 8: empresa.borrar();break;
			case 9: empresa.mayorSueldoDpto();break;
			case 10: empresa.mayorSueldo();break;
			case 11: System.out.println("Fin de programa");break;
			}	
		}
		while (opcion!=11);
		

	}

}
