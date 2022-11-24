
public class Banquero {
private String nombre;

public Banquero(String nombre) {
	this.nombre=nombre;
}

public void Ingresar(Cuenta cuenta, double ingreso) {
	cuenta.ingresar(ingreso);
}
public void Retirar(Cuenta cuenta,double retirada) {
	cuenta.retirar(retirada);
}

public void Imprimir(Cuenta cuenta) {
	System.out.println(cuenta);
}
}
