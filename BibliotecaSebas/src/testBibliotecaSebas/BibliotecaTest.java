package testBibliotecaSebas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.Map;

import org.junit.Before;
import bibliotecaSebas.BibliotecaSebas;
import bibliotecaSebas.Genero;
import bibliotecaSebas.Libro;

class BibliotecaTest {
	BibliotecaSebas biblioteca;

	@Before
	public void setUp() {
		biblioteca = new BibliotecaSebas();
		Libro l1 = new Libro("Homero", "Odisea", 447, 1982, Genero.EPICA);
		Libro l2 = new Libro("Gabriel Garcia Marquez", "Ojos de PerroAzul", 133, 1974, Genero.CUENTO);
		Libro l3 = new Libro("Sarmiento", "Facundo", 96, 1993, Genero.ENSAYO);
		Libro l4 = new Libro("Homero", "Iliada", 584, 2006, Genero.EPICA);
		Libro l5 = new Libro("Miguel de Cervantes", "Don Quijote de la Mancha", 1249, 2004, Genero.NOVELA);
		Libro l6 = new Libro("Jorge Luis Borges", "Cervantes y el Quijote", 178, 2005, Genero.ENSAYO);
		Libro l7 = new Libro("Jorge Luis Borges", "Nueve Ensayos Dantescos", 161, 1982, Genero.ENSAYO);
		Libro l8 = new Libro("Varios", "Antologia Literaria", 102, 2009, Genero.ANTOLOGIA);
		Libro l9 = new Libro("Herman Mellville", "Moby Dick 1", 416, 2008, Genero.NOVELA);
		Libro l10 = new Libro("Herman Mellville", "Moby Dick 2", 419, 2008, Genero.NOVELA);
		Libro l11 = new Libro("Varios", "Los Diez Mandamientos", 151, 1966, Genero.ANTOLOGIA);
		Libro l12 = new Libro("Carmen Naranjo", "Memoria de un Hombre Palabra", 137, 1978, Genero.NOVELA);
		Libro l13 = new Libro("Federico Garcia Lorca", "La zapatera prodigiosa", 117, 1944, Genero.TEATRO);
		Libro l14 = new Libro("Oscar Wilde", "De Profundis", 153, 2010, Genero.ENSAYO);
		Libro l15 = new Libro("Carlos Castaneda", "El conocimiento silencioso", 358, 2008, Genero.BIOGRAFIA);
		Libro l16 = new Libro("Juan Gelman", "De atrasalante en su porfia", 163, 2012, Genero.POESIA);
		Libro l17 = new Libro("Virgilio", "La Eneida", 350, 2007, Genero.EPICA);
		Libro l18 = new Libro("Charles Baudelaire", "Flores del Mal", 192, 2007, Genero.POESIA);
		Libro l19 = new Libro("Ray Bradbury", "Fahrenheit 451", 175, 2012, Genero.NOVELA);
		Libro l20 = new Libro("Ernest Hemingway", "Relatos", 436, 1965, Genero.CUENTO);
		Libro l21 = new Libro("Diego Golombek", "El nuevo cocinero cientifico", 238, 2007, Genero.CIENCIA);
		Libro l22 = new Libro("Oscar Wilde", "El retraro de Dorian Grey", 60, 1993, Genero.CUENTO);
		Libro l23 = new Libro("Edgar Allan Poe", "El gato negro y otros cuentos", 190, 2005, Genero.CUENTO);
		Libro l24 = new Libro("Roberto Arlt", "Los siete locos", 254, 2014, Genero.NOVELA);
		Libro l25 = new Libro("Edgar Allan Poe", "Cuentos Completos", 845, 2015, Genero.CUENTO);
		Libro l26 = new Libro("Desconocido", "La Biblia", 563, 1992, Genero.RELIGION);
		Libro l27 = new Libro("Tikal Editorial", "Observar el cielo", 240, 2010, Genero.CIENCIA);
		Libro l28 = new Libro("George Orwell", "1984", 186, 1954, Genero.NOVELA);
		Libro l29 = new Libro("George Orwell", "Los desplazados", 186, 1955, Genero.NOVELA);
		Libro l30 = new Libro("Aldous Huxley", "Las puertas de la percepcion", 77, 2000, Genero.CIENCIA);

		biblioteca.agregarLibro(l1);
		biblioteca.agregarLibro(l2);
		biblioteca.agregarLibro(l3);
		biblioteca.agregarLibro(l4);
		biblioteca.agregarLibro(l5);
		biblioteca.agregarLibro(l6);
		biblioteca.agregarLibro(l7);
		biblioteca.agregarLibro(l8);
		biblioteca.agregarLibro(l9);
		biblioteca.agregarLibro(l10);
		biblioteca.agregarLibro(l11);
		biblioteca.agregarLibro(l12);
		biblioteca.agregarLibro(l13);
		biblioteca.agregarLibro(l14);
		biblioteca.agregarLibro(l15);
		biblioteca.agregarLibro(l16);
		biblioteca.agregarLibro(l17);
		biblioteca.agregarLibro(l18);
		biblioteca.agregarLibro(l19);
		biblioteca.agregarLibro(l20);
		biblioteca.agregarLibro(l21);
		biblioteca.agregarLibro(l22);
		biblioteca.agregarLibro(l23);
		biblioteca.agregarLibro(l24);
		biblioteca.agregarLibro(l25);
		biblioteca.agregarLibro(l26);
		biblioteca.agregarLibro(l27);
		biblioteca.agregarLibro(l28);
		biblioteca.agregarLibro(l29);
		biblioteca.agregarLibro(l30);

	}

	@Test
	void testOrdenPaginas() {
		this.setUp();
		biblioteca.ordenarLibrosPorPaginas();
		// Don quijote tiene 1249 paginas, es el mas largo por lo que deberia estar en
		// el indice 0
		assertEquals("Don Quijote de la Mancha", biblioteca.getLibro().get(0).getTitulo());

	}

	@Test
	public void testOrdenApellidoAutor() {
		this.setUp();
		biblioteca.ordenarLibrosPorAutor();
		// Aldous Huxley es el primero alfabeticamente por lo que deberia estar en el
		// indice 0
		assertEquals("Aldous Huxley", biblioteca.getLibro().get(0).getAutor());
	}

	@Test
	public void testOrdenTitulo() {
		this.setUp();
		biblioteca.ordenarLibrosporTitulo();
		// 1984 es el primer titulo alfabetico (al ser titulo compuesto por numero) por
		// lo que deberia ir en indice 0
		assertEquals("1984", biblioteca.getLibro().get(0).getTitulo());
		// Antologia literaria es el primer titulo alfabetico, va en indice 1
		assertEquals("Antologia Literaria", biblioteca.getLibro().get(1).getTitulo());

		/*
		 * for (int i=1; i<biblioteca.getLibro().size()+1;i++) { System.out.println(i +
		 * ") " +biblioteca.getLibro().get(i-1).getTitulo()); }
		 */
	}

	@Test
	public void testOrdenTituloNormalizado() {
		this.setUp();
		biblioteca.ordenarLibrosPorTituloNormalizado();
		for (int i = 1; i < biblioteca.getLibro().size() + 1; i++) {
			System.out.println(i + ") " + biblioteca.getLibro().get(i - 1).getTituloNormalizado());
		}

	}

	public void testOrdenAnio() {
		this.setUp();
		biblioteca.ordenarLibrosPorAnio();
		// la zapatera prodigiosa es el libro mas viejo por lo que deberia estar en el
		// indice 0
		assertEquals("La zapatera prodigiosa", biblioteca.getLibro().get(0).getTitulo());

	}

	public void testLibroRepetido() {
		this.setUp();
		// Estos dos ya estan en la biblioteca
		Libro repetido1 = new Libro("George Orwell", "Los desplazados", 186, 1955, Genero.NOVELA);
		Libro repetido2 = new Libro("Herman Mellville", "Moby Dick 1", 416, 2008, Genero.NOVELA);

		// Estos dos no estan en la biblioteca
		Libro noRepetido1 = new Libro("Dante Alighieri", "La Divina Comedia", 463, 2008, Genero.POESIA);
		Libro noRepetido2 = new Libro("Charles Baudelaire", "Pequeños poemas en prosa", 128, 2015, Genero.POESIA);

		assertTrue(biblioteca.esLibroRepetido(repetido1));
		assertTrue(biblioteca.esLibroRepetido(repetido2));
		assertFalse(biblioteca.esLibroRepetido(noRepetido1));
		assertFalse(biblioteca.esLibroRepetido(noRepetido2));

	}

	public void librosPorGeneroTest() {
		System.out.println(biblioteca.librosPorGenero(Genero.CUENTO));
		System.out.println(biblioteca.librosPorGenero(Genero.ENSAYO));
		System.out.println(biblioteca.librosPorGenero(Genero.NOVELA));
		System.out.println(biblioteca.librosPorGenero(Genero.ANTOLOGIA));
		System.out.println(biblioteca.librosPorGenero(Genero.CIENCIA));
		System.out.println(biblioteca.librosPorGenero(Genero.TEATRO));
		System.out.println(biblioteca.librosPorGenero(Genero.BIOGRAFIA));
		System.out.println(biblioteca.librosPorGenero(Genero.POESIA));
		System.out.println(biblioteca.librosPorGenero(Genero.RELIGION));
		System.out.println(biblioteca.librosPorGenero(Genero.POLITICA));
		System.out.println(biblioteca.librosPorGenero(Genero.EPICA));
		
		System.out.println(biblioteca.contarLibrosPorGenero());

	}

}
