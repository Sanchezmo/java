package Herencia2;

public class PrincipalSorteo {

	public static void main(String[] args) {
		Dado s1= new Dado(6);
		Moneda s2=new Moneda(2);
		Carta s3=new Carta(40);
		
		System.out.println(s1.lanzar());
		System.out.println(s2.lanzar());
		System.out.println(s3.lanzar());
		
		System.out.println(s1.verDatos());
		System.out.println(s2.verDatos());
		System.out.println(s3.verDatos());
		
		

	}

}
