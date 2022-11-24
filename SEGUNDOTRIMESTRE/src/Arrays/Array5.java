package Arrays;

import java.util.Scanner;

public class Array5 {
	
	public static char[] ar1=new char[6];
	public static String[] ar2= new String[6];
	public static int[] nun=new int[6];
	public static Scanner entrada =new Scanner(System.in);
	public static int longitud;
	public static String cifra;
	
	public static void main(String[] args) {
		do {
		System.out.println("Introduzca cifra 6 digitos");
		cifra=entrada.next();
		longitud=cifra.length();
		if(longitud!=6) {
			System.out.println("la cifra tiene que ser de 6 digitos");
		}
		}while(longitud!=6);
		
		for(int i=0;i<ar1.length;i++) {
			ar1[i]=cifra.charAt(i);
		}
		for(int i=0;i<ar1.length;i++) {
			ar2[i]=Character.toString(ar1[i]);
		}
		for(int i=0;i<ar1.length;i++) {
			nun[i]=Integer.parseInt(ar2[i]);
		}
		System.out.println("Introduzca un numero a cotejar 0 a 9");
		int noc=entrada.nextInt();
		int cont=0;
		for(int i=0;i<nun.length;i++) {
			if(noc==nun[i]) {
				cont++;
			}
		}
			if(cont==0) {
				System.out.println("No hay coincidencias");
			}else if(cont!=0) {
				System.out.println("El numero a cotejar ser repite "+cont);
			
		}
	}
	
}
