package Arrays;

import java.util.Scanner;

	public class Array2 {
		public static int[] ar1=new int[10];
		public static Scanner entrada =new Scanner(System.in);
		
	public static void main(String[] args) {
		ar1=cargarArray();
		sumatotal(ar1);
		conteoPares(ar1);
		maximoValor(ar1);
	}
	public static int[] cargarArray() {
		for(int i=0;i<ar1.length;i++) {
		System.out.println("Introduce valor posicion "+i+" :");
		ar1[i]= entrada.nextInt();
		}
	return ar1;
	}
	public void mayor17(int[] ar) {
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<17) {
				System.out.println("Posicion "+i+" es Menor que 17");
			}
		}
		
	}
	public static int sumatotal(int[] ar) {
		int total=0;
		for(int i=0;i<ar.length;i++) {
			total=+ar[i];
		}
		return total;
	}
	public static void conteoPares(int[] ar) {
		int positi=0;
		int negati=0;
		int ceros=0;
		
		for(int i=0;i<ar.length;i+=2) {
			if(ar[i]==0) {
				ceros++;
			}else if(ar[i]>0) {
				positi++;
			}else if(ar[i]<0) {
				negati++;
			}
		}
			System.out.println("Numero ceros "+ceros);
			System.out.println("Numero positivos "+positi);
			System.out.println("Numero negativos "+negati);
	}
	public static void maximoValor(int[] ar) {
		int max=Integer.MIN_VALUE;
		int cont=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
			for(int j=0;j<ar.length;j++) {
			if(ar[j]==max) {
				cont++;
			}
			}
		System.out.println("El maximo es "+max);
		System.out.println("El maximo se repite "+cont+" veces");
		}
	}
