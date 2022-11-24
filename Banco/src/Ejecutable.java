
public class Ejecutable {

	public static void main(String[] args) {
		
			//creo banquero
			Banquero ba=new Banquero("tioSam");
			// creo cuentas 
			CuentaAhorro cah=new CuentaAhorro("Pablo", "Sanchez", "calle s/n", "12/05/1987", "ES1000");
			CuentaCorriente cca=new CuentaCorriente("Eva", "Sanchez", "calle s/n", "25/01/1990", "ES1001");
			//ingreso en cuentas ya existentes de 20.0$
			ba.Ingresar(cah, 20.0);
			ba.Ingresar(cca, 20.0);
			
			System.out.println("Comprobamos que se ha ingresado \n"+cah);
			//retirada de 10$ en cuentas existentes
			ba.Retirar(cah, 10.0);
			ba.Retirar(cca, 10.0);
			System.out.println("Comprobamos que se ha retirado \n"+cah);
			
			System.out.println("¿son iguales las cuentas?: "+cca.equals(cah));
			
			//banquero imprime informacion de cuentas
			ba.Imprimir(cca);
			ba.Imprimir(cah);
			
			//fin programa
			
			
	}
	

}
