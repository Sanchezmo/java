package Herencia3;

public class Centralita {
	private Llamada[] llamadas;
	
	public Centralita(Llamada[] llamadas) {
		super();
		this.llamadas = llamadas;
	}
	public void Listar() {
		System.out.println("LISTA LLAMADAS:");
		for(int i=0;i<llamadas.length;i++) {
			System.out.println("Llamada "+(1+i)+": Origen:"+llamadas[i].getOrigen()+" Destino:"+llamadas[i].getDestino()+" Duración:"+llamadas[i].getDuracion()+"segundos.");
		}
		
	}
	public int totalLLamadas() {
		return this.llamadas.length;
	}
	public double factura() {
		double total=0;
		for(int i=0;i<llamadas.length;i++) {
			if(llamadas[i] instanceof LlamadaLocal) {
				LlamadaLocal l=(LlamadaLocal)llamadas[i];
				total+=llamadas[i].getDuracion()*l.getCoste();
			}
			if(llamadas[i] instanceof LlamadaProvincial) {
				LlamadaProvincial a=(LlamadaProvincial)llamadas[i];
					  if(a.getFranja()==1) {
				total+=llamadas[i].getDuracion()*0.20;
				}else if(a.getFranja()==2) {
					total+=llamadas[i].getDuracion()*0.25;	
				}else if(a.getFranja()==3) {
					total+=llamadas[i].getDuracion()*0.30;
				}
			}
			
		}
		return total;
	}
	
	
}
