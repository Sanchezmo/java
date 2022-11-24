
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este es mi primer programa
				/*eejkjkj
				 * kjljkl�
				 * kjklklj
				 */
				System.out.println("hola");
				System.out.println("este es mi primer programa");
				System.out.println("saludos");
				
				byte b=3;
				short s=45;
				int i=2222000;
				long lon=3333L;
				
				
				s=b; 
			//	b=s;
				b=(byte)s;
				
				i=b;
				i=s;
				b=(byte)i;
			//	i=lon;
				lon=i;
				
				
				
				System.out.println("b:" + b);
				
				double nota=7.5;
				float nota1=6.5F;
				
				nota=b;
				
				
				
				boolean swEncontrado=false;
				swEncontrado=true;
				
				
				String nombre="Pepe";
				
				final double PI=3.14;
				//PI=1.9;
				
				
				
				int suma=15, cont=2;
				double suma2=15;
				double media;
				
				media=suma/cont;
				
				System.out.println("media "+media);
				
				media=suma2/cont;
				
				System.out.println("media "+media);
				
				
				int suma3=15, cont3=2;
				double media3, media2,media1;
				
				media1=(double)suma3/cont3;
				System.out.println("media 1 "+media1);
				
				media2=(double)(suma3/cont3);
				System.out.println("media 2 "+media2);
				
				media3=suma3/(double)cont3;
				System.out.println("media 3 "+media3);
				
				
				char letra1='a';
				
				char letra2='b';
				
				System.out.println((int)letra1);
				int codigo=(int)letra1;
				
				codigo=codigo+2;
				letra2=(char)codigo;
				System.out.println(letra2);
				
				int num1=5, num2=3;
				int result=num1+num2;
				System.out.println("la suma de "+num1+ " y "+num2+ " es "+ result);
				
				result=num1-num2;
				System.out.println("la resta de "+num1+ " y "+num2+ " es "+ result);
				
				result=num1*num2;
				System.out.println("el producto de "+num1+ " y "+num2+ " es "+ result);
				
				result=num1/num2;
				
				System.out.println("la division entera de "+num1+ " y "+num2+ " es "+ result);
				
				result=num1%num2;
				
				System.out.println("el resto de la division entera de "+num1+ " y "+num2+ " es "+ result);
				
				double result2=Math.pow(num1, num2);
				System.out.println("el resultado de elevar "+num1+ " a "+num2+ " es "+ result2);
				
				result2=Math.sqrt(num1);
				System.out.println("la raizm de "+num1+  " es "+ result2);
				
				int max=Integer.MIN_VALUE;
				int min=Integer.MAX_VALUE;
				
				int z=3;
				int w=++z + ++z + --z ;
				System.out.println("INcrementos Z "+w);
				
				
				
				
				

			

	}

}
