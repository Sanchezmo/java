package ClasesObjetos;

public class Articulo {
	
private int codigo;
private static int cont=0;
private String Nombre;
private String color;
private double precio;



public Articulo(String nombre, String color, double precio) {
	this.codigo=cont++;
	Nombre = nombre;
	this.color = color;
	this.precio = precio;
}
public Articulo() {
	this.codigo=cont++;
	this.Nombre="Generico";
	this.color="Rojo";
	this.precio=1.0;
}
public Articulo(String Nombre,String color) {
	this.codigo=cont++;
	this.Nombre=Nombre;
	this.color=color;
	this.precio=1.0;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public int getCodigo() {
	return codigo;
}
public void incrementarPrecio(double precio) {
	this.precio=this.precio+precio;
}
public void rebajarPrecio() {
	this.precio=this.precio-(this.precio*0.1);
}
@Override
public String toString() {
	return "Articulo [codigo=" + codigo + ", Nombre=" + Nombre + ", color=" + color + ", precio=" + precio + "]";
}

}
