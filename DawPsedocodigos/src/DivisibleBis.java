import java.util.Scanner;

/**
 * @author almudena
 * 
 */
public class DivisibleBis {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce a y b");
		//a = LeerTeclado.readInteger();
		//b = LeerTeclado.readInteger();
		int a=entrada.nextInt(), b=entrada.nextInt();
		
		//Si a no es divisible por b, pero s� al rev�s, se intercambian
		
		if (b != 0 && a % b == 0) 	
			/* Es importante poner el orden de las condiciones en el And  porque se
			 * eval�a la primera condici�n y, si es falsa, ya no entra a evaluar
			 * la segunda. Si se pone al rev�s, dar�a un error si b==0 porque lo primero
			 * que har�a ser�a intentar dividir por 0.
			*/
			System.out.println(a + " es divisible por " + b);
		else if (a != 0 && b % a == 0)
			System.out.println(b + " es divisible por " + a);
		else
			System.out.println("no son divisibles");

		entrada.close();
	}

}
