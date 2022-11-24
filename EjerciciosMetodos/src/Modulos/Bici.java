package Modulos;

public class Bici {
private String modelo;
private int numserie;
private String dueno;
private String direc;

public Bici(String modelo,int numero,String duena,String calle) {
	this.modelo=modelo;
	this.numserie=numero;
	this.dueno=duena;
	this.direc=calle;
}
public Bici(String modelo,String duena,String calle) {
	this.numserie=130;
	this.modelo=modelo;
	this.dueno=duena;
	this.direc=calle;
}
public Bici(String duena,String calle) {
	this.numserie=140;
	this.dueno=duena;
	this.direc=calle;
	this.modelo="electrica";
	
}

@Override
public String toString() {
	return "Bici nuestra en su atributo modelo es:" + modelo + ",en su numserie es:" + numserie + ", dueno=" + dueno + ", direc=" + direc + "]";
}
public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public int getNumserie() {
	return numserie;
}

public void setNumserie(int numserie) {
	this.numserie = numserie;
}

public String getDueno() {
	return dueno;
}

public void setDueno(String dueno) {
	this.dueno = dueno;
}

public String getDirec() {
	return direc;
}

public void setDirec(String direc) {
	this.direc = direc;
}
}
