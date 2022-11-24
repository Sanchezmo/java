
public class SumaEntreNumeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println ("introduce dos nº");
		int n=LeerTeclado.readInteger();
		int m=LeerTeclado.readInteger();
		
		int suma=0, aux;
		if (n>m)//intercambio las variables
			{aux=n;
			n=m;
			m=aux;
			}
		for (int i=n;i<=m;i++)
			suma+=i;
		System.out.println ("la suma total de todos los nº comprendidos entre ambos es "+suma);
	}

}
