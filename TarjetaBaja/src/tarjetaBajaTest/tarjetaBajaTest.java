package tarjetaBajaTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import tarjetaBaja.TarjetaBaja;

class tarjetaBajaTest {
	
	
	@Test
	void cargarSaldoTest() {
		TarjetaBaja tj1= new TarjetaBaja(000);
		tj1.cargarSaldo(500);
		assertEquals(500,tj1.obtenerSaldo(), 00.1);
	}
	
	@Test
	void viajarTest() {
		TarjetaBaja tj1= new TarjetaBaja(0);
		tj1.cargarSaldo(500);
		assertEquals(500,tj1.obtenerSaldo(), 00.1);
		tj1.pagarViajeEnColectivo();
		assertEquals(1,tj1.contarViajesEnColectivos());
		tj1.pagarViajeEnSubte();
		assertEquals(1,tj1.contarViajesEnSubte());
	}
	
	@Test
	void sinSaldoTest() {
		TarjetaBaja tj1= new TarjetaBaja(000);
		tj1.cargarSaldo(15);
		assertEquals(15,tj1.obtenerSaldo(), 00.1);
		tj1.pagarViajeEnColectivo();
	}

}
