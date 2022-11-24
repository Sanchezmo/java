package Examen2ev;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Jugador j1=new Jugador("juan","palomo","lateral");
		Jugador j2=new Jugador("juan1","palomox","centro");
		Jugador j3=new Jugador("juan2","palomot","pibot");
		Jugador j4=new Jugador("juan3","palomho","defensa");
		Jugador j5=new Jugador("juan4","palomto","lateral");
		Jugador j6=new Jugador("juan5","palfomo","pibotl");
		Jugador j7=new Jugador("juan6","paldomo","defensa");
		Jugador j8=new Jugador("juan7","palomoll","lateral");
		Jugador j9=new Jugador("juan8","palomjjo","lateral");
		Jugador j10=new Jugador("juan9","palomfgo","lateral");
		
		Entrenador e1=new Entrenador("Zinedine","Zidane");
		
		Jugador[] equipo1= {j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};
		
		Equipo eq1=new Equipo("Real Madrid", equipo1, 0, e1);
		
		Jugador j11=new Jugador("juan","palomo","lateral");
		Jugador j22=new Jugador("juan1","palomox","centro");
		Jugador j33=new Jugador("juan2","palomot","pibot");
		Jugador j44=new Jugador("juan3","palomho","defensa");
		Jugador j55=new Jugador("juan4","palomto","lateral");
		Jugador j66=new Jugador("juan5","palfomo","pibotl");
		Jugador j77=new Jugador("juan6","paldomo","defensa");
		Jugador j88=new Jugador("juan7","palomoll","lateral");
		Jugador j99=new Jugador("juan8","palomjjo","lateral");
		Jugador j100=new Jugador("juan9","palomfgo","lateral");
		
		Entrenador e2=new Entrenador("Cholo","Simeone");
		
		Jugador[] equipo2={j11,j22,j33,j44,j55,j66,j77,j88,j99,j100};
		
		Equipo eq2=new Equipo("Atletico",equipo2,0,e2);
		
		Equipo[] liga = {eq1,eq2,eq1,eq2,eq1,eq2,eq1,eq2,eq1,eq2};
		Liga espanola=new Liga(liga);
		eq1.listarEquipoCoste();
		System.out.println("introduce codigo del equipo de origen y el codigo equipo destino y nombre de jugador");
		String codigo=entrada.next();
		//espanola.cambiarJugador(j100, eq1, j99, eq2);

	}

}
