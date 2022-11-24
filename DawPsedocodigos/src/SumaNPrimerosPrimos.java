
public class SumaNPrimerosPrimos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n, cont,  suma=0;
		boolean primo;
		System.out.println ("Introduce un nº");
		n=LeerTeclado.readInteger();
		if (n<=0)
			System.out.println ("No hay primos");
		else 
			{
				int num=2;
				cont=1;
				System.out.println ("los "+n+" primeros primos son: ");
				while (cont<=n)
				{
				
					primo=true;
					for (int i=2;  i<=num/2&&primo; i++ )
					{
						if (num%i==0)
							primo=false;
							
					}
					if (primo)
					{
						System.out.println ("El "+num);
						cont++;
						suma+=num;
					}				
					
					num++;
				}
				
				System.out.println ("La suma de  los primos es "+suma);
				
			}

	}

}
