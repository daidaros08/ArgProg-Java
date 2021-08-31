package ponyExpress;

public class Caballo {
	private String nombre;
	private int millasRecorridas;

	public Caballo(String nombre, int millas) {
		this.setNombre(nombre);
		this.setMillas(millas);
	}

	public Caballo(String nombre) {
		this(nombre, 0);
	}

	public Caballo(int millas) {
		this(" ", millas);
	}

	public Caballo() {
		this(" ", 0);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMillas(int millas) {
		this.millasRecorridas = millas;
	}

	public void agregarMillas(int millas) {
		this.millasRecorridas += millas;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getMillasRecorridas() {
		return this.millasRecorridas;
	}
}
