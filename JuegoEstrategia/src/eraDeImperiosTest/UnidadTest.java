package eraDeImperiosTest;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

import eraDeImperios.Posicion;
import eraDeImperios.Unidad;

public class UnidadTest {
	Unidad u1;
	Unidad u2;

	@Before
	public void setUp() {
		u1 = new Unidad(new Posicion(0, 0));
		u2 = new Unidad(new Posicion(1, 1));
		System.out.println("la salud es" + u1.getSalud());
		System.out.println("la otra salud es" + u2.getSalud());
	}

	@Test
	public void testDistancia() {
		assertEquals(Math.sqrt(2), u1.getdistanciaCon(u2), 0.001);

	}

	@Test
	public void testDaño() {
		for (int i = 1; i < 6; i++) {
			u1.atacar(u2);
			System.out.println(u2.getSalud());

		}

	}

}
