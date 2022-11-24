
public abstract class Cuenta {
protected Titular titular; 
protected String numcuenta;
protected double saldo;

public Cuenta(String nombre,String apellido,String domicilio,String fn,String numcuenta,double saldo) { 
	this.titular=new Titular(nombre, apellido, domicilio, fn);
	this.numcuenta=numcuenta;
	this.saldo=saldo;
}
//cuenta con saldo inicial
public Cuenta(String nombre,String apellido,String domicilio,String fn,String numcuenta) { 
	this.titular=new Titular(nombre, apellido, domicilio, fn);
	this.numcuenta=numcuenta;
	this.saldo=15.3;
}


public void setNumcuenta(String nuncuenta)
{
	this.numcuenta=nuncuenta;
}
public void setSaldo(double saldo) {
	this.saldo=saldo;
}
public  String getNumcuenta() {
	return this.numcuenta;
}
public  double getSaldo() {
	return this.saldo;
}
public Titular getTitular() {
	return this.titular;
}
public String toString() {
	return "El titular "+this.titular+" Nº Cuenta"+this.numcuenta+" s: "+this.saldo+" $";
}
 public void ingresar(double increso) {
	 this.saldo+=increso;
 }
 public void retirar(double retiro) {
	 this.saldo-=retiro;
 }
 public boolean equals(Object o) {
	 //va ahcer downcasting
	 Cuenta c= (Cuenta)o;
	if(this.numcuenta.equals(c.getNumcuenta())) 
	 return true;
	else
	 return false;
	 
 }
 
}
