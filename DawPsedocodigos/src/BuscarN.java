import java.util.Scanner;

public class BuscarN {

	
	public static void main(String[] args) {
		int n, num;
		boolean encontrado=false;
		Scanner entrada=new Scanner(System.in);
		System.out.println ("Introduce el n� a buscar");
		n=entrada.nextInt();
		//n=LeerTeclado.readInteger();
		System.out.println ("Introduce un n� de la serie. 0 para terminar");
		
		num=entrada.nextInt();
		//num=LeerTeclado.readInteger();
		while (num!=0)
		{	if (num==n)
				encontrado=true;
			System.out.println ("Introduce un n� de la serie. 0 para terminar");
			num=entrada.nextInt();
			//num=LeerTeclado.readInteger();
		}
		if (encontrado)
			System.out.println("El n� "+n+ " estaba en la serie");
		else 
			System.out.println("El n� "+n+ " no estaba en la serie");

		entrada.close();
	}

}
