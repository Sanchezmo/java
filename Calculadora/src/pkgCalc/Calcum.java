package pkgCalc;

import java.util.ArrayList;



public class Calcum {
	private double num1;
	private double num2;
	
	private String[] check;
	private String[] resultado2;
	private ArrayList<String> resultado= new ArrayList<String>();
	
	
	
	
	public ArrayList<String> getResultado() {
		return resultado;
	}
	public void setResultado(ArrayList<String> resultado) {
		this.resultado = resultado;
	}
	
	public String[] getResultado2() {
		return resultado2;
	}
	public void setResultado2(String[] resultado2) {
		this.resultado2 = resultado2;
	}
	
	public String[] getCheck() {
		return check;
	}
	public void setCheck(String[] check) {
		this.check = check;
	}
	
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double getsuma(double num1,double num2) {
		return num1+num2;
	}
	public double getresta(double num1,double num2) {
		if(num1>num2)
		return num1-num2;
		else
		return num2-num1;
	}
	public double getdivision(double num1,double num2) {
		double div=0;
		if(num2!=0) {  
			div= num1/num2;
			}
		return div;
	}
	public double getmultiplica(double num1,double num2) {
		return num1*num2;
	}
	
	
	
	public ArrayList<String> getoperacion1() {
		
		for(int i=0;i<check.length;i++) {
			if(check[i].equals("suma")) {
				resultado.add("suma:<p>"+getsuma(num1,num2)+"</p>");			
			} if(check[i].equals("resta")) {
				resultado.add("resta:<p>"+getresta(num1,num2)+"</p>");
			} if(check[i].equals("divide")) {
				resultado.add("div:<p>"+getdivision(num1,num2)+"</p>");
			} if(check[i].equals("multiplica")) {
				resultado.add("mul:<p>"+getmultiplica(num1,num2)+"</p>");
			}
		
		}
		return resultado;
	}
	public String[] getoperacion2() {
		
		try {
			resultado2=new String[check.length];
		} catch (Exception e) {
			resultado2=new String[1];
			resultado2[0]="no has selecionado nada";
			return resultado2;
		}
	
		for(int i=0;i<check.length;i++) {
			if(check[i].equals("suma")) {
				resultado2[i]="suma:<p>"+getsuma(num1,num2)+"</p>";
			} if(check[i].equals("resta")) {
				resultado2[i]="resta:<p>"+getresta(num1,num2)+"</p>";
			} if(check[i].equals("divide")) {
				resultado2[i]="div:<p>"+getdivision(num1,num2)+"</p>";;
			} if(check[i].equals("multiplica")) {
				resultado2[i]="mul:<p>"+getmultiplica(num1,num2)+"</p>";
			}
		
		}
		return resultado2;
	}
}
