
public class Primo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n, div=2;
		boolean primo=true;
		System.out.println ("Introduce el nº ");
		n=LeerTeclado.readInteger();
		for (div=2; div<=n/2; div++) 
		{
			if (n%div==0)
				{
				primo=false;
				break;
				}
		}
		if (primo)
			System.out.println ("El "+n+" es primo");
		else 
			System.out.println ("El "+n+" no es primo");

	}

}
