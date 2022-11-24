package Arrays2;

import java.util.Scanner;

public class ArraysP2E2 {
	
	public static Scanner entrada=new Scanner(System.in);
	
	public static void main(String[] args) {
	String[] dep= {"Informatica","Contabilidad","Recursos Humanos","Administracion","Gerencia","Atencion Publico","Publicidad","Mantenimiento"};
	String[] pre= {"80000","90000","70000","60000","50000","55000","65000","45000","40000"};
	String[] depo= dep.clone();//copia del array original para ordenarlo
	//ordenar array
			String aux="";
			for(int i=0;i<depo.length-1;i++) {
				for(int j=i+1;j<depo.length;j++) {
					if(dep[i].compareTo(depo[j])>depo[j].compareTo(depo[i])) {
						aux=depo[i];
						depo[i]=depo[j];
						depo[j]=aux;
					}
				}
			}
			System.out.println("");
			System.out.println("Array departamentos ordenado");
			for(int i=0;i<depo.length;i++) {
				System.out.print(depo[i]+" ");
			}
			//ordenar presupuestos, podría integrarse en el mismo for que ordenar array depo.
			String aux2="";
			for(int i=0;i<dep.length-1;i++) {
				for(int j=i+1;j<dep.length;j++)
				if(dep[i].equalsIgnoreCase(depo[j])) {
					aux2=pre[i];
					pre[i]=pre[j];
					pre[j]=aux2;
				}
			}
			System.out.println("");
			System.out.println("Array presupuestos ordenado");
			for(int i=0;i<depo.length;i++) {
				System.out.print(pre[i]+" ");
			}
			//busqueda dicotómica
			System.out.println("");
			System.out.println("Introduce departamento a buscar");
			String no=entrada.next();
			int posicions=0;
			int medio,inf,sup;
			inf=0;
			sup=dep.length-1;
			boolean find=false;
			do {
				medio=(inf+sup)/2;
				if(depo[medio].equalsIgnoreCase(no)) {
					find=true;
					posicions=medio;//hay fallo else if, ya lo corregiré no me da tiempo con la entrega
				}else if(depo[medio].compareToIgnoreCase(no)>no.compareTo(depo[medio])) {
					sup=medio-1;
				}else {
					inf=medio+1;
				}
			}while(!find && inf<=sup);
			if(find) {
				System.out.println("El presupuesto de "+depo[posicions]+" es "+pre[posicions]);
				System.out.println("");
			}else {
				System.out.println("NO está en el Array");
			}
	}

}
