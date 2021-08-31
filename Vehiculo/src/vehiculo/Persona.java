package vehiculo;

public class Persona {
	private String nombre;

	public Persona(String nombre) {
		this.setNombre(nombre);
	}
	public Persona () {
		this (" ");
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

}
