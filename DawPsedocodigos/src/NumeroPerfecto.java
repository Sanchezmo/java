
public class NumeroPerfecto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n, suma=0;
		
		System.out.println("Introduce un n�");
		n=LeerTeclado.readInteger();
		for (int i=1;i<=n/2;i++)
			if (n%i==0)
				suma+=i; 
		System.out.println("la suma de sus divisores es "+ suma);
		if (n==suma)
			System.out.println("el n� "+n+" es perfecto");
		else 
			System.out.println("el n� "+n+" no es perfecto");
	}

}
