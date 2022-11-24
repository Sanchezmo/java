import java.util.Scanner;

public class FactorialBis {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		//int n=LeerTeclado.readInteger();
		int n=entrada.nextInt();
		int factorial=1;
		
		for (int i=n;i>=1; i--)
			factorial*=i;
		System.out.println("el factorial es "+factorial);

		entrada.close();

	}

}
