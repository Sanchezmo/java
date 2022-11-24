package ejercicio1;
import java.util.Scanner;
public class NPrimerosPrimos {
	public static void main(String[] args) {
		int n, cont;
		boolean primo;
		System.out.println ("Introduce un nº");	
		Scanner entrada=new Scanner(System.in);
		n=entrada.nextInt();
		if (n<=0)
			System.out.println ("No hay primos");
		else 
		{int num=2;
		cont=1; //si contador empieza en 1 el while termina en la vuelta n+1
		System.out.println ("los "+n+" primeros primos son: ");				
		while (cont<=n){//si cont=0 el bucle seria while(cont<n)	
			boolean primo1;
			primo1=true;		
			for (int i=2;  i<=(long) num/2 && primo1;i++)
				if (num%i==0)primo1=false;
			primo = primo1;					
			if (primo){
				System.out.println ("El "+num);
				cont++;}
			num++;}	
		}}}
