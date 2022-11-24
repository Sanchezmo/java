
public class NPrimerosPrimosBis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n, cont;
		boolean primo;
		System.out.println ("Introduce un nº");
		n=LeerTeclado.readInteger();
		if (n==0) System.out.println ("No hay primos");
		else
		{
			System.out.println("los "+n+ " primeros primos son:");
			cont=0; //se puede empezar en cont=1
			int num=2;
			while (cont<n)//si se empieza en cont=1 el bucle sería while (cont<=n)
			{
				primo=true;
				for (int i=2; i<=num/2;i++)
					if (num%i==0)
					{
						primo=false;
						break; //si encuentra un primo rompe el for
					}
				if (primo)
				{
					System.out.println("el "+num); 
					cont++;
				}
					
				num++;
		}
		
					
		}

	}

}
