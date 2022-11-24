package ClasesObjetos;

public class Punto {
private double x;
private double y;

public Punto(double x,double y) {
	this.x=x;
	this.y=y;
}

public double getX() {
	return x;
}

public void setX(double x) {
	this.x = x;
}

public double getY() {
	return y;
}

public void setY(double y) {
	this.y = y;
}
//metodos especiales

public double distancia(Punto p1) {
	double x1=p1.getX();
	double y2=p1.getY();
	double distancia=0;
	distancia=Math.sqrt(((x1-this.x)*(x1-this.x))+((y2-this.y)*(y2-this.y)));
	return distancia;
}
public void desplazar(double a,double b) {
	this.x=this.x+a;
	this.y=this.y+b;
	
}

}
