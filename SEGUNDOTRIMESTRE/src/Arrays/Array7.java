package Arrays;

import java.util.Scanner;

public class Array7 {
	public static int[] dias= {31,28,31,30,31,30,31,31,30,31,30,31};
	public static String[] meses= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	public static Scanner entrada =new Scanner(System.in);
	public static int diaa,mesa,diab,mesb,tdias;
	public static void main(String[] args) {
		System.out.println("Introduce dia inicio");
		 diaa=entrada.nextInt();
		System.out.println("Introduce mes inicio");
		mesa=entrada.nextInt();
		System.out.println(diaa+" "+meses[mesa-1]);
		System.out.println("Introduce dia fin");
		 diab=entrada.nextInt();
		System.out.println("Introduce mes fin");
		 mesb=entrada.nextInt();
		 System.out.println(diab+" "+meses[mesb-1]);
		
		
		for(int i=mesa;i<mesb;i++) {
			tdias+=dias[i];
		}
		tdias=tdias-diaa+diab;
		System.out.println("total dias "+tdias);
		
	}

}
