import java.util.Scanner;

public class Consola {
	Scanner sc = new Scanner(System.in);
	public  double pedirDatoDouble(String pregunta) {
		System.out.println(pregunta);
		double valor =sc.nextDouble(); 
		
		return valor;
	}
	
	public  int pedirDatoInt(String pregunta) {
		System.out.println(pregunta);
		int valor =sc.nextInt(); 
		
		return valor;
	}
	public boolean sonIguales(int num1, int num2) {
		boolean iguales = true;
		if (num1!=num2) {
			iguales = false;
		}
		
		
		return iguales;
	}
	public boolean sonIgualesCadena(String cad1, String cad2) {
		boolean iguales= false;
		if (cad1.equals(cad2)) {
			iguales= true;
		}
			
		
		return iguales;
	}
	public String pedirDato(String llamada) {
		
		System.out.println(llamada);
		 
		return llamada;
	}
	public String pedirCosa(String llamada) {
		System.out.println(llamada);
		String call = sc.next();
		return call;
	
	}
	

	
public  int pedirDatoIntnumero(String pregunta) {
		
		boolean control=false;
		int  valor=0 ;
		 
		do {
			System.out.println(pregunta);
			String numero = sc.next();
			 try {
				 valor = Integer.parseInt(numero);
				 if(control= false ) {
					 //return valor;
					 break;
				 }
			 }catch (Exception e) {
			// TODO: handle exceptio
				 System.out.println("Numero incorrecto");
				 control =true;
			 }
		}while(control);
		return valor;
	}

	public  double pedirDatodoublenumero(String pregunta) {
	
		boolean control=false;
	
		double valor=0; 
		do {
			System.out.println(pregunta);
			String numero = sc.next();
			
			 try {
				 valor = Double.parseDouble(numero);
				 
				 if(control= false ) {
					 //return valor;
					 break;
				 }
			 }catch (Exception e) {
			// TODO: handle exceptio
				 System.out.println("Numero incorrecto");
				 control =true;
			 }
		}while(control);
		return valor;
}
}