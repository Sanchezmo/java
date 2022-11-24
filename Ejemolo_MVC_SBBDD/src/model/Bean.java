package model;

public class Bean {
	
	private String nombre_profe;
	private String asignatura;
	public String getNombre_profe() {
		return nombre_profe;
	}
	public void setNombre_profe(String nombre_profe) {
		this.nombre_profe = nombre_profe;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	/*Metodo que contiene la logica;
	 * Metodo que se encargará de verificar si el profesor recogiso
	 * coincide con su asignatura
	 * arturo --> matematicas
	 * andres --> lenguaje
	 * antonio --> historia
	 * */
	public boolean comprobar()
	{
		if((this.nombre_profe.equals("arturo")
				&&this.asignatura.equals("matematicas"))
		||(this.nombre_profe.equals("andres")
				&&this.asignatura.equals("lengua"))
		||(this.nombre_profe.equals("antonio")
				&&this.asignatura.equals("historia")))
			return true;
		else
			return false;
	}
}







