package interfaces;

public class EjecutableInterfaz {

	public static void main(String[] args) {
		ListArray arrayprueba= new ListArray (5); 
		System.out.println("Introducimos elemento al principio:");
		arrayprueba.addFirst(1); 
		System.out.println(arrayprueba.toString());
		System.out.println("eliminar primer elemento");
		arrayprueba.removeFirst();
		System.out.println(arrayprueba.toString()+"deberia salir vacio");
		arrayprueba.addFirst(3);
		System.out.println(arrayprueba.toString());
		arrayprueba.addFirst(5);
		System.out.println(arrayprueba.toString());
		System.out.println("Introducimos elemento al final:");
		arrayprueba.addLast(7);
		System.out.println(arrayprueba.toString());
		arrayprueba.addLast(2);
		System.out.println(arrayprueba.toString());
		System.out.println("Introducimos elemento al final");
		arrayprueba.addLast(1);
		System.out.println(arrayprueba.toString());
		System.out.println("Introducimos elemento al principio");
		arrayprueba.addFirst(6);
		System.out.println(arrayprueba.toString());
		System.out.println("El primero es "+arrayprueba.getFirst());
		System.out.println("El ultimo es "+arrayprueba.getLast());
		System.out.println("El elemento 3 est� en la posici�n: "+arrayprueba.getIndexOf(3));
		System.out.println("El elemento 5 est� en la posici�n: "+arrayprueba.getIndexOf(5));
		System.out.println("El elemento 7 est� en la posici�n: "+arrayprueba.getIndexOf(7));
		System.out.println("Borramos el primer elemento");
		arrayprueba.removeFirst();
		System.out.println(arrayprueba.toString());
		System.out.println("Borramos el �ltimo");
		arrayprueba.removeLast();
		System.out.println(arrayprueba.toString());
		System.out.println("Introducimos el 5 en la posici�n 1:");
		arrayprueba.insertAt(1, 5);
		System.out.println(arrayprueba.toString());
		System.out.println("Borramos todos los 3");
		arrayprueba.removeAll(3);
		System.out.println(arrayprueba.toString());

	}

}
