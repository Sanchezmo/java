
public class Factoriales1A10 {

	
	public static void main(String[] args) {

		int n, i, fact;
		for (n=0; n<=10; n++)
		{
			fact=1;
			for (i=1;i<=n;i++)
			{
				fact*=i;
			}
			System.out.println ("El factorial de "+n+ " es igual a "+fact);
		}
			

	}

}
