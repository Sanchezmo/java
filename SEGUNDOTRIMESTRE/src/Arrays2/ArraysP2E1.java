package Arrays2;

import java.util.Scanner;

public class ArraysP2E1 {
public static int[] nums=new int[30];
public static int[] posicion=new int[30];
public static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		for(int i=0;i<nums.length;i++) {
			nums[i]=(int)(Math.random()*100+1);
		}
				for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println("\n Introduzca numero a comprobar");
		int no=entrada.nextInt();
		int cont=0;
		
		boolean tf=false;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==no) {
				cont++;
				tf=true;
				posicion[i]++;
			}
		}
		System.out.println("¿Esta en la serie? "+tf+" ¿cuantas veces se repite? "+cont);
		for(int z=0;z<posicion.length;z++) {
			if(posicion[z]==1) {
				System.out.print(" posiciones: "+z);
			}
		}
		System.out.println("");
		//ordenar array
		int aux;
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					aux=nums[i];
					nums[i]=nums[j];
					nums[j]=aux;
				}
			}
		}
		//muestra ordenado
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println("");
		//busqueda optimizada
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==no) {
				System.out.println("hay coincidencia en las posiciones "+i);
			}
			if(nums[i]>no) {
				
				break;
			}
		}
		//busqueda dicotómica
		
		int posicions=0;
		int medio,inf,sup;
		inf=0;
		sup=nums.length-1;
		boolean find=false;
		do {
			medio=(inf+sup)/2;
			if(nums[medio]==no) {
				find=true;
				posicions=medio;
			}else if(nums[medio]>no) {
				sup=medio-1;
			}else {
				inf=medio+1;
			}
		}while(!find && inf<=sup);
		if(find) {
			System.out.println("Está en el Array en la posicion "+posicions);
		}else {
			System.out.println("NO está en el Array");
		}
	}

}
