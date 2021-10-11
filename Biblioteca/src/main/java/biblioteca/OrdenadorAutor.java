package biblioteca;

import java.util.Comparator;



public class OrdenadorAutor implements Comparator<Libro> {

	
	public int compare(Libro lib1, Libro lib2) {
	
		return lib1.getAutor().compareTo(lib2.getAutor());
	}

}