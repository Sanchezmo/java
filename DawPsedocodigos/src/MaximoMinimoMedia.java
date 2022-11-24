
public class MaximoMinimoMedia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n, suma, max, min, cont;
		double media;
		suma=0;cont=0;
		max=Integer.MIN_VALUE;
		min=Integer.MAX_VALUE;
		System.out.println ("Introduce un nº, 0 para terminar");
		n=LeerTeclado.readInteger();
		while (n!=0)
		{
			suma+=n;
			cont++;
			if (n>max)
				max=n;
			if (n<min)
				min=n;
			System.out.println ("Introduce un nº, 0 para terminar");
			n=LeerTeclado.readInteger();
		}
		System.out.println ("la suma total es "+suma);	
		System.out.println("se han introducido "+cont+" numeros");
		if (cont!=0)
			{
			media=((double)suma/cont);//hago el casting de suma a double para que la division sea real y no entera.
			System.out.println("la media es "+media);
			System.out.println("Maximo= "+max);
			System.out.println("Minimo= "+min);}
		else
			System.out.println ("El maximo y minimo son 0");
			
		
		
		

	}

}
