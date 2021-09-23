package vehiculoTest;

import static org.junit.jupiter.api.Assertions.*;
import vehiculo.Autobus;
import vehiculo.Motocicleta;
import vehiculo.Persona;

import org.junit.jupiter.api.Test;

class vehiculosTest {

	@Test
	void motoTest() {
		Motocicleta moto1 = new Motocicleta (new Persona ("Jorge"));
		moto1.cambiarChofer(new Persona ("Ernesto"));
		moto1.agregarAcompaniante(new Persona ("Carlos"));
		moto1.getAcompaniante();
		moto1.cambiarChofer(new Persona ("Jose"));
		assertEquals ("Ernesto", moto1.getChofer ());
	}

}
