package Herencia3;

public class AplicacionLlamadas {

	public static void main(String[] args) {
		double costelocal=0.15;
		//franja horaria para provinciales puede ser 1,2 o 3
		LlamadaLocal l1=new LlamadaLocal("650545454","630304050",301.3,costelocal);
		LlamadaLocal l2=new LlamadaLocal("650545454","630304050",30.3,costelocal);
		LlamadaLocal l3=new LlamadaLocal("650545454","630304050",201.3,costelocal);
		LlamadaProvincial p1= new LlamadaProvincial("650545454","923454545",230.4,1);
		LlamadaProvincial p2= new LlamadaProvincial("650545454","923454545",230.4,2);
		LlamadaProvincial p3= new LlamadaProvincial("650545454","923454545",230.4,3);
		Llamada[] listaya= {l1,l2,l3,p1,p2,p3};
		Centralita ce=new Centralita(listaya);
		
		ce.Listar();
		System.out.println("Total llamadas: "+ce.totalLLamadas());
		System.out.println("Total factura: "+ce.factura()+"€");
		
		
	}

}
