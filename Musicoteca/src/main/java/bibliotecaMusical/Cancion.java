package bibliotecaMusical;

public class Cancion {
	private String autor;
	private String titulo;
	private int duracionSeg;
	private String generoMusical;
	
	public Cancion (String autor, String titulo, int duracion, String genero) {
		this.autor=autor;
		this.titulo=titulo;
		this.duracionSeg=duracion;
		this.generoMusical=genero;
	}
	@Override
	public String toString() {
		return "Titulo: "+ this.titulo + ", Autor: "+ this.autor + ", duracion: "+ this.duracionSeg + ", género: "+ this.generoMusical + "\n";
	}

}
