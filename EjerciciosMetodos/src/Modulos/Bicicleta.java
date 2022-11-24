package Modulos;

public class Bicicleta extends Vehiculo{
	private String sillin;
	private String luces;
	public Bicicleta(int ruedas,String tipo,int velocidad,String sillin, String luces) {
		super(ruedas,tipo,velocidad);
		this.luces=luces;
		this.sillin=sillin;
	}
	@Override
	public String toString() {
		return "Bicicleta [sillin=" + sillin + ", luces=" + luces + ", toString()=" + super.toString()
				+ ", getNumruedas()=" + getNumruedas() + ", getTipo()=" + getTipo() + ", getVelocidad()="
				+ getVelocidad() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public String getSillin() {
		return sillin;
	}
	public void setSillin(String sillin) {
		this.sillin = sillin;
	}
	public String getLuces() {
		return luces;
	}
	public void setLuces(String luces) {
		this.luces = luces;
	}

}
