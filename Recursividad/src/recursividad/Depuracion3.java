package recursividad;

import java.util.Scanner;

public class Depuracion3 {
	public static Scanner entrada=new Scanner(System.in);
	public static int n;
	public static double factorialRec(int n) {
		double resul;
		if (n==0)
			resul=1;
		else
			resul=n*factorialRec(n-1);
		return resul;
	}
	public static double factorialItera(int n) {
		
		int factorial=1;
		for (int i=1;i<=n; i++)
			factorial*=i;
		return factorial;
	}
	public static void main(String[] args) {
		System.out.println("Prueba depuracion dos metodos factoriales");
		System.out.println("Introduzca N");
		n=entrada.nextInt();
		System.out.println("FACTORIALES:"+Depuracion3.factorialItera(n)+" "+Depuracion3.factorialRec(n));
		
	}

}
