package ClasesObjetos;

public class Libros {
private String isbn;
private String titulo;
private boolean prestado;
private Autor autor;
public Libros(String isbn, String titulo, Autor autor) {
	this.prestado=false;
	this.isbn = isbn;
	this.titulo = titulo;
	this.autor = autor;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public boolean isPrestado() {
	return prestado;
}
public void setPrestado(boolean prestado) {
	this.prestado = prestado;
}

public Autor getAutor() {
	return autor;
}
public void setAutor(Autor autor) {
	this.autor = autor;
}
//metodos especiales
public static String prestarLibro(Libros libro) {
	if(libro.isPrestado()==true) {
		return "Libro No disponible, ya está prestado";
	}else {
		libro.setPrestado(true);
	return "Libro Disponible, se lo presto";
	}
}
public static String devolverLibro(Libros libro) {
	if(libro.isPrestado()==true) {
		libro.setPrestado(false);
		return "Libro devuelto, lo recupero";
	}else {
		
	return "Libro Disponible en biblioteca, imposible devolución";
	}
}
@Override
public String toString() {
	return "Libros [isbn=" + isbn + ", titulo=" + titulo + ", prestado=" + prestado + ", autor=" + autor + "]";
}

}
