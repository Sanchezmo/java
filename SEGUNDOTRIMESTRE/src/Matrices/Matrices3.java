package Matrices;

public class Matrices3 {
	public static int[][]m=new int[10][10];
	public static void main(String[] args) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]=(int)(Math.random()*9+1);
			}
		}
		
		Matrices1.verMatrizInt(m);
		System.out.println("");
		System.out.println("Sumemos las filas por las columnas");
		sumarFxC(m);
		Matrices1.verMatrizInt(m);
	}
	public static void sumarFxC(int[][]m) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]+=m[j][i];
			}        
		}
	}

}
