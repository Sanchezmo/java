import java.util.Scanner;

public class ContarDias {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int dia, mes, anno, total1, total2=0;
		System.out.println ("introduce dia");
		//dia=LeerTeclado.readInteger();
		dia=input.nextInt();
		System.out.println ("introduce mes");
		//mes=LeerTeclado.readInteger();
		mes=input.nextInt();
		System.out.println ("introduce año");
		//anno=LeerTeclado.readInteger();
		anno=input.nextInt();
		//(apartado a)
		total1=(mes-1)*30+dia;//dias transcurridos considerando meses de 30 
		//(apartado b)
		total2=dia; //días transcurridos considerando meses naturales 
		
		/*la lógica consiste en hacer un switch al revés sin que haya break
		en cada una de las opciones de forma que si entra por un mes
		siga sumando todos los días de los meses posteriores*/
		
		switch (mes-1){
			case 11:total2+=30;
			case 10:total2+=31;
			case 9: total2+=30;
			case 8: total2+=31;
			case 7: total2+=31;
			case 6: total2+=30;
			case 5: total2+=31;
			case 4: total2+=30;
			case 3: total2+=31;
			case 2: {if (anno%4==0 && (anno%100!=0 || anno%400==0)){
					total2+=29;System.out.println("El año es bisiesto");
					}					
					else total2+=28;}
			//si el año es bisiesto se suma 29 y si no 28 en el mes de febrero
			case 1: total2+=31;
			
		}
		
		System.out.println ("si se consideran meses de 30 días han pasado "+total1+" dias");
		System.out.println ("si se consideran meses naturales han pasado "+total2+" dias");
		
		input.close();
	}

}
