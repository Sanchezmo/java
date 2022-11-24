import java.util.Scanner;

public class Media555Bis {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int n, suma, max, min, cont,ultimo=0, penultimo=0;
		int antiguoMax=0, antiguoMin=0, contMax=0, contMin=0;
		double media;
		suma=0;cont=0;
		max=Integer.MIN_VALUE;
		min=Integer.MAX_VALUE;
		System.out.println ("Introduce un nº, después de tres 5 seguidos se termina");
		//n=LeerTeclado.readInteger();
		n=entrada.nextInt();
		while (ultimo!=5||penultimo!=5||n!=5) // también while !(ultimo==5 && penultimo==5 && n==5)
		{
			
			suma+=n;
			cont++;
			if (n>max){				
				antiguoMax=max;
				max=n;
				contMax=1;
			}
				else if (n==max) contMax++;
			
			
				
			if (n<min){				
				antiguoMin=min;
				min=n;
				contMin=1;
			}
				else if (n==min) contMin++;
			
			penultimo=ultimo;
			ultimo=n;
						
			System.out.println ("Introduce un nº,después de tres 5 seguidos se termina");
			//n=LeerTeclado.readInteger();
			n=entrada.nextInt();
		}
		
		
		if (cont>3)
			{suma-=10; //restamos los dos ultimos 5	para que no intervengan en la suma
			cont-=2; //ídem, respecto a contador para que no cuente estos 2 últimos 5
			System.out.println ("la suma total es "+suma); 
			System.out.println("se han introducido "+cont+" numeros"); //restamos del contador 2 por los dos ultimos 5
			media=((double)suma/cont);//hago el casting de suma a double para que la division sea real y no entera.
			System.out.println("la media es "+media);
			//ahora hay que tener cuidado que no tome los 5 de fin de datos ni como mínimo ni como máximo
			//podría darse el caso si, por ejemplo, se teclea 3,2,1,5,5,5 (max=5)
			if (max!=5|| (max==5 && contMax>2))	//si el maximo no es 5 se imprime, también se imprime si es 5 pero ha aparecido más de dos veces 
				System.out.println("Maximo= "+max);
			else System.out.println("Maximo="+antiguoMax); //en caso contrario se coge el antiguo maximo
			//ídem mínimo
			if (min!=5 || (min==5 && contMin>2))
				System.out.println("Minimo= "+min);
			else
				System.out.println("Minimo"+antiguoMin);
			}
		
		else
			System.out.println ("Se han introducido solo los tres 5, la suma, la media, el  maximo y minimo son 0");

		
		entrada.close();
	}

}
