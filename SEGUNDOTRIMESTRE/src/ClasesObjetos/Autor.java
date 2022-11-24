package ClasesObjetos;

public class Autor {
	
	private String nombre;
	private String nacionalidad;
	private int fn;
	private int defuncion;
	
public Autor(String nombre,String nacionalidad,int fn) {
	this.nombre=nombre;
	this.nacionalidad=nacionalidad;
	this.fn=fn;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getNacionalidad() {
	return nacionalidad;
}

public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}

public int getFn() {
	return fn;
}

public void setFn(int fn) {
	this.fn = fn;
}

public int getDefuncion() {
	return defuncion;
}
public void fallecer(int defuncion) {
	this.defuncion=defuncion;
}
@Override
public String toString() {
	return "Autor [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", fn=" + fn + ", defuncion=" + defuncion
			+ "]";
}
}
