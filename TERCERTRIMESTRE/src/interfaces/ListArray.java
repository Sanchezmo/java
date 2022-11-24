package interfaces;

public class ListArray implements IArray {
	private int numElem;
	private int[] ints;
	
	public ListArray(int tamano) {
		ints = new int[tamano];
		numElem=0;
	}
	public int getSize() {
		
		return numElem;
	}
	
	public void addFirst(int elem) {
		if (getSize()==ints.length) {
			System.out.println("El array está lleno");
		}else {
			for (int i=getSize()-1; i>=0;i--) {
				ints[i+1]=ints[i];
				}
				ints[0]=elem;
				numElem++;
		}
	}

	
	public void addLast(int elem) {
		if (getSize()<ints.length) {
			ints[numElem]=elem;
			numElem++;
		}
		else 
			System.out.println("El array está lleno");

	}

	
	public void removeFirst() {
		if (isEmpty()) {
			System.out.println("El array está vacío");
		}else {
			for (int i=1; i<getSize(); i++) {
				ints[i-1]=ints[i];
			}
				ints[numElem-1]=0;
				numElem--;
		}	

	}

	
	public void removeLast() {
		if (!isEmpty()) {
			ints[numElem-1]=0;
			numElem--;
		}
		else 
			System.out.println("El array está vacío");

	}

	
	public void insertAt(int index, int elem) {
		if (getSize()==ints.length) {
			System.out.println("El array está lleno");
		}else if (index<0 || index>=ints.length) {
			System.out.println("El índice debe estar entre 0 y " + (ints.length-1));
		}else {
			for (int i=getSize()-1; i>=index;i--) { 
				ints[i+1]=ints[i];
			}
			ints[index]=elem;
			numElem++;
		}	

	}

	
	public boolean isEmpty() {
		
		return (numElem==0);
	}

	
	public boolean contains(int elem) {
		boolean control=false;
		for (int i=0; i<getSize();i++) {
			if(ints[i]==elem) {
				control= true;
			}else{
				control=false;
			}
		}
		return control;
		
	}

	
	public int getIndexOf(int elem) {
		/*int indexo=0;
		for (int i=0; i<getSize();i++) {
			if(ints[i]==elem) {
				indexo= i;
			}else {
				indexo= -1;
			}
		}
		return indexo;*/
		for (int i=0; i<getSize();i++)
			if(ints[i]==elem)
				return i;
		return -1;
	}

	
	public int getFirst() {
		
		if (!isEmpty()) {
			return ints[0];
		}else {
			return -1;
		}
	}

	
	public int getLast() {
		
		if (!isEmpty()) {
			return ints[getSize()-1];
		}else {
			return -1;
		}
	}

	
	public void removeAt(int index) {
		if (isEmpty()) {
			System.out.println("El array está vacío");
		}else {
			for (int i=index+1; i<getSize(); i++) {
				ints[i-1]=ints[i];
			}
				ints[getSize()-1]=0; 
				numElem--;
		}	

	}

	
	public void removeAll(int index) {
		if (isEmpty())
			System.out.println("El array está vacío");
		else 
			for (int i=0; i<getSize();i++) {
				if (ints[i]==index) {
					for (int j=i+1; j<getSize(); j++) 
						ints[j-1]=ints[j]; 
					ints[getSize()-1]=0; 
					numElem--;
					i--; 
					}		
			}		

	}
	public String toString() { 
		String contenido="";
		for (int i=0; i<getSize(); i++) {
			contenido+=ints[i]+" ";
		}
		return contenido;
	}
	
}
