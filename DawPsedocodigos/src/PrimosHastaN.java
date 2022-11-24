
public class PrimosHastaN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		do {
			System.out.println ("Introduce un nº mayor a 1");
			n=LeerTeclado.readInteger();
		}
		while (n<=1);
		
		System.out.println ("Los nº primos hasta "+n+" son: ");
		
		for (int m=2; m<=n; m++){
			boolean primo=true;		
			for (int i=2; i<=m/2 && primo ; i++)
			{
				if (m%i==0)
					primo=false;
			}
			if (primo)
				System.out.println ("El "+m);
	
		}
		}
		
			


	}
