package Matrices;

public class Matrices4 {
	public static int[][]m=new int[3][5];
	public static void main(String[] args) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]=(int)(Math.random()*9+1);
			}
		}
		Matrices1.verMatrizInt(m);
		System.out.println("");
		System.out.println("Trasposicion de M");
		
		Matrices1.verMatrizInt(trasponerMatriz(m));

	}
	public static int[][] trasponerMatriz(int[][]m) {
		
		int[][] m1=new int[m[0].length][m.length];
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m1[j][i]=m[i][j];

			}
		}
		return m1;
	}

}
