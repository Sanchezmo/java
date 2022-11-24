
public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(String nombre, String apellido, String domicilio, String fn, String numcuenta) {
		super(nombre, apellido, domicilio, fn, numcuenta);
	}
	public CuentaCorriente(String nombre,String apellido,String domicilio,String fn,String numcuenta,double saldo) {
		super(nombre,apellido,domicilio,fn,numcuenta,saldo);
	}
	public String toString() {
		return super.toString();
	}
}