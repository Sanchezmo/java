
public class Primo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n, div=2;
		boolean primo=true;
		System.out.println ("Introduce el nº ");
		n=LeerTeclado.readInteger();
		
		for (div=2; div<=n/2 && primo; div++)
			if (n%div==0)
				primo=false;
		
		if (primo)
			System.out.println ("El "+n+" es primo");
		else 
			System.out.println ("El "+n+" no es primo");

	}

	}


