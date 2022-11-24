import java.util.Scanner;

public class ContarDiasValidacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int dia, mes, anno,  total=0, diasMes=0;
		//validamos que el año no tenga más de 4 cifras
		do{
			System.out.println ("introduce año");
			//anno=LeerTeclado.readInteger();
			anno=input.nextInt();
		}
		while ( anno<0 || anno>9999 ); // equivale a while(!(anno>=0 && anno<=9999));
		
		
		//validamos el mes (entre 1 y 12) 
		do{
			System.out.println ("introduce mes(1-12)");
			//mes=LeerTeclado.readInteger();
			mes=input.nextInt();
		}
		while (mes<1 || mes>12); // equivale a while (!(mes>=1 && mes<=12))
		
		//calculamos los días que tiene el mes para evaluar si el dia es correcto según el mes
		
		switch (mes){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			diasMes=31;
			break; 
		case 4: case 6: case 9: case 11:
			diasMes=30;
			break;
		case 2: {
			if ((anno%4==0) && ((anno%100!=0) || (anno%400==0))){
				System.out.println("Año bisiesto");
				diasMes=29;
				}
			else 
				diasMes=28;
			break;
		}
		}
		do{ //validamos que el día sea el correcto según el mes y el año
			System.out.println ("introduce dia (entre 1-"+diasMes+")");
			//dia=LeerTeclado.readInteger();
			dia=input.nextInt();
		}
		while (dia<1 || dia>diasMes); 
		
		
		//(apartado b)
		total=dia; //días transcurridos considerando meses naturales 
		
		//vamos descendiendo por el case invertido sin parar porque no hay break por lo que se van haciendo las sumas sucesivas 
		switch (mes-1){
			case 11:total+=30;
			case 10:total+=31;
			case 9: total+=30;
			case 8: total+=31;
			case 7: total+=31;
			case 6: total+=30;
			case 5: total+=31;
			case 4: total+=30;
			case 3: total+=31;
			case 2: {if ((anno%4==0) && ((anno%100!=0) || (anno%400==0))){
					total+=29;System.out.println("El año es bisiesto");
					}					
					else total+=28;}
			case 1: total+=31;
			
		}
		
		System.out.println ("Han pasado "+total+" dias desde el 1/1/"+ anno+ " hasta la fecha introducida "+dia+"/"+mes+"/"+anno);

		input.close();
	}

}
