
public class PrimosHastaNBis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		do
		{
			System.out.println ("Introduce un nº mayor a 1");
			n=LeerTeclado.readInteger();
		}
		while (n<=1);
		System.out.println ("Los nº primos hasta "+n+" son: ");
		
		System.out.println ("El 2"); //ya sé que el 2 es primo aunque sea par
		
		for (int m=3; m<=n; m+=2) //solo evalúa los impares ya que los pares salvo el 2 no son primos
		{
			boolean primo=true;	
			
			for (int i=3; i<=m/2 && primo; i++)//como no hay pares no empiezo por el divisor 2 sino 3f
			{
				if (m%i==0)
					primo=false;
			}
			if (primo)
				System.out.println ("El "+m);				
		
		}
		}
		
			



}
