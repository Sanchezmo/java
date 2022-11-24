package ClasesObjetos;

public class TrianguloEquilatero {
	
	private double lado;

	public TrianguloEquilatero(double lado) {
		
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getAltura() {
		double h=0;
		h=Math.sqrt((this.lado*this.lado)-((this.lado/2)*(this.lado/2)));
		return h;	
	}
	public double getArea() {
		double a=0;
		a=(this.lado*this.getAltura())/2;
		return a;
	}
	public double getPerimetro() {
		double p=0;
		p=this.lado*3;
		return p;
	}

	@Override
	public String toString() {
		return "TrianguloEquilatero [lado=" + lado + "]";
	}
}
