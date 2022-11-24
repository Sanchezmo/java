
public class Titular {
private String nombre;
private String apellido;
private String domicilio;
private String fn;

public Titular(String nombre,String apellido,String domicilio,String fn) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.domicilio=domicilio;
	this.fn=fn;
}
public void setNombre(String nombre){
	this.nombre=nombre;
}
public void setApellido(String apellido){
	this.apellido=apellido;
}
public void setDomicilio(String domicilio){
	this.domicilio=domicilio;
}
public void setFn(String fn){
	this.fn=fn;
}
public String getNombre(){
	return this.nombre;
}
public String getApellido(){
	return this.apellido;
}
public String getDomicilio(){
	return this.domicilio;
}
public String getFn(){
	return this.fn;
}
public String toString(){
	return "El titular "+this.nombre+" "+this.apellido+" "+this.domicilio+" "+this.fn;
}
}
