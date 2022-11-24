package geometria;

public class Casa implements Geometria{

	private String direccion;
	private int numHab;
	private double superficie;
	private double perimetro;

	public Casa(){

	}
	public Casa(String direccion,int numHab,double superficie,double perimetro){
		this.direccion=direccion;
		this.numHab=numHab;
		this.superficie=superficie;
		this.perimetro=perimetro;
	}



	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getNumHab() {
		return numHab;
	}
	
	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}
	
	public double getSuperficie() {
		return superficie;
	}
	
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	public double getPerímetro() {
		return perimetro;
	}
	
	public void setPerímetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public double calcArea() {
		
		return this.superficie;
	}

	public double calcPerimetro() {
		return this.perimetro;
	}
	@Override
	public String toString() {
		return "Casa [direccion=" + direccion + ", numHab=" + numHab + ", superficie=" + superficie + ", perímetro="
				+ perimetro + ", calcArea()=" + calcArea() + ", calcPerimetro()=" + calcPerimetro() + "]";
	}



}
