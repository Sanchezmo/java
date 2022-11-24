import java.util.Scanner;

public class DiaSemanaConIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int dia;
		System.out.println ("Introduce un dia de 1 a 7");
		//dia=LeerTeclado.readInteger();
		dia=entrada.nextInt();
		if (dia==1)
			System.out.println ("Lunes");
			else if (dia==2)
				System.out.println ("Martes");
				else if (dia==3)
					System.out.println ("Miercoles");
					else if (dia==4)
						System.out.println ("Jueves");
					else if (dia==5)
						System.out.println ("Viernes");
					else if (dia==6)
						System.out.println ("Sábado");
					else if (dia==7)
						System.out.println ("Domingo");
					else System.out.println ("El día debe estar comprendido entre 1 y 7");

		entrada.close();
	}

}
