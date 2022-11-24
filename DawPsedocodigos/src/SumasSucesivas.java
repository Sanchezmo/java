
public class SumasSucesivas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b,suma=0;
		System.out.println ("Introduce a y b");
		a=LeerTeclado.readInteger();
		b=LeerTeclado.readInteger();
		for (int i=1;i<=b;i++)
		{
			suma+=a;
		}
		System.out.println (suma);
	}

}
