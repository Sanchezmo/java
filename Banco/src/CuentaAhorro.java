
public class CuentaAhorro extends Cuenta {
		private double interes;
		
		
		
	public CuentaAhorro(String nombre,String apellido,String domicilio,String fn,String numcuenta,double saldo,double interes) {
	super(nombre,apellido,domicilio,fn,numcuenta,saldo);
	this.interes=interes;
	}
	
	//cuenta con interes por defecto
	
	public CuentaAhorro(String nombre,String apellido,String domicilio,String fn,String numcuenta,double saldo) {
		super(nombre,apellido,domicilio,fn,numcuenta,saldo);
		this.interes=2.5;
		}
	
	//cuenta con interes y saldo por defecto
	public CuentaAhorro(String nombre,String apellido,String domicilio,String fn,String numcuenta) {
		super(nombre,apellido,domicilio,fn,numcuenta);
		this.interes=2.5;
		
		}
	
	public  double getInteres() {
		return this.interes;
	}
	public void setInteres(double interes) {
		this.interes=interes;
	}
	
	public String toString() {
		return super.toString()+"\n Tiene un interes de: "+this.interes;
	}
}

