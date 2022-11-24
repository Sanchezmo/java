package Modulos;

import java.util.Scanner;

public class FactorialRecursivo {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num;
		do {
			System.out.println("Introduce un número positivo o 0");
			num=entrada.nextInt();
		}
		while (num<0);
		System.out.println("El factorial de "+num+" es "+factorial(num));
		System.out.println("Lo calculamos de otra forma");		
		System.out.println("El factorial de "+num+" es "+factorialBis(num));
		
		
		entrada.close();

	}
	
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
	
}