
public class Notas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int nota;
		String respuesta;
		do 
		{
			System.out.println ("Introduce una nota de 0 a 10");
			nota=LeerTeclado.readInteger();
			
			switch (nota)
			{
			case 0: case 1: case 2: {System.out.println ("Muy deficiente");break;}						
			case 3: case 4: {System.out.println ("Deficiente");break;}
			case 5: {System.out.println ("Suficente");break;}
			case 6: {System.out.println ("Bien");break;}
			case 7: case 8: {System.out.println ("Notable");break;}
			case 9: case 10: {System.out.println ("Sobresaliente");break;}
			default: System.out.println ("La nota debe estar comprendida entre 0 y 10");
			}
			do
				{System.out.println ("¿Desea repetirlo otra vez? (S/N)");
				respuesta=LeerTeclado.readString();}
			while (!respuesta.equals("s")&&!respuesta.equals("S")&&!respuesta.equals("n")&&!respuesta.equals("N") );
		}   
		
		while (respuesta.equals("s") || respuesta.equals("S"));
		
		   
		
			System.out.println("Fin de programa");
	}

}
