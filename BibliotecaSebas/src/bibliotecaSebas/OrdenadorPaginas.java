package bibliotecaSebas;

import java.util.Comparator;

public class OrdenadorPaginas implements Comparator<Libro> {
	@Override
	public int compare(Libro lib1,Libro lib2) {
		return Integer.compare(lib1.getPaginas(),lib2.getPaginas());
	}

}
