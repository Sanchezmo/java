
public class ProductoHasta100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double producto=0; //con int se produce desbordamiento
		for (int i=1; i<=100; i++)
			producto+=i;
		System.out.println("El producto es: "+producto);
	}

	}



