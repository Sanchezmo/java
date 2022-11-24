package Examen2ev;

import java.util.Arrays;

public class Equipo {
	private static int codigo;
	private String nombre;
	private Jugador[] arrayJugador=new Jugador[10];
	private int presupuesto;
	private double puntuacion;
	private Entrenador entrenador;
	private static int num;
	
	public Equipo(String nombre, Jugador[] arrayJugador, double puntuacion, Entrenador entrenador) {
		super();
		this.nombre = nombre+(num++);
		this.arrayJugador = arrayJugador;
		this.presupuesto = (int)(Math.random()*10000+2000);
		this.puntuacion = puntuacion;
		this.entrenador = entrenador;
	}

	public static int getCodigo() {
		return codigo;
	}

	public static void setCodigo(int codigo) {
		Equipo.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Jugador[] getArrayJugador() {
		return arrayJugador;
	}

	public void setArrayJugador(Jugador[] arrayJugador) {
		this.arrayJugador = arrayJugador;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Equipo.num = num;
	}

	public String listarEquipoCoste() {
		int total=0;
		Jugador[] equipo =this.getArrayJugador();
		for(int i=0;i<equipo.length;i++) {
			total+=equipo[i].getPrecioContrato();
		}
		return "Equipo [nombre=" + nombre + ", arrayJugador=" + Arrays.toString(arrayJugador) + ", presupuesto="
				+ presupuesto + ", puntuacion=" + puntuacion + ", entrenador=" + entrenador + "]"+" total coste "+total;
	}

}
