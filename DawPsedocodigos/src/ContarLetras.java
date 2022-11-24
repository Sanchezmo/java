import java.util.Scanner;

public class ContarLetras {

	
	public static void main(String[] args) {
		String letraBuscada,nuevaLetra;
	
		Scanner input=new Scanner(System.in);
		System.out.println("introduce una letra");
	//	letraBuscada=LeerTeclado.readString();
		letraBuscada=input.next();
		int cont=1;
		for (int i=2;i<=4;i++)
		{
			System.out.println("introduce una letra");
			nuevaLetra=input.next();
			//nuevaLetra=LeerTeclado.readString();
			/*pregunta si son iguales con equals o 
			 * equalsIgnoreCase para que no distinga 
			 * entre mayúsculas o minúsculas */
			
			if (nuevaLetra.equalsIgnoreCase(letraBuscada)) //no hacer:nuevaLetra==letraBuscada
				cont++;
		}
		System.out.println("la primera letra es "+letraBuscada);
		System.out.println ("el nº de veces que se repite es "+cont);
		input.close();
			
			

	}

}
