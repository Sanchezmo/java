1package ArrayObj;

import java.util.Scanner;

public class ArrayObj2 {

	public static void main(String[] args) {
		//construir la baraja
		Carta[][] baraja=new Carta[4][10];
		String[] palos= {"Oros","Copas","Espadas","Bastos"};
		String[] cartas= {"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Sota","Caballo","Rey"};
		double[] valor= {1,2,3,4,5,6,7,0.5,0.5,0.5};
		
		for(int i=0;i<baraja.length;i++) {
			for(int j=0;j<baraja[i].length;j++) {
				baraja[i][j]=new Carta(palos[i],cartas[j],valor[j],false);
			}
		}
		Scanner entrada=new Scanner(System.in);
		double valortotal=0;
		int mas=0;
		do {
		System.out.println("Haga juego, �Quiere Carta? SI[1] NO[0]");
		mas=entrada.nextInt();
		if(mas==1) {
			
			int rani=0;
			int ranj=0;
			do {
			rani=rani(rani);
			ranj=ranj(ranj);
				
				if(!(baraja[rani][ranj].isUso())) {
					valortotal+=baraja[rani][ranj].getValor();
					System.out.println("Su puntuaci�n "+valortotal+" "+baraja[rani][ranj].getNombre()+" "+baraja[rani][ranj].getPalo());
					
				}
			}while(baraja[rani][ranj].isUso());
			baraja[rani][ranj].setUso(true);
		}
		}while(mas==1&&valortotal<=7.5);
		
		if(valortotal>7.5){
			System.out.println("Has Perdido");
		}else {
			System.out.println("Te Plantaste, Turno de la Casa");
			double valortotalo=0;
			do {
				int rani=0;
				int ranj=0;
					do {
					rani=rani(rani);
					ranj=ranj(ranj);
						if(!(baraja[rani][ranj].isUso())) {
							valortotalo+=baraja[rani][ranj].getValor();
							System.out.println("La Casa saca Carta "+valortotalo+" "+baraja[rani][ranj].getNombre()+" "+baraja[rani][ranj].getPalo());	
						}
					}while(baraja[rani][ranj].isUso());
					baraja[rani][ranj].setUso(true);
				}while(valortotalo<=6);
			//Resultados
			if(valortotal>valortotalo&&valortotal<=7.5) {
				System.out.println("GANA JUGADOR");
			}else if(valortotalo>valortotal&&valortotalo<=7.5) {
				System.out.println("GANA LA CASA");
			}else if(valortotalo>7.5){
				System.out.println("PIERDE LA CASA");
			}else {
				System.out.println("EMPATE");
			}
		}
		entrada.close();
	}
	public static int rani(int rani) {
		 rani=(int)(Math.random()*4);
		return rani;
	}
	public static int ranj(int ranj) {
		 ranj=(int)(Math.random()*10);
		return ranj;
	}
}
