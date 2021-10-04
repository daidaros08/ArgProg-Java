package bibliotecaSebas;

public class Libro implements Cloneable, Comparable<Libro> {

	private String autor;
	private String titulo;
	private int cantPag;
	private int anioPublicacion;
	private Genero genero;
	private static final int LIMITE_TITULO = 200;

	public Libro(String autor, String titulo, int pags, int anio, Genero genero) {
		this.autor = autor;
		this.titulo = titulo;
		this.cantPag = pags;
		this.anioPublicacion = anio;
		this.genero = genero;
	}

	public String recortarTitulo() {
		if (this.titulo.length() >= Libro.LIMITE_TITULO) {
			return this.titulo.substring(0, Libro.LIMITE_TITULO);
		}
		return this.titulo;
	}

	public String getTituloNormalizado() {
		String tituloNorm;
		String[] tituloSeparado = this.titulo.split(" ");
		String art = tituloSeparado[0];
		String articulo = art.toLowerCase();

		if (articulo.equals("el") || articulo.equals("la") || articulo.equals("los") || articulo.equals("las")) {
			String tituloSinArt = this.getTitulo().substring(articulo.length());
			tituloNorm = tituloSinArt + ", " + articulo;
			return tituloNorm;
		}
		return this.getTitulo();
	}

	public int getPaginas() {
		return this.cantPag;
	}

	public String getAutor() {
		return this.autor;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public int getAnioPublicacion() {
		return this.anioPublicacion;
	}

	public Genero getGenero() {
		return this.genero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.autor + ", (" + this.anioPublicacion + ") ," + this.genero;
	}

	@Override
	public Libro clone() throws CloneNotSupportedException {
		return (Libro) super.clone();
	}

	@Override
	public int compareTo(Libro otroLibro) {
		if (this.titulo.compareTo(otroLibro.titulo) == 0) {
			return this.autor.compareTo(otroLibro.autor);
		}
		return this.titulo.compareTo(otroLibro.titulo);
	}

}
