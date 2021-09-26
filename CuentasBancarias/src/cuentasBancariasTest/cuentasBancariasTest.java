package cuentasBancariasTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import cuentasBancarias.Cuenta;
import cuentasBancarias.CuentaCorriente;
import cuentasBancarias.CuentaDeAhorro;

class cuentasBancariasTest {

	@Test
	void depositoYRetiroTest() {
		Cuenta c1 = new Cuenta();
		c1.depositar(1000);
		assertEquals(1000, c1.getSaldo(), 0.001);
		c1.retirar(550);
		assertEquals(450, c1.getSaldo(), 0.001);
	}

	@Test
	void extraerErrorTest() {
		Cuenta c1 = new Cuenta();
		c1.depositar(-200);
		assertEquals(0, c1.getSaldo(), 0.001);
		c1.retirar(100);
		assertEquals(0, c1.getSaldo(), 0.001);
	}

	@Test
	void transferenciaTest() {
		Cuenta cuentaOrigen = new Cuenta();
		cuentaOrigen.depositar(10000);
		assertEquals(10000, cuentaOrigen.getSaldo(), 0.001);
		Cuenta cuentaDestino = new Cuenta();
		assertEquals(0, cuentaDestino.getSaldo(), 0.001);
		cuentaOrigen.transferir(550, cuentaDestino);
		assertEquals(550, cuentaDestino.getSaldo(), 0.001);
		assertEquals(9450, cuentaOrigen.getSaldo(), 0.001);

	}

	@Test
	void cuentaDeAhorroTest() {
		CuentaDeAhorro ahorro1 = new CuentaDeAhorro(10000, 5000);
		assertEquals(ahorro1.getAhorro(), 5000, 0.01);
		assertEquals(ahorro1.getSaldo(), 5000, 0.01);
		ahorro1.retirar(ahorro1.getSaldo() + ahorro1.getAhorro());
	}

	@Test
	void cuentaCorrienteTest() {
		CuentaCorriente cor1 = new CuentaCorriente(1000);
		cor1.depositar(5000);
		cor1.retirar(6000);
		assertEquals(-1000, cor1.getSaldo(), 0.001);
	}

	@Test
	void transferenciaEntreCuentasDiferentesTest() {
		CuentaDeAhorro ahorro = new CuentaDeAhorro(10000, 2000);
		CuentaCorriente corriente = new CuentaCorriente(10000, 200);
		corriente.transferir(10200, ahorro);
		// NO FUNCIONA ESTE TEST
		assertEquals(-200, corriente.getSaldo(), 0.01);// no se descuenta el dinero de la transferencia
		// ESTOS SI
		assertEquals(18200, ahorro.getSaldo(), 0.001);
		assertEquals(2000, ahorro.getAhorro(), 0.001);
	}
}
