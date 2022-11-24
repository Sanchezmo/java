import java.util.Scanner;

public class FechaMasN1 {

	public static void main(String[] args) {
		
		//Considerando todos los meses de 30 d�as
		Scanner entrada=new Scanner(System.in);
		
		int dia, mes,n, anno, nuevoDia, nuevoMes, nuevoAnno;
		do {
			System.out.println ("introduce dia entre 1 y 30");
			//dia=LeerTeclado.readInteger();
			dia=entrada.nextInt();
		}
		while (dia<1 || dia>30);


		do {
			System.out.println ("introduce mes entre 1 y 12");
			//mes=LeerTeclado.readInteger();
			mes=entrada.nextInt();
		}
		while (mes<1 || mes>12);
		
		//validamos que el a�o no tenga m�s de 4 cifras
		do{
			System.out.println ("introduce a�o");
			//anno=LeerTeclado.readInteger();
			anno=entrada.nextInt();
		}
		while ( anno<0 || anno>9999 ); // equivale a while(!(anno>=0 && anno<=9999));
		
		//validamos que los d�as a sumar no sean negativos
		do{
			System.out.println("Introduce los dias que quieres adelantar:");
			//n=LeerTeclado.readInteger();
			n=entrada.nextInt();
		}
		while (n<0);
		
		//sumamos los d�as de adelanto al d�a actual
		nuevoDia=dia+n;
		nuevoMes=mes;
		nuevoAnno=anno;
		
		while(nuevoDia>30){
			nuevoMes++;
			nuevoDia=nuevoDia-30; //equivale a nuevoDia-=30;
		}
		
		while(nuevoMes>12){
			nuevoAnno++;
			nuevoMes=nuevoMes-12; //nuevoMes-=12;
		}
		System.out.println("La fecha seria "+ nuevoDia+" / " + nuevoMes +" / "+ nuevoAnno);
	
		entrada.close();
	}

}


