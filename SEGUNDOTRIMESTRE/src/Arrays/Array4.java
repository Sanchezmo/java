package Arrays;

import java.util.Scanner;

public class Array4 {
	public static Scanner entrada=new Scanner(System.in);
	public static Double[] notes=new Double[15];
	public static String[] valor= {"Billete 500","Billete 200","Billete 100","Billete 50","Billete 20","Billete 10","Billete 5","Moneda 2","Moneda 1","Moneda 0.50","Moneda 0.20","Moneda 0.10","Moneda 0.05","Moneda 0.02","Moneda 0.01"};
	public static void main(String[] args) {
		System.out.println("introduzca el importe");
		double importe=entrada.nextDouble();
		
		notes[0]=(importe-importe%500)/500;
		importe=importe%500;
		notes[1]=(importe-importe%200)/200;
		importe=importe%200;
		notes[2]=(importe-importe%100)/100;
		importe=importe%100;
		notes[3]=(importe-importe%50)/50;
		importe=importe%50;
		notes[4]=(importe-importe%20)/20;
		importe=importe%20;
		notes[5]=(importe-importe%10)/10;
		importe=importe%10;
		notes[6]=(importe-importe%5)/5;
		importe=importe%5;
		notes[7]=(importe-importe%2)/2;
		importe=importe%2;
		notes[8]=(importe-importe%1)/1;
		importe=importe%1;
		notes[9]=(importe-importe%0.50)/0.50;
		importe=importe%0.5;
		notes[10]=(importe-importe%0.20)/0.20;
		importe=importe%0.2;
		notes[11]=(importe-importe%0.10)/0.10;
		importe=importe%0.1;
		notes[12]=(importe-importe%0.05)/0.05;
		importe=importe%0.05;
		notes[13]=(importe-importe%0.02)/0.02;
		importe=importe%0.02;
		notes[14]=(importe-importe%0.01)/0.01;
	for(int i=0;i<notes.length;i++) {
		System.out.println(notes[i]+" "+valor[i]);
	}
	}
}
