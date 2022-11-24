package recursividad;

import java.util.Scanner;

public class DebugE19 {

	public static void main(String[] args) {
		System.out.println("Ejercicio 19");
		System.out.println("19.Algoritmo que calcule el valor mínimo, máximo y medio de una serie de números introducidos por teclado (la serie termina cuando se introduce un 0).");
		System.out.println("Introduzca un numero, para salir pulse 0");
		Scanner entrada = new Scanner(System.in);
		int a = entrada.nextInt();
		int max = a;
		int min = a;
		int c = 0;
		double suma = 0;
		while (a!=0) {
			if (a>max) max=a;
			if (a<min) min=a;
			c++;
			suma = suma + a;
			System.out.println("Introduzca otro numero, para salir pulse 0");
			a = entrada.nextInt();
		}
		if (max==0) System.out.println("No se ha introducido ningun numero");
		else System.out.println("El maximo es "+max+", el minimo es "+min+", la media es "+suma/c);
		entrada.close();
	}

}
