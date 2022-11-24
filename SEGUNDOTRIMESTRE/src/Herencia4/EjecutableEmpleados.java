package Herencia4;

public class EjecutableEmpleados {

	public static void main(String[] args) {
		
		Directivo d1=new Directivo("Juan Palomo", "50312838D", 12,3,2005,1000.0,1000.0);
		Oficial o1=new Oficial("Marco Polo","50432323H",13,3,2005,1000.0,"Juan Palomo",40.0);
		Tecnico t1=new Tecnico("Benito Camelo","50060045E",14,3,2005,1000.0,"Juan Palomo",50,"Marco Polo");
		
		Empleado[] empleados = {d1,o1,t1};
		
		int contempleados=0;
		int contecnicos=0;
		double totalsueldo=0;
		for(int i=0;i<empleados.length;i++) {
			contempleados++;
			if(empleados[i] instanceof Tecnico) {
				contecnicos++;
			}
		totalsueldo+=empleados[i].calcularSalario();
			if(empleados[i] instanceof Directivo) {
				System.out.println(empleados[i].toString());
			}
		}
		System.out.println("Total empleados: "+contempleados);
		System.out.println("Total tecnicos: "+contecnicos);
		System.out.println("Total sueldo empleados: "+totalsueldo);
	}

}
