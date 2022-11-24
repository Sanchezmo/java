package ClasesObjetos;

public class TestPartido {
private Jugador j1;
private Jugador j2;
private Partido pt;
public TestPartido(Jugador j1, Jugador j2, Partido pt) {
	this.j1 = j1;
	this.j2 = j2;
	this.pt = pt;
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
public Partido getPt() {
	return pt;
}
public void setPt(Partido pt) {
	this.pt = pt;
}


}
