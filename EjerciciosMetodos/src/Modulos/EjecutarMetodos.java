package Modulos;
import java.util.Scanner;

public class EjecutarMetodos {
	public static int opcion;
	public static Scanner entrada = new Scanner(System.in);
	public static int a,b;

	public static void main(String[] args) {
do {
			
			System.out.println("+*OPCIONES************************************************************************+");
			System.out.println("+ ////////   (1)Sumar; (2)Restar; (3)Multiplicar; (4)Dividir (5)Si A divisor B;   +");
			System.out.println("+(6)Compara A,B (7)Si A es primo; (8)Obtener primos hasta N; (9)N primeros primos;+");
			System.out.println("+(10)Numeros Perfectos Menores N; (11)Factorial de N;        (12) SALIR PROGRAMA  +");
			System.out.println("+*INTRODUZCA-OPCION***************************************************************+");
			
			
			opcion=entrada.nextInt();
			
			if(opcion==1) {
				System.out.println("Suma");
				System.out.println("Introduzca A");
				a=entrada.nextInt();
				System.out.println("Introduzca B");
				b=entrada.nextInt();
				System.out.println("La suma es :"+Operaciones.sumar(a,b));
				
			}else if(opcion==2) {
				System.out.println("Resta");
				System.out.println("Introduzca A");
				a=entrada.nextInt();
				System.out.println("Introduzca B");
				b=entrada.nextInt();
				System.out.println("La resta es :"+Operaciones.restar(a,b));
				
			}else if(opcion==3) {
				System.out.println("Producto");
				System.out.println("Introduzca A");
				a=entrada.nextInt();
				System.out.println("Introduzca B");
				b=entrada.nextInt();
				System.out.println("El producto es :"+Operaciones.multiplicar(a,b));
				
			}else if(opcion==4) {
				System.out.println("División");
				System.out.println("Introduzca A");
				a=entrada.nextInt();
				do {
				System.out.println("Introduzca B distinto de Cero");
				b=entrada.nextInt();
				}while(b==0);
				System.out.println("La división es :"+Operaciones.dividir(a,b));
				
			}else if(opcion==5) {
				System.out.println("Si A divisor B");
				System.out.println("Introduzca A");
				a=entrada.nextInt();
				do {
				System.out.println("Introduzca B distinto e Cero");
				b=entrada.nextInt();
				}while(b==0);
				if(Operaciones.divisor(a,b)==true) {
					System.out.println(a+" es divisible por "+b);
				}else {
					System.out.println(a+" NO es divisible por "+b);
				}
			}else if(opcion==6) {
				System.out.println("Menor entre A y B");
				System.out.println("Introduzca A");
				a=entrada.nextInt();
				System.out.println("Introduzca B");
				b=entrada.nextInt();
				System.out.println("El menor es "+Operaciones.menor(a,b));
					
				
			}else if(opcion==7) {
				System.out.println("Si A es primo");
				System.out.println("Introduzca A");
				a=entrada.nextInt();
				if(Operaciones.primo(a)==true) {
					System.out.println("El numero es primo");
				}else {
					System.out.println("El numero NO es primo");
				}
				
			}else if(opcion==8) {
				System.out.println("Obtener primos hasta N");
				System.out.println("Introduzca N");
				a=entrada.nextInt();
				if (a<=0) {
					System.out.println ("No hay primos");
				}else {
					
					for(int i=1;i<=a;i++) {
						
						if(Operaciones.primo(i)==true) {
							System.out.println("Es primo el "+i);
						}	
					}
				}
			
			}else if(opcion==9) {
				System.out.println("N primeros primos");
				System.out.println("Introduzca N");
				a=entrada.nextInt();
				int cont=0;
				int z=Integer.MAX_VALUE;
				for(int i=1;i<z;i++) {
					if(Operaciones.primo(i)==true) {
						System.out.println(i);
						cont++;
						if(cont==a) {
							break;
						}
					}
				
				}
				
			}else if(opcion==10) {
				System.out.println("Numeros Perfectos Menores N");
				System.out.println("Introduzca N");
				a=entrada.nextInt();
				for(int i=0;i<a;i++) {
					if(Operaciones.sumadiv(i)==i) {
						System.out.println("es "+i);
					}
				}
			}else if(opcion==11) {
				System.out.println("Factorial de N");
				System.out.println("Introduzca N");
				a=entrada.nextInt();
				System.out.println("El factorial de "+a+" es "+Operaciones.factorial(a));
				
			}else if(opcion==12) {
				System.out.println("FIN PROGRAMA");
			}else {
				System.out.println("OPCION NO VALIDA");
			}
		}while(opcion!=12);
		
		entrada.close();
	}
	}


