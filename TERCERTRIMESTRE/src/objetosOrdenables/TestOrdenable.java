package objetosOrdenables;


	import Herencia2.EmpleadoFijo;
	import Herencia2.EmpleadoEventual;
	import Herencia2.Empleado;
	import Herencia2.Figura;
	import Herencia2.Triangulo;
	import Herencia2.Rectangulo;
	
	public class TestOrdenable {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Ordenable [] Empleados= new Ordenable[4];
			Ordenable [] Figuras= new Ordenable[3];


			Empleado emp1=new EmpleadoFijo("Juan","50263247L","914604654",22000);
			Empleado emp2=new EmpleadoFijo("Juan manuel","50263247L","915605660",20000);
			Empleado emp3=new EmpleadoEventual("Manuela","5033895G","642252525",4,20);
			Empleado emp4=new EmpleadoEventual("Juana","50189470Q","635757525",8,25);


			Figura f1= new Triangulo ("Verde",3,3,3);
			Figura f2= new Rectangulo("Azul",4,8,15);
			Figura f3= new Triangulo ("Morado",3,15,15);


			Empleados[0]=emp1;
			Empleados[1]=emp2;
			Empleados[2]=emp3;
			Empleados[3]=emp4;
			Figuras[0]=f1;
			Figuras[1]=f2;
			Figuras[2]= f3;
			
			
			imprimir(Empleados);
			
			System.out.println("Ordenamos");
			Algoritmos.ordenar(Empleados);			
			imprimir(Empleados);
			
			
			imprimir(Figuras);
			
			
			Algoritmos.ordenar(Figuras);			
			imprimir(Figuras);
			
			
			
			System.out.println("La figura con mayor área es: "+Algoritmos.maximo(Figuras));
			System.out.println();
			System.out.println("El empleado con mayor sueldo es: "+Algoritmos.maximo(Empleados));
			System.out.println();
			System.out.println("La figura con menor área es: "+Algoritmos.minimo(Figuras));
			System.out.println();
			System.out.println("El empleado con menor sueldo es: "+Algoritmos.minimo(Empleados));


		}
		
		public static void imprimir(Ordenable[] array) {
			for (int i = 0; i < array.length; i++) {

				System.out.println(array[i].toString());
			}
		}
}
