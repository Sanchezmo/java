
public class Multiplos3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Introduce un numero");
		int n=LeerTeclado.readInteger();
		System.out.println("Los multiplos de 3 hasta "+n);
		for (int i=0; i<=n; i=i+3)
			System.out.println (i);

	}

}
