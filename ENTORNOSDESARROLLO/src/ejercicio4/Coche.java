package ejercicio4;

public class Coche {
	private int numeroBastidor;
	
	private Motor data = new Motor();

	private Rueda []posicion;
	private Chasis chasis;
	
	
	public Coche(){
		posicion=new Rueda[4];
	}
	public Coche(int numeroBastidor, Chasis chasis, Rueda rueda){
		this.numeroBastidor=numeroBastidor;
		this.chasis=chasis;
		posicion=new Rueda[4];
		for(int i=0;i<posicion.length;i++)
			posicion[i]=rueda;
	}
	
	public Coche(int numeroBastidor, int cilindrada, int potencia,
			double consumo, Rueda[] posicion, Chasis chasis) {
		this.numeroBastidor = numeroBastidor;
		this.data.setCilindrada(cilindrada);
		this.data.setPotencia(potencia);
		this.data.setConsumo(consumo);
		this.posicion = posicion;
		this.chasis = chasis;
	}
	public int getNumeroBastidor() {
		return numeroBastidor;
	}
	public void setNumeroBastidor(int numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}
	public int getCilindrada() {
		return data.getCilindrada();
	}
	public void setCilindrada(int cilindrada) {
		this.data.setCilindrada(cilindrada);
	}
	public int getPotencia() {
		return data.getPotencia();
	}
	public void setPotencia(int potencia) {
		this.data.setPotencia(potencia);
	}
	public double getConsumo() {
		return data.getConsumo();
	}
	public void setConsumo(double consumo) {
		this.data.setConsumo(consumo);
	}
	public Rueda[] getPosicion() {
		return posicion;
	}
	public void setPosicion(Rueda[] posicion) {
		this.posicion = posicion;
	}
	public Chasis getChasis() {
		return chasis;
	}
	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}
	public void ponerChasis(Chasis chasis){
		this.chasis=chasis;
	}
	public void ponerRueda(Rueda rueda){
		for(int i=0;i<posicion.length;i++)
			this.posicion[i]=rueda;
	}
	public int getnumeroBastidor(){
		return numeroBastidor;
	}
	public String toString(){
		String salida="DATOS DEL COCHE\n";
		salida+="-----------------\n";
		salida+="numero de bastidor: "+numeroBastidor + "\n";
		salida+=chasis.toString() + "\n";
		for(int i=0;i<posicion.length;i++)
		salida+=posicion[i].toString() +"\n";
		return salida;
	}
}
