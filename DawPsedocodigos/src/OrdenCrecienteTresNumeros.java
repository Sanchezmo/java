
public class OrdenCrecienteTresNumeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a,b,c,aux;
		
		System.out.println("introduce tres numeros, pueden ser desordenados");
		a=LeerTeclado.readInteger();
		b=LeerTeclado.readInteger();
		c=LeerTeclado.readInteger();
		boolean cambio=false;
		
		if (a>b)//cambio a y b, el menor de a y b esta en a
			{aux=a;
			a=b;
			b=aux;
			cambio=true;
			}
		if(a>c)//cambio a y c, el menor de a y c esta en a, por lo tanto, en a esta el mas pequeño
			{aux=a;
			a=c;
			c=aux;
			cambio=true;
			}
		if (b>c)//cambio b y c, el menor esta en b , luego en b esta el mediano y en c el mayor
			{aux=b;
			b=c;
			c=aux;
			cambio=true;
			}
		
		if (cambio) 
			System.out.println ("Los números no se han introducido en orden creciente");
			else 
				System.out.println ("Los números se han introducido en orden creciente");
		
		System.out.println ("los numeros en orden creciente son "+a+" "+b+" "+c);
		
		
		
		}
	}
