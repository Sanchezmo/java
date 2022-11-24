package ClasesObjetos;

public class Posicion {
	
private int x,y;
//constructores
public Posicion() {
	this.x=0;
	this.y=0;
}
public Posicion(int x,int y) {
	this.x=x;
	this.y=y;
}
//getters 
public int getX() {
	return x;
}

public int getY() {
	return y;
}

//metodos especiales
public void setXY(int x,int y) {
	this.x=x;
	this.y=y;
}
public String getXY() {
	return "("+x+","+y+")";
}
public void decXY(int x,int y) {
	this.x=this.x-x;
	this.y=this.y-y;
}
public void incXY(int x,int y) {
	this.x=this.x+x;
	this.y=this.y+y;
}
public static String recta(Posicion p1, Posicion p2) {
	double m;

	if((p2.getX()-p1.getX())==0){
		m=0;
	}else {
	m=(p2.getY()-p1.getY())/(p2.getX()-p1.getX());
	}
	int y=p2.getY();
	int x=p2.getX();
	return "y-"+y+"="+m+"(x-"+x+")";
}
public static Posicion opuestoXY(Posicion p1) {
	int x=p1.getX();
	int y=p1.getY();
	Posicion px=new Posicion((-x),(-y));
	return px;
}
//sin ser static
public Posicion opoXY() {
	int x=this.getX();
	int y=this.getY();
	Posicion pxy=new Posicion(-x,-y);
	return pxy;
}
}
