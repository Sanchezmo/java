package ArrayObj;

import java.util.Scanner;

public class ArrayObj3 {

	public static void main(String[] args) {
		String[] tipodpto= {"INFORMATICA","SEGURIDAD","ADMINISTRACION","VENTAS"};
		Departamento[] dptos=new Departamento[4];
		Scanner entrada=new Scanner(System.in);
		int control=0;
		do {
			System.out.println("MENU \n [1]Alta Dptos;[2]Asignar Empleado a Dpto;[3]Visualizar Dpto;[4]Buscar Empleado por dpto y codigo empleado;[5]Buscar empleado por dpto y nombre; \n [6]Incrementar Sueldo;"
					+ "[7]Borrar Empleado;[8]Visualizar Empleado Mayor Sueldo por Dpto;[9]Visualizar Empleado Mayor Sueldo Empresa; \n [10]SALIR");
			control=entrada.nextInt();
			switch(control) {
			case 1:
				System.out.println("ALTA DEPARTAMENTOS");
				
				for(int i=0;i<tipodpto.length;i++) {
		
				System.out.println("introduzca numero empleados del dpto "+(i+1)+" "+tipodpto[i]);
				int numemp=entrada.nextInt();
				Empleado[] emple=new Empleado[numemp]; 
				dptos[i]=new Departamento(i,tipodpto[i],numemp,emple);
				
				}
				break;
			case 2:
				System.out.println("Asignar Empleado a Dpto");
				System.out.println("¿Numero Dpto? 1-4");
				int numdpto=entrada.nextInt();
				System.out.println("¿numero de empleado?");
				int numemp=entrada.nextInt();
				System.out.println("¿nombre de empleado?");
				String nomemp=entrada.next();
				System.out.println("¿Sueldo de empleado?");
				double sueldo=entrada.nextDouble();
				int nemp=dptos[numdpto-1].getEmpleados().length;
				Empleado[] empleados=new Empleado[nemp];
				empleados=dptos[numdpto-1].getEmpleados();
				if(empleados[numemp-1]!=null) {
					System.out.println("Ya existe el empleado "+numemp);
				}else {
					empleados[numemp-1]=new Empleado(numemp,nomemp,sueldo);
				}
					dptos[numdpto-1].setEmpleados(empleados);
				break;
			case 3:
				System.out.println("Visualizar Departamento");
				System.out.println("¿Numero Dpto? 1-4");
				numdpto=entrada.nextInt();
				System.out.println("DEPARTAMENTO:");
				System.out.println("Nº // NOMBRE");
				if(dptos[numdpto-1]!=null) {
				System.out.println((dptos[numdpto-1].getCodigoDpto()+1)+" "+dptos[numdpto-1].getNombreDpto());
				empleados=dptos[numdpto-1].getEmpleados();
				System.out.println("EMPLEADOS:");
				System.out.println("Nº // SUELDO");
				for(int i=0;i<empleados.length;i++) {
					System.out.println(empleados[i].getNombreEmp()+" "+empleados[i].getSueldo());
				}
				}else{
					System.out.println("No existe departamento");
				}
				break;
			case 4:
				System.out.println("Buscar Empleado por dpto y codigo empleado");
				System.out.println("Nº departamento:");
				numdpto=entrada.nextInt();
				System.out.println("Nº empleado:");
				numemp=entrada.nextInt();
				if(dptos[numdpto-1]!=null) {
					empleados=dptos[numdpto-1].getEmpleados();
						if(empleados[numemp-1]!=null) {//numero empleado coincide con indice no hay que recorrer array
							System.out.println(empleados[numemp-1].getNombreEmp()+" "+empleados[numemp-1].getSueldo());
						}
				}else{
					System.out.println("No existe departamento");
				}
				break;
			case 5:
				System.out.println("Buscar empleado por dpto y nombre");
				System.out.println("Nº departamento:");
				numdpto=entrada.nextInt();
				System.out.println("Nombre empleado");
				nomemp=entrada.next();
				if(dptos[numdpto-1]!=null) {
					empleados=dptos[numdpto-1].getEmpleados();
					for(int i=0;i<empleados.length;i++) {
						if(empleados[i].getNombreEmp().equalsIgnoreCase(nomemp)) {
							System.out.println("Encontrado, Nº empleado:"+empleados[i].getCodigoEmp()+" Sueldo: "+empleados[i].getSueldo());
						}else {
							System.out.println("No encontrado empleado con ese nombre");
						}
					}
				}else {
					System.out.println("No existe departamento");
				}
				break;
			case 6:
				System.out.println("Incrementar Sueldo");
				System.out.println("Nº departamento:");
				numdpto=entrada.nextInt();
				System.out.println("Nº empleado:");
				numemp=entrada.nextInt();
				System.out.println("Nuevo Salario:");
				sueldo=entrada.nextDouble();
				if(dptos[numdpto]!=null) {
					empleados=dptos[numdpto-1].getEmpleados();
					if(empleados[numemp-1]!=null) {
						empleados[numemp-1].setSueldo(sueldo);
						System.out.println("Sueldo Cambiado");
					}else {
						System.out.println("No existe empleado");
					}
				}else {
					System.out.println("No existe departamento");
				}
				break;
			case 7:
				System.out.println("Borrar Empleado");
				System.out.println("Nº departamento:");
				numdpto=entrada.nextInt();
				System.out.println("Nº empleado:");
				numemp=entrada.nextInt();
				if(dptos[numdpto-1]!=null) {
					empleados=dptos[numdpto-1].getEmpleados();
					if(empleados[numemp-1]!=null) {
						empleados[numemp-1].setNombreEmp(null);
						empleados[numemp-1].setSueldo(0);
						System.out.println("Datos Empleado borrados");
					}else {
						System.out.println("No existe empleado");
					}
				}else {
					System.out.println("No existe departamento");
				}
				break;
			case 8:
				System.out.println("Visualizar Empleado Mayor Sueldo por Dpto");
				System.out.println("Nº departamento:");
				numdpto=entrada.nextInt();
				double max=Double.MIN_VALUE;
				String maximo="";
				int codmax=0;
				
					empleados=dptos[numdpto-1].getEmpleados();
					for(int j=0;j<empleados.length;j++) {
						if(empleados[j].getSueldo()>max) {
							 max=empleados[j].getSueldo();
							 maximo=empleados[j].getNombreEmp();
							 codmax=empleados[j].getCodigoEmp();
						}	
					}	
				
				System.out.println("El mayor sueldo del departamento es "+max+" de "+maximo+" cod empleado"+codmax);
				break;
			case 9:
				System.out.println("Visualizar Empleado Mayor Sueldo Empresa");
				max=Double.MIN_VALUE;
				maximo="";
				codmax=0;
				for(int i=0;i<dptos.length;i++) {
					empleados=dptos[i].getEmpleados();
					for(int j=0;j<empleados.length;j++) {
						if(empleados[j].getSueldo()>max) {
							 max=empleados[j].getSueldo();
							 maximo=empleados[j].getNombreEmp();
							 codmax=empleados[j].getCodigoEmp();
						}	
					}	
				}
				System.out.println("El mayor sueldo de la empresa es "+max+" de "+maximo+" cod empleado"+codmax);
				break;
			case 10:
				System.out.println("FIN PROGRAMA");
				break;
			default:
				System.out.println("Opcion No Valida");
			}
		}while(control!=10);
		entrada.close();
	}

}
