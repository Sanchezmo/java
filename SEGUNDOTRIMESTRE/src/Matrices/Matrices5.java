package Matrices;

public class Matrices5 {
	public static int[][] m=new int[30][5];
	public static void main(String[] args) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]=(int)(Math.random()*9+1);
			}
		}
		System.out.println("Cada fila contiene las 5 notas de cada asignatura para cada alumno 30 alumnos x 5 asignaturas");
		Matrices1.verMatrizInt(m);
		System.out.println("Nota Maxima: "+notaMax(m));
		System.out.println("Nota Media: "+notaMedia(m));
		System.out.println("Media por alumno");
		mediaAlumno(m);
		System.out.println("Media Asignatura");
		mediaAsignatura(m);
		
	}
	public static int notaMax(int[][]m) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(m[i][j]>max) {
					max=m[i][j];
				}
			}
		}
		return max;
	}
	public static double notaMedia(int[][]m) {
		double media=0;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				media+=m[i][j];
				}
			}
		return media/(m.length*m[0].length);
	}
	public static void mediaAlumno(int[][]m) {
		double[] m1=new double[m.length];
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m1[i]+=m[i][j];
				}
			}
		for(int i=0;i<m1.length;i++) {
			System.out.println("La media del alumno "+(i+1)+" es "+m1[i]/m[0].length);
		}
	}
	public static void mediaAsignatura(int[][]m) {
		int[][] m1=new int[m[0].length][m.length];
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m1[j][i]=m[i][j];

			}
		}
		double[] m2=new double[m[0].length];
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1[i].length;j++) {
				m2[i]+=m1[i][j];
				}
			}
		for(int i=0;i<m2.length;i++) {
			System.out.println("La media de la asignatura "+(i+1)+" es "+m2[i]/m1[0].length);
		}
	}

}
