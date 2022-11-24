package es.susapablo;

import java.util.ArrayList;
import java.util.Iterator;

public class Empresa {
	private ArrayList<Vehiculo> parking= new ArrayList<Vehiculo>();
	

	
	
	public boolean alta_vehiculo(Vehiculo v) {
		return parking.add(v);
	}
	public boolean baja_vehiculo(String matricula) {
		boolean baja=false;
		Iterator<Vehiculo> pk = parking.iterator();
		while(pk.hasNext()) {
			Vehiculo v = pk.next();
			if(v.getMatricula().equals(matricula)) {
				parking.remove(v);
				baja=true;
				break;
			
			}
		}
		
		return baja;
	}
	public void listar_vehiculo() {
		Iterator<Vehiculo> pk = parking.iterator();
		while(pk.hasNext()) {
			Vehiculo v=pk.next();
			System.out.println(v);
		}
	}
	public void preciototal_vehiculo(int dias) {
		Iterator<Vehiculo> pk = parking.iterator();
		while(pk.hasNext()) {
			Vehiculo v=pk.next();
			System.out.println(v.calc_coste(dias));
		}
	}
	public void precio_vehiculo(String matricula,int dias) {
		Iterator<Vehiculo> pk = parking.iterator();
		while(pk.hasNext()) {
			Vehiculo v=pk.next();
			if(v.getMatricula().equals(matricula)) {
				System.out.println(v.calc_coste(dias));
				break;
			}
		}
	}
}
