package ejercicio4;

public class Chasis {
	private double peso;
	//tipo enumerado con unos valores predefinidos
	enum Color{Azul, Rojo, Negro, Amarillo, Rosita} ;
	private Color color;
	
	public Chasis(){
		peso=50;
		color=Color.Rosita;
	}
	public Chasis(double peso, Color color){
		this.peso=peso;
		this.color=color;
	}
	public String toString(){
		String salida="DATOS DEL CHASIS\n";
		salida+="-----------------\n";
		salida+="Peso= " + peso + "\n";
		salida+="Color= " + color +"\n";
		return salida;
	}
}
