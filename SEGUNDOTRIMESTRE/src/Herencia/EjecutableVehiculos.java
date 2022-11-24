package Herencia;

public class EjecutableVehiculos {

	public static void main(String[] args) {
		Vehiculo v1=new Vehiculo("Seat","M1212UF",4,100);
		Coches coche =new Coches("Seat","6743KDS",600,"Azul",5,true);
		Camiones camion1=new Camiones("Pegaso","4848LJL",8,900,12000,500,"Manolo");
		Camiones camion2=new Camiones("Mercedes","3030HKL",10,950,24000,10500,"Juan");
		
		//probamos metodos, en vehiculo no se puede pintar porque ese metodo es propio de coche
		
		coche.pintar("Rojo");
		camion1.Cargar(5000);
		camion2.descargar(40000);
		
		
		System.out.println(v1);
		System.out.println(coche.listar());
		System.out.println(camion1.listar());
		System.out.println(camion2.listar());
	}

}
