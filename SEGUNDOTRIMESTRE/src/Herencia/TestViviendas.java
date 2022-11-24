package Herencia;

public class TestViviendas {

	public static void main(String[] args) {
		Vivienda v1=new Vivienda(2,50,"calle pepita",3);
		Chalet chalet1=new Chalet(6,300,"calle chalet",32,500,true);
		Chalet chalet2=new Chalet(7,350,"calle chalet2",33,500,false);
		Palacio palacio=new Palacio(1000,"calle palacio",42,true);
		
		Vivienda[] arrayVivienda = {v1,chalet1,chalet2,palacio};
		
		for(int i=0;i<arrayVivienda.length;i++) {
			System.out.println(arrayVivienda[i]);
		}
		int contador=0;
		for(int i=0;i<arrayVivienda.length;i++) {
			if(arrayVivienda[i] instanceof Chalet) {
				contador++;
			}
		}
		System.out.println("El numero de chalets es "+contador);
		

	}

}
