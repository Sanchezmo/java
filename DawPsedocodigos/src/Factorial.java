import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		//int n=LeerTeclado.readInteger();
		int n=entrada.nextInt();
		int factorial=1;
		for (int i=1;i<=n; i++)
			factorial*=i;
		System.out.println("el factorial es "+factorial);

		entrada.close();
	}

}
