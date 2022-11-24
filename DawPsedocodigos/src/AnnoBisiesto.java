import java.util.Scanner;

public class AnnoBisiesto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int anno;
		Scanner entrada=new Scanner(System.in);
		do {
			System.out.println("Introduce año para ver si es bisiesto");
			//se puede usar la clase LeerTeclado que os he dado 
			//o se puede usar la clase Scanner
			anno=entrada.nextInt();
			//anno=LeerTeclado.readInteger();
		}
		while (anno<0);
		
		if ((anno%4==0) && ((anno%100!=0) || (anno%400==0)))
			System.out.println (anno+ " es bisiesto");
			else
			System.out.println (anno+ "  no es bisiesto");

		entrada.close();
	}

}
