package Arrays;

import java.util.Scanner;

public class Array3 {
public static Scanner entrada=new Scanner(System.in);
public static int[] ar1=new int[11];
	public static void main(String[] args) {
		int control=0;
		while(control>=0&&control<=10) {
			System.out.println("Introduzca Nota 0 a 10, otro valor termina programa");
			control=entrada.nextInt();
			switch(control) {
			case 0: ar1[0]++;
				break;
			case 1: ar1[1]++;
				break;
			case 2: ar1[2]++;
				break;
			case 3: ar1[3]++;
				break;
			case 4: ar1[4]++;
				break;
			case 5: ar1[5]++;
				break;
			case 6: ar1[6]++;
				break;
			case 7: ar1[7]++;
				break;
			case 8: ar1[8]++;
				break;
			case 9: ar1[9]++;
				break;
			case 10: ar1[10]++;
				break;
				default:
			}
		}
		for(int i=0;i<ar1.length;i++) {
			System.out.println("Repeticiones de "+i+" son "+ar1[i]);
		}
	}

}
