package Arrays;

public class Array6 {
	public static int[] nun =new int[30];
	public static void main(String[] args) {
		for(int i=0;i<nun.length;i++) {
			nun[i]=(int)(Math.random()*50+1);
		}
		Array1.verArray(nun);
		nun=modificarArray(nun);
		Array1.verArray(nun);
		Array1.verArray(modificarArray(nun));
	}
	public static int[] modificarArray(int[] a) {
		int[] b= new int[a.length];
		b[0]=a[a.length-1];
		for(int i=1;i<(a.length-1);i++) {
			b[i]=a[i-1];
		}
		b[a.length-1]=a[a.length-2];
		return b;
	}

}
