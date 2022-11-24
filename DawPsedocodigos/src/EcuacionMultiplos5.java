
public class EcuacionMultiplos5 {
	public static void main(String[] args) {
		
		double y1;
		for (int x=10;x<=75;x+=5){			
			y1=Math.pow(x,3)+5*Math.pow(x,2)-2*x;//la potencia se expresa con el metodo pow de la clase Math que devuelve double
			System.out.println("Para x= "+x+ " y = "+(int)y1);
		}
			

	}

}
