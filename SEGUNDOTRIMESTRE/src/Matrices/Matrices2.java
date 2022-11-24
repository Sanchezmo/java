package Matrices;

public class Matrices2 {
	public static int[][] m=new int[5][5];
	public static void main(String[] args) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(i==j) {
					m[i][j]++;
				}
			}
		}
		Matrices1.verMatrizInt(m);
	}

}
