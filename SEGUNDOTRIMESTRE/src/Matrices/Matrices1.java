package Matrices;

public class Matrices1 {
	public static int[][] m=new int[5][5];
	public static void main(String[] args) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]=i+j;
			}
		}
		verMatrizInt(m);
		
	}
	public static void verMatrizInt(int[][] m){
		for(int i=0;i<m.length;i++) {
			System.out.println("");
			for(int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j]+","); ;
			}
		}
	}

}
