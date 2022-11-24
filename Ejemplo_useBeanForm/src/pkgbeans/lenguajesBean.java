package pkgbeans;

public class lenguajesBean {
	
	private String nombre;
	private String lenguaje;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLenguaje() {
		return lenguaje;
	}
	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	
	public String getcometariosLenguaje()
	{
		if(lenguaje.equals("Java"))
			return "El rey de los lenguajes Orientados a Objetos";
		else if(lenguaje.equals("C++"))
			return"Demasiado Complejo";
		else
			return " Ese lenguaje no lo he utilizado";
	}

}

