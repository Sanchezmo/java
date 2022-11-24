package ejercicio4bis;

public class Fabrica {
	private String nombreFabrica;
	private Coche[]coches;

	public Fabrica(){
		nombreFabrica=null;
		coches=new Coche[100];
	}
	public void setNombreFabrica(String nombreFabrica){
		this.nombreFabrica=nombreFabrica;
	}
	public boolean colocarCoche(Coche coche){
		boolean libre=false;
		for(int i=0;i<coches.length;i++){
			if(coches[i]==null){
				coches[i]=coche;
				libre=true;
				break;
			}
		}
		return libre;
	}
	public Coche buscarCoche(int numeroBastidor){
		Coche coche=new Coche();
		for(int i=0;i<coches.length;i++){
			if(coches[i].getnumeroBastidor()==numeroBastidor){
				coche=coches[i];
				break;
			}
		}
		return coche;
	}
	public String getnombreFabrica(){
		return nombreFabrica;
	}
}
