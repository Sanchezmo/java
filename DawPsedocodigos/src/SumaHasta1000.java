
public class SumaHasta1000 {

	public static void main(String[] args) {
		int n, suma=0;
		while (suma<1000)
		{ 	System.out.println ("Introduce nº hasta que su suma sea superior a 1000");
			n=LeerTeclado.readInteger();
			suma+=n;
		}
		System.out.println ("la suma ha sido "+suma);


	}

}
