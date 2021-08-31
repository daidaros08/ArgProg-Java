package almacenPago;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlmacenPagoTest {

	@Test
	public void calcularInversionAnualTest() {
		System.out.println("Primeros Resultados");
		AlmacenPago.calcularInversionAnual(1000, 0.24, 4);
		System.out.println("Segundos Resultados");
		AlmacenPago.calcularInversionAnual(1000, 0.71355714, 5);

	}

	@Test
	public void calcularTiempoInversionTest() {
		System.out.println("Terceros Resultados");
		System.out.println(AlmacenPago.calcularTiempoInversion(1000, 0.07, 2000));
		System.out.println("Cuartos Resultados");
		System.out.println(AlmacenPago.calcularTiempoInversion(1000, 0.24, 2587));

	}

}
