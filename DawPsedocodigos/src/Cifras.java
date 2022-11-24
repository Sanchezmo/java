import java.util.Scanner;

public class Cifras {

	public static void main(String[] args) {
		int n, aux, cont=0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un nº");
	//	n=LeerTeclado.readInteger();
		n=entrada.nextInt();
		aux=n;
		while (aux!=0)
		{
			cont++;
			aux=aux/10;
		}
		System.out.println ("El nº de cifras es "+cont);
		entrada.close();

	}

}
