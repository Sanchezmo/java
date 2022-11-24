
public class DiaLaborable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int dia;
		System.out.println ("Introduce un dia de 1 a 7");
		dia=LeerTeclado.readInteger();
		
		switch (dia){
			case 1 :case 2: case 3: case 4: case 5: {System.out.println ("Dia laborable");
													break;}
			case 6: case 7: {System.out.println ("Dia festivo");
							break;}
			default: System.out.println ("El dia debe estar comprendido entre 1 y 7");
		}
	}

}
