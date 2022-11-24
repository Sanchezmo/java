package ejercicio4bis;

import java.util.Scanner;

public class FactoriaCoches {
	public static void main(String[]args){
		Fabrica fabrica=new Fabrica();
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el nombre de la fabrica: ");
		String nombreFab=entrada.next();
		fabrica.setNombreFabrica(nombreFab);
		int contNumeroBastidor=1;
		for(int i=0;i<4;i++){
			System.out.println("Alta del coche "+ i);
			System.out.println("Introduce el radio de la rueda: ");
			double radio=entrada.nextDouble();
			//	System.out.println("Introduce el tipo de rueda: ");
			//Tipo tipoRueda=Tipo.seco;
			Rueda rueda=new Rueda(radio);
			Chasis chasis=new Chasis();
			Coche coche=new Coche(contNumeroBastidor,chasis,rueda);
			boolean colocado=fabrica.colocarCoche(coche);
				if(colocado)
					System.out.println(coche.toString());
				else
					System.out.println("Supera el limite de coches");
			contNumeroBastidor++;
		}
	
		System.out.println("Introduce el numero de bastidor: ");
		int n=entrada.nextInt();
		Coche cocheAux=fabrica.buscarCoche(n);
			if(cocheAux==null)
			System.out.println("El coche no existe");
			else
				System.out.println(cocheAux.toString());
		 
	}
}
