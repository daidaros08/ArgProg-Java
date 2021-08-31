package vehiculo;

public class Autobus extends Vehiculo {
	public Persona listaPasajeros[] = new Persona[20];
	private Persona pasajero;
	private int cantidadPasajeros;

	public Autobus(Persona chofer) {
		super(chofer);
		this.cantidadPasajeros = 0;

	}

	public void agregarPasajero(Persona pasajero) {
		this.listaPasajeros[this.cantidadPasajeros] = pasajero;
		this.cantidadPasajeros++;
	}

	public Persona[] getListaPasajeros() {
		return this.listaPasajeros;
	}

	public int getCantidadPasajeros() {
		return this.cantidadPasajeros;
	}

	@Override
	public void cambiarChofer(Persona chofer) {
		if (this.cantidadPasajeros == 0) {
			this.setChofer(chofer);
		}
		throw new Error("No se puede cambiar de chofer, hay pasajeros");

	}

	public static void main(String[] args) {
		Autobus auto1 = new Autobus(new Persona("Carlos"));
		// System.out.println(auto1.cantidadPasajeros);
		// System.out.println(auto1.getChofer());
		Persona pasajero2 = new Persona("Jose");
		Persona pasajero3 = new Persona("Marcos");
		Persona pasajero4 = new Persona("Emilia");
		auto1.agregarPasajero(new Persona("Carla"));
		auto1.agregarPasajero(pasajero2);
		auto1.agregarPasajero(pasajero3);
		auto1.agregarPasajero(pasajero4);
		System.out.println(auto1.getCantidadPasajeros());
		System.out.println(auto1.getListaPasajeros()[2].getNombre());
		auto1.cambiarChofer(new Persona ("Sebas"));


	}
}
