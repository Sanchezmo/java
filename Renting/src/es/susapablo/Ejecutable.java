package es.susapablo;

public class Ejecutable {
private static Empresa[] renting= new Empresa[3]; 
	public static void main(String[] args) {
		alta_empresa(0);
		alta_empresa(1);
		alta_empresa(2);
		
		alta_vehiculo_empresa(0,new Coche("z2222", 5));
	
		listar_vehiculos(0);
		listar_precios(0, 1);//listado todos los precios de todos los vehiculos para 1 dia.
		listar_precio_vehiculo(0, "2222JDT", 10);//precio vehiculo concreto.
		
		baja_vehiculo_empresa(0, "2222JDT");
		
		
		
		
		

	}
private static void alta_empresa(int id) {
	renting[id] = new Empresa();
}
private static boolean alta_vehiculo_empresa(int id,Vehiculo v) {
	renting[id].alta_vehiculo(v);
	if(renting[id].alta_vehiculo(v)==true) {
		System.out.println("el veliculo se ha dado de alta");
	}
	return renting[id].alta_vehiculo(v);
		
}
private static boolean baja_vehiculo_empresa(int id,String matricula) {
	renting[id].baja_vehiculo(matricula);
	boolean control=false;
	if(renting[id].baja_vehiculo(matricula)==true) {
		control=true;
		System.out.println("vehiculo dado de baja"); 
		}else {
		System.out.println("vehiculo NO dado de baja");	
		}
	return control;	
		
}
private static void listar_vehiculos(int id) {
	 renting[id].listar_vehiculo();
}
private static void listar_precio_vehiculo(int id,String matricula,int dias ) {
	 renting[id].precio_vehiculo(matricula, dias);
}
private static void listar_precios(int id,int dias ) {
	 renting[id].preciototal_vehiculo(dias);
}
}