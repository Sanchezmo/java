
public class NPrimerosPrimos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n, cont;
		boolean primo;
		System.out.println ("Introduce un nº");
		n=LeerTeclado.readInteger();
		if (n<=0)
			System.out.println ("No hay primos");
		else 
			{
				int num=2;
				cont=1; //si contador empieza en 1 el while termina en la vuelta n+1
				//podria ser cont=0;
				System.out.println ("los "+n+" primeros primos son: ");
				
				while (cont<=n)//si cont=0 el bucle seria while(cont<n)
				{
					primo=true;
					
					for (int i=2;  i<=num/2 && primo; i++ )
						if (num%i==0)
							primo=false;
					
					if (primo){
						System.out.println ("El "+num);
						cont++;
					}
					num++;
				}
				
			}
		

	}

}
