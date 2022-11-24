
public class MenuEjerc43 {

	public static void main(String[] args) {
		int a,b,opcion;
		System.out.println("Introduce dos números para operar con ellos");
		
		System.out.println("Introduce a");
		a=LeerTeclado.readInteger();
		
		System.out.println("Introduce b");
		b=LeerTeclado.readInteger();
		
		do {
			System.out.println();
			System.out.println("Elige la operación");
			System.out.println("******************");
			System.out.println("1: Suma");
			System.out.println("2: Resta");
			System.out.println("3: Producto");
			System.out.println("4: División");
			System.out.println("5: Fin");
			System.out.println("******************");
			System.out.println();
			System.out.println("Introduce opción (1-5)");
			opcion=LeerTeclado.readInteger();
			
			switch (opcion) {
			case 1:
				System.out.println();
				System.out.println("El resultado de la suma es "+(a+b));
				break;
				
			case 2:
				System.out.println();
				System.out.println("El resultado de la resta es "+(a-b));
				break;
				
			case 3:
				System.out.println();
				System.out.println("El resultado del producto es "+(a*b));
				break;
				
			case 4:
				System.out.println();
				if (b!=0)
					System.out.println("El resultado de la division es "+((double)a/b));
				else System.out.println("Lo sentimos, no se puede dividir entre 0");
				break;
				
			case 5:
				System.out.println("Fin de programa ");
				break;

			default:
				System.out.println("Error en opción (1-5)");
				break;
			}
			
		}
		
		while (opcion!=5);
		
			
			

		

	}

}
