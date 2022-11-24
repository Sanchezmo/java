package Examen2ev;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String[] nombres =new String[100];
		String[] pruebas = {"Teorico escrito","Practico escrito","Teorico oral","Proyecto","Memoria"};
		double[][] notas=new double[100][5];
			
		for(int i=0;i<nombres.length;i++) {
			nombres[i]="Opositor"+i;
		}
		for(int i=0;i<notas.length;i++) {
			for(int j=0;j<notas[i].length;j++) {
				notas[i][j]=(double)(Math.random()*10);
			}
		}
		
		System.out.println("Introduce nombre prueba para saber los opositores que han obtenido 10");
		String pru=entrada.next();
		if(pru.equals("Teorico escrito")) {
		}else if(pru.equalsIgnoreCase("Teorico escrito")) {
			for(int i=0;i<notas.length;i++) {
				if(notas[i][0]==10) {
					System.out.println("tiene 10 en teorico escrito "+nombres[i]);
				}
			}
			
		}else if(pru.equalsIgnoreCase("Practico escrito")) {
			for(int i=0;i<notas.length;i++) {
				if(notas[i][1]==10) {
					System.out.println("tiene 10 en practico escrito "+nombres[i]);
				}
			}
		}else if(pru.equalsIgnoreCase("Teorico oral")) {
			for(int i=0;i<notas.length;i++) {
				if(notas[i][2]==10) {
					System.out.println("tiene 10 en teorico oral "+nombres[i]);
				}
			}
		}else if(pru.equalsIgnoreCase("Proyecto")) {
			for(int i=0;i<notas.length;i++) {
				if(notas[i][3]==10) {
					System.out.println("tiene 10 en proyecto "+nombres[i]);
				}
			}
		}else if(pru.equalsIgnoreCase("Memoria")) {
			for(int i=0;i<notas.length;i++) {
				if(notas[i][4]==10) {
					System.out.println("tiene 10 en memoria "+nombres[i]);
				}
			}
		}
		//calcular opositores han aprobado todo
		
		int contaprobado=0;
		for(int i=0;i<notas.length;i++) {
			int cont=0;
			for(int j=0;j<notas[i].length;j++) {
				if(notas[i][j]>=5) {
					cont++;
					if(cont==5) {
						contaprobado++;
					}
				}
			}
			
		}
		System.out.println("han aprobado "+contaprobado+" alumons");
		
	}

}
