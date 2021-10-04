package bibliotecaSebas;
import java.util.LinkedList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class BibliotecaSebas implements Cloneable {
	private LinkedList <Libro> libros;
	
	public BibliotecaSebas () {
		this.libros= new LinkedList <Libro>();
	}
	public LinkedList <Libro> getLibro(){
		return this.libros;
		
	}
	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}	
	public void ordenarLibrosPorAutor() {
		Collections.sort(this.libros, new OrdenadorAutor());
	}
	public void ordenarLibrosporTitulo() {
		Collections.sort(this.libros, new OrdenadorTitulo());
	}
	public void ordenarLibrosPorPaginas() {
		Collections.sort(this.libros, new OrdenadorPaginas());
	}
	public void ordenarLibrosPorTituloNormalizado(){
		Collections.sort(this.libros, new OrdenadorTituloNormalizado());
	}
	public void ordenarLibrosPorAnio(){
		Collections.sort(this.libros,new OrdenadorAnioPublicacion());
	}
	public boolean esLibroRepetido(Libro libro){
		return this.libros.contains(libro);
	}
	public Map<Genero,LinkedList<Libro>> librosPorGenero(Genero genero){
		Map <Genero,LinkedList<Libro>> librosPorGenero = new HashMap <Genero, LinkedList<Libro>>();
		for (Libro libro:this.libros) {
			Genero key=libro.getGenero();
			if (librosPorGenero.containsKey(key)) {
				librosPorGenero.get(key).add(libro);
			}
			else {
				LinkedList <Libro>nuevoLibro = new LinkedList<Libro>();
				nuevoLibro.add(libro);
				librosPorGenero.put(key, nuevoLibro);			}
		}
			
		
		return librosPorGenero;
	}
	public Map<Genero,Integer> contarLibrosPorGenero(){
		Map <Genero, Integer> librosPorGenero= new HashMap <Genero, Integer>();
		for (Libro libro:this.libros) {
			Genero key=libro.getGenero();
			if (librosPorGenero.containsKey(key)) {
				Integer value=librosPorGenero.get(key)+1;
				librosPorGenero.put(key, value);
			}
			else {
				librosPorGenero.put(key, 1);
			}
		}
		return librosPorGenero;
	}
}
