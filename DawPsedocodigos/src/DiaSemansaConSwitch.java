import java.util.Scanner;

public class DiaSemansaConSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int dia;
		System.out.println ("Introduce un dia de 1 a 7");
		//dia=LeerTeclado.readInteger();
		dia=entrada.nextInt();
		
		switch (dia){
			case 1: {System.out.println ("Lunes");
					break;}
			case 2: {System.out.println ("Martes");
					break;}
			case 3: {System.out.println ("Miercoles");
					break;}
			case 4: {System.out.println ("Jueves");
					break;}
			case 5: {System.out.println ("Viernes");
					break;}
			case 6: {System.out.println ("Sabado");
					break;}
			case 7: {System.out.println ("Domingo");
					break;}
			default: System.out.println ("El dia debe estar comprendido entre 1 y 7");
					
		}	
		entrada.close();
	}
}

		 
