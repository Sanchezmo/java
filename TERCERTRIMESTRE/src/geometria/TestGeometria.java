package geometria;

import Herencia2.Figura;
import Herencia2.Circulo;
import Herencia2.Rectangulo;

public class TestGeometria {

	public static void main(String[] args) {
		
		Geometria [] Geo=new Geometria[3];
		
		Figura f1 = new Circulo("Rojo",5);
		Figura f2= new Rectangulo("Azul",4,8,15);
		Casa c1=new Casa("Magallanes",4,180.13,160);
		
		Geo[0]=f1;
		Geo[1]=f2;
		Geo[2]=c1;
		
		for (int i = 0; i < Geo.length; i++) {
			
			System.out.println("El área del "+Geo[i].getClass().getName()+" es: "+Geo[i].calcArea());
			System.out.println("y su perímetro es: "+Geo[i].calcPerimetro());
			System.out.println();
			
		}
		
		
		
	}

}