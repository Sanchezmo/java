
public class NumerosAmigos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n,m,sumaN=0,sumaM=0;
		System.out.println("Introduce dos nº");
		n=LeerTeclado.readInteger();
		m=LeerTeclado.readInteger();
		for (int i=1;i<=n/2;i++)
			if (n%i==0)
				sumaN+=i; 
		for (int i=1;i<=m/2;i++)
			if (m%i==0)
				sumaM+=i; 
		if (n==sumaM && m==sumaN)
			System.out.println ("ambos numeros son amigos");
		else
			System.out.println("los numeros no son amigos");

	}

}
