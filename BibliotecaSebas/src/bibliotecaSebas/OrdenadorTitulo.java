package bibliotecaSebas;

import java.util.Comparator;

public class OrdenadorTitulo implements Comparator<Libro> {

	@Override
	public int compare(Libro lib1, Libro lib2) {

		return lib1.getTitulo().compareTo(lib2.getTitulo());
	}

}
