package Examen2ev;

public class Liga {
	private Equipo[] equipos=new Equipo[10];

	public Liga(Equipo[] equipos) {
		super();
		this.equipos = equipos;
	}

	public Equipo[] getEquipos() {
		return equipos;
	}

	public void setEquipos(Equipo[] equipos) {
		this.equipos = equipos;
	}
	public void cambiarJugador(String j1,String equiporingen,String equipodestino) {
	
		
		Jugador[] arrayJugador1=eq1.getArrayJugador();
		Jugador[] arrayJugador2=eq2.getArrayJugador();
		for(int i=0;i<arrayJugador1.length;i++) {
			if(j1.equals(arrayJugador1[i])) {
				arrayJugador1[i]=j2;
			}
		}
		for(int i=0;i<arrayJugador2.length;i++) {
			if(j2.equals(arrayJugador1[i])) {
				arrayJugador2[i]=j1;
			}
		}
		
	
	}
}
