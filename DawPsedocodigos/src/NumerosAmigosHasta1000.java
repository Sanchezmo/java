
public class NumerosAmigosHasta1000 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sumaN,sumaM;
		boolean amigos=false;
		for (int n=1;n<=999;n++)
		{
			sumaN=0;
			for (int i=1;i<=n/2;i++)
				if (n%i==0)
					sumaN+=i; 
			
			for (int m=n+1;m<=1000;m++) {
				//la m no empieza en 1 para no volver a evaluar los n cuyos divisores ya se estudiaron en el otro for
				sumaM=0;
				for (int j=1;j<=m/2;j++)
					if (m%j==0)
						sumaM+=j; 
				if (n==sumaM && m==sumaN)
				{
					System.out.println (n+" y "+m+" son amigos");
					amigos=true;
					
				}
				
			}
				
		}
		if (!amigos) // o (amigos==false)
			System.out.println ("no hay nºs amigos");
	}

}
