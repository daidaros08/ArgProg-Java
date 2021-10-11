package biblioteca;

import java.util.Comparator;



public class OrdenadorAnioPublicacion implements Comparator<Libro> {

	
	public int compare(Libro lib1, Libro lib2) {
		
		return Integer.compare(lib1.getAnioPublicacion(), lib2.getAnioPublicacion());
	}

}
