package ClasesObjetos;

public class Rectangulo {
private Punto a;
private Punto b;

public Rectangulo(Punto a,Punto b) {
	this.a=a;
	this.b=b;
}
public Rectangulo() {
	Punto a = new Punto(0,0);
	Punto b = new Punto(1,1);
	this.a=a;
	this.b=b;
}
public Rectangulo(Punto a,double ancho,double alto) {
	this.a=a;
	Punto b=new Punto(a.getX()+alto,a.getY()+alto);
	this.b=b;
}
//getters and setters
public Punto getA() {
	return a;
}
public void setA(Punto a) {
	this.a = a;
}
public Punto getB() {
	return b;
}
public void setB(Punto b) {
	this.b = b;
}
//metodos especiales
public static String visualizarRect(Rectangulo rct) {
	Punto a=rct.getA();
	Punto b=rct.getB();
	
	double x1=a.getX();
	double x2=b.getX();
	double y1=a.getY();
	double y2=b.getY();
	
	
	
	String puntoA="("+x1+","+y1+")";
	String puntoB="("+x2+","+y2+")";
	String puntoC="("+y2+","+x1+")";
	String puntoD="("+x1+","+y2+")";
	
	return puntoA+puntoB+puntoC+puntoD;
}
public static double baseRect(Punto a,Punto b) {
	double x1=a.getX();
	//double x2=b.getX();
	double y1=a.getY();
	double y2=b.getY();
	Punto c =new Punto(x1,y1+y2);
	//Punto d =new Punto(x1+x2,y1);
	double base=0;
	base=a.distancia(c);
	return base;
}
public static double alturaRect(Punto a,Punto b) {
	double x1=a.getX();
	double x2=b.getX();
	double y1=a.getY();
	//double y2=b.getY();
	//Punto c =new Punto(x1,y1+y2);
	Punto d =new Punto(x1+x2,y1);
	double altura=0;
	altura=a.distancia(d);
	return altura;
}
public static double areaRect(Punto a, Punto b) {
	
	double base=Rectangulo.baseRect(a, b);
	double altura=Rectangulo.alturaRect(a, b);
	double area=base*altura;
	return area;
}
public static double perimetroRect(Punto a,Punto b) {
	double base=Rectangulo.baseRect(a, b);
	double altura=Rectangulo.alturaRect(a, b);
	double perimetro=2*altura+2*base;
	return perimetro;
}

}
