package Herencia2;

public class PrincipalEmpleado {

	public static void main(String[] args) {
		
		
		EmpleadoFijo e1=new EmpleadoFijo("Maria","22222222F","640404020",1400.0);
		EmpleadoFijo e2=new EmpleadoFijo("Manuel","33323333H","636565021",1200.0);
		
		EmpleadoEventual e3=new EmpleadoEventual("Juan","50212845E","915082020",6.0,80);
		EmpleadoEventual e4=new EmpleadoEventual("Cristina","50255500G","620201213",7.5,60);
		
		Empleado[] oficina = {e1,e2,e3,e4};
		
		for(int i=0;i<oficina.length;i++) {
			System.out.println(oficina[i].getNombre()+" su "+oficina[i].calcularSalario());
		}
		
	}

}

