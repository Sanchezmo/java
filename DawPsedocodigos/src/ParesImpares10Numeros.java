
public class ParesImpares10Numeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n, cPar=0,cImpar=0;
		
		 for (int i=1; i<=10; i++)
		 {
			 System.out.println("Introduzca un n�");
			 n=LeerTeclado.readInteger();
			 if (n%2==0)
				 cPar++;
			 else cImpar++;
		 }
		 System.out.println ("Hay "+cPar+" n�meros pares");
		 System.out.println ("Hay "+cImpar+" n�meros impares");
	}

}
