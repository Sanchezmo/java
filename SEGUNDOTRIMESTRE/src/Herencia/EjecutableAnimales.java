package Herencia;

public class EjecutableAnimales {

	public static void main(String[] args) {
		Animal rana = new Animal("ranita","anfibius bulgaris" ,0.25,5);
		Mamifero ballena=new Mamifero("ballena","cetaceus",1000.0,600,3,12);
		MamiferoTerrestre perro=new MamiferoTerrestre("Rotteweiler","canino",100.0,55,4,3,4);
		Ave avestruz=new Ave("Avestruz","pollo gigante",250.0,200,2,false);
		Ave paloma=new Ave("Paloma","Rata voladora",0.75,30.0,3,true);
		
		//visualiza objetos
		System.out.println(rana);
		System.out.println(ballena);
		System.out.println(perro);
		System.out.println(avestruz);
		System.out.println(paloma);
		
		//camnbia peso rana
		rana.setPeso(0.30);
		
		//peso ballena
		ballena.setPeso(2000.0);
		
		//huevos paloma
		paloma.setNumHuevos(4);
		
		//tamañoPerro 10%
		perro.setPeso(perro.getPeso()+perro.getPeso()*10/100);
		
		//meses embarazo ballena
		ballena.setMesesEmbarazo(14);
		//No se puede cambiar los meses de embarazo de Rana porque no es un atributo de su clase Animal.
		//visualizamos 
		System.out.println(rana);
		System.out.println(ballena);
		System.out.println(perro);
		System.out.println(avestruz);
		System.out.println(paloma);
	}
}
