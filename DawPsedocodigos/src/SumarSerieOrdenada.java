
public class SumarSerieOrdenada {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n, anterior, suma=0;
		boolean ordenado=true;
		System.out.println("Introduce un nº, 0 es fin");
		n=LeerTeclado.readInteger();
		anterior=n;
		while (n!=0)
		{
			suma+=n;
			if (anterior>n)
				ordenado=false;
			anterior=n;
			System.out.println("Introduce un nº, 0 es fin");
			n=LeerTeclado.readInteger();
		}
		if (ordenado)
			System.out.println ("la serie esta ordenada");
		else 
			System.out.println ("la serie no esta ordenada");
		System.out.println ("la suma es: "+suma);
	}

}
