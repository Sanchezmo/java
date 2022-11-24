
public class Par {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=4;
		int n=LeerTeclado.readInteger();
		if (n%2==0)
			System.out.println("El número "+n +" es par");
		else
			System.out.println("El número "+n +" es impar");
	}

}
