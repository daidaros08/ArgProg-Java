package bibliotecaSebas;

import java.util.Comparator;

public class OrdenadorAnioPublicacion implements Comparator<Libro> {

	@Override
	public int compare(Libro lib1, Libro lib2) {
		
		return Integer.compare(lib1.getAnioPublicacion(), lib2.getAnioPublicacion());
	}

}
