package ejercicio4;

public class Rueda {
	private double radio;
	public enum Tipo {Seco,Mojado} ;
	public Tipo tipo;
	
	public Rueda(){
		radio=0.5;
		tipo=Tipo.Seco;
	}
	public Rueda(double radio){
		this.radio=radio;;
		tipo=Tipo.Seco;
	}
	
	public Rueda(double radio, Tipo tipo){
		this.radio=radio;
		this.tipo=tipo;
	}
	public void Tipo(Tipo tipo){
		
	}
	public String toString(){
		 String salida="DATOS DE LA RUEDA\n";
	        salida+="-------------\n";
	        salida+="Radio: "+radio+"\n";
	        salida+="Tipo rueda: "+tipo+"\n";
	        return salida;
	}

}