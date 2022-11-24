import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce a y b");
//		a = LeerTeclado.readInteger();
//		b = LeerTeclado.readInteger();
		int a=entrada.nextInt(), b=entrada.nextInt();	
				
		if (a%b==0)
			System.out.println (b + " es divisor de "+a);
		else 
			System.out.println (b + " no es divisor de "+a);
		
		entrada.close();

	}

}
