
public class Primo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n, div=2;
		boolean primo=true;
		System.out.println ("Introduce el nº ");
		n=LeerTeclado.readInteger();
		div=2;
		while(primo && div<=n/2)
		{
			if (n%div==0)
				primo=false;
				else
					div++;
		}
		if (primo)
			System.out.println ("El "+n+" es primo");
		else 
			System.out.println ("El "+n+" no es primo");

	}

	}
