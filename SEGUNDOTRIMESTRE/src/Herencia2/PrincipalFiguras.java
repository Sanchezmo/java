package Herencia2;

public class PrincipalFiguras {

	public static void main(String[] args) {
		//no se pueden hacer instancias de una clase abstracta
		
		Circulo f1=new Circulo("Azul",5.0);
		Triangulo f2=new Triangulo("Rojo",3,4,3);
		Rectangulo f3=new Rectangulo("Verde",4,5,4);
		Hexagono f4=new Hexagono("Amarillo",6,2,1.5);
		
		Figura[] figuras= {f1,f2,f3,f4};
		int contpoligono=0;
		int contrectangulo=0;
		for(int i=0;i<figuras.length;i++) {
			System.out.println(figuras[i].toString());
			if(figuras[i] instanceof Poligono ) {
				contpoligono++;
			}
			if(figuras[i] instanceof Rectangulo ) {
				contrectangulo++;
			}
		}
		System.out.println("Numero de Poligonos "+contpoligono);
		System.out.println("Numero de Rectangulos "+contrectangulo);

	}

}
