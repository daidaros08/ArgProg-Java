package eraDeImperiosTest;

import eraDeImperios.UnidadAbstracta;
import eraDeImperios.Arquero;
import eraDeImperios.Soldado;
import eraDeImperios.Caballero;
import eraDeImperios.Posicion;
import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class EjercitosTest {
	Arquero Arquero1;
	Soldado Soldado1;
	Caballero Caballero1;

	@Before
	public void setUp() {
		Arquero1 = new Arquero(new Posicion(1, 1));
		Soldado1 = new Soldado(new Posicion(3, 3));
		Caballero1 = new Caballero(new Posicion(1, 1));
	}

	@Test
	public void Reiniciotest() {

		while (Arquero1.getFlechas() > 0) {

			Arquero1.atacar(Soldado1);
		}
		assertEquals(0, Arquero1.getFlechas());
		Caballero1.atacar(Arquero1);
		assertEquals (60, Arquero1.getSalud());
	}

}
