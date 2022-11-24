package objetosOrdenables;

public class Algoritmos {
	
	public static void  ordenar(Ordenable[] array){
		Ordenable aux;
		for (int i = 0; i < array.length-1; i++) {
			for(int j=i+1; j<array.length;j++){
				if(array[i].esMayor(array[j])){
					aux=array[i];
					array[i]=array[j];
					array[j]=aux;
				}
			}
		}
		
	}
	
	public static Ordenable maximo(Ordenable[] array){
		Ordenable max;
		max=array[0];
		for(int i=1; i<array.length;i++){
			if (array[i].esMayor(max))
					max=array[i];
		}
		return max;

	}
	
	public static Ordenable minimo (Ordenable[] array){
		Ordenable min;
		min=array[0];
		for(int i=1; i<array.length;i++){
			if (array[i].esMenor(min))
					min=array[i];
		}
		return min;

	}
}
