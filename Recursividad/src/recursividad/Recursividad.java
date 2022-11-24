package recursividad;

import java.util.Scanner;

public class Recursividad {
	public static int opcion;
	public static Scanner entrada = new Scanner(System.in);
	public static int a,b;
	
	public static void main(String[] args) {
		
		do {
		System.out.println("+*OPCIONES*******************************************************************************+");
		System.out.println("+ ////////   (1)FACTORIAL; (2)POTENCIA; (3)FIBONACCI; (4)PASAR BINARIO (5);INVERTIR CIFRA+");
		System.out.println("+*INTRODUZCA-OPCION*(6)PARA*SALIR********************************************************+");
		
		
		opcion=entrada.nextInt();
		
		if(opcion==1) {
			System.out.println("9.	Escribir un método que calcule el factorial de un nº usando recursividad.");
			int num;
			do {
				System.out.println("Introduce un número positivo o 0");
				num=entrada.nextInt();
			}while (num<0);
			System.out.println("El factorial de "+num+" es "+factorial(num));
			System.out.println("Lo calculamos de otra forma");		
			System.out.println("El factorial de "+num+" es "+factorialBis(num));
			
			
		}else if(opcion==2) {
			System.out.println("10.	Escribir un método recursivo que reciba como parámetros una base a y un  exponente b y calcule la potencia por productos sucesivos:");
			System.out.println("Introduce base");
			a=entrada.nextInt();
			System.out.println("Introduce exponente");
			b=entrada.nextInt();
			System.out.println(potRec(a,b));
		}else if(opcion==3) {
			System.out.println("11.	Escribir un programa que dado un número N calcule los N primeros números de la serie de Fibonacci usando recursividad:");
			System.out.println("Introduce Numero fibonacci");
			a=entrada.nextInt();
			System.out.println("Introduce cuantos numeros desea ver");
			b=entrada.nextInt();
			for(int i=0;i<b;i++){
				int n=a+i;
				System.out.println(fibo(n));
			}
			
		}else if(opcion==4) {
			System.out.println("12.	Escribir un programa que pase un nº de decimal a binario usando recursividad");
			System.out.println("Introduce Numero a convertir");
			a=entrada.nextInt();
			aBinario(a);
			System.out.println(" binario");
			
		}else if(opcion==5) {
			System.out.println("13.	Escribir un programa que dado un nº obtenga sus cifras en orden inverso usando recursividad");
			
			
		}
			
		}while(opcion!=6);
		entrada.close();
	}
	//Metodos Recursivos
	
	public static double factorial(int n) {
		if (n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
	//otra forma
		public static double factorialBis (int n) {
			double resul;
			if (n==0)
				resul=1;
			else
				resul=n*factorialBis(n-1);
			return resul;
		}
	//Potencia Recursiva
		public static double potRec(int a,int n) {
			double resultado=0;
			if(n==0) {
				resultado=1;
			}else if(n>0) {
				resultado=a*potRec(a,n-1);
			}else if(n<0) {
				n=-n;
				resultado=1/(a*potRec(a,n-1));
				
			}
			return resultado;
		}

	/*
	 * public static int potenciaRecur(int a,int n) { int resultado=0; if(n==1) {
	 * resultado=a; }else if(n%2==0) {
	 * resultado=potenciaRecur(a,n/2)*potenciaRecur(a,n/2); }else {
	 * resultado=a*potenciaRecur(a,(n-1)/2)*potenciaRecur(a,(n-1)/2); } return
	 * resultado; }
	 */
	//Fibonacci
		public static int fibo(int n) {
			int resultado=0;
			if(n==1) {
				resultado= 1;
			}else if(n==0) {
				resultado= 0;
			}else if(n>1) {
				resultado= fibo(n-1)+fibo(n-2);
			}
			
			return resultado;
		}
		//Decimal a Binario
		public static void aBinario(int n) {
			
			if(n<2) {
			System.out.print(n);
			return;
			}else {
				aBinario(n/2);
				System.out.print(n%2);
				return;
			}
			
		}
		public static int invertir(int n) {
			return 1;
		}
}
