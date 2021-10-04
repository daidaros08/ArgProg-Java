package bibliotecaSebas;

import java.util.Comparator;

public class OrdenadorTituloNormalizado implements Comparator<Libro> {

	@Override
	public int compare(Libro lib1, Libro lib2) {
		
		return lib1.getTituloNormalizado().compareTo(lib2.getTituloNormalizado());
	}

}
