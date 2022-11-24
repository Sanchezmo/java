
public class SumaMediaHasta0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//OJO cuidado con el tipo del campo suma debe ser double o hacer el casting a double para calcula la media como real no entero
		
		String continuar;
		
		//double suma;
		int suma;//si no pongo double a la suma al hacer la media trunca los decimales a no ser que al dividir pase suma a double
		int cont,n;
		double media;
		
		do
		{	
		System.out.println("Introduce un nº, 0 para terminar");
		suma=0;cont=0;
		
		n=LeerTeclado.readInteger();
		while (n!=0)
		{
			suma+=n;
			cont++;
			System.out.println("Introduce un nº, 0 para terminar");
			n=LeerTeclado.readInteger();
		}
		System.out.println ("la suma total es "+suma);	
		if (cont!=0)
			{
			System.out.println("se han introducido "+cont+" numeros");
			media=((double)suma/cont);//hago el casting de suma a double para que la division sea real y no entera.
			System.out.println("la media es "+media);
			}
		System.out.println("¿Deseas hacerlo otra vez?");
		continuar=LeerTeclado.readString();
		}
		while (continuar.equals("s")||continuar.equals("S"));
		System.out.println ("fin de programa");
	}
	
}
