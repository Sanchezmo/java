package ArrayObj;

import java.util.Scanner;

public class ArrayObj1 {

	public static void main(String[] args) {
		//creo array objetos y lo lleno de objetos alumno
		Alumno[] alumno=new Alumno[30];
		
		for(int i=0;i<alumno.length;i++) {
			int codigo=i+1;
			int no=(int)(Math.random()*100);
			String nombre="Alumno_"+no;
			double nota=Math.random()*11;
			
			alumno[i]=new Alumno(codigo,nombre,nota);
		}
		//visualizar aprobados
		System.out.println("visualizar aprobados");
		for(int i=0;i<alumno.length;i++) {
			if(alumno[i].getNota()>=5) {
				System.out.println(alumno[i].toString()+" Esta aprobado");
			}
		}
		// dado un codigo alumno, visualizar nota
		System.out.println("Escriba codigo alumno");
		Scanner entrada=new Scanner(System.in);
		int codint=entrada.nextInt();
		
		System.out.println(alumno[codint-1].getNota());
		
		//dado nombre alumno, visualizar nota
		System.out.println("Escriba el nombre en este formato: Alumno_NUMERO");
		String nombra=entrada.next();
		for(int i=0;i<alumno.length;i++) {
			if(alumno[i].getNombre().equalsIgnoreCase(nombra)) {
				System.out.println("El alumno "+alumno[i].getNombre()+" tiene de nota "+alumno[i].getNota());
				break;
			}
		}
		//dada una nota visualizar alumnos con igual o superior
		System.out.println("Escriba nota formato: 0,0 a 10,0");
		double noto=entrada.nextDouble();
		for(int i=0;i<alumno.length;i++) {
			if(alumno[i].getNota()>=noto) {
				System.out.println(alumno[i].getNombre()+" Nota: "+alumno[i].getNota());
			}
		}
		entrada.close();
	}

}
