package Arrays;

public class Array1 {
	public static int[] Ar1 =new int[10];
	public static int[] Ar2 =new int[10];
	
public static int[] sumarArray(int[] ar1,int[] ar2) {
	int[] ar3=new int[ar1.length];
	for(int i=0;i<ar1.length;i++) {
		ar3[i]=ar1[i]+ar2[i];
	}
	return ar3 ;
}
public static void verArray(int[] a) {
	System.out.println();
	for (int i=0; i<a.length; i++) {
		System.out.print(a[i]+ " ");
	}
	
}
	public static void main(String[] args) {
		for(int i=0;i<Ar1.length;i++) {
			Ar1[i]=(int)(Math.random()*10+1);
			Ar2[i]=(int)(Math.random()*10+1);
		}
		System.out.println("Array 1");
		verArray(Ar1);
		System.out.println("\n"+"Array 2");
		verArray(Ar2);
		System.out.println("\n"+"Suma Arrays 1 y 2");
		verArray(sumarArray(Ar1,Ar2));
		
	}

}
