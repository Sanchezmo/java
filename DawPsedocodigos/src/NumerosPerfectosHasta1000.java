
public class NumerosPerfectosHasta1000 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int suma;
		for (int n=1; n<=1000; n++)
		{
			suma=0;
			for (int i=1;i<=n/2;i++)
				if (n%i==0)
					suma+=i;
			if (suma==n)
				System.out.println("El nº "+n+" es perfecto");
		}

	}

}


