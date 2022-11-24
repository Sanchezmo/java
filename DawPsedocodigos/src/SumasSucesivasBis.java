
public class SumasSucesivasBis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b,suma=0, cont=0; // tambien cont=1
		System.out.println ("Introduce a y b");
		a=LeerTeclado.readInteger();
		b=LeerTeclado.readInteger();
		while (cont<b) //si cont=1 el while (cont<=b)
		{
			suma+=a;
			cont++;
		}
		System.out.println (suma);

	}

}
