package ClasesObjetos;

public class Partido {
private Jugador j1;
private Jugador j2;
private Jugador ganador;
public Partido(Jugador j1, Jugador j2) {
	this.j1 = j1;
	this.j2 = j2;
	this.ganador=null;
}
public Jugador getJ1() {
	return j1;
}
public void setJ1(Jugador j1) {
	this.j1 = j1;
}
public Jugador getJ2() {
	return j2;
}
public void setJ2(Jugador j2) {
	this.j2 = j2;
}
public Jugador getGanador() {
	return ganador;
}
public void setGanador(Jugador ganador) {
	this.ganador = ganador;
}

@Override
public String toString() {
	return "Partido [j1=" + j1 + ", j2=" + j2 + ", ganador=" + ganador + "]";
}
//metodos especiales
public static Jugador ganador(Partido pt) {
	Jugador j1=pt.getJ1();
	Jugador j2=pt.getJ2();
	Jugador ganador=null;
	double ranking1=j1.getRanking();
	double ranking2=j2.getRanking();
	
	double resultado1= Math.random() * ranking1;
	double resultado2= Math.random() * ranking2;
	do {
	if(resultado1>resultado2) {
		ganador=j1;
	}else if(resultado2>resultado1) {
		ganador=j2;
	}else {
		resultado1= Math.random() * ranking1;
		resultado2= Math.random() * ranking2;
	}
	}while(resultado1==resultado2);
	
	return ganador;
}
public static String ganar(Jugador ganador) {
	double rankingg=ganador.getRanking();
	rankingg++;
	ganador.setRanking(rankingg);
	return "Ranking aumentado";
}


}
