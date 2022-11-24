import java.util.Scanner;

public class FechaMasN2 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int dia, mes, anno, n,  diasMes=0, nuevoDia, nuevoMes, nuevoAnno;	
		
		//validamos que el año no tenga más de 4 cifras
		
		do{
			System.out.println ("introduce año");
			//anno=LeerTeclado.readInteger();
			anno=entrada.nextInt();
		}
		while ( anno<0 || anno>9999 ); // equivale a while(!(anno>=0 && anno<=9999));
		
		
		//validamos el mes (entre 1 y 12) 
		do{
			System.out.println ("introduce mes(1-12)");
			//mes=LeerTeclado.readInteger();
			mes=entrada.nextInt();
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
			dia=entrada.nextInt();
		}
		while (dia<1 || dia>diasMes); 
		
		//validamos que los días a sumar no sean negativos
		do {
			System.out.println ("introduce los días a sumar");
			//n=LeerTeclado.readInteger();
			n=entrada.nextInt();
		}
		while (n<0);
		
		nuevoDia=dia+n;
		nuevoMes=mes;
		nuevoAnno=anno;


		while  (nuevoDia>diasMes){ //si al sumar nos pasamos del diaMes
			nuevoDia-=diasMes; //le resto los días exactos del mes (en lugar de restar 30)
			nuevoMes++; //incremento el mes
			if (nuevoMes>12){ //si nos pasamos de 12
				nuevoMes=1; //empiezo en enero
				nuevoAnno++; //aumento el año
			}

			//vuelvo a calcular los díasMes del nuevoMes que he generado
			// por si he cambiado de mes o de año 
			switch (nuevoMes){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
				diasMes=31;
				break; 
			case 4: case 6: case 9: case 11:
				diasMes=30;
				break;
			case 2: {
				if ((nuevoAnno%4==0) && ((nuevoAnno%100!=0) || (nuevoAnno%400==0))){
					System.out.println (nuevoAnno+ " es bisiesto");
					diasMes=29;
				}

				else {
					System.out.println (nuevoAnno+ "  no es bisiesto");
					diasMes=28;
				}

				break;
			}
			}

		}
		System.out.println ("la nueva fecha es: "+nuevoDia+"/"+nuevoMes+"/"+nuevoAnno);


	}

}
